package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vvj implements k41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vvj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k41
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((wvj) obj).k = true;
                break;
            case 1:
                ((wvj) obj).k = true;
                break;
            case 2:
                ((wvj) obj).k = true;
                break;
            default:
                p41 p41Var = (p41) obj;
                boolean z = p41Var.r.l() == 1.0f;
                if (z != p41Var.x) {
                    p41Var.x = z;
                    p41Var.o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
