package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lf4 extends sq3 {
    public boolean r;
    public adi s;
    public /* synthetic */ Object t;
    public final /* synthetic */ qf4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf4(qf4 qf4Var, rq3 rq3Var) {
        super(rq3Var);
        this.u = qf4Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.g(false, this);
    }
}
