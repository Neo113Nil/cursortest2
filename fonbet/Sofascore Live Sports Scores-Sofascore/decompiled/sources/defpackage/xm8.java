package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xm8 extends wkn {
    @Override // defpackage.wkn
    public final void D() {
        U().D();
    }

    @Override // defpackage.wkn
    public final void L() {
        U().L();
    }

    @Override // defpackage.wkn
    public final void N(Object obj) {
        U().N(obj);
    }

    public abstract wkn U();

    @Override // defpackage.wkn
    public void q(String str, Throwable th) {
        U().q(str, th);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(U(), "delegate");
        return I.toString();
    }
}
