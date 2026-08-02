package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a39 extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ g39 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a39(g39 g39Var, sq3 sq3Var) {
        super(sq3Var);
        this.s = g39Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(0, 0, this);
    }
}
