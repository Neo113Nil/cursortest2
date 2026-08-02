package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.presentation;

import A00.a;
import Vg.d;
import a00.h;
import a00.j;
import androidx.lifecycle.w0;
import c20.r;
import d20.AbstractC6065b;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.feature.hotels.map.shared.di.HotelsMapInfoComponent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4ViewModel;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4WidgetViewHolder;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data.HotelsMapInfoV5DTO;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.UpdateInsetsEvent;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140#0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/presentation/HotelsMapInfoV5ViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/di/HotelsMapInfoComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/di/HotelsMapInfoComponent;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4WidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4WidgetViewHolder;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/di/HotelsMapInfoComponent;", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "viewModel", "Ljava/lang/ref/WeakReference;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV5ViewMapper extends r<HotelsMapInfoV5DTO, HotelsMapInfoV4VO> {

    @NotNull
    private final HotelsMapInfoComponent component;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;
    private WeakReference<HotelsMapInfoV4ViewModel> viewModel;

    @NotNull
    private final r.a viewType;

    public HotelsMapInfoV5ViewMapper(@NotNull HotelsMapInfoComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(UpdateInsetsEvent.class);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsMapInfoV4VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        HotelsMapInfoComponent hotelsMapInfoComponent = this.component;
        d customActionHandlersStoreFactory = hotelsMapInfoComponent.getCustomActionHandlersStoreFactory();
        h a02 = container.a0();
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel = (HotelsMapInfoV4ViewModel) ((w0) j.a(a02.a(), N.b(HotelsMapInfoV4ViewModel.class), new HotelsMapInfoV5ViewMapper$createHolder$1$1(hotelsMapInfoComponent)).getValue());
        this.viewModel = new WeakReference<>(hotelsMapInfoV4ViewModel);
        Unit unit = Unit.f71690a;
        TravelGeoProvidersStorage travelGeoProviderStorage = hotelsMapInfoComponent.getTravelGeoProviderStorage();
        ProductFavoriteDelegateProvider favoriteProductMoleculeDelegateProvider = hotelsMapInfoComponent.getFavoriteProductMoleculeDelegateProvider();
        h a03 = container.a0();
        return new HotelsMapInfoV4WidgetViewHolder(customActionHandlersStoreFactory, container, hotelsMapInfoV4ViewModel, travelGeoProviderStorage, favoriteProductMoleculeDelegateProvider, (TravelOnboardingViewModel) ((w0) j.a(a03.a(), N.b(TravelOnboardingViewModel.class), new HotelsMapInfoV5ViewMapper$createHolder$1$3(hotelsMapInfoComponent)).getValue()), hotelsMapInfoComponent.getMiniApp(), hotelsMapInfoComponent.getDispatchersProvider(), hotelsMapInfoComponent.getFeatureChecker(), hotelsMapInfoComponent.getAuthStateStorage(), hotelsMapInfoComponent.getFavoriteUnauthorizedAnalytics());
    }

    @Override // c20.r, I00.d
    public HotelsMapInfoV4VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsMapInfoV4VO oldItem) {
        WeakReference<HotelsMapInfoV4ViewModel> weakReference;
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof UpdateInsetsEvent) || (weakReference = this.viewModel) == null || (hotelsMapInfoV4ViewModel = weakReference.get()) == null) {
            return null;
        }
        hotelsMapInfoV4ViewModel.onEvent(new MapEvent.OnUpdate(((UpdateInsetsEvent) update).getInsetsWrapper()));
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsMapInfoV4VO> map(@NotNull HotelsMapInfoV5DTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getHotelsMapInfoV5Mapper().invoke(state, info);
    }
}
