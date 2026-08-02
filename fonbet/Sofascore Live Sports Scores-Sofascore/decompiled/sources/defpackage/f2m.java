package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f2m extends sq3 {
    public cql r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ cql u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2m(cql cqlVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = cqlVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.g(this);
    }
}
