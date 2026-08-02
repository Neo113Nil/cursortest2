package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzft extends zzg {
    private final zzfs zza;
    private boolean zzb;

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzz() {
        return false;
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            if (cursor == null) {
                return -1L;
            }
            cursor.close();
            return -1L;
        } finally {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private final SQLiteDatabase zzad() throws SQLiteException {
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

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzad zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzae zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzft zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzfv zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzgl zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzhg zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzlb zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzml zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zznt zzq() {
        return super.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AbstractSafeParcelable> zza(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        String str;
        String[] strArr;
        Parcel obtain;
        zzno zznoVar;
        zzac zzacVar;
        zzt();
        Cursor cursor2 = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (zzae()) {
            int i2 = 5;
            for (int i3 = 0; i3 < 5; i3++) {
                try {
                    sQLiteDatabase = zzad();
                    if (sQLiteDatabase == null) {
                        this.zzb = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return null;
                    }
                    try {
                        sQLiteDatabase.beginTransaction();
                        long zza = zza(sQLiteDatabase);
                        long j = -1;
                        if (zza != -1) {
                            strArr = new String[]{String.valueOf(zza)};
                            str = "rowid<?";
                        } else {
                            str = null;
                            strArr = null;
                        }
                        cursor = sQLiteDatabase.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                        while (cursor.moveToNext()) {
                            try {
                                j = cursor.getLong(0);
                                int i4 = cursor.getInt(1);
                                byte[] blob = cursor.getBlob(2);
                                if (i4 == 0) {
                                    obtain = Parcel.obtain();
                                    try {
                                        try {
                                            obtain.unmarshall(blob, 0, blob.length);
                                            obtain.setDataPosition(0);
                                            zzbf createFromParcel = zzbf.CREATOR.createFromParcel(obtain);
                                            if (createFromParcel != null) {
                                                arrayList.add(createFromParcel);
                                            }
                                        } catch (SafeParcelReader.ParseException unused) {
                                            zzj().zzg().zza("Failed to load event from local database");
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
                                            zznoVar = zzno.CREATOR.createFromParcel(obtain);
                                        } catch (SafeParcelReader.ParseException unused2) {
                                            zzj().zzg().zza("Failed to load user property from local database");
                                            obtain.recycle();
                                            zznoVar = null;
                                        }
                                        if (zznoVar != null) {
                                            arrayList.add(zznoVar);
                                        }
                                    } finally {
                                    }
                                } else if (i4 == 2) {
                                    obtain = Parcel.obtain();
                                    try {
                                        try {
                                            obtain.unmarshall(blob, 0, blob.length);
                                            obtain.setDataPosition(0);
                                            zzacVar = zzac.CREATOR.createFromParcel(obtain);
                                        } catch (SafeParcelReader.ParseException unused3) {
                                            zzj().zzg().zza("Failed to load conditional user property from local database");
                                            obtain.recycle();
                                            zzacVar = null;
                                        }
                                        if (zzacVar != null) {
                                            arrayList.add(zzacVar);
                                        }
                                    } finally {
                                    }
                                } else if (i4 == 3) {
                                    zzj().zzu().zza("Skipping app launch break");
                                } else {
                                    zzj().zzg().zza("Unknown record type in local database");
                                }
                            } catch (SQLiteDatabaseLockedException unused4) {
                                SystemClock.sleep(i2);
                                i2 += 20;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                            } catch (SQLiteFullException e) {
                                e = e;
                                zzj().zzg().zza("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                if (sQLiteDatabase != null) {
                                    try {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
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
                                }
                                zzj().zzg().zza("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                            }
                        }
                        if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                            zzj().zzg().zza("Fewer entries removed from local database than expected");
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteDatabaseLockedException unused5) {
                        cursor = null;
                    } catch (SQLiteFullException e3) {
                        e = e3;
                        cursor = null;
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused6) {
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e5) {
                    e = e5;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e6) {
                    e = e6;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            zzj().zzu().zza("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    zzft(zzhj zzhjVar) {
        super(zzhjVar);
        this.zza = new zzfs(this, zza(), "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zzaa() {
        int delete;
        zzt();
        try {
            SQLiteDatabase zzad = zzad();
            if (zzad == null || (delete = zzad.delete("messages", null, null)) <= 0) {
                return;
            }
            zzj().zzp().zza("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzab() {
        return zza(3, new byte[0]);
    }

    private final boolean zzae() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzac() {
        zzt();
        if (this.zzb || !zzae()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase zzad = zzad();
                if (zzad == null) {
                    this.zzb = true;
                    if (zzad != null) {
                        zzad.close();
                    }
                    return false;
                }
                zzad.beginTransaction();
                zzad.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                zzad.setTransactionSuccessful();
                zzad.endTransaction();
                if (zzad != null) {
                    zzad.close();
                }
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteFullException e) {
                zzj().zzg().zza("Error deleting app launch break from local database", e);
                this.zzb = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
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
                zzj().zzg().zza("Error deleting app launch break from local database", e2);
                this.zzb = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().zzu().zza("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final boolean zza(zzac zzacVar) {
        zzq();
        byte[] zza = zznt.zza((Parcelable) zzacVar);
        if (zza.length > 131072) {
            zzj().zzm().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zza(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        ?? r10;
        boolean z3;
        long j;
        zzt();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor = null;
            r7 = null;
            cursor = null;
            r7 = null;
            r7 = null;
            Cursor cursor2 = null;
            Cursor cursor3 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = zzad();
                try {
                    if (sQLiteDatabase == null) {
                        try {
                            this.zzb = true;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            return r2;
                        } catch (SQLiteFullException e) {
                            e = e;
                            z = r2;
                            zzj().zzg().zza("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (cursor3 != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            i2++;
                            r2 = z;
                        } catch (SQLiteException e2) {
                            e = e2;
                            z3 = r2;
                            r10 = 0;
                            z2 = true;
                            sQLiteDatabase2 = sQLiteDatabase;
                            r10 = r10;
                            z = z3;
                            if (sQLiteDatabase2 != null) {
                            }
                            zzj().zzg().zza("Error writing entry to local database", e);
                            this.zzb = z2;
                            if (r10 != 0) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                            i2++;
                            r2 = z;
                        }
                    } else {
                        try {
                            try {
                                sQLiteDatabase.beginTransaction();
                                r10 = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                                if (r10 != 0) {
                                    try {
                                        try {
                                            try {
                                                if (r10.moveToFirst()) {
                                                    j = r10.getLong(r2);
                                                    if (j >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                                        try {
                                                            zzj().zzg().zza("Data loss, local db full");
                                                            long j2 = 100001 - j;
                                                            long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                                            if (delete != j2) {
                                                                z3 = r2;
                                                                try {
                                                                    try {
                                                                        z2 = true;
                                                                    } catch (SQLiteDatabaseLockedException unused) {
                                                                        cursor2 = r10;
                                                                        z = z3;
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
                                                                    }
                                                                } catch (SQLiteFullException e3) {
                                                                    e = e3;
                                                                    z3 = z3;
                                                                    cursor3 = r10;
                                                                    z = z3;
                                                                    zzj().zzg().zza("Error writing entry; local database full", e);
                                                                    this.zzb = true;
                                                                    if (cursor3 != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                } catch (SQLiteException e4) {
                                                                    e = e4;
                                                                    r10 = r10;
                                                                    z3 = z3;
                                                                    z2 = true;
                                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                                    r10 = r10;
                                                                    z = z3;
                                                                    if (sQLiteDatabase2 != null) {
                                                                        try {
                                                                            if (sQLiteDatabase2.inTransaction()) {
                                                                                sQLiteDatabase2.endTransaction();
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            sQLiteDatabase = sQLiteDatabase2;
                                                                            cursor = r10;
                                                                            if (cursor != null) {
                                                                            }
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    zzj().zzg().zza("Error writing entry to local database", e);
                                                                    this.zzb = z2;
                                                                    if (r10 != 0) {
                                                                        r10.close();
                                                                    }
                                                                    if (sQLiteDatabase2 == null) {
                                                                        sQLiteDatabase2.close();
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                }
                                                                try {
                                                                    zzj().zzg().zza("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                                                    z3 = z3;
                                                                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                                                    sQLiteDatabase.setTransactionSuccessful();
                                                                    sQLiteDatabase.endTransaction();
                                                                    if (r10 != 0) {
                                                                        r10.close();
                                                                    }
                                                                    if (sQLiteDatabase != null) {
                                                                        sQLiteDatabase.close();
                                                                    }
                                                                    return z2;
                                                                } catch (SQLiteFullException e5) {
                                                                    e = e5;
                                                                    cursor3 = r10;
                                                                    z = z3;
                                                                    zzj().zzg().zza("Error writing entry; local database full", e);
                                                                    this.zzb = true;
                                                                    if (cursor3 != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                                    r10 = r10;
                                                                    z = z3;
                                                                    if (sQLiteDatabase2 != null) {
                                                                    }
                                                                    zzj().zzg().zza("Error writing entry to local database", e);
                                                                    this.zzb = z2;
                                                                    if (r10 != 0) {
                                                                    }
                                                                    if (sQLiteDatabase2 == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                }
                                                            }
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            z3 = r2;
                                                        }
                                                    }
                                                    z3 = r2;
                                                    z2 = true;
                                                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    if (r10 != 0) {
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    return z2;
                                                }
                                            } catch (SQLiteFullException e8) {
                                                e = e8;
                                                z3 = r2;
                                                cursor3 = r10;
                                                z = z3;
                                                zzj().zzg().zza("Error writing entry; local database full", e);
                                                this.zzb = true;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (sQLiteDatabase == null) {
                                                    sQLiteDatabase.close();
                                                }
                                                i2++;
                                                r2 = z;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = r10;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        z3 = r2;
                                        cursor2 = r10;
                                        z = z3;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        i2++;
                                        r2 = z;
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        z3 = r2;
                                        r10 = r10;
                                        z2 = true;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        r10 = r10;
                                        z = z3;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        zzj().zzg().zza("Error writing entry to local database", e);
                                        this.zzb = z2;
                                        if (r10 != 0) {
                                        }
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        i2++;
                                        r2 = z;
                                    }
                                }
                                j = 0;
                                if (j >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                }
                                z3 = r2;
                                z2 = true;
                                sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                if (r10 != 0) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                return z2;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            z = r2;
                        } catch (SQLiteException e11) {
                            e = e11;
                            z3 = r2;
                            z2 = true;
                            r10 = 0;
                        }
                    }
                    th = th3;
                } catch (SQLiteDatabaseLockedException unused3) {
                    z = r2;
                }
            } catch (SQLiteDatabaseLockedException unused4) {
                z = r2;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e12) {
                e = e12;
                z = r2;
                sQLiteDatabase = null;
            } catch (SQLiteException e13) {
                e = e13;
                z = r2;
                z2 = true;
                r10 = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        boolean z4 = r2;
        zzj().zzp().zza("Failed to write entry to local database");
        return z4;
    }

    public final boolean zza(zzbf zzbfVar) {
        Parcel obtain = Parcel.obtain();
        zzbfVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzj().zzm().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, marshall);
    }

    public final boolean zza(zzno zznoVar) {
        Parcel obtain = Parcel.obtain();
        zznoVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzj().zzm().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, marshall);
    }
}
