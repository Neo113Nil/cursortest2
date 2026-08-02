package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lb8 extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public b98 t;
    public final /* synthetic */ mb8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb8(mb8 mb8Var, rq3 rq3Var) {
        super(rq3Var);
        this.u = mb8Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
