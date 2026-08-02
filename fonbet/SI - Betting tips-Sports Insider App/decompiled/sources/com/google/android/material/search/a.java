package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.material.internal.FadeThroughDrawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5923b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f5922a = i5;
        this.f5923b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5922a) {
            case 0:
                ((View) this.f5923b).setAlpha(0.0f);
                break;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$4((k.g) this.f5923b, valueAnimator);
                break;
            case 2:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$5((FadeThroughDrawable) this.f5923b, valueAnimator);
                break;
            case 3:
                ((SearchViewAnimationHelper) this.f5923b).lambda$addTextFadeAnimatorIfNeeded$7(valueAnimator);
                break;
            default:
                SearchViewAnimationHelper.lambda$addBackButtonAnimatorIfNeeded$3((ImageButton) this.f5923b, valueAnimator);
                break;
        }
    }
}
