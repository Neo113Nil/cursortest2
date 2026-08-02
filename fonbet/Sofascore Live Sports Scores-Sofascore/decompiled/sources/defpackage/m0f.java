package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m0f extends sq3 {
    public boolean r;
    public kk3 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ p0f u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0f(p0f p0fVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = p0fVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.f(false, this);
    }
}
