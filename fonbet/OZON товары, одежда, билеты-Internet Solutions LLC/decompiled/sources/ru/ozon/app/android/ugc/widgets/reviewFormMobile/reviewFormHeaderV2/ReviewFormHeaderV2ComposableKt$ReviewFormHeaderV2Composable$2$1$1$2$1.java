package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rating", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$1$1$2$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ Function1<Float, Unit> $onRatingClick;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$1$1$2$1(View view, Function1<? super Float, Unit> function1) {
        super(1);
        this.$view = view;
        this.$onRatingClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        HapticVibrator.INSTANCE.vibrate(this.$view, HapticToken.MEDIUM);
        this.$onRatingClick.invoke(Float.valueOf(f7));
    }
}
