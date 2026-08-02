package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vxj implements zff {
    public final p90 a;
    public final q90 b;
    public final cc4 c;
    public final p90 d;
    public final cc4 e;
    public final cc4 f;

    public vxj(p90 p90Var, q90 q90Var, cc4 cc4Var, p90 p90Var2, dc4 dc4Var, cc4 cc4Var2, cc4 cc4Var3) {
        this.a = p90Var;
        this.b = q90Var;
        this.c = cc4Var;
        this.d = p90Var2;
        this.e = cc4Var2;
        this.f = cc4Var3;
    }

    @Override // defpackage.yff
    public final Object get() {
        r38 r38Var = (r38) this.a.b.b;
        wxj wxjVar = (wxj) this.b.b;
        return new mjc(new imf(((xxj) wxjVar).a("FIREBASE_INAPPMESSAGING", new kn5("proto"), new ogj(14)), 23), (iu) this.c.get(), r38Var, (l48) this.d.get(), new igf(3), (qy4) this.e.get(), (Executor) this.f.get());
    }
}
