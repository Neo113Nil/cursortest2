package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import androidx.lifecycle.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModel;", "", "", "id", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;", "info", "", "isSelected", "", "changeSetting", "(JLru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$SettingInfo;Z)V", "settingId", "commId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "changeSettingInBottomSheet", "(JJJJ)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "getActionLiveData", "()Landroidx/lifecycle/P;", "actionLiveData", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NotificationsSettingsCellViewModel {
    void changeSetting(long id2, @NotNull NotificationsSettingsDTO.NotificationSource.SettingInfo info, boolean isSelected);

    void changeSettingInBottomSheet(long id2, long settingId, long commId, long value);

    @NotNull
    P<NotificationsSettingsCellViewModelImpl.Action> getActionLiveData();
}
