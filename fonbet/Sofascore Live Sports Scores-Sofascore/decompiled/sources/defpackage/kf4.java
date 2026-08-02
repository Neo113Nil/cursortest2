package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kf4 extends sq3 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ qf4 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf4(qf4 qf4Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = qf4Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.f(this);
    }
}
