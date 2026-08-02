package defpackage;

/* loaded from: classes7.dex */
public final class w98 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ t98 t;
    public b98 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w98(t98 t98Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = t98Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
