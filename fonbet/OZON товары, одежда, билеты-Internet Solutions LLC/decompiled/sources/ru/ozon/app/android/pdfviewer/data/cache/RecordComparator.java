package ru.ozon.app.android.pdfviewer.data.cache;

import java.util.Comparator;

/* loaded from: classes13.dex */
class RecordComparator implements Comparator<Record> {
    RecordComparator() {
    }

    private static int compare(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    @Override // java.util.Comparator
    public int compare(Record record, Record record2) {
        return compare(record2.getTime(), record.getTime());
    }
}
