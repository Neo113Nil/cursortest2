package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerVO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "toVo", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonPromoBannerMapperKt {
    @NotNull
    public static final CommonPromoBannerVO toVo(@NotNull CommonPromoBannerDTO commonPromoBannerDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(commonPromoBannerDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = commonPromoBannerDTO.getTrackingInfo();
        return new CommonPromoBannerVO(hashCode, commonPromoBannerDTO, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, false);
    }
}
