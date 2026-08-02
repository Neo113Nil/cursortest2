package b;

import b3.AbstractC2382a;
import b3.AbstractC2387f;
import java.util.Arrays;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313j extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24122a;

    public C2313j(byte[] bArr) {
        this.f24122a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24122a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 18, this.f24122a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2313j) {
            return Arrays.equals(this.f24122a, ((C2313j) w0Var).f24122a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24122a);
    }

    public final String toString() {
        return AbstractC2387f.a(this.f24122a);
    }
}
