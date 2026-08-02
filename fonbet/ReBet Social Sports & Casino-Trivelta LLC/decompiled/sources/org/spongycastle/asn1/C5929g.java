package org.spongycastle.asn1;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: org.spongycastle.asn1.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5929g extends AbstractC5940s {
    private static C5929g[] cache = new C5929g[12];
    private final byte[] bytes;

    public C5929g(byte[] bArr) {
        if (bArr.length > 1) {
            byte b10 = bArr[0];
            if (b10 == 0 && (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
            if (b10 == -1 && (bArr[1] & ByteCompanionObject.MIN_VALUE) != 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
        }
        this.bytes = Aj.a.d(bArr);
    }

    public static C5929g k(byte[] bArr) {
        if (bArr.length > 1) {
            return new C5929g(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & UByte.MAX_VALUE;
        C5929g[] c5929gArr = cache;
        if (i10 >= c5929gArr.length) {
            return new C5929g(Aj.a.d(bArr));
        }
        C5929g c5929g = c5929gArr[i10];
        if (c5929g != null) {
            return c5929g;
        }
        C5929g c5929g2 = new C5929g(Aj.a.d(bArr));
        c5929gArr[i10] = c5929g2;
        return c5929g2;
    }

    public static C5929g l(Object obj) {
        if (obj == null || (obj instanceof C5929g)) {
            return (C5929g) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C5929g) AbstractC5940s.g((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof C5929g) {
            return Aj.a.a(this.bytes, ((C5929g) abstractC5940s).bytes);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(10, this.bytes);
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
        return Aj.a.q(this.bytes);
    }
}
