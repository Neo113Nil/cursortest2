package ru.ozon.app.android.messenger.widgets.messengerCounterV2.di;

import EN.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2Mapper;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewFactory;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewModelImpl;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.notifications.NotificationsManager;
import ru.ozon.app.android.notifications.di.NotificationComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/di/MessengerCounterV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2Mapper;", "getMapper", "()Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2Mapper;", "mapper", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewFactory;", "getViewFactory", "()Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewFactory;", "viewFactory", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModelImpl;", "getMessengerCounterViewModel", "()Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModelImpl;", "messengerCounterViewModel", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessengerCounterV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/di/MessengerCounterV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/di/MessengerCounterV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "createComponent", "(Lk20/g;)Lk20/e;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessengerCounterV2Component createComponent$lambda$0(final C7475g c7475g) {
            return new MessengerCounterV2Component(c7475g) { // from class: ru.ozon.app.android.messenger.widgets.messengerCounterV2.di.MessengerCounterV2Component$Companion$createComponent$1$1
                private final FeatureService featureService;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;
                private final NetworkComponentApi networkComponentApi;
                private final NotificationComponentApi notificationComponentApi;
                private final NotificationsManager notificationsManager;
                private final StorageComponentApi storageComponentApi;

                /* renamed from: viewFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewFactory;

                {
                    NotificationComponentApi notificationComponentApi = (NotificationComponentApi) c7475g.getComponent(NotificationComponentApi.class);
                    this.notificationComponentApi = notificationComponentApi;
                    NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.networkComponentApi = networkComponentApi;
                    this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
                    this.mapper = k.b(MessengerCounterV2Component$Companion$createComponent$1$1$mapper$2.INSTANCE);
                    this.viewFactory = k.b(MessengerCounterV2Component$Companion$createComponent$1$1$viewFactory$2.INSTANCE);
                    this.notificationsManager = notificationComponentApi.getNotificationsManager();
                    this.featureService = networkComponentApi.getFeatureService();
                }

                @Override // ru.ozon.app.android.messenger.widgets.messengerCounterV2.di.MessengerCounterV2Component
                public MessengerCounterV2Mapper getMapper() {
                    return (MessengerCounterV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.messenger.widgets.messengerCounterV2.di.MessengerCounterV2Component
                public MessengerCounterV2ViewModelImpl getMessengerCounterViewModel() {
                    return new MessengerCounterV2ViewModelImpl(getNotificationsManager(), this.storageComponentApi.getAuthStateStorage());
                }

                public NotificationsManager getNotificationsManager() {
                    return this.notificationsManager;
                }

                @Override // ru.ozon.app.android.messenger.widgets.messengerCounterV2.di.MessengerCounterV2Component
                public MessengerCounterV2ViewFactory getViewFactory() {
                    return (MessengerCounterV2ViewFactory) this.viewFactory.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<MessengerCounterV2Component> createComponent(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MessengerCounterV2Component.class), new a(storage, 16));
        }
    }

    @NotNull
    MessengerCounterV2Mapper getMapper();

    @NotNull
    MessengerCounterV2ViewModelImpl getMessengerCounterViewModel();

    @NotNull
    MessengerCounterV2ViewFactory getViewFactory();
}
