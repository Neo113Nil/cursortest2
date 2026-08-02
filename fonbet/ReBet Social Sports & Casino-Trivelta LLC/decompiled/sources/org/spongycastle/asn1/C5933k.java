package org.spongycastle.asn1;

import java.math.BigInteger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: org.spongycastle.asn1.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5933k extends AbstractC5940s {
    private final byte[] bytes;

    public C5933k(long j10) {
        this.bytes = BigInteger.valueOf(j10).toByteArray();
    }

    public static C5933k k(Object obj) {
        if (obj == null || (obj instanceof C5933k)) {
            return (C5933k) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C5933k) AbstractC5940s.g((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public static C5933k l(AbstractC5947z abstractC5947z, boolean z10) {
        AbstractC5940s m10 = abstractC5947z.m();
        return (z10 || (m10 instanceof C5933k)) ? k(m10) : new C5933k(AbstractC5937o.k(abstractC5947z.m()).m());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof C5933k) {
            return Aj.a.a(this.bytes, ((C5933k) abstractC5940s).bytes);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(2, this.bytes);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.bytes.length) + 1 + this.bytes.length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.bytes;
            if (i10 == bArr.length) {
                return i11;
            }
            i11 ^= (bArr[i10] & UByte.MAX_VALUE) << (i10 % 4);
            i10++;
        }
    }

    public BigInteger m() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger n() {
        return new BigInteger(this.bytes);
    }

    public String toString() {
        return n().toString();
    }

    public C5933k(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
    }

    public C5933k(byte[] bArr) {
        this(bArr, true);
    }

    public C5933k(byte[] bArr, boolean z10) {
        if (bArr.length > 1) {
            byte b10 = bArr[0];
            if (b10 == 0 && (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) {
                throw new IllegalArgumentException("malformed integer");
            }
            if (b10 == -1 && (bArr[1] & ByteCompanionObject.MIN_VALUE) != 0) {
                throw new IllegalArgumentException("malformed integer");
            }
        }
        this.bytes = z10 ? Aj.a.d(bArr) : bArr;
    }
}
