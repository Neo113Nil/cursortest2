package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzhcv;
import defpackage.ddb;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzy implements zzhcv {
    public final /* synthetic */ ddb a;
    public final /* synthetic */ zzcfi b;
    public final /* synthetic */ zzcfb c;
    public final /* synthetic */ zzfqw d;
    public final /* synthetic */ zzap e;

    public zzy(zzap zzapVar, ddb ddbVar, zzcfi zzcfiVar, zzcfb zzcfbVar, zzfqw zzfqwVar) {
        this.a = ddbVar;
        this.b = zzcfiVar;
        this.c = zzcfbVar;
        this.d = zzfqwVar;
        this.e = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M8)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().e("SignalGeneratorImpl.generateSignals", th);
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.generateSignals", th);
        }
        zzfrg N4 = zzap.N4(this.a, this.b);
        if (((Boolean) zzbla.e.c()).booleanValue() && N4 != null) {
            zzfqw zzfqwVar = this.d;
            zzfqwVar.a(th);
            zzfqwVar.zzd(false);
            N4.a(zzfqwVar);
            N4.h();
        }
        zzcfb zzcfbVar = this.c;
        if (zzcfbVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcfbVar.zza(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        zzap zzapVar = this.e;
        AtomicBoolean atomicBoolean = zzapVar.B;
        zzbc zzbcVar = (zzbc) obj;
        zzfrg N4 = zzap.N4(this.a, this.b);
        atomicBoolean.set(true);
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G8)).booleanValue();
        zzcfb zzcfbVar = this.c;
        zzfqw zzfqwVar = this.d;
        if (!booleanValue) {
            if (zzcfbVar != null) {
                try {
                    zzcfbVar.zza("QueryInfo generation has been disabled.");
                } catch (RemoteException e) {
                    String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                }
            }
            if (!((Boolean) zzbla.e.c()).booleanValue() || N4 == null) {
                return;
            }
            zzfqwVar.zzk("QueryInfo generation has been disabled.");
            zzfqwVar.zzd(false);
            N4.a(zzfqwVar);
            N4.h();
            return;
        }
        try {
            try {
                if (zzbcVar == null) {
                    if (zzcfbVar != null) {
                        zzcfbVar.J1(null, null, null);
                    }
                    zzfqwVar.zzd(true);
                    if (!((Boolean) zzbla.e.c()).booleanValue() || N4 == null) {
                        return;
                    }
                    N4.a(zzfqwVar);
                    N4.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzbcVar.zzb).optString("request_id", ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        if (zzcfbVar != null) {
                            zzcfbVar.zza("Internal error: request ID is empty in request JSON.");
                        }
                        zzfqwVar.zzk("Request ID empty");
                        zzfqwVar.zzd(false);
                        if (!((Boolean) zzbla.e.c()).booleanValue() || N4 == null) {
                            return;
                        }
                        N4.a(zzfqwVar);
                        N4.h();
                        return;
                    }
                    Bundle bundle = zzbcVar.zzd;
                    boolean z = zzapVar.p;
                    String str = zzapVar.q;
                    String str2 = zzapVar.r;
                    if (z && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, zzapVar.s.get());
                    }
                    if (zzapVar.o && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(zzapVar.u)) {
                            zzapVar.u = com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.b, zzapVar.t.afmaVersion);
                        }
                        bundle.putString(str, zzapVar.u);
                    }
                    if (zzcfbVar != null) {
                        zzcfbVar.J1(zzbcVar.zza, bundle, zzbcVar.zzb);
                    }
                    zzfqwVar.zzd(true);
                    if (!((Boolean) zzbla.e.c()).booleanValue() || N4 == null) {
                        return;
                    }
                    N4.a(zzfqwVar);
                    N4.h();
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    if (zzcfbVar != null) {
                        String obj2 = e2.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        zzcfbVar.zza(sb.toString());
                    }
                    zzfqwVar.a(e2);
                    zzfqwVar.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.generateSignals.onSuccess", e2);
                    if (!((Boolean) zzbla.e.c()).booleanValue() || N4 == null) {
                        return;
                    }
                    N4.a(zzfqwVar);
                    N4.h();
                }
            } catch (RemoteException e3) {
                zzfqwVar.a(e3);
                zzfqwVar.zzd(false);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.generateSignals.onSuccess", e3);
                if (!((Boolean) zzbla.e.c()).booleanValue() || N4 == null) {
                    return;
                }
                N4.a(zzfqwVar);
                N4.h();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbla.e.c()).booleanValue() && N4 != null) {
                N4.a(zzfqwVar);
                N4.h();
            }
            throw th;
        }
    }
}
