package defpackage;

/* loaded from: classes7.dex */
public final class u98 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ v98 t;
    public b98 u;
    public kog v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u98(v98 v98Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = v98Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
