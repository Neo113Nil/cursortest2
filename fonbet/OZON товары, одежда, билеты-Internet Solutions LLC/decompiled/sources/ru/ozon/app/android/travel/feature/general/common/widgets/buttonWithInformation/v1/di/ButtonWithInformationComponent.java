package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di;

import DV.a;
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
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data.ButtonWithInformationMapper;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationIsVisibleViewModel;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/di/ButtonWithInformationComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationMapper;", "mapper", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ButtonWithInformationComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/di/ButtonWithInformationComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/di/ButtonWithInformationComponent;", "create", "(Lk20/g;)Lk20/e;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ButtonWithInformationComponent create$lambda$0(final C7475g c7475g) {
            return new ButtonWithInformationComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ButtonWithInformationComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(ButtonWithInformationComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent
                public ButtonWithInformationMapper getMapper() {
                    return (ButtonWithInformationMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent
                public ButtonWithInformationIsVisibleViewModel getViewModel() {
                    return new ButtonWithInformationIsVisibleViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<ButtonWithInformationComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ButtonWithInformationComponent.class), new a(storage, 13));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    ButtonWithInformationMapper getMapper();

    @NotNull
    ButtonWithInformationIsVisibleViewModel getViewModel();
}
