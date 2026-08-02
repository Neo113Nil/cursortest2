package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pw1 extends kn8 {
    public final /* synthetic */ int b;
    public Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw1(cwh cwhVar, int i) {
        super(cwhVar);
        this.b = i;
    }

    @Override // defpackage.kn8, defpackage.cwh
    public final long read(x52 x52Var, long j) {
        switch (this.b) {
            case 0:
                try {
                    return super.read(x52Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            default:
                try {
                    return super.read(x52Var, j);
                } catch (Exception e2) {
                    this.c = e2;
                    throw e2;
                }
        }
    }
}
