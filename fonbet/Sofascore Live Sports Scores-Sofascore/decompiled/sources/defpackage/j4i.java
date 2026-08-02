package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j4i extends sq3 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ n4i t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4i(n4i n4iVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = n4iVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.k(0, this);
    }
}
