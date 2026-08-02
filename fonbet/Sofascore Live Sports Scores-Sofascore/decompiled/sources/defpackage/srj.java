package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class srj extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ vrj s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srj(vrj vrjVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = vrjVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, null, this);
    }
}
