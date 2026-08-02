package b;

import b3.AbstractC2382a;
import b3.AbstractC2385d;
import b3.C2383b;
import b3.C2384c;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Map;

/* renamed from: b.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2290S extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24080a;

    public C2290S(byte[] bArr) {
        if (j(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f24080a = bArr;
        k(bArr);
    }

    public static boolean j(byte[] bArr) {
        boolean z10;
        Map map;
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length == 1) {
            return false;
        }
        if (bArr[0] == (bArr[1] >> 7)) {
            ThreadLocal threadLocal = AbstractC2385d.f24981a;
            try {
                String str = (String) AccessController.doPrivileged(new C2383b());
                if (str == null && ((map = (Map) AbstractC2385d.f24981a.get()) == null || (str = (String) map.get("org.bouncyseoncastle.asn1.allow_unsafe_integer")) == null)) {
                    str = (String) AccessController.doPrivileged(new C2384c());
                }
                z10 = "true".equalsIgnoreCase(str);
            } catch (AccessControlException unused) {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public static void k(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            if (b10 != (bArr[i10] >> 7)) {
                return;
            }
        }
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24080a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 2, this.f24080a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2290S) {
            return Arrays.equals(this.f24080a, ((C2290S) w0Var).f24080a);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24080a);
    }

    public final BigInteger l() {
        return new BigInteger(this.f24080a);
    }

    public final String toString() {
        return l().toString();
    }
}
