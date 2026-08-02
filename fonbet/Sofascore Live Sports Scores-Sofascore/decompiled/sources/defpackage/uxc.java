package defpackage;

import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uxc implements Closeable {
    public final File a;
    public final long b;
    public final File c;
    public final RandomAccessFile d;
    public final FileChannel e;
    public final FileLock f;

    public uxc(File file, File file2) {
        file.getPath();
        file2.getPath();
        this.a = file;
        this.c = file2;
        this.b = f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.e = channel;
                try {
                    file3.getPath();
                    this.f = channel.lock();
                    file3.getPath();
                } catch (IOException e) {
                    e = e;
                    try {
                        this.e.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    this.e.close();
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    this.e.close();
                    throw e;
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    this.d.close();
                } catch (IOException unused2) {
                }
                throw e;
            }
        } catch (Error e5) {
            e = e5;
            this.d.close();
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            this.d.close();
            throw e;
        }
    }

    public static void e(ZipFile zipFile, ZipEntry zipEntry, txc txcVar, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-".concat(str), ".zip", txcVar.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + txcVar.getAbsolutePath() + "\")");
                }
                txcVar.getPath();
                if (createTempFile.renameTo(txcVar)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + txcVar.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            createTempFile.delete();
            throw th2;
        }
    }

    public static long f(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            h12 n = rha.n(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = n.b;
            randomAccessFile.seek(n.a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j -= read;
                if (j == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void m(x0 x0Var, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor edit = x0Var.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            txc txcVar = (txc) it.next();
            edit.putLong(ljg.j(i, "dex.crc."), txcVar.a);
            edit.putLong("dex.time." + i, txcVar.lastModified());
            i++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }

    public final ArrayList g(x0 x0Var, boolean z) {
        ArrayList arrayList;
        File file = this.a;
        file.getPath();
        if (!this.f.isValid()) {
            a70.r("MultiDexExtractor was closed");
            return null;
        }
        if (!z) {
            SharedPreferences sharedPreferences = x0Var.getSharedPreferences("multidex.version", 4);
            long j = sharedPreferences.getLong("timestamp", -1L);
            long lastModified = file.lastModified();
            if (lastModified == -1) {
                lastModified--;
            }
            if (j == lastModified && sharedPreferences.getLong("crc", -1L) == this.b) {
                try {
                    arrayList = h(x0Var);
                } catch (IOException unused) {
                    ArrayList k = this.k();
                    long lastModified2 = file.lastModified();
                    if (lastModified2 == -1) {
                        lastModified2--;
                    }
                    m(x0Var, lastModified2, this.b, k);
                    arrayList = k;
                }
                arrayList.size();
                return arrayList;
            }
        }
        ArrayList k2 = k();
        long lastModified3 = file.lastModified();
        if (lastModified3 == -1) {
            lastModified3--;
        }
        m(x0Var, lastModified3, this.b, k2);
        arrayList = k2;
        arrayList.size();
        return arrayList;
    }

    public final ArrayList h(x0 x0Var) {
        String str = this.a.getName() + ".classes";
        SharedPreferences sharedPreferences = x0Var.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            txc txcVar = new txc(this.c, lnb.k(i2, str, ".zip"));
            if (!txcVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + txcVar.getPath() + "'");
            }
            txcVar.a = f(txcVar);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long lastModified = txcVar.lastModified();
            if (j2 != lastModified || j != txcVar.a) {
                StringBuilder sb = new StringBuilder("Invalid extracted dex: ");
                sb.append(txcVar);
                sb.append(" (key \"\"), expected modification time: ");
                sb.append(j2);
                fn0.t(lastModified, ", modification time: ", ", expected crc: ", sb);
                sb.append(j);
                sb.append(", file crc: ");
                sb.append(txcVar.a);
                throw new IOException(sb.toString());
            }
            arrayList.add(txcVar);
        }
        return arrayList;
    }

    public final ArrayList k() {
        StringBuilder sb = new StringBuilder();
        File file = this.a;
        sb.append(file.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        sxc sxcVar = new sxc();
        File file2 = this.c;
        File[] listFiles = file2.listFiles(sxcVar);
        if (listFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : listFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("classes");
            int i = 2;
            sb3.append(2);
            sb3.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb3.toString());
            while (entry != null) {
                txc txcVar = new txc(file2, sb2 + i + ".zip");
                arrayList.add(txcVar);
                txcVar.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    e(zipFile, entry, txcVar, sb2);
                    try {
                        txcVar.a = f(txcVar);
                        z = true;
                    } catch (IOException unused) {
                        txcVar.getAbsolutePath();
                        z = false;
                    }
                    txcVar.getAbsolutePath();
                    txcVar.length();
                    if (!z) {
                        txcVar.delete();
                        if (txcVar.exists()) {
                            txcVar.getPath();
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + txcVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }
}
