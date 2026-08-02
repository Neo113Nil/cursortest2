package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bdi {
    public static final bdi e = new bdi(xjj.b, 0, 0, 0);
    public final int a;
    public final xjj b;
    public final int c;
    public final int d;

    public bdi(xjj xjjVar, int i, int i2, int i3) {
        this.b = xjjVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public final bdi a(int i) {
        xjj xjjVar = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = ba9.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            xjjVar.getClass();
            i3 += i6;
            xjjVar = new rhh(xjjVar, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        bdi bdiVar = new bdi(xjjVar, i2, i9, i3 + i8);
        return i9 == 2078 ? bdiVar.b(i + 1) : bdiVar;
    }

    public final bdi b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        xjj xjjVar = this.b;
        xjjVar.getClass();
        return new bdi(new hw1(xjjVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(bdi bdiVar) {
        int i;
        int i2 = this.d + (ba9.b[this.a][bdiVar.a] >> 16);
        int i3 = bdiVar.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= bdiVar.d;
    }

    public final bdi d(int i, int i2) {
        int i3 = this.d;
        xjj xjjVar = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = ba9.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xjjVar.getClass();
            i3 += i7;
            xjjVar = new rhh(xjjVar, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        xjjVar.getClass();
        return new bdi(new rhh(xjjVar, i2, i8), i, 0, i3 + i8);
    }

    public final bdi e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = ba9.d[i3][i];
        xjj xjjVar = this.b;
        xjjVar.getClass();
        return new bdi(new rhh(new rhh(xjjVar, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", ba9.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
