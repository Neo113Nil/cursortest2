package defpackage;

/* loaded from: classes7.dex */
public final class rci extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ wf2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rci(wf2 wf2Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = wf2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        this.t.collect(null, this);
        return lu3.a;
    }
}
