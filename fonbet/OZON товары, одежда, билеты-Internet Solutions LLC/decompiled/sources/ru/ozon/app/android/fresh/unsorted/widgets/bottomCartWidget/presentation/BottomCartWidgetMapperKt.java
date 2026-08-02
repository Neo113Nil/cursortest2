package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data.BottomCartWidgetDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetVO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/data/BottomCartWidgetDTO;", "widgetId", "", "asyncData", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomCartWidgetMapperKt {
    @NotNull
    public static final BottomCartWidgetVO toVO(@NotNull BottomCartWidgetDTO bottomCartWidgetDTO, long j11, String str) {
        Intrinsics.checkNotNullParameter(bottomCartWidgetDTO, "<this>");
        BottomCartWidgetVO.ViewState catalogButtonState = (bottomCartWidgetDTO.getCatalogButton() == null || bottomCartWidgetDTO.getCartButton() == null) ? bottomCartWidgetDTO.getCatalogButton() != null ? new BottomCartWidgetVO.ViewState.CatalogButtonState(bottomCartWidgetDTO.getCatalogButton()) : bottomCartWidgetDTO.getCartButton() != null ? new BottomCartWidgetVO.ViewState.CartButtonState(bottomCartWidgetDTO.getCartButton()) : BottomCartWidgetVO.ViewState.NoButtonsState.INSTANCE : new BottomCartWidgetVO.ViewState.TwoButtonState(bottomCartWidgetDTO.getCartButton(), bottomCartWidgetDTO.getCatalogButton());
        Map<String, TokenizedTrackingInfo> trackingInfo = bottomCartWidgetDTO.getTrackingInfo();
        return new BottomCartWidgetVO(j11, catalogButtonState, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    public static /* synthetic */ BottomCartWidgetVO toVO$default(BottomCartWidgetDTO bottomCartWidgetDTO, long j11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return toVO(bottomCartWidgetDTO, j11, str);
    }
}
