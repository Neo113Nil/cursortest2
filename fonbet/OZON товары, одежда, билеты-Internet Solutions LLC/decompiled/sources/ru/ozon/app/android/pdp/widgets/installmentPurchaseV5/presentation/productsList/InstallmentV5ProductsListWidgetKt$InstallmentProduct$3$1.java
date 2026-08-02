package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.productsList;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentV5ProductsListWidgetKt$InstallmentProduct$3$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InstallmentPurchaseV5VO.CreditProductsList.CreditProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstallmentV5ProductsListWidgetKt$InstallmentProduct$3$1(InstallmentPurchaseV5VO.CreditProductsList.CreditProduct creditProduct, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$product = creditProduct;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction action;
        InstallmentPurchaseV5VO.CommonVO common = this.$product.getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return;
        }
        this.$actionHandler.invoke(action);
    }
}
