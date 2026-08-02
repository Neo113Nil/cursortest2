package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r06 implements wff {
    public final /* synthetic */ int a;
    public final u7h b;

    public /* synthetic */ r06(u7h u7hVar, int i) {
        this.a = i;
        this.b = u7hVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        u7h u7hVar = this.b;
        switch (i) {
            case 0:
                return new q06((vff) u7hVar.b);
            case 1:
                r38 r38Var = (r38) u7hVar.b;
                r38Var.getClass();
                z7h z7hVar = z7h.a;
                return z7h.a(r38Var);
            default:
                return new qhb((Context) u7hVar.b);
        }
    }
}
