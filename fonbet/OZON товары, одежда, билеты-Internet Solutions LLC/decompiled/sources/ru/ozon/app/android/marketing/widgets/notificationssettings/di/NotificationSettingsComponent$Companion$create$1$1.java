package ru.ozon.app.android.marketing.widgets.notificationssettings.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.domain.NotificationSettingsApi;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell.NotificationsSettingsCellMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector.NotificationsSettingsSelectorMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.title.NotificationsSettingsTitleMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"ru/ozon/app/android/marketing/widgets/notificationssettings/di/NotificationSettingsComponent$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/notificationssettings/di/NotificationSettingsComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/cell/NotificationsSettingsCellMapper;", "cellMapper$delegate", "LSc/j;", "getCellMapper", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/core/cell/NotificationsSettingsCellMapper;", "cellMapper", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorMapper;", "selectorMapper$delegate", "getSelectorMapper", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorMapper;", "selectorMapper", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/title/NotificationsSettingsTitleMapper;", "titleMapper$delegate", "getTitleMapper", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/core/title/NotificationsSettingsTitleMapper;", "titleMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "notificationsSettingsApi$delegate", "getNotificationsSettingsApi", "()Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "notificationsSettingsApi", "Lru/ozon/app/android/account/user/UserManager;", "getUserManager", "()Lru/ozon/app/android/account/user/UserManager;", "userManager", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationSettingsComponent$Companion$create$1$1 implements NotificationSettingsComponent {
    private final AccountComponentApi accountComponentApi;
    private final ContextComponentDependencies contextApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: cellMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cellMapper = k.b(new NotificationSettingsComponent$Companion$create$1$1$cellMapper$2(this));

    /* renamed from: selectorMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j selectorMapper = k.b(NotificationSettingsComponent$Companion$create$1$1$selectorMapper$2.INSTANCE);

    /* renamed from: titleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j titleMapper = k.b(NotificationSettingsComponent$Companion$create$1$1$titleMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(NotificationSettingsComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: notificationsSettingsApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j notificationsSettingsApi = k.b(new NotificationSettingsComponent$Companion$create$1$1$notificationsSettingsApi$2(this));

    NotificationSettingsComponent$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.contextApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent
    public NotificationsSettingsCellMapper getCellMapper() {
        return (NotificationsSettingsCellMapper) this.cellMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent
    public NotificationSettingsApi getNotificationsSettingsApi() {
        Object value = this.notificationsSettingsApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (NotificationSettingsApi) value;
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent
    public NotificationsSettingsSelectorMapper getSelectorMapper() {
        return (NotificationsSettingsSelectorMapper) this.selectorMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent
    public NotificationsSettingsTitleMapper getTitleMapper() {
        return (NotificationsSettingsTitleMapper) this.titleMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent
    public UserManager getUserManager() {
        return this.accountComponentApi.getUserManager();
    }
}
