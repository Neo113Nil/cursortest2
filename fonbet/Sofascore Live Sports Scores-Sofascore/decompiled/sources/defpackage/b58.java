package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b58 implements xff {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b58(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                r38 r38Var = (r38) ((ujg) obj).b;
                w3a.q(r38Var);
                return r38Var;
            case 1:
                l48 l48Var = (l48) ((ujg) obj).c;
                w3a.q(l48Var);
                return l48Var;
            case 2:
                vff vffVar = (vff) ((ujg) obj).d;
                w3a.q(vffVar);
                return vffVar;
            case 3:
                vff vffVar2 = (vff) ((ujg) obj).e;
                w3a.q(vffVar2);
                return vffVar2;
            default:
                mc4 mc4Var = (mc4) obj;
                return new rv7(mc4Var.c.b, (SharedPreferences) mc4Var.l.get());
        }
    }
}
