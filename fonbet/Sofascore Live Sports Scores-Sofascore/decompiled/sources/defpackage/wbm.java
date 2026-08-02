package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wbm extends sq3 {
    public sqm r;
    public vnm s;
    public String t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ sqm w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbm(sqm sqmVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = sqmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.V(this);
    }
}
