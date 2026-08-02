package androidx.fragment.app;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f1888a;

    public d1(Fragment fragment) {
        this.f1888a = fragment;
    }

    @Override // androidx.fragment.app.n1
    public final void a(j1 j1Var, Fragment fragment) {
        this.f1888a.onAttachFragment(fragment);
    }
}
