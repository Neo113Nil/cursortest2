package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di;

import Bs.C2670a;
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
import ru.ozon.app.android.travel.feature.avia.shared.buttonSwitcher.ButtonWithInformationSwitcherViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.data.AviaCheckTariffsPriceDetailsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsViewModel;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/di/AviaCheckTariffsPriceDetailsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsMapper;", "getAviaCheckTariffsPriceDetailsMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsMapper;", "aviaCheckTariffsPriceDetailsMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "getButtonSwitcherViewModel", "()Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "buttonSwitcherViewModel", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel;", "viewModel", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AviaCheckTariffsPriceDetailsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/di/AviaCheckTariffsPriceDetailsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/di/AviaCheckTariffsPriceDetailsComponent;", "create", "(Lk20/g;)Lk20/e;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AviaCheckTariffsPriceDetailsComponent create$lambda$0(final C7475g c7475g) {
            return new AviaCheckTariffsPriceDetailsComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent$Companion$create$1$1

                /* renamed from: aviaCheckTariffsPriceDetailsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j aviaCheckTariffsPriceDetailsMapper = k.b(AviaCheckTariffsPriceDetailsComponent$Companion$create$1$1$aviaCheckTariffsPriceDetailsMapper$2.INSTANCE);
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent
                public AviaCheckTariffsPriceDetailsMapper getAviaCheckTariffsPriceDetailsMapper() {
                    return (AviaCheckTariffsPriceDetailsMapper) this.aviaCheckTariffsPriceDetailsMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent
                public ButtonWithInformationSwitcherViewModel getButtonSwitcherViewModel() {
                    return new ButtonWithInformationSwitcherViewModel();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent
                public AviaCheckTariffsPriceDetailsViewModel getViewModel() {
                    return new AviaCheckTariffsPriceDetailsViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<AviaCheckTariffsPriceDetailsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AviaCheckTariffsPriceDetailsComponent.class), new C2670a(storage, 13));
        }
    }

    @NotNull
    AviaCheckTariffsPriceDetailsMapper getAviaCheckTariffsPriceDetailsMapper();

    @NotNull
    ButtonWithInformationSwitcherViewModel getButtonSwitcherViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    AviaCheckTariffsPriceDetailsViewModel getViewModel();
}
