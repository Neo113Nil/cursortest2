package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ironsource.C4427z5;
import defpackage.pyh;
import defpackage.sgo;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzctn implements zzcsl {
    public final CookieManager a;

    public zzctn(Context context) {
        this.a = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcsl
    public final void a(HashMap hashMap) {
        CookieManager cookieManager = this.a;
        if (cookieManager == null) {
            return;
        }
        if (((String) hashMap.get("clear")) == null) {
            String str = (String) hashMap.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E1), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E1);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List c = zzguz.a(new sgo(';')).c(cookie);
            for (int i = 0; i < c.size(); i++) {
                String str3 = (String) c.get(i);
                zzguz a = zzguz.a(new sgo(C4427z5.U));
                str3.getClass();
                pyh pyhVar = (pyh) a.c.i(a, str3);
                if (!pyhVar.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (0)");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) pyhVar.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p1))));
            }
        }
    }
}
