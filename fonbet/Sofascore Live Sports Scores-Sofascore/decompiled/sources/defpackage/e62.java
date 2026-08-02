package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class e62 extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ g62 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e62(g62 g62Var, sq3 sq3Var) {
        super(sq3Var);
        this.s = g62Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object H = g62.H(this.s, this);
        return H == lu3.a ? H : new go2(H);
    }
}
