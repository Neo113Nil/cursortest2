package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: org.spongycastle.asn1.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5936n extends AbstractC5940s {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap f62260b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f62261a;
    private byte[] body;

    /* renamed from: org.spongycastle.asn1.n$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f62262a;
        private final byte[] enc;

        public a(byte[] bArr) {
            this.f62262a = Aj.a.q(bArr);
            this.enc = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Aj.a.a(this.enc, ((a) obj).enc);
            }
            return false;
        }

        public int hashCode() {
            return this.f62262a;
        }
    }

    public C5936n(byte[] bArr) {
        boolean z10;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        long j10 = 0;
        BigInteger bigInteger = null;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (j10 <= 72057594037927808L) {
                z10 = z11;
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
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                    z11 = z10;
                }
            } else {
                z10 = z11;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j10) : bigInteger).or(BigInteger.valueOf(b10 & ByteCompanionObject.MAX_VALUE));
                if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z10) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j10 = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                    z11 = z10;
                }
            }
        }
        this.f62261a = stringBuffer.toString();
        this.body = Aj.a.d(bArr);
    }

    public static C5936n m(byte[] bArr) {
        C5936n c5936n = (C5936n) f62260b.get(new a(bArr));
        return c5936n == null ? new C5936n(bArr) : c5936n;
    }

    public static C5936n p(Object obj) {
        if (obj == null || (obj instanceof C5936n)) {
            return (C5936n) obj;
        }
        if (obj instanceof InterfaceC5927e) {
            InterfaceC5927e interfaceC5927e = (InterfaceC5927e) obj;
            if (interfaceC5927e.toASN1Primitive() instanceof C5936n) {
                return (C5936n) interfaceC5927e.toASN1Primitive();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C5936n) AbstractC5940s.g((byte[]) obj);
        } catch (IOException e10) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e10.getMessage());
        }
    }

    public static C5936n q(AbstractC5947z abstractC5947z, boolean z10) {
        AbstractC5940s m10 = abstractC5947z.m();
        return (z10 || (m10 instanceof C5936n)) ? p(m10) : m(AbstractC5937o.k(abstractC5947z.m()).m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r3 != '.') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s(String str, int i10) {
        boolean z10;
        int length = str.length();
        do {
            z10 = false;
            while (true) {
                length--;
                if (length < i10) {
                    return z10;
                }
                char charAt = str.charAt(length);
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                z10 = true;
            }
        } while (z10);
        return false;
    }

    public static boolean t(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return s(str, 2);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s == this) {
            return true;
        }
        if (abstractC5940s instanceof C5936n) {
            return this.f62261a.equals(((C5936n) abstractC5940s).f62261a);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        byte[] n10 = n();
        c5939q.c(6);
        c5939q.i(n10.length);
        c5939q.d(n10);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int length = n().length;
        return z0.a(length) + 1 + length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return this.f62261a.hashCode();
    }

    public C5936n k(String str) {
        return new C5936n(this, str);
    }

    public final void l(ByteArrayOutputStream byteArrayOutputStream) {
        y0 y0Var = new y0(this.f62261a);
        int parseInt = Integer.parseInt(y0Var.b()) * 40;
        String b10 = y0Var.b();
        if (b10.length() <= 18) {
            u(byteArrayOutputStream, parseInt + Long.parseLong(b10));
        } else {
            v(byteArrayOutputStream, new BigInteger(b10).add(BigInteger.valueOf(parseInt)));
        }
        while (y0Var.a()) {
            String b11 = y0Var.b();
            if (b11.length() <= 18) {
                u(byteArrayOutputStream, Long.parseLong(b11));
            } else {
                v(byteArrayOutputStream, new BigInteger(b11));
            }
        }
    }

    public final synchronized byte[] n() {
        try {
            if (this.body == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                l(byteArrayOutputStream);
                this.body = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.body;
    }

    public String o() {
        return this.f62261a;
    }

    public C5936n r() {
        a aVar = new a(n());
        ConcurrentMap concurrentMap = f62260b;
        C5936n c5936n = (C5936n) concurrentMap.get(aVar);
        if (c5936n != null) {
            return c5936n;
        }
        C5936n c5936n2 = (C5936n) concurrentMap.putIfAbsent(aVar, this);
        return c5936n2 == null ? this : c5936n2;
    }

    public String toString() {
        return o();
    }

    public final void u(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        byte[] bArr = new byte[9];
        int i10 = 8;
        bArr[8] = (byte) (((int) j10) & 127);
        while (j10 >= 128) {
            j10 >>= 7;
            i10--;
            bArr[i10] = (byte) ((((int) j10) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i10, 9 - i10);
    }

    public final void v(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i10 = bitLength - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            bArr[i11] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i10] = (byte) (bArr[i10] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public C5936n(String str) {
        if (str != null) {
            if (t(str)) {
                this.f62261a = str;
                return;
            }
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public C5936n(C5936n c5936n, String str) {
        if (s(str, 0)) {
            this.f62261a = c5936n.o() + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }
}
