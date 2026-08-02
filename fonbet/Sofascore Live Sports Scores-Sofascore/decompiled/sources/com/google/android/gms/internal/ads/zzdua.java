package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzdtg;
import defpackage.ahn;
import defpackage.ddb;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.olo;
import defpackage.t0o;
import defpackage.tlo;
import defpackage.u0o;
import defpackage.v0o;
import defpackage.x5n;
import defpackage.xlo;
import defpackage.yvn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdua {
    public final Context a;
    public final zzdtg b;
    public final zzbbd c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbif f;
    public final hsn g;
    public final zzbmk h;
    public final zzdus i;
    public final zzdxg j;
    public final ScheduledExecutorService k;
    public final zzdwb l;
    public final zzeaj m;
    public final zzfte n;
    public final zzele o;
    public final zzelp p;
    public final zzfma q;
    public final zzeae r;
    public final zzebm s;
    public final zzdcg t;

    public zzdua(Context context, zzdtg zzdtgVar, zzbbd zzbbdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, hsn hsnVar, zzflw zzflwVar, zzdus zzdusVar, zzdxg zzdxgVar, ScheduledExecutorService scheduledExecutorService, zzeaj zzeajVar, zzfte zzfteVar, zzele zzeleVar, zzdwb zzdwbVar, zzelp zzelpVar, zzfma zzfmaVar, zzeae zzeaeVar, zzebm zzebmVar, zzdcg zzdcgVar) {
        this.a = context;
        this.b = zzdtgVar;
        this.c = zzbbdVar;
        this.d = versionInfoParcel;
        this.e = zzaVar;
        this.f = zzbifVar;
        this.g = hsnVar;
        this.h = zzflwVar.j;
        this.i = zzdusVar;
        this.j = zzdxgVar;
        this.k = scheduledExecutorService;
        this.m = zzeajVar;
        this.n = zzfteVar;
        this.o = zzeleVar;
        this.l = zzdwbVar;
        this.p = zzelpVar;
        this.q = zzfmaVar;
        this.r = zzeaeVar;
        this.s = zzebmVar;
        this.t = zzdcgVar;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(com.vungle.ads.internal.task.g.e), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzew f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzew(optString, optString2);
    }

    public final ddb a(JSONArray jSONArray, boolean z, boolean z2, zzdzs zzdzsVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhcy.a(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
            x5n.q(zzdzsVar.a, this.r);
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(b(jSONArray.optJSONObject(i), z, null));
        }
        return zzhcy.i(new olo(zzgxm.x(arrayList), true), ahn.i, this.g);
    }

    public final ddb b(JSONObject jSONObject, boolean z, zzdzs zzdzsVar) {
        int i;
        double d;
        if (jSONObject == null) {
            return xlo.b;
        }
        HashMap hashMap = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X4)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y4))) {
                hashMap = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z4)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
                    try {
                        hashMap.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        HashMap hashMap2 = hashMap;
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) && hashMap2 == null) {
            return xlo.b;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue() && zzdzsVar != null) {
            x5n.q(zzdzsVar.a, this.r);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            i = optInt;
            d = optDouble;
        } else {
            if (hashMap2 == null) {
                final zzdtg zzdtgVar = this.b;
                hsn hsnVar = zzdtgVar.c;
                return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzhcy.i((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l7)).booleanValue() && optString != null && optString.startsWith("data:")) ? zzhcy.c(hsnVar, new Callable() { // from class: o0o
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        zzdtg zzdtgVar2 = zzdtg.this;
                        zzdtgVar2.getClass();
                        String str2 = optString;
                        int indexOf = str2.indexOf(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                        if (indexOf == -1) {
                            a70.p("Bad data URL: no ',' found for base64 data");
                            return null;
                        }
                        if (!str2.substring(0, indexOf).endsWith(";base64")) {
                            a70.p("Bad data URL: only base64 is supported");
                            return null;
                        }
                        int indexOf2 = str2.indexOf(":");
                        int indexOf3 = str2.indexOf(";");
                        if (indexOf2 != -1 && str2.substring(indexOf2 + 1, indexOf3).startsWith("image/")) {
                            return zzdtgVar2.a(Base64.decode(str2.substring(indexOf + 1), 0), optDouble, optBoolean);
                        }
                        a70.p("Bad data URL: only image media is supported");
                        return null;
                    }
                }) : zzhcy.i(zzdtgVar.a.zza(optString), new zzgub() { // from class: p0o
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object apply(Object obj) {
                        zzdtg zzdtgVar2 = zzdtg.this;
                        zzdtgVar2.getClass();
                        return zzdtgVar2.a(((zzato) obj).b, optDouble, optBoolean);
                    }
                }, hsnVar), new zzgub() { // from class: s0o
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object apply(Object obj) {
                        return new zzbmg(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.g));
            }
            d = optDouble;
            i = optInt;
        }
        return zzhcy.a(new zzbmg(null, Uri.parse(optString), d, i, optInt2, hashMap2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hlo d(JSONObject jSONObject, zzfld zzfldVar, zzflg zzflgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcea zzceaVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        String optString = jSONObject.optString("base_url");
        String optString2 = jSONObject.optString("html");
        int i = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt != 0) {
            i = optInt;
        } else if (optInt2 == 0) {
            zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
            zzdus zzdusVar = this.i;
            zzdusVar.getClass();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                x5n.q("native-assets-loading-video-composition-start", zzdusVar.j);
            }
            hlo h = zzhcy.h(xlo.b, new t0o(zzdusVar, zzrVar, zzfldVar, zzflgVar, zzbVar, zzceaVar, optString, optString2, 1), zzdusVar.b);
            return zzhcy.h(h, new u0o(h, 1), zzcgj.h);
        }
        zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.a, new AdSize(i, optInt2));
        zzdus zzdusVar2 = this.i;
        zzdusVar2.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
        }
        hlo h2 = zzhcy.h(xlo.b, new t0o(zzdusVar2, zzrVar, zzfldVar, zzflgVar, zzbVar, zzceaVar, optString, optString2, 1), zzdusVar2.b);
        return zzhcy.h(h2, new u0o(h2, 1), zzcgj.h);
    }

    public final tlo e(String str, boolean z, ddb ddbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a3)).booleanValue()) {
            zzcgm.a(ddbVar, str, this.g);
        }
        return z ? zzhcy.h(ddbVar, new v0o(0, ddbVar), zzcgj.h) : zzhcy.f(ddbVar, Exception.class, new yvn(1), zzcgj.h);
    }
}
