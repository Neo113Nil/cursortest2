package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k00 extends sq3 {
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ n00 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(n00 n00Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = n00Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(0L, null, this);
    }
}
