package ru.ozon.app.android.geo.addressEditDetailV2.di;

import At.C2445a;
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
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/di/AddressEditDetailV2WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "getPvzSearcherViewModel", "()Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "pvzSearcherViewModel", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "getYandexSearchSheetSharedViewModel", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "yandexSearchSheetSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressEditDetailV2WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/di/AddressEditDetailV2WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/geo/addressEditDetailV2/di/AddressEditDetailV2WidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AddressEditDetailV2WidgetComponent create$lambda$0(final C7475g c7475g) {
            return new AddressEditDetailV2WidgetComponent(c7475g) { // from class: ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final d customActionHandlersStoreFactory;

                /* renamed from: pvzSearcherViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j pvzSearcherViewModel;

                /* renamed from: yandexSearchSheetSharedViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j yandexSearchSheetSharedViewModel;

                {
                    CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.customActionHandlersComponentApi = customActionHandlersComponentApi;
                    this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                    this.pvzSearcherViewModel = k.b(new AddressEditDetailV2WidgetComponent$Companion$create$1$1$pvzSearcherViewModel$2(c7475g));
                    this.yandexSearchSheetSharedViewModel = k.b(AddressEditDetailV2WidgetComponent$Companion$create$1$1$yandexSearchSheetSharedViewModel$2.INSTANCE);
                }

                @Override // ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                @Override // ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent
                public PvzSearcherViewModelImpl getPvzSearcherViewModel() {
                    return (PvzSearcherViewModelImpl) this.pvzSearcherViewModel.getValue();
                }

                @Override // ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent
                public YandexSearchSheetSharedViewModelImpl getYandexSearchSheetSharedViewModel() {
                    return (YandexSearchSheetSharedViewModelImpl) this.yandexSearchSheetSharedViewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<AddressEditDetailV2WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AddressEditDetailV2WidgetComponent.class), new C2445a(storage, 7));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    PvzSearcherViewModelImpl getPvzSearcherViewModel();

    @NotNull
    YandexSearchSheetSharedViewModelImpl getYandexSearchSheetSharedViewModel();
}
