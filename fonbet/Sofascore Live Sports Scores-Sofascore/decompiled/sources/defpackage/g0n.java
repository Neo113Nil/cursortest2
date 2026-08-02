package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g0n extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ u0n t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0n(u0n u0nVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = u0nVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
