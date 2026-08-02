package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzeuq implements zzfby {
    private final zzhbs zza;
    private final zzdwq zzb;
    private final zzebk zzc;
    private final zzeus zzd;

    public zzeuq(zzhbs zzhbsVar, zzdwq zzdwqVar, zzebk zzebkVar, zzeus zzeusVar) {
        this.zza = zzhbsVar;
        this.zzb = zzdwqVar;
        this.zzc = zzebkVar;
        this.zzd = zzeusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        zzbhv zzbhvVar = zzbie.zznb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
            zzeus zzeusVar = this.zzd;
            if (zzeusVar.zzd() != null) {
                zzeur zzd = zzeusVar.zzd();
                zzd.getClass();
                return zzhbi.zza(zzd);
            }
        }
        if (zzgtn.zzc((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcc)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzhbi.zza(new zzeur(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeuq.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzeur zzc() {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcc)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzflk zza = this.zzb.zza(str, new JSONObject());
                zza.zzn();
                boolean zze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznb)).booleanValue() || zze) {
                    try {
                        zzbxe zzC = zza.zzC();
                        if (zzC != null) {
                            bundle2.putString("sdk_version", zzC.toString());
                        }
                    } catch (zzfkt unused) {
                    }
                }
                try {
                    zzbxe zzB = zza.zzB();
                    if (zzB != null) {
                        bundle2.putString("adapter_version", zzB.toString());
                    }
                } catch (zzfkt unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfkt unused3) {
            }
        }
        zzeur zzeurVar = new zzeur(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznb)).booleanValue()) {
            this.zzd.zzc(zzeurVar);
        }
        return zzeurVar;
    }
}
