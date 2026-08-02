package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hgl extends sq3 {
    public egl r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ kgl y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgl(kgl kglVar, sq3 sq3Var) {
        super(sq3Var);
        this.y = kglVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, 0, this);
    }
}
