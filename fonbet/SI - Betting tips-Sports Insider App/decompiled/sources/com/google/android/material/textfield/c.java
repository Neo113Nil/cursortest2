package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f5974b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i5) {
        this.f5973a = i5;
        this.f5974b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5973a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f5974b).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((ClearTextEndIconDelegate) this.f5974b).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f5974b).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
