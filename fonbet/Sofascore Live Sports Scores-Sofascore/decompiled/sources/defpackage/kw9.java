package defpackage;

import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kw9 {
    public static final ri2 c = ri2.j();
    public final eff a;
    public g0c b = j0c.a;

    public kw9(eff effVar) {
        this.a = effVar;
    }

    public final x0c a() {
        g0c g0cVar = this.b;
        Parser parser = ri2.parser();
        eff effVar = this.a;
        effVar.getClass();
        q0c q0cVar = new q0c(new c00(5, effVar, parser));
        final int i = 0;
        xn3 xn3Var = new xn3(this) { // from class: iw9
            public final /* synthetic */ kw9 b;

            {
                this.b = this;
            }

            @Override // defpackage.xn3
            public final void accept(Object obj) {
                int i2 = i;
                kw9 kw9Var = this.b;
                switch (i2) {
                    case 0:
                        kw9Var.b = g0c.a((ri2) obj);
                        break;
                    default:
                        kw9Var.b = j0c.a;
                        break;
                }
            }
        };
        p4h p4hVar = un0.m;
        x0c x0cVar = new x0c(q0cVar, xn3Var, p4hVar);
        g0cVar.getClass();
        final int i2 = 1;
        return new x0c(new l0c(g0cVar, x0cVar, 2), p4hVar, new xn3(this) { // from class: iw9
            public final /* synthetic */ kw9 b;

            {
                this.b = this;
            }

            @Override // defpackage.xn3
            public final void accept(Object obj) {
                int i22 = i2;
                kw9 kw9Var = this.b;
                switch (i22) {
                    case 0:
                        kw9Var.b = g0c.a((ri2) obj);
                        break;
                    default:
                        kw9Var.b = j0c.a;
                        break;
                }
            }
        });
    }
}
