package com.google.android.gms.internal.gtm;

import B0.A0;
import V.e;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g.C6594f;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@VisibleForTesting
/* loaded from: classes9.dex */
final class zzho extends SQLiteOpenHelper {
    final /* synthetic */ zzhp zza;
    private boolean zzb;
    private long zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzho(zzhp zzhpVar, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzhpVar;
        this.zzc = 0L;
    }

    private static final boolean zza(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME}, "name=?", new String[]{str}, null, null, null);
            boolean moveToFirst = cursor.moveToFirst();
            cursor.close();
            return moveToFirst;
        } catch (SQLiteException unused) {
            if (cursor == null) {
                return false;
            }
            cursor.close();
            return false;
        } catch (Throwable th2) {
            if (cursor == null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    private static final void zzb(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(C6594f.a("SELECT * FROM ", str, " WHERE 0", new StringBuilder(str.length() + 22)), null);
        HashSet hashSet = new HashSet();
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            rawQuery.close();
            for (String str3 : list) {
                if (!hashSet.remove(str3)) {
                    throw new SQLiteException(e.a("Database column ", str3, " missing in table ", str, "."));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(A0.b("Database has extra columns in table ", str, "."));
            }
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Clock clock;
        Context context;
        String str;
        SQLiteDatabase sQLiteDatabase;
        Clock clock2;
        if (this.zzb) {
            long j11 = this.zzc + 3600000;
            clock2 = this.zza.zzj;
            if (j11 > clock2.currentTimeMillis()) {
                throw new SQLiteException("Database creation failed");
            }
        }
        this.zzb = true;
        clock = this.zza.zzj;
        this.zzc = clock.currentTimeMillis();
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            context = this.zza.zzg;
            str = this.zza.zzh;
            context.getDatabasePath(str).delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            sQLiteDatabase = super.getWritableDatabase();
        }
        this.zzb = false;
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(Build.VERSION.SDK);
            zzhl.zza(valueOf.length() != 0 ? "Invalid version number: ".concat(valueOf) : new String("Invalid version number: "));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        String str4;
        if (zza("gtm_hit_unique_ids", sQLiteDatabase)) {
            zzb(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList("hit_unique_id"));
        } else {
            str4 = zzhp.zza;
            sQLiteDatabase.execSQL(str4);
        }
        if (zza("gtm_hits", sQLiteDatabase)) {
            zzb(sQLiteDatabase, "gtm_hits", Arrays.asList("hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"));
        } else {
            str3 = zzhp.zzb;
            sQLiteDatabase.execSQL(str3);
        }
        str = zzhp.zzc;
        sQLiteDatabase.execSQL(str);
        str2 = zzhp.zzd;
        sQLiteDatabase.execSQL(str2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
