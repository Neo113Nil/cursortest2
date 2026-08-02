package defpackage;

/* loaded from: classes7.dex */
public final class thj extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ ca8 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thj(ca8 ca8Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = ca8Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
