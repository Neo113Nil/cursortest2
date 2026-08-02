package ru.ozon.app.android.geo.addresseditconfirmbutton.di;

import GN.a;
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
import ru.ozon.app.android.geo.addresseditconfirmbutton.AddressEditConfirmButtonMapper;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonMapper;", "getMapper", "()Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonMapper;", "mapper", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "getPvzSearcherViewModel", "()Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModelImpl;", "pvzSearcherViewModel", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "getMapUpdateManager", "()Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "mapUpdateManager", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressEditConfirmButtonWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/geo/addresseditconfirmbutton/di/AddressEditConfirmButtonWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AddressEditConfirmButtonWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new AddressEditConfirmButtonWidgetComponent(c7475g) { // from class: ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent$Companion$create$1$1
                private final d customActionHandlersStoreFactory;
                private final MapUpdateManager mapUpdateManager;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(AddressEditConfirmButtonWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: pvzSearcherViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j pvzSearcherViewModel;

                {
                    this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                    this.pvzSearcherViewModel = k.b(new AddressEditConfirmButtonWidgetComponent$Companion$create$1$1$pvzSearcherViewModel$2(c7475g));
                    this.mapUpdateManager = ((LocationComponentApi) c7475g.getComponent(LocationComponentApi.class)).getMapUpdateManager();
                }

                @Override // ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                @Override // ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent
                public MapUpdateManager getMapUpdateManager() {
                    return this.mapUpdateManager;
                }

                @Override // ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent
                public AddressEditConfirmButtonMapper getMapper() {
                    return (AddressEditConfirmButtonMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent
                public PvzSearcherViewModelImpl getPvzSearcherViewModel() {
                    return (PvzSearcherViewModelImpl) this.pvzSearcherViewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<AddressEditConfirmButtonWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AddressEditConfirmButtonWidgetComponent.class), new a(storage, 7));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    MapUpdateManager getMapUpdateManager();

    @NotNull
    AddressEditConfirmButtonMapper getMapper();

    @NotNull
    PvzSearcherViewModelImpl getPvzSearcherViewModel();
}
