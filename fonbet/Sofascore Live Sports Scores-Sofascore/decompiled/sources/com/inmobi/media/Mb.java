package com.inmobi.media;

import android.content.ContentValues;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Mb {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004e, code lost:
    
        if (r10.intValue() == 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Db a(ContentValues contentValues) {
        contentValues.getClass();
        String asString = contentValues.getAsString("filename");
        asString.getClass();
        Long asLong = contentValues.getAsLong("saveTimestamp");
        asLong.getClass();
        long longValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        asInteger.getClass();
        int intValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        asLong2.getClass();
        long longValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        asInteger2.getClass();
        int intValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        boolean z = asInteger3 != null;
        return new Db(asString, longValue, intValue, longValue2, z, intValue2);
    }

    public static final ContentValues a(Db db) {
        db.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", db.a);
        contentValues.put("saveTimestamp", Long.valueOf(db.b));
        contentValues.put("retryCount", Integer.valueOf(db.c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(db.d));
        contentValues.put("checkpoints", Integer.valueOf(db.f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(db.e ? 1 : 0));
        return contentValues;
    }
}
