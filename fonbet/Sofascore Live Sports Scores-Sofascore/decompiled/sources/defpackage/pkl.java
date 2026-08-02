package defpackage;

/* loaded from: classes6.dex */
public final class pkl extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ k2e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkl(k2e k2eVar, rq3 rq3Var) {
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
