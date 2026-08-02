package b;

import b3.AbstractC2382a;
import java.util.Arrays;

/* renamed from: b.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2281I extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24071a;

    public C2281I(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f24071a = bArr;
        if (!j(0) || !j(1) || !j(2) || !j(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    @Override // b.w0
    public int a(boolean z10) {
        return q0.a(z10, this.f24071a.length);
    }

    @Override // b.w0
    public void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 24, this.f24071a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2281I) {
            return Arrays.equals(this.f24071a, ((C2281I) w0Var).f24071a);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public w0 h() {
        return new A0(this.f24071a);
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24071a);
    }

    public final boolean j(int i10) {
        byte b10;
        byte[] bArr = this.f24071a;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }
}
