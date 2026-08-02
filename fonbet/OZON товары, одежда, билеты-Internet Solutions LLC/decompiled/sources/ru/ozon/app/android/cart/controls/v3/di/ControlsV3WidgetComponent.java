package ru.ozon.app.android.cart.controls.v3.di;

import Bs.C2670a;
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
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3Mapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/di/ControlsV3WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3Mapper;", "getMapper", "()Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3Mapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ControlsV3WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/di/ControlsV3WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cart/controls/v3/di/ControlsV3WidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ControlsV3WidgetComponent create$lambda$0(final C7475g c7475g) {
            return new ControlsV3WidgetComponent() { // from class: ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent$Companion$create$1$1
                private final AppType appType;

                {
                    this.appType = ((AndroidPlatformComponentDependencies) C7475g.this.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public AppType getAppType() {
                    return this.appType;
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
                    return ((CartServiceApi) C7475g.this.getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider();
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public FeatureService getFeatureService() {
                    return ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getFeatureService();
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return new HandlersInhibitor();
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public ControlsV3Mapper getMapper() {
                    return new ControlsV3Mapper();
                }

                @Override // ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<ControlsV3WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ControlsV3WidgetComponent.class), new C2670a(storage, 1));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    ControlsV3Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
