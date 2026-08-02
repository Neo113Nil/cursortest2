package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InstallmentPurchaseV5VO.SingleProduct.SingleProductContent $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1(InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$content = singleProductContent;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<BadgeDTO> badges = this.$content.getBadges();
        if (badges == null) {
            badges = K.f71697a;
        }
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        LazyRow.a(badges.size(), null, new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1$invoke$$inlined$items$default$3(InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1$invoke$$inlined$items$default$1.INSTANCE, badges), new C4912a(true, -632812321, new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1$invoke$$inlined$items$default$4(badges, function1)));
    }
}
