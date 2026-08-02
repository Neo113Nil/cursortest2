package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h7c extends sq3 {
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ m7c u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7c(m7c m7cVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = m7cVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(0, 0, this);
    }
}
