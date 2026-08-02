package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wne extends sq3 {
    public aoe r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ aoe v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wne(aoe aoeVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = aoeVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return aoe.c(this.v, 0, this);
    }
}
