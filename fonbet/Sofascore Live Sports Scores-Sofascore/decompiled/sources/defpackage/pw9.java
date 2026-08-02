package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.protobuf.Parser;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw9 implements xn3, bt8, k3f {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw9 b;

    public /* synthetic */ pw9(tw9 tw9Var, int i) {
        this.a = i;
        this.b = tw9Var;
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        int i = this.a;
        tw9 tw9Var = this.b;
        int i2 = 2;
        int i3 = 1;
        wy7 wy7Var = (wy7) obj;
        switch (i) {
            case 0:
                kw9 kw9Var = tw9Var.g;
                kw9Var.getClass();
                HashSet hashSet = new HashSet();
                for (yi2 yi2Var : wy7Var.j()) {
                    hashSet.add(wt3.b(yi2Var.l(), 1) ? yi2Var.o().i() : yi2Var.j().i());
                }
                hashSet.toString();
                x0c a = kw9Var.a();
                ri2 ri2Var = kw9.c;
                rha.x(ri2Var, "defaultItem is null");
                new oa3(i2, new l0c(a, g0c.a(ri2Var), 2), new o3(27, kw9Var, hashSet)).b();
                break;
            default:
                li2 li2Var = tw9Var.c;
                eff effVar = li2Var.a;
                effVar.getClass();
                new oa3(i3, new ab3(new sa3(new c00(6, effVar, wy7Var), i3).a(new o3(i2, li2Var, wy7Var)).a(new cp4(8)), new is8(25), un0.l), new is8(26)).b();
                break;
        }
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        int i = 28;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        switch (this.a) {
            case 1:
                String str = (String) obj;
                tw9 tw9Var = this.b;
                li2 li2Var = tw9Var.c;
                li2Var.getClass();
                q0c q0cVar = new q0c(new ji2(li2Var, i3));
                eff effVar = li2Var.a;
                Parser parser = wy7.parser();
                effVar.getClass();
                q0c q0cVar2 = new q0c(new c00(5, effVar, parser));
                ki2 ki2Var = new ki2(li2Var, i3);
                p4h p4hVar = un0.m;
                int i5 = 29;
                p0c p0cVar = new p0c(new x0c(new x0c(new x0c(new l0c(new l0c(q0cVar, new x0c(q0cVar2, ki2Var, p4hVar), 2), new ki2(li2Var, i4), 0), p4hVar, new ki2(li2Var, i2)), new is8(29), p4hVar), p4hVar, new sw9(0)), new v35(j0c.a, i4), 2);
                pw9 pw9Var = new pw9(tw9Var, 3);
                hi3 hi3Var = new hi3(tw9Var, str, new pw9(tw9Var, 4), new qw9(tw9Var, str, i4), new sw9(1), 3);
                x0c x0cVar = new x0c(tw9Var.g.a(), p4hVar, new sw9(2));
                ri2 j = ri2.j();
                rha.x(j, "defaultItem is null");
                p0c p0cVar2 = new p0c(new l0c(x0cVar, g0c.a(j), 2), new v35(g0c.a(ri2.j()), i4), 2);
                k48 k48Var = (k48) tw9Var.m;
                Task c = k48Var.c();
                Executor executor = tw9Var.o;
                m0c m0cVar = new m0c(i4, new g0c[]{new i0c(new o3(i5, c, executor), i3), new i0c(new o3(i5, k48Var.d(), executor), i3)}, new uxf(new is8(19)));
                gsg gsgVar = tw9Var.f.a;
                rha.x(gsgVar, "scheduler is null");
                o3 o3Var = new o3(i, tw9Var, new l0c(m0cVar, gsgVar, 1));
                ekg ekgVar = tw9Var.k;
                return ekgVar.b ? str.equals("ON_FOREGROUND") : ekgVar.a ? new zb8(new p0c(new p0c(p0cVar2, o3Var, 0), hi3Var, 0), 4) : new zb8(new p0c(new l0c(p0cVar, new x0c(new p0c(p0cVar2, o3Var, 0), pw9Var, p4hVar), 2), hi3Var, 0), 4);
            default:
                yi2 yi2Var = (yi2) obj;
                tw9 tw9Var2 = this.b;
                tw9Var2.getClass();
                if (yi2Var.k()) {
                    return g0c.a(yi2Var);
                }
                kw9 kw9Var = tw9Var2.g;
                kw9Var.getClass();
                String i6 = wt3.b(yi2Var.l(), 1) ? yi2Var.o().i() : yi2Var.j().i();
                gkd gkdVar = new gkd(new n0c(new p0c(kw9Var.a(), new is8(15), 1), new is8(16)), new is8(17), 1);
                rha.x(i6, "element is null");
                return new p0c(new m0c(i3, new ekd(i4, new ekd(i2, new whh(new ekd(i3, gkdVar, new ih2(i6, 2)), new is8(27)), new v35(new yhh(), i4)), new nw9(yi2Var)), new is8(28)), new nw9(yi2Var), 1);
        }
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        long k;
        long h;
        yi2 yi2Var = (yi2) obj;
        tw9 tw9Var = this.b;
        if (!tw9Var.k.a) {
            igf igfVar = tw9Var.d;
            if (wt3.b(yi2Var.l(), 1)) {
                k = yi2Var.o().k();
                h = yi2Var.o().h();
            } else {
                if (!wt3.b(yi2Var.l(), 2)) {
                    return false;
                }
                k = yi2Var.j().k();
                h = yi2Var.j().h();
            }
            igfVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= k || currentTimeMillis >= h) {
                return false;
            }
        }
        return true;
    }
}
