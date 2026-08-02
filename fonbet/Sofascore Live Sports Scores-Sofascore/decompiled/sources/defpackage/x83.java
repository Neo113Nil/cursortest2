package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x83 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ osa b;

    public /* synthetic */ x83(osa osaVar, int i) {
        this.a = i;
        this.b = osaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        String str;
        int g;
        String str2;
        String str3;
        int i2 = this.a;
        String str4 = null;
        str4 = null;
        osa osaVar = this.b;
        int intValue = ((Integer) obj).intValue();
        switch (i2) {
            case 0:
                w83 w83Var = (w83) osaVar.e(intValue);
                if (w83Var instanceof u83) {
                    return dmi.q("section_", ((u83) w83Var).a);
                }
                if (w83Var instanceof q83) {
                    return "empty_state";
                }
                if (w83Var instanceof r83) {
                    i = ((r83) w83Var).a;
                    str = "player_";
                } else {
                    if (!(w83Var instanceof s83)) {
                        if ((w83Var instanceof v83) || w83Var == null) {
                            return ljg.j(intValue, "placeholder_");
                        }
                        zzl.b();
                        return null;
                    }
                    i = ((s83) w83Var).a;
                    str = "team_";
                }
                return dmi.k(intValue, i, str, "_");
            case 1:
                ia0 ia0Var = ia0.q;
                if (!mz1.C() || (intValue != 7 && (intValue <= 7 || intValue % 10 != 6))) {
                    int A = intValue - hz8.A(intValue);
                    if (A >= osaVar.c()) {
                        return ljg.j(intValue, "unloaded_post_");
                    }
                    w31 w31Var = (w31) osaVar.e(A);
                    if (w31Var == null) {
                        return ljg.j(A, "post_placeholder_");
                    }
                    g = w31Var.getG();
                    str2 = "post_";
                } else {
                    g = hz8.A(intValue);
                    str2 = "ad_slot_";
                }
                return ljg.j(g, str2);
            case 2:
                osd osdVar = (osd) osaVar.b(intValue);
                if (osdVar != null) {
                    if (osdVar instanceof lsd) {
                        str3 = ((lsd) osdVar).a.a();
                    } else if (osdVar.equals(msd.a)) {
                        str3 = "NoQueryEmptyState";
                    } else {
                        if (!osdVar.equals(nsd.a)) {
                            zzl.b();
                            return str4;
                        }
                        str3 = "NoResultsEmptyState";
                    }
                    str4 = str3;
                }
                if (str4 == null) {
                    return "";
                }
                return str4;
            case 3:
                m1e m1eVar = (m1e) osaVar.b(intValue);
                String str5 = m1eVar != null ? m1eVar.j : null;
                return str5 == null ? "" : str5;
            default:
                d2e d2eVar = (d2e) osaVar.b(intValue);
                return Integer.valueOf(yid.m(d2eVar != null ? Integer.valueOf(d2eVar.a) : null));
        }
    }
}
