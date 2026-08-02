package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vbm extends sq3 {
    public mpm r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ mpm u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbm(mpm mpmVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = mpmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.z(0, this);
    }
}
