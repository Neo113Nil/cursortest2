package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c9c extends sq3 {
    public String r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ t9c u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9c(t9c t9cVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = t9cVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(0, null, false, this);
    }
}
