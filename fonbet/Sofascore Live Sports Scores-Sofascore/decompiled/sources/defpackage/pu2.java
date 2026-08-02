package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pu2 {
    public final usj a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public pu2(int i, int i2, long j, int i3, usj usjVar) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        qx9.r(z);
        this.d = j;
        this.e = i3;
        this.a = usjVar;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final e0h a(int i) {
        return new e0h((this.d / this.e) * this.l[i], this.k[i]);
    }

    public final yzg b(long j) {
        int i = (int) (j / (this.d / this.e));
        int d = lik.d(this.l, i, true, true);
        if (this.l[d] == i) {
            e0h a = a(d);
            return new yzg(a, a);
        }
        e0h a2 = a(d);
        int i2 = d + 1;
        return i2 < this.k.length ? new yzg(a2, a(i2)) : new yzg(a2, a2);
    }
}
