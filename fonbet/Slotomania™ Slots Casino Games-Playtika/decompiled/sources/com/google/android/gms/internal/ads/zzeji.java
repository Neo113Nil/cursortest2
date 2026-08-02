package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbhj;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzeji {
    private final zzbhd zza;
    private final Context zzb;
    private final zzein zzc;
    private final VersionInfoParcel zzd;

    public zzeji(Context context, VersionInfoParcel versionInfoParcel, zzbhd zzbhdVar, zzein zzeinVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbhdVar;
        this.zzc = zzeinVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzejh
                @Override // com.google.android.gms.internal.ads.zzfny
                public final /* synthetic */ Object zza(Object obj) {
                    zzeji.this.zzb(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String valueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbhj.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzieg e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbhj.zzaf.zzc zzB = zzbhj.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(Build.MODEL);
            zzB.zzo(zzejc.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(zzejc.zzc(sQLiteDatabase, 1));
            zzB.zzQ(zzejc.zzc(sQLiteDatabase, 3));
            zzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzB.zzM(zzejc.zzd(sQLiteDatabase, 2));
            final zzbhj.zzaf zzbu = zzB.zzbu();
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbhj.zzaf.zza zzaVar = (zzbhj.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbhj.zzq.ENUM_TRUE && zzaVar.zzb() > j) {
                    j = zzaVar.zzb();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbhd zzbhdVar = this.zza;
            zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzejf
                @Override // com.google.android.gms.internal.ads.zzbhc
                public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzbhj.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbhj.zzar.zza zzs = zzbhj.zzar.zzs();
            zzs.zzc(versionInfoParcel.buddyApkVersion);
            zzs.zzg(versionInfoParcel.clientJarVersion);
            zzs.zzk(true != versionInfoParcel.isClientJar ? 2 : 0);
            final zzbhj.zzar zzbu2 = zzs.zzbu();
            zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzejg
                @Override // com.google.android.gms.internal.ads.zzbhc
                public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar2) {
                    zzbhj.zzm.zza zzcc = zzaVar2.zzG().zzcc();
                    zzcc.zzs(zzbhj.zzar.this);
                    zzaVar2.zzI(zzcc);
                }
            });
            zzbhdVar.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            zzejc.zzb(sQLiteDatabase);
        }
        return null;
    }
}
