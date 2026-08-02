package ru.ozon.app.android.account.orders.commonBarcodeV2;

import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CommonBarcodeV2Component $component;
    final /* synthetic */ CommonBarcodeV2VO $item;
    final /* synthetic */ i<CommonBarcodeV2VO> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$1$1(CommonBarcodeV2VO commonBarcodeV2VO, i<CommonBarcodeV2VO> iVar, l lVar, CommonBarcodeV2Component commonBarcodeV2Component) {
        super(0);
        this.$item = commonBarcodeV2VO;
        this.$this_content = iVar;
        this.$tokenizedAnalytics = lVar;
        this.$component = commonBarcodeV2Component;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t d11;
        CommonControlSettings common = this.$item.getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null && (d11 = x.d(trackingInfo, this.$this_content.getInfo())) != null) {
            m.c(this.$tokenizedAnalytics, d11, null);
        }
        if (this.$item.getShareButton() == null || this.$component.getViewedPond().c(String.valueOf(this.$item.getId()))) {
            return;
        }
        this.$component.getViewedPond().e(String.valueOf(this.$item.getId()));
        this.$component.getShareBarcodeAnalytics().widgetShareButtonView(StringProvider.getString(R$string.share_code));
    }
}
