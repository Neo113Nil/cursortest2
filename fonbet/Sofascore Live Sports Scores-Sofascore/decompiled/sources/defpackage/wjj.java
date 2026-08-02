package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wjj {
    public static final byte[] g = "Nats-".getBytes();
    public static final byte[] h = "Exceeded Max".getBytes();
    public static final int i = 12;
    public final byte[] a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006b, code lost:
    
        if (r13[r2] != 13) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        r11 = r11 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r11 >= r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:
    
        if (r9.a[r11] != 10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        defpackage.a70.p("Invalid header composition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        r9.e = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wjj(int i2, int i3, int i4, byte[] bArr) {
        byte b;
        byte b2;
        this.a = bArr;
        if (i3 >= i2) {
            a70.p("Invalid header composition");
            throw null;
        }
        byte b3 = bArr[i3];
        byte b4 = 32;
        if (b3 == 32) {
            this.b = 1;
            this.c = i3;
            this.d = i3;
            while (true) {
                i3++;
                if (bArr[i3] != 32) {
                    break;
                } else {
                    this.d = i3;
                }
            }
        } else {
            if (b3 != 13) {
                if (i4 == 2 || i4 == 1) {
                    a70.p("Invalid header composition");
                    throw null;
                }
                if (i4 == 0 || i4 == 5) {
                    this.b = 5;
                    b = 13;
                    b4 = 13;
                } else if (i4 == 4) {
                    this.b = 4;
                    b = 13;
                } else {
                    this.b = 3;
                    b4 = 58;
                    b = 58;
                }
                this.c = i3;
                this.d = i3;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= i2 || (b2 = bArr[i5]) == b4 || b2 == b) {
                        break;
                    }
                    this.d = i5;
                    i3 = i5;
                }
                a70.p("Invalid header composition");
                throw null;
            }
            int i6 = i3 + 1;
            if (i6 >= i2 || bArr[i6] != 10) {
                a70.p("Invalid header composition");
                throw null;
            }
            this.b = 2;
            this.c = i3;
            this.d = i6;
        }
        this.f = this.e ? (this.d - this.c) + 1 : 0;
    }

    public final boolean a(int i2, byte[] bArr) {
        int length = bArr.length;
        int i3 = this.f;
        if (i3 != length) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2] != this.a[this.c + i2]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public final boolean b(int i2) {
        return this.b == i2;
    }

    public final String c() {
        return new String(this.a, this.c, this.f, StandardCharsets.UTF_8).trim();
    }

    public wjj(byte[] bArr, int i2, wjj wjjVar, int i3) {
        this(i2, wjjVar.d + (wjjVar.b == 3 ? 2 : 1), i3, bArr);
    }
}
