package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f1917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f1919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.a f1920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f1921e;

    public g0(Fragment fragment, f0 f0Var, AtomicReference atomicReference, h.a aVar, g.a aVar2) {
        this.f1921e = fragment;
        this.f1917a = f0Var;
        this.f1918b = atomicReference;
        this.f1919c = aVar;
        this.f1920d = aVar2;
    }

    @Override // androidx.fragment.app.j0
    public final void a() {
        g.g gVar;
        Fragment fragment = this.f1921e;
        String generateActivityResultKey = fragment.generateActivityResultKey();
        f0 f0Var = this.f1917a;
        switch (f0Var.f1901a) {
            case 0:
                Fragment fragment2 = (Fragment) f0Var.f1902b;
                Object obj = fragment2.mHost;
                if (!(obj instanceof g.h)) {
                    gVar = fragment2.requireActivity().f8424i;
                    break;
                } else {
                    gVar = ((g.h) obj).d();
                    break;
                }
            default:
                gVar = (g.g) f0Var.f1902b;
                break;
        }
        this.f1918b.set(gVar.c(generateActivityResultKey, fragment, this.f1919c, this.f1920d));
    }
}
