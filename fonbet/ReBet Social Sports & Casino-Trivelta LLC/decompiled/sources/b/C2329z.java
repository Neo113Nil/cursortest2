package b;

import b3.AbstractC2382a;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: b.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2329z extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C2329z[] f24157b = new C2329z[12];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24158a;

    public C2329z(byte[] bArr, boolean z10) {
        if (C2290S.j(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & ByteCompanionObject.MIN_VALUE) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f24158a = z10 ? AbstractC2382a.a(bArr) : bArr;
        C2290S.k(bArr);
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24158a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 10, this.f24158a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2329z) {
            return Arrays.equals(this.f24158a, ((C2329z) w0Var).f24158a);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24158a);
    }

    public final BigInteger j() {
        return new BigInteger(this.f24158a);
    }
}
