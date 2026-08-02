package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g92 extends sq3 {
    public boolean r;
    public wf2 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ i92 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g92(i92 i92Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = i92Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(false, this);
    }
}
