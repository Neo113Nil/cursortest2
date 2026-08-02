package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g48 implements zff {
    public final zff a;
    public final cc4 b;
    public final o90 c;
    public final p90 d;
    public final a55 e;
    public final cc4 f;
    public final cc4 g;

    public g48(zff zffVar, cc4 cc4Var, o90 o90Var, p90 p90Var, a55 a55Var, cc4 cc4Var2, cc4 cc4Var3) {
        this.a = zffVar;
        this.b = cc4Var;
        this.c = o90Var;
        this.d = p90Var;
        this.e = a55Var;
        this.f = cc4Var2;
        this.g = cc4Var3;
    }

    @Override // defpackage.yff
    public final Object get() {
        tw9 tw9Var = (tw9) this.a.get();
        bcf bcfVar = (bcf) this.b.get();
        this.c.get();
        return new v38(tw9Var, bcfVar, (l48) this.d.get(), (r18) this.e.get(), (qy4) this.f.get(), (Executor) this.g.get());
    }
}
