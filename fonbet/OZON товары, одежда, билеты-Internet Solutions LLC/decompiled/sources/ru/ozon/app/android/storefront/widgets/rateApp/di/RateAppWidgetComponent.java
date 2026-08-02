package ru.ozon.app.android.storefront.widgets.rateApp.di;

import GN.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefront.widgets.rateApp.core.RateAppMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storefront/widgets/rateApp/core/RateAppMapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/rateApp/core/RateAppMapper;", "mapper", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "getAppStoreInfoProvider", "()Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "appStoreInfoProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RateAppWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RateAppWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new RateAppWidgetComponent() { // from class: ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent$Companion$create$1$1
                private final AnalyticsComponentApi analyticsComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(RateAppWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

                {
                    this.analyticsComponentApi = (AnalyticsComponentApi) C7475g.this.getComponent(AnalyticsComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class);
                }

                private final NetworkComponentApi getNetworkComponentApi() {
                    return (NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class);
                }

                @Override // ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent
                public AppStoreInfoProvider getAppStoreInfoProvider() {
                    return this.analyticsComponentApi.getAppStoreInfoProvider();
                }

                @Override // ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent
                public FeatureChecker getFeatureChecker() {
                    return getNetworkComponentApi().getFeatureChecker();
                }

                @Override // ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent
                public RateAppMapper getMapper() {
                    return (RateAppMapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<RateAppWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(RateAppWidgetComponent.class), new a(storage, 1));
        }
    }

    @NotNull
    AppStoreInfoProvider getAppStoreInfoProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    RateAppMapper getMapper();
}
