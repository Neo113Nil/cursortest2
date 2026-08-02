package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tooltipKey", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$4$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ TooltipViewModel $tooltipViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$4$1(TooltipViewModel tooltipViewModel) {
        super(1);
        this.$tooltipViewModel = tooltipViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        TooltipViewModel tooltipViewModel = this.$tooltipViewModel;
        if (str == null) {
            return;
        }
        tooltipViewModel.onShown(str, true);
    }
}
