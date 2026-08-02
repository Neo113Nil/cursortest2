package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zh6 extends k04 {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ w0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh6(gi6 gi6Var, p12 p12Var) {
        super(p12Var, null, gi6Var.r, 2);
        this.h = gi6Var;
    }

    @Override // defpackage.k04
    public final boolean d(int i, int i2, j04 j04Var) {
        int i3 = this.g;
        w0 w0Var = this.h;
        switch (i3) {
            case 0:
                return ((gi6) w0Var).P(i);
            default:
                if (((ehe) w0Var).V(i, j04Var)) {
                    return false;
                }
                return super.d(i, i2, j04Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh6(ehe eheVar, p12 p12Var) {
        super(p12Var, null, eheVar.v, 2);
        this.h = eheVar;
    }
}
