package b;

import b3.AbstractC2382a;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class z0 extends w0 {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f24159f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24160a;

    /* renamed from: d, reason: collision with root package name */
    public String f24161d = null;

    public z0(byte[] bArr) {
        this.f24160a = bArr;
    }

    public static z0 j(byte[] bArr, boolean z10) {
        if (bArr.length > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        C2301b0 c2301b0 = new C2301b0(bArr);
        HashMap hashMap = f24159f;
        synchronized (hashMap) {
            try {
                z0 z0Var = (z0) hashMap.get(c2301b0);
                if (z0Var != null) {
                    return z0Var;
                }
                if (!k(bArr)) {
                    throw new IllegalArgumentException("invalid relative OID contents");
                }
                if (z10) {
                    bArr = AbstractC2382a.a(bArr);
                }
                return new z0(bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z10 = true;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (z10 && (bArr[i10] & UByte.MAX_VALUE) == 128) {
                return false;
            }
            z10 = (bArr[i10] & ByteCompanionObject.MIN_VALUE) == 0;
        }
        return z10;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24160a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 13, this.f24160a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (this == w0Var) {
            return true;
        }
        if (w0Var instanceof z0) {
            return Arrays.equals(this.f24160a, ((z0) w0Var).f24160a);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24160a);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f24161d == null) {
                    byte[] bArr = this.f24160a;
                    StringBuffer stringBuffer = new StringBuffer();
                    boolean z10 = true;
                    long j10 = 0;
                    BigInteger bigInteger = null;
                    for (int i10 = 0; i10 != bArr.length; i10++) {
                        byte b10 = bArr[i10];
                        if (j10 <= 72057594037927808L) {
                            long j11 = j10 + (b10 & ByteCompanionObject.MAX_VALUE);
                            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                                if (z10) {
                                    z10 = false;
                                } else {
                                    stringBuffer.append('.');
                                }
                                stringBuffer.append(j11);
                                j10 = 0;
                            } else {
                                j10 = j11 << 7;
                            }
                        } else {
                            if (bigInteger == null) {
                                bigInteger = BigInteger.valueOf(j10);
                            }
                            BigInteger or = bigInteger.or(BigInteger.valueOf(b10 & ByteCompanionObject.MAX_VALUE));
                            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                                if (z10) {
                                    z10 = false;
                                } else {
                                    stringBuffer.append('.');
                                }
                                stringBuffer.append(or);
                                j10 = 0;
                                bigInteger = null;
                            } else {
                                bigInteger = or.shiftLeft(7);
                            }
                        }
                    }
                    this.f24161d = stringBuffer.toString();
                }
                str = this.f24161d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
