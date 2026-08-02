package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "swipeAction", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$5$1 extends AbstractC7737t implements Function1<ProductVI.SwipeAction, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$5$1(Function1<? super b, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductVI.SwipeAction swipeAction) {
        invoke2(swipeAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductVI.SwipeAction swipeAction) {
        Intrinsics.checkNotNullParameter(swipeAction, "swipeAction");
        AtomAction action = swipeAction.getAction();
        if (action != null) {
            this.$actionHandler.invoke(action);
        }
    }
}
