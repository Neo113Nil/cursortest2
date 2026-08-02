package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import defpackage.dkn;
import defpackage.yao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgl extends yao {
    public static final String[] f = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final dkn d;
    public boolean e;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        this.d = new dkn(this, ((zzic) this.b).a);
    }

    @Override // defpackage.yao
    public final boolean T() {
        return false;
    }

    public final void U() {
        int delete;
        zzic zzicVar = (zzic) this.b;
        Q();
        try {
            SQLiteDatabase W = W();
            if (W == null || (delete = W.delete("messages", null, null)) <= 0) {
                return;
            }
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(e, "Error resetting local analytics data. error");
        }
    }

    public final void V() {
        int i;
        zzic zzicVar = (zzic) this.b;
        Q();
        if (!this.e && zzicVar.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase W = W();
                        if (W == null) {
                            this.e = true;
                            return;
                        }
                        W.beginTransaction();
                        W.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        W.setTransactionSuccessful();
                        W.endTransaction();
                        W.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.g.b(e, "Error deleting app launch break from local database");
                        this.e = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.b(e2, "Error deleting app launch break from local database");
                    this.e = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.j.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase W() {
        if (this.e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.e = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:95:0x0088, B:97:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00f8, B:42:0x0120, B:44:0x0126, B:45:0x0129, B:33:0x015b, B:21:0x0144), top: B:94:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        zzic zzicVar = (zzic) this.b;
        Q();
        boolean z3 = false;
        z3 = false;
        if (!this.e) {
            zzal zzalVar = zzicVar.d;
            zzgu zzguVar = zzicVar.f;
            zzfx zzfxVar = zzfy.W0;
            Cursor cursor2 = null;
            zzr U = zzalVar.b0(null, zzfxVar) ? zzicVar.q().U(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzicVar.d.b0(null, zzfxVar) && U != null) {
                contentValues.put("app_version", U.c);
                contentValues.put("app_version_int", Long.valueOf(U.j));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = W();
                    if (sQLiteDatabase == null) {
                        this.e = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    zzic.m(zzguVar);
                                    zzguVar.g.b(e, "Error writing entry; local database full");
                                    this.e = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    zzic.m(zzguVar);
                                    zzguVar.g.b(e, "Error writing entry to local database");
                                    this.e = z2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                zzic.m(zzguVar);
                                zzguVar.g.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (delete != j2) {
                                    zzic.m(zzguVar);
                                    zzgs zzgsVar = zzguVar.g;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        zzic.m(zzguVar);
                                        zzguVar.g.b(e, "Error writing entry; local database full");
                                        this.e = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        z2 = true;
                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        zzic.m(zzguVar);
                                        zzguVar.g.b(e, "Error writing entry to local database");
                                        this.e = z2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                    try {
                                        zzgsVar.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase.close();
                                        return z2;
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        zzic.m(zzguVar);
                                        zzguVar.g.b(e, "Error writing entry; local database full");
                                        this.e = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        zzic.m(zzguVar);
                                        zzguVar.g.b(e, "Error writing entry to local database");
                                        this.e = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                }
                            }
                            z = z3 ? 1 : 0;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            zzic.m(zzguVar);
            zzguVar.o.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
