package defpackage;

/* loaded from: classes7.dex */
public final class ld7 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ yn2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld7(yn2 yn2Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = yn2Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
