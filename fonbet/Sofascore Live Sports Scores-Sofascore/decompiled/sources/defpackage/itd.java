package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class itd extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ne8 j;
    public final /* synthetic */ ne8 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ x40 m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ itd(ne8 ne8Var, ne8 ne8Var2, Object obj, int i, x40 x40Var, int i2) {
        super(1);
        this.i = i2;
        this.j = ne8Var;
        this.k = ne8Var2;
        this.n = obj;
        this.l = i;
        this.m = x40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        x40 x40Var = this.m;
        int i2 = this.l;
        Object obj2 = this.n;
        ne8 ne8Var = this.k;
        ne8 ne8Var2 = this.j;
        switch (i) {
            case 0:
                gv1 gv1Var = (gv1) obj;
                if (ne8Var2 != ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean Q = yaa.Q(ne8Var, (ne8) obj2, i2, x40Var);
                Boolean valueOf = Boolean.valueOf(Q);
                if (Q || !gv1Var.a()) {
                    return valueOf;
                }
                return null;
            default:
                gv1 gv1Var2 = (gv1) obj;
                if (ne8Var2 != ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean P = w3a.P(i2, x40Var, ne8Var, (oqf) obj2);
                Boolean valueOf2 = Boolean.valueOf(P);
                if (P || !gv1Var2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
