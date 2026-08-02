package ru.ozon.app.android.search.dialogsearchscreen.searchbar.view;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DialogSearchBarView$indicatorAnimation$2 extends AbstractC7737t implements Function0<ObjectAnimator> {
    final /* synthetic */ DialogSearchBarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchBarView$indicatorAnimation$2(DialogSearchBarView dialogSearchBarView) {
        super(0);
        this.this$0 = dialogSearchBarView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ObjectAnimator invoke() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.this$0.getArrowBackIcon(), PropertyValuesHolder.ofFloat((Property<?, Float>) ViewGroup.ALPHA, 0.01f, 1.0f));
        ofPropertyValuesHolder.setDuration(500L);
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        return ofPropertyValuesHolder;
    }
}
