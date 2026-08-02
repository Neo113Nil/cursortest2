package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Pc.a;
import Vg.d;
import a00.h;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.di.HotelsMapInfoV2Component;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2ViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/di/HotelsMapInfoV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/di/HotelsMapInfoV2Component;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/di/HotelsMapInfoV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV2ViewMapper extends r<HotelsMapInfoV2DTO, HotelsMapInfoV2VO> {

    @NotNull
    private final HotelsMapInfoV2Component component;

    @NotNull
    private final r.a viewType;

    public HotelsMapInfoV2ViewMapper(@NotNull HotelsMapInfoV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsMapInfoV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        d customActionHandlersStoreFactory = this.component.getCustomActionHandlersStoreFactory();
        h a02 = container.a0();
        final a<HotelMapInfoViewModel> viewModelProvider = this.component.getViewModelProvider();
        w0 a11 = new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelMapInfoViewModel hotelMapInfoViewModel = (HotelMapInfoViewModel) a.this.get();
                Intrinsics.g(hotelMapInfoViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return hotelMapInfoViewModel;
            }
        }).a(HotelMapInfoViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new HotelsMapInfoV2WidgetHolder(customActionHandlersStoreFactory, container, (HotelMapInfoViewModel) a11, this.component.getTravelGeoProviderStorage(), this.component.getComposerNavigator(), this.component.getMiniApp());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsMapInfoV2VO> map(@NotNull HotelsMapInfoV2DTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
