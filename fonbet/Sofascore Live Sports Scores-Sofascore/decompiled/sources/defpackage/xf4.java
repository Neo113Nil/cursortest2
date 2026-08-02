package defpackage;

/* loaded from: classes.dex */
public final class xf4 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ m70 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf4(m70 m70Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = m70Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
