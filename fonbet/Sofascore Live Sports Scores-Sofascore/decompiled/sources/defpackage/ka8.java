package defpackage;

/* loaded from: classes6.dex */
public final class ka8 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ nk0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka8(nk0 nk0Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = nk0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
