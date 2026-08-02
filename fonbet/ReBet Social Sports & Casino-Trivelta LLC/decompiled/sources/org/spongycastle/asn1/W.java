package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class W extends AbstractC5940s implements InterfaceC5946y {
    private final byte[] string;

    public W(byte[] bArr) {
        this.string = bArr;
    }

    public static W k(Object obj) {
        if (obj == null || (obj instanceof W)) {
            return (W) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (W) AbstractC5940s.g((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public static W l(AbstractC5947z abstractC5947z, boolean z10) {
        AbstractC5940s m10 = abstractC5947z.m();
        return (z10 || (m10 instanceof W)) ? k(m10) : new W(((AbstractC5937o) m10).m());
    }

    public static boolean m(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof W) {
            return Aj.a.a(this.string, ((W) abstractC5940s).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(22, this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.string.length) + 1 + this.string.length;
    }

    @Override // org.spongycastle.asn1.InterfaceC5946y
    public String getString() {
        return Aj.h.b(this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.q(this.string);
    }

    public String toString() {
        return getString();
    }

    public W(String str) {
        this(str, false);
    }

    public W(String str, boolean z10) {
        if (str != null) {
            if (z10 && !m(str)) {
                throw new IllegalArgumentException("string contains illegal characters");
            }
            this.string = Aj.h.e(str);
            return;
        }
        throw new NullPointerException("string cannot be null");
    }
}
