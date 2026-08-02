package defpackage;

/* loaded from: classes7.dex */
public final class n98 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ wf2 t;
    public b98 u;
    public int v;
    public int w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n98(wf2 wf2Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = wf2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
