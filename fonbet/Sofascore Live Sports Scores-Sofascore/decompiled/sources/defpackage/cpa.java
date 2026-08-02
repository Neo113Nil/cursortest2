package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cpa extends t01 {
    public final zoa c;
    public final wqa d;
    public final int e;
    public final /* synthetic */ wqa f;
    public final /* synthetic */ qpa g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpa(zoa zoaVar, wqa wqaVar, int i, qpa qpaVar, int i2, int i3, long j) {
        super(6);
        this.f = wqaVar;
        this.g = qpaVar;
        this.h = i2;
        this.i = i3;
        this.j = j;
        this.c = zoaVar;
        this.d = wqaVar;
        this.e = i;
    }

    public final gpa R(int i, int i2, int i3, int i4, long j) {
        int i5;
        zoa zoaVar = this.c;
        Object d = zoaVar.d(i);
        Object g = zoaVar.b.g(i);
        List x = x(this.d, i, j);
        if (an3.f(j)) {
            i5 = an3.j(j);
        } else {
            if (!an3.e(j)) {
                u3a.a("does not have fixed height");
            }
            i5 = an3.i(j);
        }
        ema layoutDirection = this.f.b.getLayoutDirection();
        rqa rqaVar = this.g.m;
        return new gpa(i, d, i5, i4, layoutDirection, this.h, this.i, x, this.j, g, rqaVar, j, i2, i3);
    }

    @Override // defpackage.t01
    public final xqa v(int i, int i2, int i3, long j) {
        return R(i, i2, i3, this.e, j);
    }
}
