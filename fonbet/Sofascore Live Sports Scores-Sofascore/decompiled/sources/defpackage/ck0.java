package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ck0 extends sq3 {
    public nt9 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dk0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(dk0 dk0Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = dk0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, null, this);
    }
}
