package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ AbstractC7799Q $gradientBrush;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$1$1(AbstractC7799Q abstractC7799Q) {
        super(1);
        this.$gradientBrush = abstractC7799Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        InterfaceC8412e.k0(drawWithContent, this.$gradientBrush, 0L, 0L, 0.0f, null, 6, 62);
    }
}
