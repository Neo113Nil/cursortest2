package v;

import v.X;

/* loaded from: classes8.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C10132s f101082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X.f f101083b;

    public /* synthetic */ U(C10132s c10132s, X.f fVar) {
        this.f101082a = c10132s;
        this.f101083b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f101082a.f101338b.f101365a.remove(this.f101083b);
    }
}
