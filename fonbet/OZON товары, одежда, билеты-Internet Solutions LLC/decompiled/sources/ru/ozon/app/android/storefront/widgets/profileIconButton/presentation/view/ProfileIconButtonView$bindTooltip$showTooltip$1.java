package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonView$bindTooltip$showTooltip$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ int $requestId;
    final /* synthetic */ IconTooltipDto $tooltipData;
    final /* synthetic */ ProfileIconButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonView$bindTooltip$showTooltip$1(ProfileIconButtonView profileIconButtonView, int i11, IconTooltipDto iconTooltipDto) {
        super(1);
        this.this$0 = profileIconButtonView;
        this.$requestId = i11;
        this.$tooltipData = iconTooltipDto;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        int tooltipRequestId;
        TooltipDTO tooltipDto;
        tooltipRequestId = this.this$0.getTooltipRequestId();
        if (tooltipRequestId == this.$requestId) {
            tooltipDto = this.this$0.getTooltipDto();
            if (Intrinsics.d(tooltipDto, this.$tooltipData.getTooltipModel())) {
                this.this$0.setTooltipVisible(true);
                this.this$0.trackViewAnalytics();
            }
        }
    }
}
