package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ahn;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.mon;
import defpackage.non;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqg {
    public static final mon a = new mon(12);
    public static final mon b = new mon(13);
    public static final mon c = new mon(14);
    public static final mon d = new mon(15);
    public static final mon e = new mon(16);
    public static final mon f = new mon(17);
    public static final zzcjg g = new zzcjg();
    public static final zzcjh h = new zzcjh();
    public static final zzbpa i = new zzbpa();
    public static final zzbqz j = new zzbqz();
    public static final mon k = new mon(18);
    public static final mon l = new mon(19);
    public static final mon m = new mon(0);
    public static final mon n = new mon(1);
    public static final mon o = new mon(2);
    public static final mon p = new mon(3);
    public static final mon q = new mon(4);
    public static final mon r = new mon(5);
    public static final mon s = new mon(6);
    public static final mon t = new mon(7);
    public static final mon u = new mon(8);
    public static final mon v = new mon(9);
    public static final mon w = new mon(10);
    public static final mon x = new mon(11);

    public static ddb a(zzclm zzclmVar, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            zzbbd p2 = zzclmVar.p();
            zzfma zzT = zzclmVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hd)).booleanValue() || zzT == null) {
                if (p2 != null && p2.a(parse)) {
                    parse = p2.b(parse, zzclmVar.getContext(), zzclmVar.zzE(), zzclmVar.zzj());
                }
            } else if (p2 != null && p2.a(parse)) {
                parse = zzT.a(parse, zzclmVar.getContext(), zzclmVar.zzE(), zzclmVar.zzj());
            }
        } catch (zzbbe unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(concat);
        }
        Map hashMap = new HashMap();
        if (zzclmVar.e() != null) {
            hashMap = zzclmVar.e().w0;
        }
        Context context = zzclmVar.getContext();
        if (com.google.android.gms.ads.internal.zzt.zzD().a(context)) {
            String d2 = com.google.android.gms.ads.internal.zzt.zzD().d(context);
            if (d2 == null) {
                str2 = parse.toString();
            } else {
                String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z0);
                String uri = parse.toString();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y0)).booleanValue() && uri.contains(str3)) {
                    zzcer zzD = com.google.android.gms.ads.internal.zzt.zzD();
                    Map map = (Map) hashMap.get("_ac");
                    zzD.getClass();
                    zzD.h(context, "_ac", d2, zzcer.f(map));
                    str2 = zzcet.c(context, uri).replace(str3, d2);
                } else {
                    if (TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X0)).booleanValue()) {
                            String uri2 = zzcet.b(zzcet.c(context, uri), "fbs_aeid", d2).toString();
                            zzcer zzD2 = com.google.android.gms.ads.internal.zzt.zzD();
                            Map map2 = (Map) hashMap.get("_ac");
                            zzD2.getClass();
                            zzD2.h(context, "_ac", d2, zzcer.f(map2));
                            str2 = uri2;
                        }
                    }
                    str2 = uri;
                }
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = ((Long) zzblg.e.c()).longValue();
        if (longValue <= 0 || longValue > 262180000) {
            return zzhcy.a(str2);
        }
        zzhcq r2 = zzhcq.r(zzclmVar.E());
        ahn ahnVar = ahn.c;
        hsn hsnVar = zzcgj.h;
        return zzhcy.e(zzhcy.i(zzhcy.e(r2, Throwable.class, ahnVar, hsnVar), new non(str2, 0), hsnVar), Throwable.class, new non(str2, 1), hsnVar);
    }

    public static void b(Map map, zzdlw zzdlwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.rc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdlwVar != null) {
            zzdlwVar.M();
        }
    }
}
