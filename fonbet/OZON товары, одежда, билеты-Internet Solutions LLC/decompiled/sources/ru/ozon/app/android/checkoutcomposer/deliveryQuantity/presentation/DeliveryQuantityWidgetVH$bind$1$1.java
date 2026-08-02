package ru.ozon.app.android.checkoutcomposer.deliveryQuantity.presentation;

import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityVO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", ImagesContract.URL, "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryQuantityWidgetVH$bind$1$1 extends AbstractC7737t implements Function2<String, Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    final /* synthetic */ DeliveryQuantityWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryQuantityWidgetVH$bind$1$1(DeliveryQuantityWidgetVH deliveryQuantityWidgetVH) {
        super(2);
        this.this$0 = deliveryQuantityWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2(str, (Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String url, Map<String, TokenizedTrackingInfo> map) {
        t tVar;
        Intrinsics.checkNotNullParameter(url, "url");
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.this$0.getRef().getNavigator(), url, null, 2, null);
        if (map != null) {
            DeliveryQuantityVO boundedData = this.this$0.getBoundedData();
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(map, boundedData != null ? Long.valueOf(boundedData.getId()) : null, null, 2, null);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.this$0.getRef().getTokenizedAnalytics(), tVar, null, 2, null);
        }
    }
}
