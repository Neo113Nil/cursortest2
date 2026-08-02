package androidx.core.view;

import android.view.WindowInsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g2 extends f2 {

    /* renamed from: s, reason: collision with root package name */
    public static final k2 f1323s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1323s = k2.h(null, windowInsets);
    }

    public g2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
    }

    @Override // androidx.core.view.e2, androidx.core.view.a2, androidx.core.view.h2
    public g0.d f(int i5) {
        return g0.d.d(this.f1286c.getInsets(j2.a(i5)));
    }

    @Override // androidx.core.view.e2, androidx.core.view.a2, androidx.core.view.h2
    public g0.d g(int i5) {
        return g0.d.d(this.f1286c.getInsetsIgnoringVisibility(j2.a(i5)));
    }
}
