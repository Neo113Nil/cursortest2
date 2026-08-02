package U6;

import o7.j;

/* loaded from: classes2.dex */
public class a extends J7.a {

    /* renamed from: a, reason: collision with root package name */
    public final K6.b f12107a;

    /* renamed from: b, reason: collision with root package name */
    public final j f12108b;

    public a(K6.b bVar, j jVar) {
        this.f12107a = bVar;
        this.f12108b = jVar;
    }

    @Override // J7.e
    public void onRequestCancellation(String str) {
        this.f12108b.J(this.f12107a.now());
        this.f12108b.P(str);
    }

    @Override // J7.e
    public void onRequestFailure(com.facebook.imagepipeline.request.b bVar, String str, Throwable th2, boolean z10) {
        this.f12108b.J(this.f12107a.now());
        this.f12108b.I(bVar);
        this.f12108b.P(str);
        this.f12108b.O(z10);
    }

    @Override // J7.e
    public void onRequestStart(com.facebook.imagepipeline.request.b bVar, Object obj, String str, boolean z10) {
        this.f12108b.K(this.f12107a.now());
        this.f12108b.I(bVar);
        this.f12108b.y(obj);
        this.f12108b.P(str);
        this.f12108b.O(z10);
    }

    @Override // J7.e
    public void onRequestSuccess(com.facebook.imagepipeline.request.b bVar, String str, boolean z10) {
        this.f12108b.J(this.f12107a.now());
        this.f12108b.I(bVar);
        this.f12108b.P(str);
        this.f12108b.O(z10);
    }
}
