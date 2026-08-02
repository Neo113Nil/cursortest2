package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class eea extends lj2 {
    public final kea i;

    public eea(rq3 rq3Var, kea keaVar) {
        super(1, rq3Var);
        this.i = keaVar;
    }

    @Override // defpackage.lj2
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.lj2
    public final Throwable p(kea keaVar) {
        Throwable c;
        Object O = this.i.O();
        return (!(O instanceof gea) || (c = ((gea) O).c()) == null) ? O instanceof eb3 ? ((eb3) O).a : keaVar.k() : c;
    }
}
