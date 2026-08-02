package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di;

import Dq.C2878a;
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
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.shared.CustomerContactsCheckboxStatusKeyProvider;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.data.CustomerContactsV3Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3ViewModel;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00162\u00060\u0001j\u0002`\u0002:\u0001\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/di/CustomerContactsV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "travelPageKeyValueStorage", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel;", "getViewModel", "(Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/data/CustomerContactsV3Mapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CustomerContactsV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/di/CustomerContactsV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/di/CustomerContactsV3Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerContactsV3Component create$lambda$0(final C7475g c7475g) {
            return new CustomerContactsV3Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component$Companion$create$1$1
                private final CustomActionHandlersComponentApi handlersApi;
                private final RetainComposerComponentApi retainApi;
                private final CustomerContactsCheckboxStatusKeyProvider checkboxStatusKeyProvider = new CustomerContactsCheckboxStatusKeyProvider();

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(CustomerContactsV3Component$Companion$create$1$1$mapper$2.INSTANCE);

                {
                    this.retainApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.handlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component
                public d getActionHandlersStoreFactory() {
                    return this.handlersApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component
                public CustomerContactsV3Mapper getMapper() {
                    return (CustomerContactsV3Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component
                public l getTokenizedAnalytics() {
                    return this.retainApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component
                public CustomerContactsV3ViewModel getViewModel(TravelPageKeyValueStorage travelPageKeyValueStorage) {
                    Intrinsics.checkNotNullParameter(travelPageKeyValueStorage, "travelPageKeyValueStorage");
                    return new CustomerContactsV3ViewModel(travelPageKeyValueStorage, this.checkboxStatusKeyProvider);
                }
            };
        }

        @NotNull
        public final C7473e<CustomerContactsV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CustomerContactsV3Component.class), new C2878a(storage, 11));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    CustomerContactsV3Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CustomerContactsV3ViewModel getViewModel(@NotNull TravelPageKeyValueStorage travelPageKeyValueStorage);
}
