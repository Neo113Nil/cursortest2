package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import android.view.View;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "rating", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ProductCardContent$2$2$2$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onCardClick;
    final /* synthetic */ ProductForReviewV2VI $state;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$ProductCardContent$2$2$2$1(View view, ProductForReviewV2VI productForReviewV2VI, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$view = view;
        this.$state = productForReviewV2VI;
        this.$onCardClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        HapticVibrator.INSTANCE.vibrate(this.$view, HapticToken.MEDIUM);
        AtomAction.Move ratingTapAction = this.$state.getRatingTapAction();
        if (ratingTapAction != null) {
            Function1<AtomAction, Unit> function1 = this.$onCardClick;
            String link = ratingTapAction.getLink();
            function1.invoke(AtomAction.Move.copy$default(ratingTapAction, link != null ? ProductsForReviewV2ComposableKt.buildRateTapActionLink(link, C6915b.c(f7)) : null, null, null, null, null, 30, null));
        }
    }
}
