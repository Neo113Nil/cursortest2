package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dn3 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ vj0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn3(vj0 vj0Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = vj0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
