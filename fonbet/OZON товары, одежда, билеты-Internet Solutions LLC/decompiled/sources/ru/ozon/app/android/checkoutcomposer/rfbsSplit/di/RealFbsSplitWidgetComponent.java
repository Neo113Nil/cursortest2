package ru.ozon.app.android.checkoutcomposer.rfbsSplit.di;

import Fo.C3057a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/di/RealFbsSplitWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RealFbsSplitWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/di/RealFbsSplitWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/di/RealFbsSplitWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RealFbsSplitWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new RealFbsSplitWidgetComponent(c7475g) { // from class: ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent$Companion$create$1$1
                private final ActionSheetEventHandler actionSheetEventHandler;
                private final Context appContext;
                private final AppType appType;
                private final d customActionHandlersStoreFactory;
                private final FeatureChecker featureChecker;

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(RealFbsSplitWidgetComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                {
                    this.appContext = ((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class)).getContext();
                    this.actionSheetEventHandler = ((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class)).getActionSheetEventHandler();
                    this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                    this.featureChecker = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getFeatureChecker();
                    this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
                }

                @Override // ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent
                public ActionSheetEventHandler getActionSheetEventHandler() {
                    return this.actionSheetEventHandler;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent
                public Context getAppContext() {
                    return this.appContext;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent
                public AppType getAppType() {
                    return this.appType;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent
                public FeatureChecker getFeatureChecker() {
                    return this.featureChecker;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<RealFbsSplitWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(RealFbsSplitWidgetComponent.class), new C3057a(storage, 0));
        }
    }

    @NotNull
    ActionSheetEventHandler getActionSheetEventHandler();

    @NotNull
    Context getAppContext();

    @NotNull
    AppType getAppType();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();
}
