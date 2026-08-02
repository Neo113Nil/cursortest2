package ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.data.EnableNotificationsSnackbarDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.presentation.EnableNotificationsSnackbarVO;
import ru.ozon.app.android.notifications.utils.NotificationHelper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/core/EnableNotificationsSnackbarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/data/EnableNotificationsSnackbarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "id", "toVo", "(Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/data/EnableNotificationsSnackbarDTO;J)Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/presentation/EnableNotificationsSnackbarVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/enablenotificationssnackbar/data/EnableNotificationsSnackbarDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnableNotificationsSnackbarMapper implements Function2<EnableNotificationsSnackbarDTO, d, List<? extends EnableNotificationsSnackbarVO>> {

    @NotNull
    private final Context context;

    public EnableNotificationsSnackbarMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final EnableNotificationsSnackbarVO toVo(EnableNotificationsSnackbarDTO enableNotificationsSnackbarDTO, long j11) {
        return new EnableNotificationsSnackbarVO(j11, enableNotificationsSnackbarDTO.getNotification(), NotificationHelper.INSTANCE.isSystemNotificationsTurnedOn(this.context));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EnableNotificationsSnackbarVO> invoke(@NotNull EnableNotificationsSnackbarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
