package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$SwipeActions$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<ProductVI.SwipeAction, Unit> $onActionClick;
    final /* synthetic */ Function1<Float, Unit> $onWidthChanged;
    final /* synthetic */ ProductVI.SwipeActionsVI $swipeActions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$SwipeActions$3(e eVar, ProductVI.SwipeActionsVI swipeActionsVI, Function1<? super ProductVI.SwipeAction, Unit> function1, Function1<? super Float, Unit> function12, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$swipeActions = swipeActionsVI;
        this.$onActionClick = function1;
        this.$onWidthChanged = function12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProductsForReviewV2ComposableKt.SwipeActions(this.$modifier, this.$swipeActions, this.$onActionClick, this.$onWidthChanged, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
