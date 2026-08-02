package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class O extends AbstractC5940s implements InterfaceC5946y {
    private final char[] string;

    public O(char[] cArr) {
        this.string = cArr;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof O) {
            return Aj.a.b(this.string, ((O) abstractC5940s).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.c(30);
        c5939q.i(this.string.length * 2);
        int i10 = 0;
        while (true) {
            char[] cArr = this.string;
            if (i10 == cArr.length) {
                return;
            }
            char c10 = cArr[i10];
            c5939q.c((byte) (c10 >> '\b'));
            c5939q.c((byte) c10);
            i10++;
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.string.length * 2) + 1 + (this.string.length * 2);
    }

    @Override // org.spongycastle.asn1.InterfaceC5946y
    public String getString() {
        return new String(this.string);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.r(this.string);
    }

    public String toString() {
        return getString();
    }
}
