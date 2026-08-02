package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w14 extends c5n {
    public final no h;

    public w14(no noVar) {
        this.h = noVar;
    }

    @Override // defpackage.c5n
    public final int s(int i, int i2, ema emaVar, qhe qheVar, int i3) {
        int R = qheVar.R(this.h.a);
        if (R == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - R;
        return emaVar == ema.b ? (i - i2) - i4 : i4;
    }

    @Override // defpackage.c5n
    public final Integer v(qhe qheVar) {
        return Integer.valueOf(qheVar.R(this.h.a));
    }
}
