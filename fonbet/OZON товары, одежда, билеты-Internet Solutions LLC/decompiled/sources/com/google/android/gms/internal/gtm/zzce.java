package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzce extends zzbs implements Closeable {
    private static final String zza = "CREATE TABLE IF NOT EXISTS hits2 ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_string' TEXT NOT NULL, 'hit_app_id' INTEGER);";
    private static final String zzb = "SELECT MAX(hit_time) FROM hits2 WHERE 1;";
    private final zzcd zzc;
    private final zzfo zzd;
    private final zzfo zze;

    zzce(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new zzfo(zzC());
        this.zze = new zzfo(zzC());
        this.zzc = new zzcd(this, zzbvVar.zza(), zzae());
    }

    private final long zzad(String str, String[] strArr, long j11) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzf().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return 0L;
                }
                long j12 = cursor.getLong(0);
                cursor.close();
                return j12;
            } catch (SQLiteException e11) {
                zzL("Database error", str, e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e11) {
            zzK("Sql error closing database", e11);
        } catch (IllegalStateException e12) {
            zzK("Error closing database", e12);
        }
    }

    public final void zzZ(List<Long> list) {
        Preconditions.checkNotNull(list);
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hit_id in (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            Long l11 = list.get(i11);
            if (l11 == null || l11.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i11 > 0) {
                sb2.append(",");
            }
            sb2.append(l11);
        }
        sb2.append(")");
        String sb3 = sb2.toString();
        try {
            SQLiteDatabase zzf = zzf();
            zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = zzf.delete("hits2", sb3, null);
            if (delete != list.size()) {
                zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb3);
            }
        } catch (SQLiteException e11) {
            zzK("Error deleting hits", e11);
            throw e11;
        }
    }

    public final int zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        zzO("Deleting stale hits (if any)");
        int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().currentTimeMillis() - 2592000000L)});
        zzP("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            } catch (SQLiteException e11) {
                zzL("Database error", "SELECT COUNT(*) FROM hits2", e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long zzc() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        return zzad(zzb, null, 0L);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    public final long zze(long j11, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzW();
        com.google.android.gms.analytics.zzr.zzh();
        return zzad("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0L);
    }

    @VisibleForTesting
    final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e11) {
            zzS("Error opening database", e11);
            throw e11;
        }
    }

    public final List<zzex> zzj(long j11) {
        Cursor query;
        Map<String, String> map;
        boolean z11;
        Preconditions.checkArgument(j11 >= 0);
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        Cursor cursor = null;
        try {
            try {
                query = zzf().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, "hit_id ASC", Long.toString(j11));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (query.moveToFirst()) {
                do {
                    long j12 = query.getLong(0);
                    long j13 = query.getLong(1);
                    String string = query.getString(2);
                    String string2 = query.getString(3);
                    int i11 = query.getInt(4);
                    Map<String, String> zzk = zzk(string);
                    if (!TextUtils.isEmpty(string2) && string2.startsWith("http:")) {
                        map = zzk;
                        z11 = false;
                        arrayList.add(new zzex(this, map, j13, z11, j12, i11, null));
                    }
                    map = zzk;
                    z11 = true;
                    arrayList.add(new zzex(this, map, j13, z11, j12, i11, null));
                } while (query.moveToNext());
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e12) {
            e = e12;
            zzK("Error loading hits from the database", e);
            throw e;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = str.length() != 0 ? "?".concat(str) : new String("?");
            }
            return HttpUtils.parse(new URI(str), "UTF-8");
        } catch (URISyntaxException e11) {
            zzK("Error parsing hit parameters", e11);
            return new HashMap(0);
        }
    }

    @VisibleForTesting
    final Map<String, String> zzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            return HttpUtils.parse(new URI(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")), "UTF-8");
        } catch (URISyntaxException e11) {
            zzK("Error parsing property parameters", e11);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j11) {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j11);
        arrayList.add(valueOf);
        zzP("Deleting hit, id", valueOf);
        zzZ(arrayList);
    }
}
