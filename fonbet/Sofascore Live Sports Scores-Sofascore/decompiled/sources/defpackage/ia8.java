package defpackage;

/* loaded from: classes7.dex */
public final class ia8 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ ja8 t;
    public Object u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia8(ja8 ja8Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = ja8Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
