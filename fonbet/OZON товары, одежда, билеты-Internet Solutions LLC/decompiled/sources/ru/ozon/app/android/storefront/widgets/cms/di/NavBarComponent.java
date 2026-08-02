package ru.ozon.app.android.storefront.widgets.cms.di;

import AL.a;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefront.navBar.NavBarMapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/di/NavBarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/storefront/navBar/NavBarMapper;", "getMapper", "()Lru/ozon/app/android/storefront/navBar/NavBarMapper;", "mapper", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "getWidgetTokenizedAnalytics", "()Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "widgetTokenizedAnalytics", "Companion", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NavBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/di/NavBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/storefront/widgets/cms/di/NavBarComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavBarComponent create$lambda$0(final C7475g c7475g) {
            return new NavBarComponent(c7475g) { // from class: ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(NavBarComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final NavigationComponentApi navigationComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;

                {
                    this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent
                public NavBarMapper getMapper() {
                    return (NavBarMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent
                public g getRouter() {
                    return this.navigationComponentApi.getOzonRouter();
                }

                @Override // ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent
                public WidgetTokenizedAnalytics getWidgetTokenizedAnalytics() {
                    return this.retainComponentApi.getWidgetTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<NavBarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NavBarComponent.class), new a(storage, 16));
        }
    }

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    NavBarMapper getMapper();

    @NotNull
    g getRouter();

    @NotNull
    WidgetTokenizedAnalytics getWidgetTokenizedAnalytics();
}
