package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f2677c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i5, int i10) {
        this.f2677c = swipeRefreshLayout;
        this.f2675a = i5;
        this.f2676b = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f6, Transformation transformation) {
        this.f2677c.f2637z.setAlpha((int) (((this.f2676b - r0) * f6) + this.f2675a));
    }
}
