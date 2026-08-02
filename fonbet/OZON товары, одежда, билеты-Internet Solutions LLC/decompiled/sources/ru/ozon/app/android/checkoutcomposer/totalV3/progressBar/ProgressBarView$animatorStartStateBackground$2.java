package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ObjectAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProgressBarView$animatorStartStateBackground$2 extends AbstractC7737t implements Function0<ObjectAnimator> {
    final /* synthetic */ ProgressBarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarView$animatorStartStateBackground$2(ProgressBarView progressBarView) {
        super(0);
        this.this$0 = progressBarView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ObjectAnimator invoke() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0, (Property<ProgressBarView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        return ofFloat;
    }
}
