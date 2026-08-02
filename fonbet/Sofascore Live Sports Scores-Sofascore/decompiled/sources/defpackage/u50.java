package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class u50 {
    public static final wj9 a = wj9.J(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static t50 a(lha lhaVar, plb plbVar) {
        ArrayList arrayList = new ArrayList();
        if (lhaVar.Z() == 1) {
            lhaVar.h();
            while (lhaVar.t()) {
                lha lhaVar2 = lhaVar;
                plb plbVar2 = plbVar;
                arrayList.add(new bbe(plbVar2, pja.b(lhaVar2, plbVar2, vik.c(), hjg.f, lhaVar.Z() == 3, false)));
                lhaVar = lhaVar2;
                plbVar = plbVar2;
            }
            lhaVar.m();
            qja.b(arrayList);
        } else {
            arrayList.add(new nja(nha.b(lhaVar, vik.c())));
        }
        return new t50(arrayList, 0);
    }

    public static z50 b(lha lhaVar, plb plbVar) {
        lhaVar.k();
        t50 t50Var = null;
        s50 s50Var = null;
        boolean z = false;
        s50 s50Var2 = null;
        while (lhaVar.Z() != 4) {
            int e0 = lhaVar.e0(a);
            if (e0 == 0) {
                t50Var = a(lhaVar, plbVar);
            } else if (e0 != 1) {
                if (e0 != 2) {
                    lhaVar.f0();
                    lhaVar.g0();
                } else if (lhaVar.Z() == 6) {
                    lhaVar.g0();
                    z = true;
                } else {
                    s50Var = un0.C(lhaVar, plbVar, true);
                }
            } else if (lhaVar.Z() == 6) {
                lhaVar.g0();
                z = true;
            } else {
                s50Var2 = un0.C(lhaVar, plbVar, true);
            }
        }
        lhaVar.n();
        if (z) {
            plbVar.a("Lottie doesn't support expressions.");
        }
        return t50Var != null ? t50Var : new v50(s50Var2, s50Var);
    }
}
