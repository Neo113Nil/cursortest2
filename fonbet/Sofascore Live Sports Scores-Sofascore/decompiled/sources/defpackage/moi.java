package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class moi extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ noi s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moi(noi noiVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = noiVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.g(0L, null, this);
    }
}
