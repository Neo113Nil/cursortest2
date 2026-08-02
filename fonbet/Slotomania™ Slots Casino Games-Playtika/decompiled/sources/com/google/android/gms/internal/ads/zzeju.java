package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.X3;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeju extends zzfyx {
    private final Context zza;
    private final zzhbs zzb;

    public zzeju(Context context, zzhbs zzhbsVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjD)).intValue(), zzfyz.zza);
        this.zza = context;
        this.zzb = zzhbsVar;
    }

    static /* synthetic */ Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String sb3 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb3, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(currentTimeMillis));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(encodedQuery).length());
                            sb4.append(valueOf);
                            sb4.append(X3.j.c);
                            sb4.append(encodedQuery);
                            sb = sb4.toString();
                        }
                        strArr2[i] = sb;
                    }
                    i++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    zzuVar.zzc(strArr2[i2], null);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void zza(zzfny zzfnyVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzejt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeju.this.getWritableDatabase();
            }
        };
        zzhbs zzhbsVar = this.zzb;
        zzhbi.zzr(zzhbsVar.submit(callable), new zzejn(this, zzfnyVar), zzhbsVar);
    }

    final void zzb(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeju.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                zzeju.this.zzb((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfny(this) { // from class: com.google.android.gms.internal.ads.zzejq
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                zzeju.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzejw zzejwVar) {
        zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj) {
                zzeju.this.zzh(zzejwVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ Void zzh(zzejw zzejwVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzejwVar.zza));
        contentValues.put("gws_query_id", zzejwVar.zzb);
        contentValues.put("url", zzejwVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzejwVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
        if (zzC != null) {
            try {
                zzC.zzf(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
