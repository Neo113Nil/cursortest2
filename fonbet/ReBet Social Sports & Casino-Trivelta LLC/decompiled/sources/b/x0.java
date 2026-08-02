package b;

import b3.AbstractC2382a;
import b3.AbstractC2387f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24154a;

    public x0(byte[] bArr) {
        this.f24154a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24154a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 27, this.f24154a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof x0) {
            return Arrays.equals(this.f24154a, ((x0) w0Var).f24154a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24154a);
    }

    public final String toString() {
        return AbstractC2387f.a(this.f24154a);
    }
}
