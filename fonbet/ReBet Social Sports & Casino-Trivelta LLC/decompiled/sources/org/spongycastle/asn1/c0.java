package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class c0 extends AbstractC5940s implements InterfaceC5946y {
    private final byte[] string;

    public c0(byte[] bArr) {
        this.string = bArr;
    }

    public static boolean k(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != ' ' && charAt != ':' && charAt != '=' && charAt != '?'))) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (charAt) {
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                return false;
                        }
                }
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof c0) {
            return Aj.a.a(this.string, ((c0) abstractC5940s).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(19, this.string);
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

    public c0(String str) {
        this(str, false);
    }

    public c0(String str, boolean z10) {
        if (z10 && !k(str)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.string = Aj.h.e(str);
    }
}
