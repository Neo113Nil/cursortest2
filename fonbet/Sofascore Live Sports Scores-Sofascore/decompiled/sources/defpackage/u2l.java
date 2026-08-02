package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u2l extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ a3l s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2l(a3l a3lVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = a3lVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
