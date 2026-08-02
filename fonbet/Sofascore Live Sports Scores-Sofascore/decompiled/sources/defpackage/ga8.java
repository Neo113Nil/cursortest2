package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ga8 extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ m70 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga8(m70 m70Var, rq3 rq3Var) {
        super(rq3Var);
        this.s = m70Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.emit(null, this);
    }
}
