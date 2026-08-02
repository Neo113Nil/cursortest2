package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.1 */
/* loaded from: classes7.dex */
final class zzdq extends zzdn.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdn zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdq(zzdn zzdnVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdnVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdn.zzb
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        zzdc zzdcVar;
        zzdc zzdcVar2;
        String str4;
        String str5;
        try {
            zzc = this.zzg.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str6 = this.zzd;
                String str7 = this.zzc;
                str5 = this.zzg.zzc;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzdn zzdnVar = this.zzg;
            zzdnVar.zzj = zzdnVar.zza(this.zze, true);
            zzdcVar = this.zzg.zzj;
            if (zzdcVar == null) {
                str4 = this.zzg.zzc;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zze, ModuleDescriptor.MODULE_ID);
            zzdl zzdlVar = new zzdl(95001L, Math.max(localVersion, r0), DynamiteModule.getRemoteVersion(this.zze, ModuleDescriptor.MODULE_ID) < localVersion, str, str2, str3, this.zzf, com.google.android.gms.measurement.internal.zzhd.zza(this.zze));
            zzdcVar2 = this.zzg.zzj;
            ((zzdc) Preconditions.checkNotNull(zzdcVar2)).initialize(ObjectWrapper.wrap(this.zze), zzdlVar, this.zza);
        } catch (Exception e) {
            this.zzg.zza(e, true, false);
        }
    }
}
