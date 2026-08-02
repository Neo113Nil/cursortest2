package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y4d extends sq3 {
    public z4d r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ z4d u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4d(z4d z4dVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = z4dVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return z4d.a(this.u, null, this);
    }
}
