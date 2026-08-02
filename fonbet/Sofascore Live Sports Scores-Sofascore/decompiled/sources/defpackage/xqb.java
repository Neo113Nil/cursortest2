package defpackage;

/* loaded from: classes6.dex */
public final class xqb extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ vj0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqb(vj0 vj0Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = vj0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
