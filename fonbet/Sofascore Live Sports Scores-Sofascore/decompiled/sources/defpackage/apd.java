package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class apd extends sq3 {
    public bpd r;
    public lof s;
    public /* synthetic */ Object t;
    public final /* synthetic */ bpd u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apd(bpd bpdVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = bpdVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return bpd.f(this.u, this);
    }
}
