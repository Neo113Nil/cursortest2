package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x66 extends sq3 {
    public v76 r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ v76 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x66(v76 v76Var, sq3 sq3Var) {
        super(sq3Var);
        this.u = v76Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return v76.f(this.u, 0L, this);
    }
}
