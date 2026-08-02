package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lqm extends sq3 {
    public Object r;
    public String s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ssm v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqm(ssm ssmVar, rq3 rq3Var) {
        super(rq3Var);
        this.v = ssmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(null, false, this);
    }
}
