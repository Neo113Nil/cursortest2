package ru.ozon.app.android.storefront.widgets.inAppPush.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.inAppPush.data.InAppPushDTO;
import ru.ozon.app.android.storefront.widgets.inAppPush.presentation.InAppPushVO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/inAppPush/data/InAppPushDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/inAppPush/data/InAppPushDTO;Ll20/d;)Ljava/util/List;", "dto", "", "widgetId", "toVO", "(Lru/ozon/app/android/storefront/widgets/inAppPush/data/InAppPushDTO;Ljava/lang/Long;)Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPushMapper implements Function2<InAppPushDTO, d, List<? extends InAppPushVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/core/InAppPushMapper$Companion;", "", "<init>", "()V", "DEFAULT_SEC_REFRESH_INTERVAL", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ InAppPushVO toVO$default(InAppPushMapper inAppPushMapper, InAppPushDTO inAppPushDTO, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        return inAppPushMapper.toVO(inAppPushDTO, l11);
    }

    @NotNull
    public final InAppPushVO toVO(@NotNull InAppPushDTO dto, Long widgetId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        long longValue = widgetId != null ? widgetId.longValue() : 0L;
        NotificationDTO notificationBar = dto.getNotificationBar();
        Integer refreshInterval = dto.getRefreshInterval();
        return new InAppPushVO(longValue, notificationBar, refreshInterval != null ? refreshInterval.intValue() : 30, dto.getPixelUrl());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InAppPushVO> invoke(@NotNull InAppPushDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, Long.valueOf(widgetInfo.d().hashCode())));
    }
}
