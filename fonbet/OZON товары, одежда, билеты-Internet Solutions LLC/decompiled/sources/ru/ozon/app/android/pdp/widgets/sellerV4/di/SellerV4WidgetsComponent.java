package ru.ozon.app.android.pdp.widgets.sellerV4.di;

import JS.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.widgets.sellerV4.core.SellerV4Mapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/di/SellerV4WidgetsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/sellerV4/core/SellerV4Mapper;", "getSellerV4Mapper", "()Lru/ozon/app/android/pdp/widgets/sellerV4/core/SellerV4Mapper;", "sellerV4Mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SellerV4WidgetsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/di/SellerV4WidgetsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/sellerV4/di/SellerV4WidgetsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SellerV4WidgetsComponent create$lambda$0(final C7475g c7475g) {
            return new SellerV4WidgetsComponent() { // from class: ru.ozon.app.android.pdp.widgets.sellerV4.di.SellerV4WidgetsComponent$Companion$create$1$1

                /* renamed from: sellerV4Mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j sellerV4Mapper = k.b(SellerV4WidgetsComponent$Companion$create$1$1$sellerV4Mapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(SellerV4WidgetsComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                private final NetworkComponentApi getNetworkComponentApi() {
                    return (NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class);
                }

                private final RetainComposerPerformanceComponentApi getRetainComposerPerformanceComponentApi() {
                    return (RetainComposerPerformanceComponentApi) C7475g.this.getComponent(RetainComposerPerformanceComponentApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.sellerV4.di.SellerV4WidgetsComponent
                public FeatureChecker getFeatureChecker() {
                    return getNetworkComponentApi().getFeatureChecker();
                }

                @Override // ru.ozon.app.android.pdp.widgets.sellerV4.di.SellerV4WidgetsComponent
                public FrameBinder getFrameBinder() {
                    return getRetainComposerPerformanceComponentApi().getFrameBinder();
                }

                @Override // ru.ozon.app.android.pdp.widgets.sellerV4.di.SellerV4WidgetsComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.sellerV4.di.SellerV4WidgetsComponent
                public SellerV4Mapper getSellerV4Mapper() {
                    return (SellerV4Mapper) this.sellerV4Mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<SellerV4WidgetsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SellerV4WidgetsComponent.class), new a(storage, 5));
        }
    }

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    SellerV4Mapper getSellerV4Mapper();
}
