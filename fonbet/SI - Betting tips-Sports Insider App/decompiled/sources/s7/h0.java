package s7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzr;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends z {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f22787e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    public final i f22788c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22789d;

    public h0(f1 f1Var) {
        super(f1Var);
        this.f22788c = new i(this, ((f1) this.f3328a).f22740a);
    }

    @Override // s7.z
    public final boolean m() {
        return false;
    }

    public final void n() {
        int delete;
        f1 f1Var = (f1) this.f3328a;
        j();
        try {
            SQLiteDatabase p10 = p();
            if (p10 == null || (delete = p10.delete("messages", null, null)) <= 0) {
                return;
            }
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e7) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(e7, "Error resetting local analytics data. error");
        }
    }

    public final boolean o() {
        f1 f1Var = (f1) this.f3328a;
        j();
        if (!this.f22789d && f1Var.f22740a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i5 = 5;
            int i10 = 0;
            while (true) {
                if (i10 >= 5) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22906i.a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase p10 = p();
                        if (p10 != null) {
                            p10.beginTransaction();
                            p10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            p10.setTransactionSuccessful();
                            p10.endTransaction();
                            p10.close();
                            return true;
                        }
                        this.f22789d = true;
                    } catch (SQLiteException e7) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.b(e7, "Error deleting app launch break from local database");
                        this.f22789d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i5);
                    i5 += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e9) {
                    n0 n0Var3 = f1Var.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.b(e9, "Error deleting app launch break from local database");
                    this.f22789d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i10++;
            }
        }
        return false;
    }

    public final SQLiteDatabase p() {
        if (this.f22789d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f22788c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f22789d = true;
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
    public final boolean q(int i5, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z5;
        boolean z7;
        Cursor cursor;
        f1 f1Var = (f1) this.f3328a;
        j();
        boolean z10 = false;
        z10 = false;
        if (!this.f22789d) {
            e eVar = f1Var.f22743d;
            n0 n0Var = f1Var.f22745f;
            w wVar = x.f23181c1;
            Cursor cursor2 = null;
            zzr n9 = eVar.t(null, wVar) ? f1Var.r().n(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i5));
            contentValues.put("entry", bArr);
            if (f1Var.f22743d.t(null, wVar) && n9 != null) {
                contentValues.put("app_version", n9.f5822c);
                contentValues.put("app_version_int", Long.valueOf(n9.j));
            }
            int i10 = 5;
            int i11 = 0;
            for (int i12 = 5; i11 < i12; i12 = 5) {
                try {
                    sQLiteDatabase = p();
                    if (sQLiteDatabase == null) {
                        this.f22789d = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z10 ? 1 : 0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
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
                                    z5 = z10 ? 1 : 0;
                                    SystemClock.sleep(i10);
                                    i10 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z10 = z5;
                                } catch (SQLiteFullException e7) {
                                    e = e7;
                                    z5 = z10 ? 1 : 0;
                                    f1.m(n0Var);
                                    n0Var.f22903f.b(e, "Error writing entry; local database full");
                                    this.f22789d = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z10 = z5;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    z5 = z10 ? 1 : 0;
                                    z7 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    f1.m(n0Var);
                                    n0Var.f22903f.b(e, "Error writing entry to local database");
                                    this.f22789d = z7;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z10 = z5;
                                }
                            }
                            if (j >= 100000) {
                                f1.m(n0Var);
                                n0Var.f22903f.a("Data loss, local db full");
                                long j6 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j6)});
                                if (delete != j6) {
                                    f1.m(n0Var);
                                    l0 l0Var = n0Var.f22903f;
                                    z5 = z10 ? 1 : 0;
                                    try {
                                        try {
                                            z7 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i10);
                                            i10 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i11++;
                                                z10 = z5;
                                            }
                                            sQLiteDatabase.close();
                                            i11++;
                                            z10 = z5;
                                        }
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        f1.m(n0Var);
                                        n0Var.f22903f.b(e, "Error writing entry; local database full");
                                        this.f22789d = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i11++;
                                            z10 = z5;
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z10 = z5;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        z7 = true;
                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        f1.m(n0Var);
                                        n0Var.f22903f.b(e, "Error writing entry to local database");
                                        this.f22789d = z7;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i11++;
                                            z10 = z5;
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z10 = z5;
                                    }
                                    try {
                                        l0Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j6), Long.valueOf(delete), Long.valueOf(j6 - delete));
                                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase.close();
                                        return z7;
                                    } catch (SQLiteFullException e12) {
                                        e = e12;
                                        f1.m(n0Var);
                                        n0Var.f22903f.b(e, "Error writing entry; local database full");
                                        this.f22789d = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z10 = z5;
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        f1.m(n0Var);
                                        n0Var.f22903f.b(e, "Error writing entry to local database");
                                        this.f22789d = z7;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z10 = z5;
                                    }
                                }
                            }
                            z5 = z10 ? 1 : 0;
                            z7 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z7;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z5 = z10 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e14) {
                            e = e14;
                            z5 = z10 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e15) {
                            e = e15;
                            z5 = z10 ? 1 : 0;
                            z7 = true;
                            cursor = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z5 = z10 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e16) {
                    e = e16;
                    z5 = z10 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e17) {
                    e = e17;
                    z5 = z10 ? 1 : 0;
                    z7 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabase = null;
                }
            }
            boolean z11 = z10 ? 1 : 0;
            f1.m(n0Var);
            n0Var.f22910n.a("Failed to write entry to local database");
            return z11;
        }
        return z10;
    }
}
