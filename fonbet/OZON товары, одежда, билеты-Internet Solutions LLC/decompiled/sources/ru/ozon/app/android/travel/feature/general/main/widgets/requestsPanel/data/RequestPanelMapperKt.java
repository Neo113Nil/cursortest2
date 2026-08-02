package ru.ozon.app.android.travel.feature.general.main.widgets.requestsPanel.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.requestsPanel.presentation.RequestPanelVI;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVI", "Lru/ozon/app/android/travel/feature/general/main/widgets/requestsPanel/presentation/RequestPanelVI;", "Lru/ozon/app/android/travel/feature/general/main/widgets/requestsPanel/data/RequestPanelDTO;", "widgetId", "", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestPanelMapperKt {
    @NotNull
    public static final RequestPanelVI toVI(@NotNull RequestPanelDTO requestPanelDTO, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(requestPanelDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        long hashCode = widgetId.hashCode();
        TextDTO title = requestPanelDTO.getTitle();
        List<CellDTO> requests = requestPanelDTO.getRequests();
        Map<String, TokenizedTrackingInfo> trackingInfo = requestPanelDTO.getTrackingInfo();
        return new RequestPanelVI(hashCode, title, requests, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }
}
