package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di;

import EV.a;
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
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.shared.CustomerContactsCheckboxStatusKeyProvider;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.data.CustomerContactsV2Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.data.CustomerContractsV2ScrollerMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2ViewModel;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/di/CustomerContactsV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContactsV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContractsV2ScrollerMapper;", "getScrollerMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/data/CustomerContractsV2ScrollerMapper;", "scrollerMapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CustomerContactsV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/di/CustomerContactsV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/di/CustomerContactsV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerContactsV2Component create$lambda$0(final C7475g c7475g) {
            return new CustomerContactsV2Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component$Companion$create$1$1
                private final CustomActionHandlersComponentApi handlersApi;
                private final RetainComposerComponentApi retainApi;
                private final CustomerContactsCheckboxStatusKeyProvider checkboxStatusKeyProvider = new CustomerContactsCheckboxStatusKeyProvider();

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(CustomerContactsV2Component$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: scrollerMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j scrollerMapper = k.b(CustomerContactsV2Component$Companion$create$1$1$scrollerMapper$2.INSTANCE);

                {
                    this.retainApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.handlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component
                public d getActionHandlersStoreFactory() {
                    return this.handlersApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component
                public CustomerContactsV2Mapper getMapper() {
                    return (CustomerContactsV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component
                public CustomerContractsV2ScrollerMapper getScrollerMapper() {
                    return (CustomerContractsV2ScrollerMapper) this.scrollerMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component
                public l getTokenizedAnalytics() {
                    return this.retainApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component
                public CustomerContactsV2ViewModel getViewModel() {
                    return new CustomerContactsV2ViewModel(this.checkboxStatusKeyProvider);
                }
            };
        }

        @NotNull
        public final C7473e<CustomerContactsV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CustomerContactsV2Component.class), new a(storage, 18));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    CustomerContactsV2Mapper getMapper();

    @NotNull
    CustomerContractsV2ScrollerMapper getScrollerMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CustomerContactsV2ViewModel getViewModel();
}
