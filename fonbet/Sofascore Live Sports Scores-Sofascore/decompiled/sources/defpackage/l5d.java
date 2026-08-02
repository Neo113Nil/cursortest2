package defpackage;

/* loaded from: classes6.dex */
public final class l5d extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ m5d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5d(m5d m5dVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = m5dVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
