package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x89 implements efb {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x89(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.efb
    public final void a(sk3 sk3Var) {
        dfb hgeVar;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((efb) obj).a(sk3Var);
                ((y89) obj2).h.a(sk3Var);
                break;
            case 1:
                zwd zwdVar = (zwd) obj2;
                zwdVar.j = sk3Var;
                if (!zwdVar.i) {
                    ((efb) obj).a(sk3Var);
                    break;
                }
                break;
            default:
                ige igeVar = (ige) obj2;
                f6a f6aVar = igeVar.g;
                o6a o6aVar = (o6a) obj;
                rk3 rk3Var = sk3Var.a;
                if (rk3Var != rk3.e) {
                    rk3 rk3Var2 = rk3.d;
                    rk3 rk3Var3 = rk3.c;
                    if (rk3Var == rk3Var3 || rk3Var == rk3Var2) {
                        f6aVar.C();
                    }
                    if (igeVar.i == rk3Var3) {
                        if (rk3Var != rk3.a) {
                            if (rk3Var == rk3Var2) {
                                igeVar.y();
                                break;
                            }
                        }
                    }
                    int ordinal = rk3Var.ordinal();
                    if (ordinal == 0) {
                        hgeVar = new hge(bfb.e);
                    } else if (ordinal == 1) {
                        hgeVar = new hge(bfb.b(o6aVar, null));
                    } else if (ordinal == 2) {
                        hgeVar = new hge(bfb.a(sk3Var.b));
                    } else if (ordinal != 3) {
                        is8.c(rk3Var, "Unsupported state:");
                        break;
                    } else {
                        hgeVar = new dge(igeVar, o6aVar);
                    }
                    igeVar.i = rk3Var;
                    f6aVar.M(rk3Var, hgeVar);
                    break;
                }
                break;
        }
    }
}
