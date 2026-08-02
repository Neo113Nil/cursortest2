package defpackage;

/* loaded from: classes7.dex */
public final class n6e extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public b98 t;
    public final /* synthetic */ ja8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6e(ja8 ja8Var, rq3 rq3Var) {
        super(rq3Var);
        this.u = ja8Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
