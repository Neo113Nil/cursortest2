package Ph;

import Sh.C1579q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class H0 extends C1579q implements InterfaceC1456i0, InterfaceC1487y0 {

    /* renamed from: d, reason: collision with root package name */
    public I0 f9007d;

    @Override // Ph.InterfaceC1487y0
    public N0 b() {
        return null;
    }

    @Override // Ph.InterfaceC1456i0
    public void dispose() {
        t().v0(this);
    }

    @Override // Ph.InterfaceC1487y0
    public boolean isActive() {
        return true;
    }

    public final I0 t() {
        I0 i02 = this.f9007d;
        if (i02 != null) {
            return i02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // Sh.C1579q
    public String toString() {
        return U.a(this) + '@' + U.b(this) + "[job@" + U.b(t()) + ']';
    }

    public abstract boolean u();

    public abstract void v(Throwable th2);

    public final void w(I0 i02) {
        this.f9007d = i02;
    }
}
