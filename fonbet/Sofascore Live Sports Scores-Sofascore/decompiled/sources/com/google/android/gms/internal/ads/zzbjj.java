package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.ironsource.L6;
import com.ironsource.U3;
import defpackage.b0a;
import defpackage.ddb;
import defpackage.een;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbjj {
    public final String a = (String) zzblb.a.c();
    public final LinkedHashMap b;
    public final Context c;
    public final String d;

    public zzbjj(Context context, String str) {
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(L6.F, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put(U3.i.G, com.google.android.gms.ads.internal.util.zzs.zzt());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? "0" : "1");
        zzccc zzp = com.google.android.gms.ads.internal.zzt.zzp();
        zzp.getClass();
        ddb submit = zzcgj.a.submit(new een(zzp, context, false, 2));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbz) submit.get()).j));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbz) submit.get()).k));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("CsiConfiguration.CsiConfiguration", e);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Wc)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = this.b;
            com.google.android.gms.ads.internal.zzt.zzc();
            linkedHashMap2.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.zzE(context) ? "0" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Wa)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l3)).booleanValue() || b0a.U(com.google.android.gms.ads.internal.zzt.zzh().g)) {
                return;
            }
            this.b.put(L6.L, com.google.android.gms.ads.internal.zzt.zzh().g);
        }
    }
}
