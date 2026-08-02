package defpackage;

/* loaded from: classes6.dex */
public final class f4k extends sq3 {
    public int A;
    public /* synthetic */ Object r;
    public int s;
    public b98 t;
    public int u;
    public final /* synthetic */ e4k v;
    public g4k w;
    public g4k x;
    public g4k y;
    public g4k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4k(e4k e4kVar, rq3 rq3Var) {
        super(rq3Var);
        this.v = e4kVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
