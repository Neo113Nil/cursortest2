package b;

import b3.AbstractC2382a;
import b3.AbstractC2387f;
import java.util.Arrays;

/* renamed from: b.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2286N extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24073a;

    public C2286N(byte[] bArr) {
        this.f24073a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24073a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 12, this.f24073a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2286N) {
            return Arrays.equals(this.f24073a, ((C2286N) w0Var).f24073a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24073a);
    }

    public final String toString() {
        return AbstractC2387f.b(this.f24073a);
    }
}
