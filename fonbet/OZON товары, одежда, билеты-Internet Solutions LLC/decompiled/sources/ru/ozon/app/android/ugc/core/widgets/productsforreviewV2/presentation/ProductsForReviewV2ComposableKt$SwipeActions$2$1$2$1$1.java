package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$SwipeActions$2$1$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ProductVI.SwipeAction $action;
    final /* synthetic */ Function1<ProductVI.SwipeAction, Unit> $onActionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$SwipeActions$2$1$2$1$1(Function1<? super ProductVI.SwipeAction, Unit> function1, ProductVI.SwipeAction swipeAction) {
        super(0);
        this.$onActionClick = function1;
        this.$action = swipeAction;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onActionClick.invoke(this.$action);
    }
}
