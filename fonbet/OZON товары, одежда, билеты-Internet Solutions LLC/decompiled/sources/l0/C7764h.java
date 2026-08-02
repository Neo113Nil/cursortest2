package l0;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7764h implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c1.u f72090a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f72091b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7774s f72092c;

    public C7764h(c1.u uVar, Object obj, C7774s c7774s) {
        this.f72090a = uVar;
        this.f72091b = obj;
        this.f72092c = c7774s;
    }

    @Override // S0.M
    public final void dispose() {
        c1.u uVar = this.f72090a;
        Object obj = this.f72091b;
        uVar.remove(obj);
        this.f72092c.f().g(obj);
    }
}
