package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class reh extends sq3 {
    public String r;
    public peh s;
    public /* synthetic */ Object t;
    public final /* synthetic */ seh u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reh(seh sehVar, rq3 rq3Var) {
        super(rq3Var);
        this.u = sehVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(null, null, this);
    }
}
