package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MessengerCounterV2View$indicatorAnimation$2 extends AbstractC7737t implements Function0<ObjectAnimator> {
    final /* synthetic */ MessengerCounterV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerCounterV2View$indicatorAnimation$2(MessengerCounterV2View messengerCounterV2View) {
        super(0);
        this.this$0 = messengerCounterV2View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ObjectAnimator invoke() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.this$0.getIndicatorView(), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 0.01f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 0.01f, 1.0f));
        ofPropertyValuesHolder.setDuration(400L);
        ofPropertyValuesHolder.setInterpolator(new BounceInterpolator());
        return ofPropertyValuesHolder;
    }
}
