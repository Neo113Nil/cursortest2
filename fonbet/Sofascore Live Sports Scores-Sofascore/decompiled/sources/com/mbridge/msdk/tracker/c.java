package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class c {
    private final b a;
    private final String b;
    private final Object c = new Object();

    public c(b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        }
    }

    public long a(i iVar) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            long j = -1;
            if (y.b(this.a)) {
                return -1L;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            try {
            } catch (Exception e2) {
                if (a.a) {
                    e2.getMessage();
                }
            } finally {
                b(sQLiteDatabase);
            }
            if (c(sQLiteDatabase)) {
                return -1L;
            }
            a(sQLiteDatabase);
            ContentValues contentValues = new ContentValues(16);
            e d = iVar.d();
            contentValues.put("name", d.g());
            contentValues.put("type", Integer.valueOf(d.m()));
            contentValues.put("time_stamp", Long.valueOf(d.l()));
            contentValues.put("properties", d.i().toString());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(d.h()));
            contentValues.put("state", Integer.valueOf(iVar.j()));
            contentValues.put("report_count", Integer.valueOf(iVar.h()));
            contentValues.put("uuid", d.n());
            contentValues.put("ignore_max_timeout", Integer.valueOf(!d.p() ? 1 : 0));
            contentValues.put("ignore_max_retry_times", Integer.valueOf(!d.o() ? 1 : 0));
            contentValues.put("invalid_time", Long.valueOf(iVar.g()));
            j = sQLiteDatabase.insert(this.b, null, contentValues);
            d(sQLiteDatabase);
            return j;
        }
    }

    public int b() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            int i = 0;
            if (y.b(this.a)) {
                return 0;
            }
            Cursor cursor = null;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            if (c(sQLiteDatabase)) {
                return 0;
            }
            try {
                try {
                    a(sQLiteDatabase);
                    cursor = sQLiteDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursor != null && cursor.moveToNext()) {
                        i = Math.max(cursor.getCount(), 0);
                    }
                    d(sQLiteDatabase);
                    b(sQLiteDatabase);
                    y.a(cursor);
                } catch (Exception e2) {
                    if (a.a) {
                        e2.getMessage();
                    }
                    b(sQLiteDatabase);
                    y.a(cursor);
                }
                return i;
            } catch (Throwable th) {
                b(sQLiteDatabase);
                y.a(cursor);
                throw th;
            }
        }
    }

    public void c(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            if (y.b(this.a) || y.b((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            if (c(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    a(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        sQLiteDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.k()});
                    }
                    d(sQLiteDatabase);
                    b(sQLiteDatabase);
                } catch (Exception e2) {
                    if (a.a) {
                        e2.getMessage();
                    }
                    b(sQLiteDatabase);
                }
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    public void c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            if (y.b(this.a)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            if (c(sQLiteDatabase)) {
                return;
            }
            try {
                a(sQLiteDatabase);
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", (Integer) 3);
                contentValues.put("report_error_message", "update from reporting");
                sQLiteDatabase.update(this.b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                d(sQLiteDatabase);
            } catch (Exception e2) {
                if (a.a) {
                    e2.getMessage();
                }
            } finally {
                b(sQLiteDatabase);
            }
        }
    }

    public void b(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            if (y.b(this.a) || y.b((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            if (c(sQLiteDatabase)) {
                return;
            }
            try {
                try {
                    a(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        sQLiteDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.k()});
                    }
                    d(sQLiteDatabase);
                    b(sQLiteDatabase);
                } catch (Exception e2) {
                    if (a.a) {
                        e2.getMessage();
                    }
                    b(sQLiteDatabase);
                }
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception unused) {
        }
    }

    public List<i> a(int i) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Exception exc;
        List<i> list;
        Cursor query;
        synchronized (this.c) {
            Cursor cursor = null;
            List<i> list2 = null;
            Cursor cursor2 = null;
            if (y.b(this.a)) {
                return null;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            try {
                if (c(sQLiteDatabase)) {
                    return null;
                }
                try {
                    a(sQLiteDatabase);
                    query = sQLiteDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i));
                } catch (Exception e2) {
                    exc = e2;
                    list = null;
                }
                try {
                    list2 = y.b(query);
                    d(sQLiteDatabase);
                    b(sQLiteDatabase);
                    y.a(query);
                } catch (Exception e3) {
                    exc = e3;
                    List<i> list3 = list2;
                    cursor2 = query;
                    list = list3;
                    if (a.a) {
                        exc.getMessage();
                    }
                    b(sQLiteDatabase);
                    y.a(cursor2);
                    list2 = list;
                    return list2;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    b(sQLiteDatabase);
                    y.a(cursor);
                    throw th;
                }
                return list2;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public void a(List<i> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            if (y.b(this.a) || y.b((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            try {
                if (c(sQLiteDatabase)) {
                    return;
                }
                try {
                    a(sQLiteDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.j()));
                        contentValues.put("report_count", Integer.valueOf(iVar.h()));
                        String i = iVar.i();
                        if (!TextUtils.isEmpty(i)) {
                            contentValues.put("report_error_message", i);
                        }
                        sQLiteDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.k()});
                    }
                    d(sQLiteDatabase);
                    b(sQLiteDatabase);
                } catch (Exception e2) {
                    if (a.a) {
                        e2.getMessage();
                    }
                    b(sQLiteDatabase);
                }
            } catch (Throwable th) {
                b(sQLiteDatabase);
                throw th;
            }
        }
    }

    public int a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.c) {
            int i = -1;
            if (y.b(this.a)) {
                return -1;
            }
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
            } catch (Exception e) {
                if (a.a) {
                    e.getMessage();
                }
                sQLiteDatabase = null;
            }
            if (c(sQLiteDatabase)) {
                return -1;
            }
            try {
                a(sQLiteDatabase);
                i = sQLiteDatabase.delete(this.b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                d(sQLiteDatabase);
            } catch (Exception e2) {
                if (a.a) {
                    e2.getMessage();
                }
            } finally {
                b(sQLiteDatabase);
            }
            return i;
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception unused) {
        }
    }
}
