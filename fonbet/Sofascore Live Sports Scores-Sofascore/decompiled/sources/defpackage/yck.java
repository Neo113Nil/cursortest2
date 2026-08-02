package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yck implements oz7 {
    public final wck a;
    public final int b;
    public final Integer c;
    public final int d;

    public yck(wck wckVar, int i, Integer num) {
        wckVar.getClass();
        this.a = wckVar;
        this.b = i;
        this.c = num;
        int i2 = wckVar.g;
        this.d = i2;
        if (i < 0) {
            ogj.h(lnb.k(i, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i2 < i) {
            ogj.j(") is less than the minimum number of digits (", "The maximum number of digits (", i2, i);
            throw null;
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.oz7
    public final wm8 a() {
        gef gefVar = this.a.a;
        ph3 ph3Var = new ph3();
        int i = this.b;
        if (i < 0) {
            ogj.h(lnb.k(i, "The minimum number of digits (", ") is negative"));
            return null;
        }
        if (i <= 9) {
            return this.c != null ? new ph3() : ph3Var;
        }
        ogj.h(lnb.k(i, "The minimum number of digits (", ") exceeds the length of an Int"));
        return null;
    }

    @Override // defpackage.oz7
    public final v9e b() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.d);
        wck wckVar = this.a;
        return tba.M(valueOf, valueOf2, this.c, wckVar.a, wckVar.d, false);
    }

    @Override // defpackage.oz7
    public final /* bridge */ /* synthetic */ l3 c() {
        return this.a;
    }
}
