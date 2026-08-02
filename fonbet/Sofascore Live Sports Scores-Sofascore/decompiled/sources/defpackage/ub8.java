package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ub8 extends n3 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub8(ob8 ob8Var, Object obj, int i) {
        super(ob8Var);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        int i = this.c;
        int i2 = 0;
        int i3 = 1;
        ob8 ob8Var = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                pw9 pw9Var = (pw9) obj;
                if (!ao2.I(ob8Var, ed8Var, pw9Var)) {
                    int C = wt3.C(1);
                    ob8Var.d(C != 1 ? C != 2 ? new rb8(ed8Var, pw9Var) : new qb8(ed8Var, pw9Var, true) : new qb8(ed8Var, pw9Var, false));
                    break;
                }
                break;
            case 1:
                if (!(ed8Var instanceof ai3)) {
                    ob8Var.d(new bc8(ed8Var));
                    break;
                } else {
                    ob8Var.d(new ac8((ai3) ed8Var));
                    break;
                }
            case 2:
                k3f k3fVar = (k3f) obj;
                if (!(ed8Var instanceof ai3)) {
                    ob8Var.d(new ic8(ed8Var, k3fVar));
                    break;
                } else {
                    ob8Var.d(new hc8((ai3) ed8Var, k3fVar, i2));
                    break;
                }
            case 3:
                ob8Var.d(new mc8(ed8Var, (bt8) obj));
                break;
            default:
                hpo hpoVar = (hpo) obj;
                if (!(ed8Var instanceof ai3)) {
                    ob8Var.d(new sc8(ed8Var, hpoVar));
                    break;
                } else {
                    ob8Var.d(new hc8((ai3) ed8Var, hpoVar, i3));
                    break;
                }
        }
    }
}
