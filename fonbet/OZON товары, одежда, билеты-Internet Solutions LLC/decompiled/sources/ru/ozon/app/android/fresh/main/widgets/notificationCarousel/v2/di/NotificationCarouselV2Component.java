package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di;

import Fu.C3060a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.common.flags.FreshNotificationCarouselV2InShellNavBar;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2Mapper;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2RepositoryImpl;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewModel;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewModelFF;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/di/NotificationCarouselV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "", "isFeatureFlagEnabled", "()Z", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "viewModel", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "getViewModelExperimental", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "viewModelExperimental", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "mapper", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NotificationCarouselV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/di/NotificationCarouselV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/di/NotificationCarouselV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NotificationCarouselV2Component create$lambda$0(final C7475g c7475g) {
            return new NotificationCarouselV2Component() { // from class: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(NotificationCarouselV2Component$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component
                public NotificationCarouselV2Mapper getMapper() {
                    return (NotificationCarouselV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component
                public NotificationCarouselV2ViewModel getViewModel() {
                    return new NotificationCarouselV2ViewModel(new NotificationCarouselV2RepositoryImpl(((ComposerWidgetAsyncComponentApi) C7475g.this.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository(), getMapper()));
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component
                public NotificationCarouselV2ViewModelFF getViewModelExperimental() {
                    return new NotificationCarouselV2ViewModelFF(new NotificationCarouselV2RepositoryImpl(((ComposerWidgetAsyncComponentApi) C7475g.this.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository(), getMapper()));
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component
                public boolean isFeatureFlagEnabled() {
                    return ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getFeatureChecker().isEnabled(FreshNotificationCarouselV2InShellNavBar.INSTANCE);
                }
            };
        }

        @NotNull
        public final C7473e<NotificationCarouselV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NotificationCarouselV2Component.class), new C3060a(storage, 9));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    NotificationCarouselV2Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    NotificationCarouselV2ViewModel getViewModel();

    @NotNull
    NotificationCarouselV2ViewModelFF getViewModelExperimental();

    boolean isFeatureFlagEnabled();
}
