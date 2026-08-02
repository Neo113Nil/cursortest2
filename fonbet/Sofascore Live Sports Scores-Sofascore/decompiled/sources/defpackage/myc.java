package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class myc extends sq3 {
    public Object r;
    public Object s;
    public AutoCloseable t;
    public /* synthetic */ Object u;
    public final /* synthetic */ oyc v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myc(oyc oycVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = oycVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
