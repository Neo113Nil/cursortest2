package b;

import b3.AbstractC2382a;
import java.util.Arrays;

/* renamed from: b.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2292U extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24081a;

    public C2292U(byte[] bArr) {
        this.f24081a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24081a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 21, this.f24081a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2292U) {
            return Arrays.equals(this.f24081a, ((C2292U) w0Var).f24081a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24081a);
    }
}
