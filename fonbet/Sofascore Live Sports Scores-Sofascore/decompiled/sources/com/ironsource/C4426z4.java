package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4426z4 extends SQLiteOpenHelper implements A7 {
    private static C4426z4 f = null;
    private static final String g = " TEXT";
    private static final String h = " INTEGER";
    private static final String i = ",";
    private final A4 a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.z4$a */
    public static abstract class a implements BaseColumns {
        public static final String a = "events";
        public static final int b = 4;
        public static final String c = "eventid";
        public static final String d = "timestamp";
        public static final String e = "type";
        public static final String f = "data";
    }

    public C4426z4(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.a = new A4();
        this.b = 4;
        this.c = 400;
        this.d = "DROP TABLE IF EXISTS events";
        this.e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        if (r3.isOpen() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0094, code lost:
    
        if (r3.isOpen() != false) goto L42;
     */
    @Override // com.ironsource.A7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ArrayList<C4355v5> a(String str) {
        ArrayList<C4355v5> arrayList;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        try {
            arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                sQLiteDatabase = a(false);
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
            }
            try {
                cursor = sQLiteDatabase.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        int columnIndex = cursor.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i2 = cursor.getInt(columnIndex);
                            int columnIndex2 = cursor.getColumnIndex("timestamp");
                            if (columnIndex2 >= 0) {
                                long j = cursor.getLong(columnIndex2);
                                int columnIndex3 = cursor.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new C4355v5(i2, j, cursor.getString(columnIndex3)));
                                    cursor.moveToNext();
                                }
                            }
                        }
                    }
                    cursor.close();
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    C4157k4.d().a(th);
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                    }
                    return arrayList;
                } finally {
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1.isOpen() != false) goto L20;
     */
    @Override // com.ironsource.A7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {str};
        try {
            sQLiteDatabase = a(true);
            try {
                sQLiteDatabase.delete("events", "type = ?", strArr);
            } catch (Throwable th) {
                th = th;
                try {
                    C4157k4.d().a(th);
                } finally {
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r0.isOpen() != false) goto L31;
     */
    @Override // com.ironsource.A7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(List<C4355v5> list, String str) {
        SQLiteDatabase sQLiteDatabase;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase2 = null;
                try {
                    sQLiteDatabase = a(true);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Iterator<C4355v5> it = list.iterator();
                    while (it.hasNext()) {
                        ContentValues a2 = a(it.next(), str);
                        if (sQLiteDatabase != null && a2 != null) {
                            sQLiteDatabase.insert("events", null, a2);
                        }
                    }
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase2 = sQLiteDatabase;
                    try {
                        C4157k4.d().a(th);
                        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                            sQLiteDatabase = sQLiteDatabase2;
                            sQLiteDatabase.close();
                        }
                    } catch (Throwable th3) {
                        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                            sQLiteDatabase2.close();
                        }
                        throw th3;
                    }
                }
            }
        }
    }

    public static synchronized C4426z4 a(Context context, String str, int i2) {
        C4426z4 c4426z4;
        synchronized (C4426z4.class) {
            c4426z4 = f;
            if (c4426z4 == null) {
                c4426z4 = new C4426z4(context, str, i2);
                f = c4426z4;
            }
        }
        return c4426z4;
    }

    private ContentValues a(C4355v5 c4355v5, String str) {
        if (c4355v5 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c4355v5.c()));
        contentValues.put("timestamp", Long.valueOf(c4355v5.d()));
        contentValues.put("type", str);
        contentValues.put("data", c4355v5.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z) throws Throwable {
        int i2 = 0;
        while (true) {
            A4 a4 = this.a;
            try {
                if (z) {
                    return a4.a(true, this);
                }
                return a4.a(false, this);
            } finally {
            }
        }
    }
}
