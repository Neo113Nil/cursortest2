package ru.ozon.app.android.search.catalog.components.productselectormobiledata.core;

import UZ.a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.RangeAnalyticDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.models.ProductSelectorMobileDataConcreteStepVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n*\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/RangeAnalyticDelegate;", "", "<init>", "()V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedInfo", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;Ljava/util/Map;)LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "vo", "", "sendRangeChangeActionAnalytic", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;)Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RangeAnalyticDelegate {
    private final t getTokenizedInfo(ProductSelectorMobileDataConcreteStepVO productSelectorMobileDataConcreteStepVO, Map<String, TokenizedTrackingInfo> map) {
        if (map != null) {
            return TrackingInfoMapperKt.mapToTokenizedEvent$default(map, Long.valueOf(productSelectorMobileDataConcreteStepVO.getId()), null, 2, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g sendRangeChangeActionAnalytic$lambda$0(String str, String str2, a aVar, g customizedEventParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customizedEventParams, "customizedEventParams");
        Map<String, Object> b11 = customizedEventParams.b();
        if (b11 == null) {
            b11 = U.c();
        }
        LinkedHashMap u11 = U.u(b11);
        u11.put("filterValue", str + ProductContainerDTO.RATIO_DELIMITER + str2);
        return g.a(customizedEventParams, u11, null, 2);
    }

    public final boolean sendRangeChangeActionAnalytic(@NotNull AtomAction.Click action, @NotNull ComposerReferences composerReferences, ProductSelectorMobileDataConcreteStepVO vo) {
        t tokenizedInfo;
        Map<String, String> params;
        final String str;
        Map<String, String> params2;
        final String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        if (vo == null || (tokenizedInfo = getTokenizedInfo(vo, action.getTrackingInfo())) == null || (params = action.getParams()) == null || (str = params.get("fromValue")) == null || (params2 = action.getParams()) == null || (str2 = params2.get("toValue")) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents(composerReferences.getTokenizedAnalytics(), tokenizedInfo, new e() { // from class: XH.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g sendRangeChangeActionAnalytic$lambda$0;
                sendRangeChangeActionAnalytic$lambda$0 = RangeAnalyticDelegate.sendRangeChangeActionAnalytic$lambda$0(str, str2, (d) aVar, gVar);
                return sendRangeChangeActionAnalytic$lambda$0;
            }
        });
        return true;
    }
}
