package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
public final class zzen extends zzf {
    private final zzem zza;
    private boolean zzb;

    zzen(zzge zzgeVar) {
        super(zzgeVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzem(this, zzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b8  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzq(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        ?? r10;
        Cursor cursor;
        boolean z2;
        zzg();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = zzh();
                if (sQLiteDatabase == null) {
                    this.zzb = true;
                    return r2;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    r10 = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (r10 != 0) {
                        try {
                            try {
                                if (r10.moveToFirst()) {
                                    j = r10.getLong(r2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = r10;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            z2 = r2;
                            cursor2 = r10;
                            z = z2;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                i2++;
                                r2 = z;
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            z2 = r2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            cursor = r10;
                            z = z2;
                            this.zzt.zzaA().zzd().zzb("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = z;
                        } catch (SQLiteException e2) {
                            e = e2;
                            z2 = r2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            r10 = r10;
                            z = z2;
                            if (sQLiteDatabase2 != null) {
                            }
                            this.zzt.zzaA().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (r10 != 0) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = z;
                        }
                    }
                    if (j >= 100000) {
                        this.zzt.zzaA().zzd().zza("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j2 = 100001 - j;
                        strArr[r2] = Long.toString(j2);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j2) {
                            z2 = r2;
                            try {
                                this.zzt.zzaA().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                z2 = z2;
                                sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                if (r10 != 0) {
                                    r10.close();
                                }
                                sQLiteDatabase.close();
                                return true;
                            } catch (SQLiteDatabaseLockedException unused2) {
                                cursor2 = r10;
                                z = z2;
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase == null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = z;
                            } catch (SQLiteFullException e3) {
                                e = e3;
                                sQLiteDatabase2 = sQLiteDatabase;
                                cursor = r10;
                                z = z2;
                                this.zzt.zzaA().zzd().zzb("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase2 == null) {
                                    i2++;
                                    r2 = z;
                                }
                                sQLiteDatabase2.close();
                                i2++;
                                r2 = z;
                            } catch (SQLiteException e4) {
                                e = e4;
                                sQLiteDatabase2 = sQLiteDatabase;
                                r10 = r10;
                                z = z2;
                                if (sQLiteDatabase2 != null) {
                                    try {
                                        if (sQLiteDatabase2.inTransaction()) {
                                            sQLiteDatabase2.endTransaction();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        cursor2 = r10;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                this.zzt.zzaA().zzd().zzb("Error writing entry to local database", e);
                                this.zzb = true;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabase2 == null) {
                                    i2++;
                                    r2 = z;
                                }
                                sQLiteDatabase2.close();
                                i2++;
                                r2 = z;
                            }
                        }
                    }
                    z2 = r2;
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (r10 != 0) {
                    }
                    sQLiteDatabase.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused3) {
                    z = r2;
                } catch (SQLiteFullException e5) {
                    e = e5;
                    z2 = r2;
                    r10 = 0;
                } catch (SQLiteException e6) {
                    e = e6;
                    z2 = r2;
                    r10 = 0;
                }
            } catch (SQLiteDatabaseLockedException unused4) {
                z = r2;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e7) {
                e = e7;
                z = r2;
                cursor = null;
            } catch (SQLiteException e8) {
                e = e8;
                z = r2;
                r10 = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        boolean z3 = r2;
        this.zzt.zzaA().zzj().zza("Failed to write entry to local database");
        return z3;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024d  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzi(int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        long j;
        long j2;
        String str;
        String[] strArr;
        String[] strArr2;
        Parcel obtain;
        Object obj;
        Object obj2;
        zzg();
        Cursor cursor5 = 0;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i2 = 5;
        int i3 = 0;
        while (i3 < 5) {
            try {
                sQLiteDatabase = zzh();
                if (sQLiteDatabase == null) {
                    this.zzb = true;
                    return cursor5;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        cursor4 = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                        try {
                            j = -1;
                            if (cursor4.moveToFirst()) {
                                j2 = cursor4.getLong(0);
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                            } else {
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                j2 = -1;
                            }
                            if (j2 != -1) {
                                str = "rowid<?";
                                strArr = new String[]{String.valueOf(j2)};
                            } else {
                                str = cursor5;
                                strArr = str;
                            }
                            strArr2 = new String[3];
                            strArr2[0] = "rowid";
                            strArr2[1] = "type";
                            cursor2 = cursor5;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor5;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor5;
                        cursor4 = cursor2;
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    cursor2 = cursor5;
                } catch (SQLiteFullException e) {
                    e = e;
                    cursor2 = cursor5;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor2 = cursor5;
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor5;
                }
                try {
                    strArr2[2] = "entry";
                    cursor3 = sQLiteDatabase.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(100));
                    while (cursor3.moveToNext()) {
                        try {
                            j = cursor3.getLong(0);
                            int i4 = cursor3.getInt(1);
                            byte[] blob = cursor3.getBlob(2);
                            if (i4 == 0) {
                                obtain = Parcel.obtain();
                                try {
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        zzaw createFromParcel = zzaw.CREATOR.createFromParcel(obtain);
                                        if (createFromParcel != null) {
                                            arrayList.add(createFromParcel);
                                        }
                                    } catch (SafeParcelReader.ParseException unused2) {
                                        this.zzt.zzaA().zzd().zza("Failed to load event from local database");
                                        obtain.recycle();
                                    }
                                } finally {
                                }
                            } else if (i4 == 1) {
                                obtain = Parcel.obtain();
                                try {
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        obj = (zzlj) zzlj.CREATOR.createFromParcel(obtain);
                                    } catch (SafeParcelReader.ParseException unused3) {
                                        this.zzt.zzaA().zzd().zza("Failed to load user property from local database");
                                        obtain.recycle();
                                        obj = cursor2;
                                    }
                                    if (obj != null) {
                                        arrayList.add(obj);
                                    }
                                } finally {
                                }
                            } else if (i4 == 2) {
                                obtain = Parcel.obtain();
                                try {
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        obj2 = (zzac) zzac.CREATOR.createFromParcel(obtain);
                                    } catch (SafeParcelReader.ParseException unused4) {
                                        this.zzt.zzaA().zzd().zza("Failed to load conditional user property from local database");
                                        obtain.recycle();
                                        obj2 = cursor2;
                                    }
                                    if (obj2 != null) {
                                        arrayList.add(obj2);
                                    }
                                } finally {
                                }
                            } else if (i4 == 3) {
                                this.zzt.zzaA().zzk().zza("Skipping app launch break");
                            } else {
                                this.zzt.zzaA().zzd().zza("Unknown record type in local database");
                            }
                        } catch (SQLiteDatabaseLockedException unused5) {
                            SystemClock.sleep(i2);
                            i2 += 20;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (sQLiteDatabase == null) {
                                i3++;
                                cursor5 = cursor2;
                            }
                            sQLiteDatabase.close();
                            i3++;
                            cursor5 = cursor2;
                        } catch (SQLiteFullException e3) {
                            e = e3;
                            this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                            this.zzb = true;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (sQLiteDatabase == null) {
                                i3++;
                                cursor5 = cursor2;
                            }
                            sQLiteDatabase.close();
                            i3++;
                            cursor5 = cursor2;
                        } catch (SQLiteException e4) {
                            e = e4;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = cursor3;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                            this.zzb = true;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (sQLiteDatabase == null) {
                                i3++;
                                cursor5 = cursor2;
                            }
                            sQLiteDatabase.close();
                            i3++;
                            cursor5 = cursor2;
                        }
                    }
                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                        this.zzt.zzaA().zzd().zza("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    sQLiteDatabase.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused6) {
                    cursor3 = cursor2;
                    SystemClock.sleep(i2);
                    i2 += 20;
                    if (cursor3 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i3++;
                    cursor5 = cursor2;
                } catch (SQLiteFullException e5) {
                    e = e5;
                    cursor3 = cursor2;
                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                    this.zzb = true;
                    if (cursor3 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i3++;
                    cursor5 = cursor2;
                } catch (SQLiteException e6) {
                    e = e6;
                    cursor3 = cursor2;
                    if (sQLiteDatabase != null) {
                    }
                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                    this.zzb = true;
                    if (cursor3 != null) {
                    }
                    if (sQLiteDatabase == null) {
                    }
                    sQLiteDatabase.close();
                    i3++;
                    cursor5 = cursor2;
                } catch (Throwable th5) {
                    th = th5;
                    cursor = cursor2;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                cursor2 = cursor5;
                sQLiteDatabase = cursor2;
                cursor3 = sQLiteDatabase;
            } catch (SQLiteFullException e7) {
                e = e7;
                cursor2 = cursor5;
                sQLiteDatabase = cursor2;
                cursor3 = sQLiteDatabase;
            } catch (SQLiteException e8) {
                e = e8;
                cursor2 = cursor5;
                sQLiteDatabase = cursor2;
                cursor3 = sQLiteDatabase;
            } catch (Throwable th6) {
                th = th6;
                cursor = cursor5;
                sQLiteDatabase = cursor;
            }
        }
        List list = cursor5;
        this.zzt.zzaA().zzk().zza("Failed to read events from database in reasonable time");
        return list;
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        int i;
        zzg();
        if (!this.zzb && zzl()) {
            int i2 = 5;
            for (0; i < 5; i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
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
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
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
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzt.zzaA().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length <= 131072) {
            return zzq(2, zzap);
        }
        this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
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
        this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlj zzljVar) {
        Parcel obtain = Parcel.obtain();
        zzlk.zza(zzljVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
