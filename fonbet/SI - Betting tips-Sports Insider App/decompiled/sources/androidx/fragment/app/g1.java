package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1922a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f1924c;

    public g1(j1 j1Var, String str, int i5) {
        this.f1924c = j1Var;
        this.f1922a = str;
        this.f1923b = i5;
    }

    @Override // androidx.fragment.app.f1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f1924c.f1986z;
        if (fragment != null && this.f1923b < 0 && this.f1922a == null && fragment.getChildFragmentManager().T(-1, 0)) {
            return false;
        }
        return this.f1924c.U(arrayList, arrayList2, this.f1922a, this.f1923b, 1);
    }
}
