package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mhm extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ hjm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhm(hjm hjmVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = hjmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
