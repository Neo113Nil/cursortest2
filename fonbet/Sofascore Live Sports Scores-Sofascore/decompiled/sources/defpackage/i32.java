package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i32 extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ ccd s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(ccd ccdVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = ccdVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.D(null, this);
    }
}
