package defpackage;

/* loaded from: classes6.dex */
public final class z98 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ o63 t;
    public b98 u;
    public Throwable v;
    public int w;
    public int x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z98(o63 o63Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = o63Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
