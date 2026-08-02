package defpackage;

/* loaded from: classes7.dex */
public final class fa8 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ wj0 t;
    public Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa8(wj0 wj0Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = wj0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
