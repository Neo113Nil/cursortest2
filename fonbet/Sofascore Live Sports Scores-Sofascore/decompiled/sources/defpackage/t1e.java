package defpackage;

/* loaded from: classes6.dex */
public final class t1e extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ u1e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1e(u1e u1eVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = u1eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
