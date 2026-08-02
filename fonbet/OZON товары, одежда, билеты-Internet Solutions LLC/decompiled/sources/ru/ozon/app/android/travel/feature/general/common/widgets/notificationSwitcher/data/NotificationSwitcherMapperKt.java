package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.data;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.presentation.NotificationSwitcherVI;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "toVI", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSwitcherMapperKt {
    @NotNull
    public static final NotificationSwitcherVI toVI(@NotNull NotificationSwitcherDTO notificationSwitcherDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(notificationSwitcherDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CellDTO cell = notificationSwitcherDTO.getCell();
        TravelWidgetSettingsDTO.PaddingsSetting cellPaddings = notificationSwitcherDTO.getCellPaddings();
        Map<String, TokenizedTrackingInfo> trackingInfo = notificationSwitcherDTO.getTrackingInfo();
        return new NotificationSwitcherVI(hashCode, cell, cellPaddings, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }
}
