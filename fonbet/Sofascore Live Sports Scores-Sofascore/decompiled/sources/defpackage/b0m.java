package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b0m extends sq3 {
    public lom r;
    public /* synthetic */ Object s;
    public final /* synthetic */ lom t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0m(lom lomVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = lomVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return lom.A(this.t, this);
    }
}
