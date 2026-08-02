package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kx6 extends sq3 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ lx6 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx6(lx6 lx6Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = lx6Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(0, this);
    }
}
