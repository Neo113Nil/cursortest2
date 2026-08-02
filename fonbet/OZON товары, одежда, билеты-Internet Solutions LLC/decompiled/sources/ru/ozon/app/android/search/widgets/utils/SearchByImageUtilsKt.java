package ru.ozon.app.android.search.widgets.utils;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"showErrorNotification", "", "Landroid/view/View;", "errorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "widgetId", "", "(Landroid/view/View;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/Long;)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchByImageUtilsKt {
    public static final void showErrorNotification(@NotNull View view, NotificationDTO notificationDTO, @NotNull ComposerReferences references, Long l11) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(references, "references");
        if (notificationDTO != null) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
                return;
            }
            CommonControlSettings common = notificationDTO.getCommon();
            if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(references.getTokenizedAnalytics(), TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null), null, 2, null);
            }
            NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationDTO, references.getContainer().g(), null, 8, null).show();
        }
    }
}
