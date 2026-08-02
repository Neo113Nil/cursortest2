package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedd implements zzdds, zzdgv, zzdfh {
    public final zzedp a;
    public final String b;
    public final String c;
    public zzddi f;
    public com.google.android.gms.ads.internal.client.zze g;
    public JSONObject k;
    public JSONObject l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String h = "";
    public String i = "";
    public String j = "";
    public int d = 0;
    public zzedc e = zzedc.a;

    public zzedd(zzedp zzedpVar, zzflw zzflwVar, String str) {
        this.a = zzedpVar;
        this.c = str;
        this.b = zzflwVar.g;
    }

    public static JSONObject c(com.google.android.gms.ads.internal.client.zze zzeVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : c(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
        zzedp zzedpVar = this.a;
        if (zzedpVar.f()) {
            zzfln zzflnVar = zzfloVar.b;
            List list = zzflnVar.a;
            if (!list.isEmpty()) {
                this.d = ((zzfld) list.get(0)).b;
            }
            zzflg zzflgVar = zzflnVar.b;
            String str = zzflgVar.l;
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            String str2 = zzflgVar.m;
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            JSONObject jSONObject = zzflgVar.p;
            if (jSONObject.length() > 0) {
                this.l = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pa)).booleanValue()) {
                if (zzedpVar.w >= ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Qa)).longValue()) {
                    this.o = true;
                    return;
                }
                String str3 = zzflgVar.n;
                if (!TextUtils.isEmpty(str3)) {
                    this.j = str3;
                }
                JSONObject jSONObject2 = zzflgVar.o;
                if (jSONObject2.length() > 0) {
                    this.k = jSONObject2;
                }
                JSONObject jSONObject3 = this.k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.j)) {
                    length += this.j.length();
                }
                long j = length;
                synchronized (zzedpVar) {
                    zzedpVar.w += j;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue()) {
            return;
        }
        zzedp zzedpVar = this.a;
        if (zzedpVar.f()) {
            zzedpVar.c(this.b, this);
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.e);
        jSONObject2.put("format", zzfld.a(this.d));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.m);
            if (this.m) {
                jSONObject2.put("shown", this.n);
            }
        }
        zzddi zzddiVar = this.f;
        if (zzddiVar != null) {
            jSONObject = b(zzddiVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.g;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzddi zzddiVar2 = (zzddi) iBinder;
                jSONObject3 = b(zzddiVar2);
                if (zzddiVar2.e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.g));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject b(zzddi zzddiVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzddiVar.a);
        jSONObject.put("responseSecsSinceEpoch", zzddiVar.f);
        jSONObject.put("responseId", zzddiVar.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ma)).booleanValue()) {
            String str = zzddiVar.g;
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("adRequestUrl", this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("postBody", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("adResponseBody", this.j);
        }
        Object obj = this.k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pa)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.o);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzddiVar.e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Na)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : c(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdfh
    public final void f0(zzcyl zzcylVar) {
        zzedp zzedpVar = this.a;
        if (zzedpVar.f()) {
            this.f = zzcylVar.f;
            this.e = zzedc.b;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue()) {
                zzedpVar.c(this.b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzedp zzedpVar = this.a;
        if (zzedpVar.f()) {
            this.e = zzedc.c;
            this.g = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue()) {
                zzedpVar.c(this.b, this);
            }
        }
    }
}
