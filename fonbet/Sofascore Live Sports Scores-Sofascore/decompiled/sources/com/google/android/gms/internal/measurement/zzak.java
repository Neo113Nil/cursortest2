package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dmi;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzak {
    static zzao b(zzak zzakVar, zzas zzasVar, zzg zzgVar, ArrayList arrayList) {
        String str = zzasVar.a;
        if (zzakVar.zzj(str)) {
            zzao zzk = zzakVar.zzk(str);
            if (zzk instanceof zzai) {
                return ((zzai) zzk).d(zzgVar, arrayList);
            }
            a70.p(dmi.y(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            zzh.a(1, "hasOwnProperty", arrayList);
            return zzakVar.zzj(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc()) ? zzao.N7 : zzao.O7;
        }
        a70.p(dmi.q("Object has no function ", str));
        return null;
    }

    void a(String str, zzao zzaoVar);

    boolean zzj(String str);

    zzao zzk(String str);
}
