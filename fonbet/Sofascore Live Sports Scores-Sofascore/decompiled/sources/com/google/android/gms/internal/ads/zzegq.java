package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import defpackage.bho;
import defpackage.cpn;
import defpackage.d1l;
import defpackage.ddb;
import defpackage.dff;
import defpackage.een;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.spn;
import defpackage.vlo;
import defpackage.x5n;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzegq {
    public static final Pattern p = Pattern.compile("\\?");
    public final zzcob a;
    public final Context b;
    public final VersionInfoParcel c;
    public final zzflw d;
    public final hsn e;
    public final ScheduledExecutorService f;
    public final String g;
    public final zzfrg h;
    public final zzeae i;
    public final zzfte j;
    public final zzdgt k;
    public final Object l = new Object();
    public String m;
    public List n;
    public Bundle o;

    public zzegq(zzcob zzcobVar, Context context, VersionInfoParcel versionInfoParcel, zzflw zzflwVar, hsn hsnVar, String str, zzfrg zzfrgVar, zzeae zzeaeVar, zzccd zzccdVar, ScheduledExecutorService scheduledExecutorService, zzfte zzfteVar, zzdgt zzdgtVar) {
        this.a = zzcobVar;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = zzflwVar;
        this.e = hsnVar;
        this.g = str;
        this.h = zzfrgVar;
        zzcobVar.a();
        this.i = zzeaeVar;
        this.f = scheduledExecutorService;
        this.j = zzfteVar;
        this.k = zzdgtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhbr a(String str, String str2) {
        ddb a;
        String str3;
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return zzhcy.b(new zzeqf(15, "Invalid ad string."));
        }
        Context context = this.b;
        zzfqw e = zzfqw.e(11, context);
        e.zza();
        zzbva b = com.google.android.gms.ads.internal.zzt.zzr().b(context, this.c, this.a.r());
        dff dffVar = zzbux.a;
        zzbve a2 = b.a("google.afma.response.normalize", dffVar, dffVar);
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i8)).booleanValue();
        int i = 6;
        hsn hsnVar = this.e;
        zzeae zzeaeVar = this.i;
        if (booleanValue) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.m = jSONObject.optString("fetch_url", "");
                this.n = zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Invalid ad response.");
                str4 = this.m;
                List list = this.n;
                if (TextUtils.isEmpty(str4)) {
                }
                hlo h = zzhcy.h(zzhcy.h(zzhcy.h(a, new cpn(str2, 7), hsnVar), new spn(5, this, a2), hsnVar), new cpn(this, i), hsnVar);
                zzfrf.c(h, this.h, e, false);
                h.addListener(new vlo(0, h, new d1l(this, 17)), zzcgj.h);
                return h;
            }
            str4 = this.m;
            List list2 = this.n;
            if (TextUtils.isEmpty(str4)) {
                zzeaeVar.b("sst", "2");
                String str6 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k8);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.j8)).booleanValue()) {
                    bho bhoVar = new bho(p);
                    zzguk.e(bhoVar, "The pattern may not match the empty string: %s", !bhoVar.a("").a.matches());
                    List c = new zzguz(new d1l(bhoVar, 25)).c(str4);
                    if (c.size() < 2) {
                        a = zzhcy.b(new zzeqf(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) c.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                a = zzhcy.f((zzhcq) zzhcy.g(zzhcq.r(zzcgj.a.submit(new een(8, this, new zzeji(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6)))), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l8)).intValue(), TimeUnit.MILLISECONDS, this.f), Exception.class, new spn(i, this, list2), hsnVar);
            } else {
                a = zzhcy.a(str3);
                zzeaeVar.b("sst", "1");
            }
        } else {
            a = zzhcy.a(str);
            zzeaeVar.b("sst", "1");
        }
        hlo h2 = zzhcy.h(zzhcy.h(zzhcy.h(a, new cpn(str2, 7), hsnVar), new spn(5, this, a2), hsnVar), new cpn(this, i), hsnVar);
        zzfrf.c(h2, this.h, e, false);
        h2.addListener(new vlo(0, h2, new d1l(this, 17)), zzcgj.h);
        return h2;
    }

    public final void b(zzdzs zzdzsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n8)).booleanValue()) {
            x5n.q(zzdzsVar.a, this.i);
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.g));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(concat);
            return str;
        }
    }
}
