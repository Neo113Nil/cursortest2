package defpackage;

/* loaded from: classes7.dex */
public final class ha8 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ v98 t;
    public ja8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha8(v98 v98Var, rq3 rq3Var) {
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
