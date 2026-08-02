package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2NewBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view.AdvVideoBannerV2ViewNew;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "productHeight", "", "visibility", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2PlayerBinder$changeProductVisibility$1 extends AbstractC7737t implements Function2<Integer, Boolean, Unit> {
    final /* synthetic */ AdvBannerVideoV2VO $item;
    final /* synthetic */ AdvVideoBannerV2PlayerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PlayerBinder$changeProductVisibility$1(AdvBannerVideoV2VO advBannerVideoV2VO, AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder) {
        super(2);
        this.$item = advBannerVideoV2VO;
        this.this$0 = advVideoBannerV2PlayerBinder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        invoke(num.intValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, boolean z11) {
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        if (this.$item.getLegalInformation() != null) {
            AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder = this.this$0;
            AdvBannerVideoV2VO advBannerVideoV2VO = this.$item;
            widgetAdvVideoBannerV2NewBinding = advVideoBannerV2PlayerBinder.binding;
            if (widgetAdvVideoBannerV2NewBinding == null || (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) == null) {
                return;
            }
            advVideoBannerV2ViewNew.repositionLegalStateIfNeeded(i11, 8388611, z11 && !advBannerVideoV2VO.getDisableOverlayDisclaimer());
        }
    }
}
