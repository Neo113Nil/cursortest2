package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hpd extends sq3 {
    public tha r;
    public tha s;
    public kof t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ipd v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpd(ipd ipdVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = ipdVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(this, null);
    }
}
