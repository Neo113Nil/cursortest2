package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class A extends AbstractC5940s {
    private byte[] time;

    public A(byte[] bArr) {
        this.time = bArr;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (abstractC5940s instanceof A) {
            return Aj.a.a(this.time, ((A) abstractC5940s).time);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.c(23);
        int length = this.time.length;
        c5939q.i(length);
        for (int i10 = 0; i10 != length; i10++) {
            c5939q.c(this.time[i10]);
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int length = this.time.length;
        return z0.a(length) + 1 + length;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return Aj.a.q(this.time);
    }

    public String k() {
        String l10 = l();
        if (l10.charAt(0) < '5') {
            return "20" + l10;
        }
        return "19" + l10;
    }

    public String l() {
        String b10 = Aj.h.b(this.time);
        if (b10.indexOf(45) < 0 && b10.indexOf(43) < 0) {
            if (b10.length() == 11) {
                return b10.substring(0, 10) + "00GMT+00:00";
            }
            return b10.substring(0, 12) + "GMT+00:00";
        }
        int indexOf = b10.indexOf(45);
        if (indexOf < 0) {
            indexOf = b10.indexOf(43);
        }
        if (indexOf == b10.length() - 3) {
            b10 = b10 + "00";
        }
        if (indexOf == 10) {
            return b10.substring(0, 10) + "00GMT" + b10.substring(10, 13) + ":" + b10.substring(13, 15);
        }
        return b10.substring(0, 12) + "GMT" + b10.substring(12, 15) + ":" + b10.substring(15, 17);
    }

    public String toString() {
        return Aj.h.b(this.time);
    }
}
