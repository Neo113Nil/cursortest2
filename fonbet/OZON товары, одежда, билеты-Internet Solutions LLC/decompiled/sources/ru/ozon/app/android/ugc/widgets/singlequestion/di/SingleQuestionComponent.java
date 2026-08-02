package ru.ozon.app.android.ugc.widgets.singlequestion.di;

import FU.a;
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
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/di/SingleQuestionComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl;", "viewModel", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleQuestionComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/di/SingleQuestionComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/singlequestion/di/SingleQuestionComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleQuestionComponent getInstance$lambda$0(final C7475g c7475g) {
            return new SingleQuestionComponent() { // from class: ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent$Companion$getInstance$1$1

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(SingleQuestionComponent$Companion$getInstance$1$1$handlersInhibitor$2.INSTANCE);

                private final ActionComponentApi getActionComponentApi() {
                    return (ActionComponentApi) C7475g.this.getComponent(ActionComponentApi.class);
                }

                private final ActionV2Repository getActionV2Repository() {
                    return getActionComponentApi().getActionRepository();
                }

                private final NavigationComponentApi getNavigationComponentApi() {
                    return (NavigationComponentApi) C7475g.this.getComponent(NavigationComponentApi.class);
                }

                private final NetworkComponentApi getNetworkComponentApi() {
                    return (NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class);
                }

                private final StorageComponentApi getStorageComponentApi() {
                    return (StorageComponentApi) C7475g.this.getComponent(StorageComponentApi.class);
                }

                @Override // ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent
                public ActionSheetEventHandler getActionSheetEventHandler() {
                    return getActionComponentApi().getActionSheetEventHandler();
                }

                @Override // ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent
                public g getRouter() {
                    return getNavigationComponentApi().getOzonRouter();
                }

                @Override // ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent
                public CallApiViewModelImpl getViewModel() {
                    return new CallApiViewModelImpl(getStorageComponentApi().getAuthStateStorage(), new ProductReviewRepository(getActionV2Repository(), getNetworkComponentApi().getJsonDeserializer()));
                }
            };
        }

        @NotNull
        public final C7473e<SingleQuestionComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SingleQuestionComponent.class), new a(storage, 2));
        }
    }

    @NotNull
    ActionSheetEventHandler getActionSheetEventHandler();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    g getRouter();

    @NotNull
    CallApiViewModelImpl getViewModel();
}
