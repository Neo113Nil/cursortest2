package ru.ozon.app.android.pdfviewer.data.cache;

import B0.A0;
import Lm0.a;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class DiskLruCache {
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private final long cacheSize;
    private final FileManager fileManager;
    private final Journal journal;

    private DiskLruCache(FileManager fileManager, Journal journal, long j11) {
        this.fileManager = fileManager;
        this.journal = journal;
        this.cacheSize = j11;
    }

    private static void assertKeyValid(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(A0.b("Invalid key value: '", str, "'"));
        }
    }

    public static DiskLruCache create(File file, long j11) throws IOException {
        return create(new SimpleFileManager(file), j11);
    }

    private void delete(String str, boolean z11) throws IOException, RecordNotFoundException {
        synchronized (this.journal) {
            try {
                assertKeyValid(str);
                Record delete = this.journal.delete(str);
                if (delete == null) {
                    throw new RecordNotFoundException();
                }
                if (z11) {
                    this.journal.writeJournal();
                }
                this.fileManager.delete(delete.getName());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static String fileExtension(String str) {
        int lastIndexOf;
        return (str == null || str.isEmpty() || (lastIndexOf = str.lastIndexOf(".")) == -1) ? "" : str.substring(lastIndexOf);
    }

    private static String generateName(String str, File file) {
        return keyHash(str) + fileExtension(file.getName());
    }

    private static String keyHash(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(UTF_8));
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalArgumentException("Unable to hash key");
        }
    }

    public void clearCache() throws IOException {
        synchronized (this.journal) {
            Iterator it = new HashSet(this.journal.keySet()).iterator();
            while (it.hasNext()) {
                try {
                    delete((String) it.next(), false);
                } catch (RecordNotFoundException unused) {
                }
            }
            this.journal.writeJournal();
        }
    }

    public File get(String str) {
        synchronized (this.journal) {
            try {
                assertKeyValid(str);
                Record record = this.journal.get(str);
                File file = null;
                if (record == null) {
                    a.f17149a.d("[-] No requested file with key %s in cache", str);
                    return null;
                }
                File file2 = this.fileManager.get(record.getName());
                if (file2.exists()) {
                    file = file2;
                } else {
                    this.journal.delete(str);
                }
                this.journal.writeJournal();
                return file;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public File put(String str, File file) throws IOException {
        File accept;
        synchronized (this.journal) {
            assertKeyValid(str);
            String generateName = generateName(str, file);
            Record record = new Record(str, generateName, System.currentTimeMillis(), file.length());
            accept = this.fileManager.accept(file, generateName);
            this.journal.delete(str);
            this.journal.put(record, this.cacheSize);
            this.journal.writeJournal();
        }
        return accept;
    }

    public static DiskLruCache create(FileManager fileManager, long j11) throws IOException {
        fileManager.prepare();
        return new DiskLruCache(fileManager, Journal.readJournal(fileManager), j11);
    }
}
