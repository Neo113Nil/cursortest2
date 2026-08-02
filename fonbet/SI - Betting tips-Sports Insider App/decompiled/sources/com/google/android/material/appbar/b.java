package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5860c;

    public /* synthetic */ b(int i5, Object obj, Object obj2) {
        this.f5858a = i5;
        this.f5859b = obj;
        this.f5860c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5858a) {
            case 0:
                ((AppBarLayout) this.f5859b).lambda$initializeLiftOnScrollWithElevation$1((MaterialShapeDrawable) this.f5860c, valueAnimator);
                break;
            case 1:
                ((ExpandCollapseAnimationHelper) this.f5859b).lambda$getExpandCollapseAnimator$0((Rect) this.f5860c, valueAnimator);
                break;
            default:
                ((DeterminateDrawable) this.f5859b).lambda$new$0((BaseProgressIndicatorSpec) this.f5860c, valueAnimator);
                break;
        }
    }
}
