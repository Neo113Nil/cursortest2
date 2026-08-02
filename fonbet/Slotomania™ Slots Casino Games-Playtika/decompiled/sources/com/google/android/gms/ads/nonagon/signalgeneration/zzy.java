package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzcdx;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzhbf;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzy implements zzhbf {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcee zzb;
    final /* synthetic */ zzcdx zzc;
    final /* synthetic */ zzfpi zzd;
    final /* synthetic */ zzap zze;

    zzy(zzap zzapVar, ListenableFuture listenableFuture, zzcee zzceeVar, zzcdx zzcdxVar, zzfpi zzfpiVar) {
        this.zza = listenableFuture;
        this.zzb = zzceeVar;
        this.zzc = zzcdxVar;
        this.zzd = zzfpiVar;
        Objects.requireNonNull(zzapVar);
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziG)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfps zzy = zzap.zzy(this.zza, this.zzb);
        if (((Boolean) zzbjx.zze.zze()).booleanValue() && zzy != null) {
            zzfpi zzfpiVar = this.zzd;
            zzfpiVar.zzj(th);
            zzfpiVar.zzd(false);
            zzy.zza(zzfpiVar);
            zzy.zzh();
        }
        zzcdx zzcdxVar = this.zzc;
        if (zzcdxVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcdxVar.zzb(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean zzN = this.zze.zzN();
        zzbc zzbcVar = (zzbc) obj;
        zzfps zzy = zzap.zzy(listenableFuture, this.zzb);
        zzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziA)).booleanValue()) {
            try {
                zzcdx zzcdxVar = this.zzc;
                if (zzcdxVar != null) {
                    zzcdxVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
            }
            if (!((Boolean) zzbjx.zze.zze()).booleanValue() || zzy == null) {
                return;
            }
            zzfpi zzfpiVar = this.zzd;
            zzfpiVar.zzk("QueryInfo generation has been disabled.");
            zzfpiVar.zzd(false);
            zzy.zza(zzfpiVar);
            zzy.zzh();
            return;
        }
        try {
            try {
                if (zzbcVar == null) {
                    zzcdx zzcdxVar2 = this.zzc;
                    if (zzcdxVar2 != null) {
                        zzcdxVar2.zzc(null, null, null);
                    }
                    zzfpi zzfpiVar2 = this.zzd;
                    zzfpiVar2.zzd(true);
                    if (!((Boolean) zzbjx.zze.zze()).booleanValue() || zzy == null) {
                        return;
                    }
                    zzy.zza(zzfpiVar2);
                    zzy.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzbcVar.zzb).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzcdx zzcdxVar3 = this.zzc;
                        if (zzcdxVar3 != null) {
                            zzcdxVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfpi zzfpiVar3 = this.zzd;
                        zzfpiVar3.zzk("Request ID empty");
                        zzfpiVar3.zzd(false);
                        if (!((Boolean) zzbjx.zze.zze()).booleanValue() || zzy == null) {
                            return;
                        }
                        zzy.zza(zzfpiVar3);
                        zzy.zzh();
                        return;
                    }
                    Bundle bundle = zzbcVar.zzd;
                    zzap zzapVar = this.zze;
                    if (zzapVar.zzF() && bundle != null && bundle.getInt(zzapVar.zzH(), -1) == -1) {
                        bundle.putInt(zzapVar.zzH(), zzapVar.zzI().get());
                    }
                    if (zzapVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzapVar.zzG()))) {
                        if (TextUtils.isEmpty(zzapVar.zzK())) {
                            zzapVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.zzz(), zzapVar.zzJ().afmaVersion));
                        }
                        bundle.putString(zzapVar.zzG(), zzapVar.zzK());
                    }
                    zzcdx zzcdxVar4 = this.zzc;
                    if (zzcdxVar4 != null) {
                        zzcdxVar4.zzc(zzbcVar.zza, zzbcVar.zzb, bundle);
                    }
                    this.zzd.zzd(true);
                    if (!((Boolean) zzbjx.zze.zze()).booleanValue() || zzy == null) {
                        return;
                    }
                    zzy.zza(this.zzd);
                    zzy.zzh();
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzcdx zzcdxVar5 = this.zzc;
                    if (zzcdxVar5 != null) {
                        String obj2 = e2.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        zzcdxVar5.zzb(sb.toString());
                    }
                    zzfpi zzfpiVar4 = this.zzd;
                    zzfpiVar4.zzj(e2);
                    zzfpiVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbjx.zze.zze()).booleanValue() || zzy == null) {
                        return;
                    }
                    zzy.zza(zzfpiVar4);
                    zzy.zzh();
                }
            } catch (RemoteException e3) {
                zzfpi zzfpiVar5 = this.zzd;
                zzfpiVar5.zzj(e3);
                zzfpiVar5.zzd(false);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbjx.zze.zze()).booleanValue() || zzy == null) {
                    return;
                }
                zzy.zza(this.zzd);
                zzy.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbjx.zze.zze()).booleanValue() && zzy != null) {
                zzy.zza(this.zzd);
                zzy.zzh();
            }
            throw th;
        }
    }
}
