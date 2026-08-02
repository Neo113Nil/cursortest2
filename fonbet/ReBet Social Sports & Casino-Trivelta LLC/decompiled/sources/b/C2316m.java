package b;

import b3.AbstractC2382a;
import b3.AbstractC2387f;
import java.util.Arrays;

/* renamed from: b.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2316m extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24133a;

    public C2316m(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f24133a = bArr;
        if (!j(0) || !j(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24133a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 23, this.f24133a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2316m) {
            return Arrays.equals(this.f24133a, ((C2316m) w0Var).f24133a);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24133a);
    }

    public final boolean j(int i10) {
        byte b10;
        byte[] bArr = this.f24133a;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    public final String toString() {
        return AbstractC2387f.a(this.f24133a);
    }
}
