package defpackage;

/* loaded from: classes6.dex */
public final class qr7 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public b98 t;
    public int u;
    public final /* synthetic */ or7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr7(or7 or7Var, rq3 rq3Var) {
        super(rq3Var);
        this.v = or7Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
