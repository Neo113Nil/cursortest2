package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di;

import BL.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/di/BigPromoCheckoutWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BigPromoCheckoutWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/di/BigPromoCheckoutWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/di/BigPromoCheckoutWidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BigPromoCheckoutWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new BigPromoCheckoutWidgetComponent(c7475g) { // from class: ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetComponent$Companion$create$1$1
                private final AppType appType;
                private final RetainComposerComponentApi retainComposerComponentApi;
                private final StorageComponentApi storageComponentApi;
                private final l tokenizedAnalytics;

                {
                    RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.retainComposerComponentApi = retainComposerComponentApi;
                    this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
                    this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
                    this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
                }

                @Override // ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetComponent
                public AppType getAppType() {
                    return this.appType;
                }

                @Override // ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetComponent
                public StartupArgsService getStartupArgsService() {
                    return this.storageComponentApi.getStartupArgsService();
                }

                @Override // ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetComponent
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }
            };
        }

        @NotNull
        public final C7473e<BigPromoCheckoutWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BigPromoCheckoutWidgetComponent.class), new a(storage, 6));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    StartupArgsService getStartupArgsService();

    @NotNull
    l getTokenizedAnalytics();
}
