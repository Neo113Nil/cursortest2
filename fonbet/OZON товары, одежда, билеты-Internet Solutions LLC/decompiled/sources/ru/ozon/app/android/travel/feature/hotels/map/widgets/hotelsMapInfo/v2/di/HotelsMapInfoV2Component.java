package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.di;

import Av.C2447a;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2Mapper;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/di/HotelsMapInfoV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "getTravelGeoProviderStorage", "()Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProviderStorage", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "", "getMiniAppName", "()Ljava/lang/String;", "miniAppName", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsMapInfoV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/di/HotelsMapInfoV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/di/HotelsMapInfoV2Component;", "create", "(Lk20/g;)Lk20/e;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsMapInfoV2Component create$lambda$0(C7475g c7475g) {
            return new HotelsMapInfoV2Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<HotelsMapInfoV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsMapInfoV2Component.class), new C2447a(storage, 3));
        }
    }

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HotelsMapInfoV2Mapper getMapper();

    @NotNull
    /* renamed from: getMiniAppName */
    String getMiniApp();

    @NotNull
    TravelGeoProvidersStorage getTravelGeoProviderStorage();

    @NotNull
    Pc.a<HotelMapInfoViewModel> getViewModelProvider();
}
