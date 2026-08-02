package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ProductCardContent$2$2$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onCardClick;
    final /* synthetic */ ProductForReviewV2VI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$ProductCardContent$2$2$1$1$1(ProductForReviewV2VI productForReviewV2VI, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$state = productForReviewV2VI;
        this.$onCardClick = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction.Move cardTapAction = this.$state.getCardTapAction();
        if (cardTapAction != null) {
            this.$onCardClick.invoke(cardTapAction);
        }
    }
}
