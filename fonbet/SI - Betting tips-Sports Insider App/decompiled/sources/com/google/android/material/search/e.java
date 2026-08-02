package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5933c;

    public /* synthetic */ e(int i5, Object obj, Object obj2) {
        this.f5931a = i5;
        this.f5932b = obj;
        this.f5933c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5931a) {
            case 0:
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1((MaterialShapeDrawable) this.f5932b, (View) this.f5933c, valueAnimator);
                break;
            default:
                ((SearchViewAnimationHelper) this.f5932b).lambda$addEditTextClipAnimator$6((Rect) this.f5933c, valueAnimator);
                break;
        }
    }
}
