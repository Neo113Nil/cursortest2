package ru.ozon.app.android.pdfviewer.data.cache;

import Lm0.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
class Journal {
    private final File file;
    private FileManager fileManager;
    private final Map<String, Record> map = new HashMap();
    private long totalSize = 0;

    private Journal(File file, FileManager fileManager) {
        this.file = file;
        this.fileManager = fileManager;
    }

    private void prepare(long j11, long j12) throws IOException {
        if (this.totalSize + j11 > j12) {
            a.f17149a.d("[!] File %d bytes is not fit in cache %d bytes", Long.valueOf(j11), Long.valueOf(this.totalSize));
            ArrayList arrayList = new ArrayList(this.map.values());
            Collections.sort(arrayList, new RecordComparator());
            for (int size = arrayList.size() - 1; size > 0; size--) {
                Record record = (Record) arrayList.remove(size);
                long size2 = this.totalSize - record.getSize();
                a.f17149a.d("[x] Delete %s [%d ms] %d bytes and free cache to %d bytes", record.getKey(), Long.valueOf(record.getTime()), Long.valueOf(record.getSize()), Long.valueOf(size2));
                this.fileManager.delete(record.getName());
                this.map.remove(record.getKey());
                this.totalSize = size2;
                if (size2 + j11 <= j12) {
                    return;
                }
            }
        }
    }

    public static Journal readJournal(FileManager fileManager) {
        File journal = fileManager.journal();
        a.f17149a.d("[.] Start journal reading %s", journal.getName());
        Journal journal2 = new Journal(journal, fileManager);
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(journal));
            try {
                if (dataInputStream2.readShort() != 1) {
                    throw new IllegalArgumentException("Invalid journal format version");
                }
                int readInt = dataInputStream2.readInt();
                long j11 = 0;
                for (int i11 = 0; i11 < readInt; i11++) {
                    String readUTF = dataInputStream2.readUTF();
                    String readUTF2 = dataInputStream2.readUTF();
                    long readLong = dataInputStream2.readLong();
                    long readLong2 = dataInputStream2.readLong();
                    j11 += readLong2;
                    journal2.put(new Record(readUTF, readUTF2, readLong, readLong2));
                }
                journal2.setTotalSize(j11);
                a.f17149a.d("[.] Journal read. Files count is %d and total size is %d", Integer.valueOf(readInt), Long.valueOf(j11));
                return journal2;
            } catch (IOException unused) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return journal2;
            }
        } catch (IOException unused3) {
        }
    }

    private void setTotalSize(long j11) {
        this.totalSize = j11;
    }

    private void updateTime(Record record) {
        this.map.put(record.getKey(), new Record(record, System.currentTimeMillis()));
    }

    public Record delete(String str) {
        Record remove = this.map.remove(str);
        if (remove != null) {
            this.totalSize -= remove.getSize();
        }
        return remove;
    }

    public Record get(String str) {
        Record record = this.map.get(str);
        if (record != null) {
            updateTime(record);
            a.f17149a.d("[^] Update time of %s (%d bytes)", record.getKey(), Long.valueOf(record.getSize()));
        }
        return record;
    }

    public Set<String> keySet() {
        return Collections.unmodifiableSet(this.map.keySet());
    }

    public void put(Record record, long j11) throws IOException {
        prepare(record.getSize(), j11);
        put(record);
    }

    public void writeJournal() {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(this.file));
            try {
                dataOutputStream2.writeShort(1);
                dataOutputStream2.writeInt(this.map.size());
                for (Record record : this.map.values()) {
                    dataOutputStream2.writeUTF(record.getKey());
                    dataOutputStream2.writeUTF(record.getName());
                    dataOutputStream2.writeLong(record.getTime());
                    dataOutputStream2.writeLong(record.getSize());
                }
            } catch (IOException unused) {
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
        }
    }

    private void put(Record record) {
        this.map.put(record.getKey(), record);
        this.totalSize += record.getSize();
        a.f17149a.d("[+] Put %s (%d bytes) and cache size became %d bytes", record.getKey(), Long.valueOf(record.getSize()), Long.valueOf(this.totalSize));
    }
}
