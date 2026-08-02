package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final g0.d f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.d f1337b;

    public i1(g0.d dVar, g0.d dVar2) {
        this.f1336a = dVar;
        this.f1337b = dVar2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f1336a + " upper=" + this.f1337b + "}";
    }

    public i1(WindowInsetsAnimation.Bounds bounds) {
        this.f1336a = q1.g(bounds);
        this.f1337b = q1.f(bounds);
    }
}
