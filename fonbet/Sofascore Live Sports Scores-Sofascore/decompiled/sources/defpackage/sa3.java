package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sa3 extends ma3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sa3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ma3
    public final void d(ya3 ya3Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cm5 cm5Var = new cm5(un0.k);
                ya3Var.a(cm5Var);
                try {
                    ((ya) obj).run();
                    if (!cm5Var.g()) {
                        ya3Var.onComplete();
                        break;
                    }
                } catch (Throwable th) {
                    td4.w0(th);
                    if (cm5Var.g()) {
                        hda.L(th);
                        return;
                    } else {
                        ya3Var.onError(th);
                        return;
                    }
                }
                break;
            case 1:
                cm5 cm5Var2 = new cm5(un0.k);
                ya3Var.a(cm5Var2);
                try {
                    ((c00) obj).call();
                    if (!cm5Var2.g()) {
                        ya3Var.onComplete();
                        break;
                    }
                } catch (Throwable th2) {
                    td4.w0(th2);
                    if (cm5Var2.g()) {
                        hda.L(th2);
                        return;
                    } else {
                        ya3Var.onError(th2);
                        return;
                    }
                }
                break;
            default:
                ((ab3) obj).c(new dad(this, ya3Var));
                break;
        }
    }
}
