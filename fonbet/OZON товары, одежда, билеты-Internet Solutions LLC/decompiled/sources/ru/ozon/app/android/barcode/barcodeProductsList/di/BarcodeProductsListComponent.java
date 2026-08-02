package ru.ozon.app.android.barcode.barcodeProductsList.di;

import Gm.a;
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
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper.BarcodeProductsListMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/di/BarcodeProductsListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewMapper/BarcodeProductsListMapper;", "getMapper", "()Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewMapper/BarcodeProductsListMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeProductsListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/di/BarcodeProductsListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/barcode/barcodeProductsList/di/BarcodeProductsListComponent;", "create", "(Lk20/g;)Lk20/e;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BarcodeProductsListComponent create$lambda$0(final C7475g c7475g) {
            return new BarcodeProductsListComponent(c7475g) { // from class: ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent$Companion$create$1$1
                private final AccountComponentApi accountComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;
                private final BarcodeProductsListMapper mapper = new BarcodeProductsListMapper();

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(BarcodeProductsListComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                {
                    this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent
                public AdultListDelegateProvider getAdultListDelegateProvider() {
                    return new AdultListDelegateProvider(this.accountComponentApi.getAdultHandler(), this.networkComponentApi.getFeatureChecker());
                }

                @Override // ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent
                public BarcodeProductsListMapper getMapper() {
                    return this.mapper;
                }

                @Override // ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<BarcodeProductsListComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BarcodeProductsListComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    AdultListDelegateProvider getAdultListDelegateProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    BarcodeProductsListMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
