package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wkj implements f2f {
    public final int a;

    public wkj(int i) {
        this.a = i;
    }

    @Override // defpackage.f2f
    public final long a(x6a x6aVar, long j, ema emaVar, long j2) {
        int i = (int) (j2 >> 32);
        int f = wt3.f(x6aVar.d(), i, 2, x6aVar.a);
        if (f < 0) {
            f = x6aVar.a;
        } else if (f + i > ((int) (j >> 32))) {
            f = x6aVar.c - i;
        }
        int i2 = x6aVar.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = x6aVar.d + i3;
        }
        return (f << 32) | (i4 & 4294967295L);
    }
}
