package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fki extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ gki s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fki(gki gkiVar, rq3 rq3Var) {
        super(rq3Var);
        this.s = gkiVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        this.s.collect(null, this);
        return lu3.a;
    }
}
