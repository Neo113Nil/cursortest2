package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.di;

import AB.b;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModelFactory;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/di/PromoPushEnableComponent;", "Lhi/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModelFactory;", "getViewModelFactory", "()Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModelFactory;", "viewModelFactory", "Companion", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PromoPushEnableComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/di/PromoPushEnableComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/di/PromoPushEnableComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromoPushEnableComponent create$lambda$0(final C7475g c7475g) {
            return new PromoPushEnableComponent() { // from class: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.di.PromoPushEnableComponent$Companion$create$1$1
                private final ActionV2Repository actionV2Repository;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class);
                    this.actionV2Repository = ((ActionComponentApi) C7475g.this.getComponent(ActionComponentApi.class)).getActionRepository();
                }

                @Override // ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.di.PromoPushEnableComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.di.PromoPushEnableComponent
                public PromoPushEnableViewModelFactory getViewModelFactory() {
                    return new PromoPushEnableViewModelFactory(this.actionV2Repository, ((AndroidPlatformComponentApi) C7475g.this.getComponent(AndroidPlatformComponentApi.class)).getEnableNotificationsSuggestingHandler(), ((CoroutineDispatchersComponentApi) C7475g.this.getComponent(CoroutineDispatchersComponentApi.class)).getDispatcherProvider(), ((NotificationStatusComponentApi) C7475g.this.getComponent(NotificationStatusComponentApi.class)).getNotificationStatusProvider());
                }
            };
        }

        @NotNull
        public final C7473e<PromoPushEnableComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PromoPushEnableComponent.class), new b(storage, 8));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    PromoPushEnableViewModelFactory getViewModelFactory();
}
