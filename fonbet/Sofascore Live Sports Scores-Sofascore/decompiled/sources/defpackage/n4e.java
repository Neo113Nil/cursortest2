package defpackage;

/* loaded from: classes7.dex */
public final class n4e extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ os2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4e(os2 os2Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = os2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
