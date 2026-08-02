package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class asa extends t01 {
    public final sra c;
    public final wqa d;
    public final long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wqa g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ fo j;
    public final /* synthetic */ lv1 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ ksa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asa(long j, boolean z, sra sraVar, wqa wqaVar, int i, int i2, fo foVar, lv1 lv1Var, int i3, int i4, long j2, ksa ksaVar) {
        super(6);
        this.f = z;
        this.g = wqaVar;
        this.h = i;
        this.i = i2;
        this.j = foVar;
        this.k = lv1Var;
        this.l = i3;
        this.m = i4;
        this.n = j2;
        this.o = ksaVar;
        this.c = sraVar;
        this.d = wqaVar;
        this.e = cn3.b(0, z ? an3.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : an3.g(j), 5);
    }

    public final dsa R(int i, long j) {
        sra sraVar = this.c;
        Object d = sraVar.d(i);
        Object g = sraVar.b.g(i);
        return new dsa(i, x(this.d, i, j), this.f, this.j, this.k, this.g.b.getLayoutDirection(), this.l, this.m, i == this.h + (-1) ? 0 : this.i, this.n, d, g, this.o.o, j);
    }

    @Override // defpackage.t01
    public final xqa v(int i, int i2, int i3, long j) {
        return R(i, j);
    }
}
