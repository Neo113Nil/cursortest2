package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bad extends sq3 {
    public x52 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ead t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bad(ead eadVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = eadVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.g(null, this);
    }
}
