package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fjn;
import defpackage.nkn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcmx {
    public final fjn a;
    public final n b;

    public zzcmx(n nVar, fjn fjnVar) {
        this.a = fjnVar;
        this.b = nVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        n nVar = this.b;
        zzbbd p = nVar.p();
        if (p == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzbay zzbayVar = p.b;
        if (zzbayVar == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (nVar.getContext() != null) {
            return zzbayVar.zzf(nVar.getContext(), str, nVar.zzE(), nVar.a.a);
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        n nVar = this.b;
        zzbbd p = nVar.p();
        if (p == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzbay zzbayVar = p.b;
        if (zzbayVar == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (nVar.getContext() != null) {
            return zzbayVar.zzj(nVar.getContext(), nVar.zzE(), nVar.a.a);
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        n nVar = this.b;
        zzbjg.a(nVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Bf)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzclx zzP = nVar.zzP();
            zzdck zzdckVar = zzP != null ? zzP.A : null;
            if (zzdckVar != null) {
                long j = zzdckVar.a.get();
                if (j > 0) {
                    jSONObject.put("plcmtid", j);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new nkn(this, str, false, 9));
        }
    }
}
