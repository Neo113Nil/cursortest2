package defpackage;

/* loaded from: classes5.dex */
public final class czh extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ k2e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czh(k2e k2eVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = k2eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
