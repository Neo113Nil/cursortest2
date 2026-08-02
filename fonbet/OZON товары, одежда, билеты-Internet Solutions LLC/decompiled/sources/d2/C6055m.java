package d2;

/* renamed from: d2.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6055m implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6034K f61058a;

    public C6055m(C6034K c6034k) {
        this.f61058a = c6034k;
    }

    @Override // S0.M
    public final void dispose() {
        C6034K c6034k = this.f61058a;
        c6034k.disposeComposition();
        c6034k.b();
    }
}
