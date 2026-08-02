package b;

import b3.AbstractC2382a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24059a;

    static {
        new C2284L();
    }

    public D0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.f24059a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24059a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 25, this.f24059a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof D0) {
            return Arrays.equals(this.f24059a, ((D0) w0Var).f24059a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24059a);
    }
}
