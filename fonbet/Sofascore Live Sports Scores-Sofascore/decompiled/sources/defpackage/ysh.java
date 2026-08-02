package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ysh implements n55 {
    public final /* synthetic */ ct8 a;
    public final /* synthetic */ tfi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ e1d d;
    public final /* synthetic */ boh e;
    public final /* synthetic */ boh f;

    public ysh(ct8 ct8Var, tfi tfiVar, int i, e1d e1dVar, boh bohVar, boh bohVar2) {
        this.a = ct8Var;
        this.b = tfiVar;
        this.c = i;
        this.d = e1dVar;
        this.e = bohVar;
        this.f = bohVar2;
    }

    @Override // defpackage.n55
    public final void d() {
        long h = this.f.h() + (((Boolean) this.d.getValue()).booleanValue() ? yaa.v() - this.e.h() : 0L);
        if (h > 100) {
            this.a.invoke(this.b, Long.valueOf(h), Integer.valueOf(this.c));
        }
    }
}
