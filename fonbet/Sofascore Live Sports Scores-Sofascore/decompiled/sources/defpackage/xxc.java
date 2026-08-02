package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xxc extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ nk0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxc(nk0 nk0Var, rq3 rq3Var) {
        super(rq3Var);
        this.t = nk0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
