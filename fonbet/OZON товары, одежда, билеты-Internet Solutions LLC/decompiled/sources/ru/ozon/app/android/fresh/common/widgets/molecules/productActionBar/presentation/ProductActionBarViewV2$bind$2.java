package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductActionBarViewV2$bind$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ProductActionBarViewV2.ActionListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductActionBarViewV2$bind$2(ProductActionBarViewV2.ActionListener actionListener) {
        super(0);
        this.$listener = actionListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ProductActionBarViewV2.ActionListener actionListener = this.$listener;
        if (actionListener != null) {
            actionListener.onMinusClick();
        }
    }
}
