package ru.ozon.app.android.geo.addresseditformprompt.di;

import As.C2444a;
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
import ru.ozon.app.android.geo.addresseditformprompt.core.AddressEditFormPromptMapper;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/di/AddressEditFormPromptWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/geo/addresseditformprompt/core/AddressEditFormPromptMapper;", "getMapper", "()Lru/ozon/app/android/geo/addresseditformprompt/core/AddressEditFormPromptMapper;", "mapper", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "getPvzSearcherViewModel", "()Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "pvzSearcherViewModel", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "getYandexSearchSheetSharedViewModel", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "yandexSearchSheetSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "getMapUpdateManager", "()Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "mapUpdateManager", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressEditFormPromptWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/di/AddressEditFormPromptWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/geo/addresseditformprompt/di/AddressEditFormPromptWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AddressEditFormPromptWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new AddressEditFormPromptWidgetComponent(c7475g) { // from class: ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final d customActionHandlersStoreFactory;
                private final MapUpdateManager mapUpdateManager;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;

                /* renamed from: pvzSearcherViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j pvzSearcherViewModel;

                /* renamed from: yandexSearchSheetSharedViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j yandexSearchSheetSharedViewModel;

                {
                    CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.customActionHandlersComponentApi = customActionHandlersComponentApi;
                    this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                    this.mapper = k.b(AddressEditFormPromptWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);
                    this.pvzSearcherViewModel = k.b(new AddressEditFormPromptWidgetComponent$Companion$create$1$1$pvzSearcherViewModel$2(c7475g));
                    this.yandexSearchSheetSharedViewModel = k.b(AddressEditFormPromptWidgetComponent$Companion$create$1$1$yandexSearchSheetSharedViewModel$2.INSTANCE);
                    this.mapUpdateManager = ((LocationComponentApi) c7475g.getComponent(LocationComponentApi.class)).getMapUpdateManager();
                }

                @Override // ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                @Override // ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent
                public MapUpdateManager getMapUpdateManager() {
                    return this.mapUpdateManager;
                }

                @Override // ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent
                public AddressEditFormPromptMapper getMapper() {
                    return (AddressEditFormPromptMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent
                public PvzSearcherViewModelImpl getPvzSearcherViewModel() {
                    return (PvzSearcherViewModelImpl) this.pvzSearcherViewModel.getValue();
                }

                @Override // ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent
                public YandexSearchSheetSharedViewModelImpl getYandexSearchSheetSharedViewModel() {
                    return (YandexSearchSheetSharedViewModelImpl) this.yandexSearchSheetSharedViewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<AddressEditFormPromptWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AddressEditFormPromptWidgetComponent.class), new C2444a(storage, 12));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    MapUpdateManager getMapUpdateManager();

    @NotNull
    AddressEditFormPromptMapper getMapper();

    @NotNull
    PvzSearcherViewModelImpl getPvzSearcherViewModel();

    @NotNull
    YandexSearchSheetSharedViewModelImpl getYandexSearchSheetSharedViewModel();
}
