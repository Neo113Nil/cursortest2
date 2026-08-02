package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqn implements zzbqh {
    public final Context a;
    public final Map b;

    public zzbqn(Context context, Map map) {
        this.a = context;
        this.b = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        zzcer zzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.a;
        if (zzD.a(context)) {
            String str = (String) map.get(U3.i.j0);
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                Map map2 = this.b;
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        zzcer zzD2 = com.google.android.gms.ads.internal.zzt.zzD();
                        Map map3 = (Map) map2.get("_ai");
                        zzD2.getClass();
                        zzD2.h(context, "_ai", str2, zzcer.f(map3));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    zzcer zzD3 = com.google.android.gms.ads.internal.zzt.zzD();
                    Map map4 = (Map) map2.get("_ac");
                    zzD3.getClass();
                    zzD3.h(context, "_ac", str2, zzcer.f(map4));
                    return;
                }
            } else if (str.equals("_aa")) {
                com.google.android.gms.ads.internal.zzt.zzD().h(context, "_aa", str2, null);
                return;
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
