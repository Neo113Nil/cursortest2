package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "translationY", "", "alpha", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2WidgetViewHolder$updatePrice$1 extends AbstractC7737t implements Function2<Float, Float, Unit> {
    final /* synthetic */ AppCompatTextView $animatedPriceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2WidgetViewHolder$updatePrice$1(AppCompatTextView appCompatTextView) {
        super(2);
        this.$animatedPriceView = appCompatTextView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Float f7, Float f11) {
        invoke(f7.floatValue(), f11.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7, float f11) {
        this.$animatedPriceView.setTranslationY(f7);
        this.$animatedPriceView.setAlpha(f11);
    }
}
