package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import defpackage.bf3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcet {
    public static String a(String str, Context context, boolean z, Map map) {
        String d;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g1)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzD().a(context) || TextUtils.isEmpty(str) || (d = com.google.android.gms.ads.internal.zzt.zzD().d(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y0)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
                zzcer zzD = com.google.android.gms.ads.internal.zzt.zzD();
                Map map2 = (Map) map.get("_ac");
                zzD.getClass();
                zzD.h(context, "_ac", d, zzcer.f(map2));
                return c(context, str).replace(str2, d);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                return str;
            }
            zzcer zzD2 = com.google.android.gms.ads.internal.zzt.zzD();
            Map map3 = (Map) map.get("_ai");
            zzD2.getClass();
            zzD2.h(context, "_ai", d, zzcer.f(map3));
            return c(context, str).replace(str2, d);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X0)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
            zzcer zzD3 = com.google.android.gms.ads.internal.zzt.zzD();
            Map map4 = (Map) map.get("_ac");
            zzD3.getClass();
            zzD3.h(context, "_ac", d, zzcer.f(map4));
            return b(c(context, str), "fbs_aeid", d).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            return str;
        }
        zzcer zzD4 = com.google.android.gms.ads.internal.zzt.zzD();
        Map map5 = (Map) map.get("_ai");
        zzD4.getClass();
        zzD4.h(context, "_ai", d, zzcer.f(map5));
        return b(c(context, str), "fbs_aeid", d).toString();
    }

    public static Uri b(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        bf3.v(sb, str2, U3.j.b, str3, U3.j.c);
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static String c(Context context, String str) {
        String b = com.google.android.gms.ads.internal.zzt.zzD().b(context);
        String c = com.google.android.gms.ads.internal.zzt.zzD().c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(b)) {
            str = b(str, "gmp_app_id", b).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(c)) ? str : b(str, "fbs_aiid", c).toString();
    }
}
