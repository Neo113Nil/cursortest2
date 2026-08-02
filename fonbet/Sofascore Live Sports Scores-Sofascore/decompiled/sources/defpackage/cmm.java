package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cmm extends sq3 {
    public Object r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ kqm u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmm(kqm kqmVar, rq3 rq3Var) {
        super(rq3Var);
        this.u = kqmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, null, this);
    }
}
