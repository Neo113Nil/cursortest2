package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ln8 extends o6a {
    @Override // defpackage.o6a
    public final List A() {
        return S().A();
    }

    @Override // defpackage.o6a
    public final ao2 C() {
        return S().C();
    }

    @Override // defpackage.o6a
    public final Object D() {
        return S().D();
    }

    @Override // defpackage.o6a
    public final void K() {
        S().K();
    }

    @Override // defpackage.o6a
    public void L() {
        S().L();
    }

    @Override // defpackage.o6a
    public void O(List list) {
        S().O(list);
    }

    public abstract o6a S();

    public String toString() {
        en0 I = qea.I(this);
        I.e(S(), "delegate");
        return I.toString();
    }
}
