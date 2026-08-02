package b;

import b3.AbstractC2382a;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: b.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2307e0 extends w0 {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f24101f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24102a;

    /* renamed from: d, reason: collision with root package name */
    public String f24103d = null;

    public C2307e0(byte[] bArr) {
        this.f24102a = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24102a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.f(z10, 6, this.f24102a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (this == w0Var) {
            return true;
        }
        if (w0Var instanceof C2307e0) {
            return Arrays.equals(this.f24102a, ((C2307e0) w0Var).f24102a);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24102a);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            try {
                if (this.f24103d == null) {
                    byte[] bArr = this.f24102a;
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
                                    if (j11 < 40) {
                                        stringBuffer.append('0');
                                    } else if (j11 < 80) {
                                        stringBuffer.append('1');
                                        j11 -= 40;
                                    } else {
                                        stringBuffer.append('2');
                                        j11 -= 80;
                                    }
                                    z10 = false;
                                }
                                stringBuffer.append('.');
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
                                    stringBuffer.append('2');
                                    or = or.subtract(BigInteger.valueOf(80L));
                                    z10 = false;
                                }
                                stringBuffer.append('.');
                                stringBuffer.append(or);
                                j10 = 0;
                                bigInteger = null;
                            } else {
                                bigInteger = or.shiftLeft(7);
                            }
                        }
                    }
                    this.f24103d = stringBuffer.toString();
                }
                str = this.f24103d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
