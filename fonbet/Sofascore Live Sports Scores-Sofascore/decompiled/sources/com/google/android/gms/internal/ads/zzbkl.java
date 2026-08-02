package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import defpackage.aa4;
import defpackage.bm9;
import defpackage.dm9;
import defpackage.f2n;
import defpackage.ja4;
import defpackage.qnn;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbkl {
    public final ScheduledExecutorService a;
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzj b;
    public final com.google.android.gms.ads.nonagon.signalgeneration.zza c;
    public final zzeao d;
    public f2n e;
    public zzbki f;
    public ja4 g;
    public String h;
    public long i = 0;
    public long j;
    public JSONArray k;
    public Context l;

    public zzbkl(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, zzeao zzeaoVar) {
        this.a = scheduledExecutorService;
        this.b = zzjVar;
        this.c = zzaVar;
        this.d = zzeaoVar;
    }

    public final void a(String str) {
        try {
            ja4 ja4Var = this.g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.j).toString());
            e(jSONObject);
            if (((Boolean) zzblm.c.c()).booleanValue()) {
                jSONObject.put("as", this.c.zzb());
            }
            ja4Var.c(jSONObject.toString());
            qnn qnnVar = new qnn(this, str);
            if (((Boolean) zzblm.e.c()).booleanValue()) {
                this.b.zzb(this.g, qnnVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.l, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), qnnVar);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error creating JSON: ", e);
        }
    }

    public final JSONObject b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblm.e.c()).booleanValue() ? ((Long) zzblm.h.c()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) zzblm.c.c()).booleanValue()) {
            jSONObject.put("as", this.c.zzb());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblm.e.c()).booleanValue() ? ((Long) zzblm.h.c()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) zzblm.c.c()).booleanValue()) {
            jSONObject.put("as", this.c.zzb());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.xb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ScheduledExecutorService scheduledExecutorService;
        zzbki zzbkiVar = this.f;
        if (zzbkiVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbkiVar.b.get()) {
            return;
        }
        if (this.h != null && this.g != null && (scheduledExecutorService = this.a) != null) {
            if (this.i == 0 || com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() > this.i) {
            }
            ja4 ja4Var = this.g;
            Uri parse = Uri.parse(this.h);
            ja4Var.getClass();
            Bundle bundle = new Bundle();
            aa4 aa4Var = ja4Var.c;
            dm9 dm9Var = ja4Var.b;
            try {
                Bundle bundle2 = new Bundle();
                if (bundle2.isEmpty()) {
                    bundle2 = null;
                }
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                    ((bm9) dm9Var).E4(aa4Var, parse, bundle);
                } else {
                    ((bm9) dm9Var).D4(aa4Var, parse);
                }
            } catch (RemoteException unused) {
            }
            scheduledExecutorService.schedule(this.e, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yb)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    public final void e(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = this.k;
            if (jSONArray == null) {
                jSONArray = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ab));
                this.k = jSONArray;
            }
            jSONObject.put("eids", jSONArray);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
