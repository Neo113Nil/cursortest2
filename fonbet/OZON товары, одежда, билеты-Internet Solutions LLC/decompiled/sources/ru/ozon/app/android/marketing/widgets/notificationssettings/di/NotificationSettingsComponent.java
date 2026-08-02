package ru.ozon.app.android.marketing.widgets.notificationssettings.di;

import AT.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.marketing.domain.NotificationSettingsApi;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell.NotificationsSettingsCellMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector.NotificationsSettingsSelectorMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.title.NotificationsSettingsTitleMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001b2\u00060\u0001j\u0002`\u0002:\u0001\u001bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/di/NotificationSettingsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/cell/NotificationsSettingsCellMapper;", "getCellMapper", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/core/cell/NotificationsSettingsCellMapper;", "cellMapper", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorMapper;", "getSelectorMapper", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorMapper;", "selectorMapper", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/title/NotificationsSettingsTitleMapper;", "getTitleMapper", "()Lru/ozon/app/android/marketing/widgets/notificationssettings/core/title/NotificationsSettingsTitleMapper;", "titleMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "getNotificationsSettingsApi", "()Lru/ozon/app/android/marketing/domain/NotificationSettingsApi;", "notificationsSettingsApi", "Lru/ozon/app/android/account/user/UserManager;", "getUserManager", "()Lru/ozon/app/android/account/user/UserManager;", "userManager", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NotificationSettingsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/di/NotificationSettingsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/di/NotificationSettingsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NotificationSettingsComponent create$lambda$0(C7475g c7475g) {
            return new NotificationSettingsComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<NotificationSettingsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NotificationSettingsComponent.class), new a(storage, 3));
        }
    }

    @NotNull
    NotificationsSettingsCellMapper getCellMapper();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    NotificationSettingsApi getNotificationsSettingsApi();

    @NotNull
    NotificationsSettingsSelectorMapper getSelectorMapper();

    @NotNull
    NotificationsSettingsTitleMapper getTitleMapper();

    @NotNull
    UserManager getUserManager();
}
