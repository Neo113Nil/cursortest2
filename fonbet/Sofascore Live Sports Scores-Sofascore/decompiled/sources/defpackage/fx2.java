package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fx2 extends g4 {
    public final wkn h;

    public fx2(wkn wknVar) {
        this.h = wknVar;
    }

    @Override // defpackage.g4
    public final void i() {
        this.h.q("GrpcFuture was cancelled", null);
    }

    @Override // defpackage.g4
    public final String j() {
        en0 I = qea.I(this);
        I.e(this.h, "clientCall");
        return I.toString();
    }
}
