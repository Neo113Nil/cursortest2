package com.google.android.gms.measurement.internal;

import T7.E;
import U7.C4056a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzet extends zzf {
    private final zzes zza;
    private boolean zzb;

    zzet(zzgk zzgkVar) {
        super(zzgkVar);
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        this.zza = new zzes(this, zzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzq(int i11, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z11;
        boolean z12;
        ?? r102;
        Cursor cursor;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object obj;
        boolean z17;
        Cursor cursor2;
        zzg();
        ?? r22 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i11));
        contentValues.put("entry", bArr);
        this.zzs.zzf();
        int i12 = 0;
        int i13 = 5;
        for (int i14 = 5; i12 < i14; i14 = 5) {
            Cursor cursor3 = null;
            cursor3 = null;
            r8 = null;
            Cursor cursor4 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = zzh();
                if (sQLiteDatabase == null) {
                    this.zzb = true;
                    return r22;
                }
                try {
                    try {
                        sQLiteDatabase.beginTransaction();
                        r102 = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                        long j11 = 0;
                        if (r102 != 0) {
                            try {
                                try {
                                    if (r102.moveToFirst()) {
                                        j11 = r102.getLong(r22);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor3 = r102;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
                                z15 = r22;
                                cursor4 = r102;
                                z11 = z15;
                                SystemClock.sleep(i13);
                                i13 += 20;
                                if (cursor4 != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                i12++;
                                r22 = z11;
                            } catch (SQLiteFullException e11) {
                                e = e11;
                                z14 = r22;
                                cursor2 = r102;
                                z17 = z14;
                                sQLiteDatabase2 = sQLiteDatabase;
                                cursor = cursor2;
                                z11 = z17;
                                this.zzs.zzay().zzd().zzb("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.close();
                                i12++;
                                r22 = z11;
                            } catch (SQLiteException e12) {
                                e = e12;
                                z13 = r22;
                                z12 = true;
                                obj = r102;
                                z16 = z13;
                                sQLiteDatabase2 = sQLiteDatabase;
                                r102 = obj;
                                z11 = z16;
                                if (sQLiteDatabase2 != null) {
                                }
                                this.zzs.zzay().zzd().zzb("Error writing entry to local database", e);
                                this.zzb = z12;
                                if (r102 != 0) {
                                }
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.close();
                                i12++;
                                r22 = z11;
                            }
                        }
                        if (j11 >= 100000) {
                            this.zzs.zzay().zzd().zza("Data loss, local db full");
                            long j12 = 100001 - j11;
                            long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j12)});
                            if (delete != j12) {
                                z15 = r22;
                                try {
                                    try {
                                        z12 = true;
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        cursor4 = r102;
                                        z11 = z15;
                                        SystemClock.sleep(i13);
                                        i13 += 20;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            sQLiteDatabase.close();
                                        }
                                        i12++;
                                        r22 = z11;
                                    }
                                } catch (SQLiteFullException e13) {
                                    e = e13;
                                    z14 = z15;
                                    cursor2 = r102;
                                    z17 = z14;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    cursor = cursor2;
                                    z11 = z17;
                                    this.zzs.zzay().zzd().zzb("Error writing entry; local database full", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase2 == null) {
                                        i12++;
                                        r22 = z11;
                                    }
                                    sQLiteDatabase2.close();
                                    i12++;
                                    r22 = z11;
                                } catch (SQLiteException e14) {
                                    e = e14;
                                    z13 = z15;
                                    z12 = true;
                                    obj = r102;
                                    z16 = z13;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    r102 = obj;
                                    z11 = z16;
                                    if (sQLiteDatabase2 != null) {
                                        try {
                                            if (sQLiteDatabase2.inTransaction()) {
                                                sQLiteDatabase2.endTransaction();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            cursor3 = r102;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzs.zzay().zzd().zzb("Error writing entry to local database", e);
                                    this.zzb = z12;
                                    if (r102 != 0) {
                                        r102.close();
                                    }
                                    if (sQLiteDatabase2 == null) {
                                        i12++;
                                        r22 = z11;
                                    }
                                    sQLiteDatabase2.close();
                                    i12++;
                                    r22 = z11;
                                }
                                try {
                                    this.zzs.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j12), Long.valueOf(delete), Long.valueOf(j12 - delete));
                                    z15 = z15;
                                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    if (r102 != 0) {
                                        r102.close();
                                    }
                                    sQLiteDatabase.close();
                                    return z12;
                                } catch (SQLiteFullException e15) {
                                    e = e15;
                                    cursor2 = r102;
                                    z17 = z15;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    cursor = cursor2;
                                    z11 = z17;
                                    this.zzs.zzay().zzd().zzb("Error writing entry; local database full", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.close();
                                    i12++;
                                    r22 = z11;
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    obj = r102;
                                    z16 = z15;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    r102 = obj;
                                    z11 = z16;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    this.zzs.zzay().zzd().zzb("Error writing entry to local database", e);
                                    this.zzb = z12;
                                    if (r102 != 0) {
                                    }
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.close();
                                    i12++;
                                    r22 = z11;
                                }
                            }
                        }
                        z15 = r22;
                        z12 = true;
                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (r102 != 0) {
                        }
                        sQLiteDatabase.close();
                        return z12;
                    } catch (Throwable th4) {
                        th = th4;
                        if (cursor3 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    z11 = r22;
                } catch (SQLiteFullException e17) {
                    e = e17;
                    z17 = r22;
                    cursor2 = null;
                } catch (SQLiteException e18) {
                    e = e18;
                    z16 = r22;
                    z12 = true;
                    obj = null;
                }
            } catch (SQLiteDatabaseLockedException unused4) {
                z11 = r22;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e19) {
                e = e19;
                z11 = r22;
                cursor = null;
            } catch (SQLiteException e21) {
                e = e21;
                z11 = r22;
                z12 = true;
                r102 = 0;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
            }
        }
        boolean z18 = r22;
        E.g(this.zzs, "Failed to write entry to local database");
        return z18;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzi(int i11) {
        int i12;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        Cursor cursor2;
        long j11;
        String str;
        String[] strArr;
        Parcel obtain;
        zzlo zzloVar;
        zzac zzacVar;
        zzg();
        Cursor cursor3 = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i13 = 5;
        for (0; i12 < 5; i12 + 1) {
            try {
                sQLiteDatabase = zzh();
                if (sQLiteDatabase == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        cursor2 = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                        try {
                            long j12 = -1;
                            if (cursor2.moveToFirst()) {
                                j11 = cursor2.getLong(0);
                                cursor2.close();
                            } else {
                                cursor2.close();
                                j11 = -1;
                            }
                            if (j11 != -1) {
                                str = "rowid<?";
                                strArr = new String[]{String.valueOf(j11)};
                            } else {
                                str = null;
                                strArr = null;
                            }
                            cursor = sQLiteDatabase.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                            while (cursor.moveToNext()) {
                                try {
                                    j12 = cursor.getLong(0);
                                    int i14 = cursor.getInt(1);
                                    byte[] blob = cursor.getBlob(2);
                                    if (i14 == 0) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                zzaw createFromParcel = zzaw.CREATOR.createFromParcel(obtain);
                                                if (createFromParcel != null) {
                                                    arrayList.add(createFromParcel);
                                                }
                                            } catch (SafeParcelReader.ParseException unused) {
                                                this.zzs.zzay().zzd().zza("Failed to load event from local database");
                                                obtain.recycle();
                                            }
                                        } finally {
                                        }
                                    } else if (i14 == 1) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                zzloVar = zzlo.CREATOR.createFromParcel(obtain);
                                            } catch (SafeParcelReader.ParseException unused2) {
                                                this.zzs.zzay().zzd().zza("Failed to load user property from local database");
                                                obtain.recycle();
                                                zzloVar = null;
                                            }
                                            if (zzloVar != null) {
                                                arrayList.add(zzloVar);
                                            }
                                        } finally {
                                        }
                                    } else if (i14 == 2) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                zzacVar = zzac.CREATOR.createFromParcel(obtain);
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                this.zzs.zzay().zzd().zza("Failed to load conditional user property from local database");
                                                obtain.recycle();
                                                zzacVar = null;
                                            }
                                            if (zzacVar != null) {
                                                arrayList.add(zzacVar);
                                            }
                                        } finally {
                                        }
                                    } else if (i14 == 3) {
                                        this.zzs.zzay().zzk().zza("Skipping app launch break");
                                    } else {
                                        this.zzs.zzay().zzd().zza("Unknown record type in local database");
                                    }
                                } catch (SQLiteDatabaseLockedException unused4) {
                                    SystemClock.sleep(i13);
                                    i13 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    i12 = sQLiteDatabase == null ? i12 + 1 : 0;
                                    sQLiteDatabase.close();
                                } catch (SQLiteFullException e11) {
                                    e = e11;
                                    this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor3 = cursor;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                }
                            }
                            if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                this.zzs.zzay().zzd().zza("Fewer entries removed from local database than expected");
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            cursor.close();
                            sQLiteDatabase.close();
                            return arrayList;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = null;
                    }
                } catch (SQLiteDatabaseLockedException unused5) {
                    cursor = null;
                } catch (SQLiteFullException e13) {
                    e = e13;
                    cursor = null;
                } catch (SQLiteException e14) {
                    e = e14;
                    cursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    if (cursor3 != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused6) {
                sQLiteDatabase = null;
                cursor = null;
            } catch (SQLiteFullException e15) {
                e = e15;
                sQLiteDatabase = null;
                cursor = null;
            } catch (SQLiteException e16) {
                e = e16;
                sQLiteDatabase = null;
                cursor = null;
            } catch (Throwable th6) {
                th = th6;
                sQLiteDatabase = null;
            }
        }
        C4056a.a(this.zzs, "Failed to read events from database in reasonable time");
        return null;
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzs.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzb("Error resetting local analytics data. error", e11);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    final boolean zzl() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        int i11;
        zzg();
        if (!this.zzb && zzl()) {
            int i12 = 5;
            for (0; i11 < 5; i11 + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase zzh = zzh();
                            if (zzh == null) {
                                this.zzb = true;
                                return false;
                            }
                            zzh.beginTransaction();
                            zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            zzh.setTransactionSuccessful();
                            zzh.endTransaction();
                            zzh.close();
                            return true;
                        } catch (SQLiteException e11) {
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
                            this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e11);
                            this.zzb = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i12);
                        i12 += 20;
                        i11 = 0 == 0 ? i11 + 1 : 0;
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e12) {
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e12);
                    this.zzb = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            C4056a.a(this.zzs, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzan = this.zzs.zzv().zzan(zzacVar);
        if (zzan.length <= 131072) {
            return zzq(2, zzan);
        }
        this.zzs.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        zzax.zza(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzs.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlo zzloVar) {
        Parcel obtain = Parcel.obtain();
        zzlp.zza(zzloVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzs.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
