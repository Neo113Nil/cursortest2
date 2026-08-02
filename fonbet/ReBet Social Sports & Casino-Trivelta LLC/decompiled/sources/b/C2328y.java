package b;

import b3.AbstractC2382a;
import b3.AbstractC2387f;
import java.util.Arrays;

/* renamed from: b.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2328y extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24155a;

    public C2328y(byte[] bArr) {
        this.f24155a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24155a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 19, this.f24155a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2328y) {
            return Arrays.equals(this.f24155a, ((C2328y) w0Var).f24155a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24155a);
    }

    public final String toString() {
        return AbstractC2387f.a(this.f24155a);
    }
}
