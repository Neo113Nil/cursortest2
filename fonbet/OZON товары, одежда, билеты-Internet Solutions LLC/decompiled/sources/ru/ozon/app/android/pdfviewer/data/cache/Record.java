package ru.ozon.app.android.pdfviewer.data.cache;

import G.g;

/* loaded from: classes13.dex */
class Record {
    private final String key;
    private final String name;
    private final long size;
    private final long time;

    Record(Record record, long j11) {
        this(record.key, record.name, j11, record.size);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Record record = (Record) obj;
        if (this.time == record.time && this.size == record.size && this.key.equals(record.key)) {
            return this.name.equals(record.name);
        }
        return false;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int a11 = g.a(this.key.hashCode() * 31, 31, this.name);
        long j11 = this.time;
        long j12 = this.size;
        return ((a11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    Record(String str, String str2, long j11, long j12) {
        this.key = str;
        this.name = str2;
        this.time = j11;
        this.size = j12;
    }
}
