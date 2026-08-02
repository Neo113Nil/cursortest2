package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pam extends sq3 {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ cdm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pam(cdm cdmVar, rq3 rq3Var) {
        super(rq3Var);
        this.t = cdmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
