package k1;

import io.agora.rtc2.internal.AudioRoutingController;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5145a {

    /* renamed from: a, reason: collision with root package name */
    public int f54097a;

    public final void e(int i10) {
        this.f54097a = i10 | this.f54097a;
    }

    public void f() {
        this.f54097a = 0;
    }

    public final boolean g(int i10) {
        return (this.f54097a & i10) == i10;
    }

    public final boolean h() {
        return g(268435456);
    }

    public final boolean i() {
        return g(4);
    }

    public final boolean j() {
        return g(134217728);
    }

    public final boolean k() {
        return g(1);
    }

    public final boolean l() {
        return g(PKIFailureInfo.duplicateCertReq);
    }

    public final boolean m() {
        return g(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    public final void n(int i10) {
        this.f54097a = i10;
    }
}
