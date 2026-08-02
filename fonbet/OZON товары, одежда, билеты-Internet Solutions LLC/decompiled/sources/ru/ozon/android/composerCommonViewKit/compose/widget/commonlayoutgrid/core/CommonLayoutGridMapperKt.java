package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.core;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation.CommonLayoutGridVO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/presentation/CommonLayoutGridVO;", "toVo", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/presentation/CommonLayoutGridVO;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonLayoutGridMapperKt {
    @NotNull
    public static final CommonLayoutGridVO toVo(@NotNull CommonLayoutGridDTO commonLayoutGridDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(commonLayoutGridDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = commonLayoutGridDTO.getTrackingInfo();
        return new CommonLayoutGridVO(hashCode, commonLayoutGridDTO, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }
}
