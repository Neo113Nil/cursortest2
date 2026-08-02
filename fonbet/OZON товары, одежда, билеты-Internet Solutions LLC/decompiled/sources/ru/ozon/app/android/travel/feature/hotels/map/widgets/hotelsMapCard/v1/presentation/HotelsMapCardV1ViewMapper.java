package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.presentation;

import Pc.a;
import a00.h;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.R$layout;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.data.HotelsMapCardV1DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.di.HotelsMapCardComponent;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1ViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1VO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/di/HotelsMapCardComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/di/HotelsMapCardComponent;)V", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1WidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1WidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/di/HotelsMapCardComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapCardV1ViewMapper extends r<HotelsMapCardV1DTO, HotelsMapCardV1VO> {

    @NotNull
    private final HotelsMapCardComponent component;

    @NotNull
    private final r.a viewType;

    public HotelsMapCardV1ViewMapper(@NotNull HotelsMapCardComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewGroupExtKt.inflate(parent, R$layout.widget_hotels_map_card_v1);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsMapCardV1VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        h a02 = container.a0();
        final a<HotelMapInfoViewModel> viewModelProvider = this.component.getViewModelProvider();
        w0 a11 = new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.presentation.HotelsMapCardV1ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelMapInfoViewModel hotelMapInfoViewModel = (HotelMapInfoViewModel) a.this.get();
                Intrinsics.g(hotelMapInfoViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return hotelMapInfoViewModel;
            }
        }).a(HotelMapInfoViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new HotelsMapCardV1WidgetViewHolder(container, (HotelMapInfoViewModel) a11, this.component.getCustomActionHandlersStoreFactory(), new ER.a(0));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsMapCardV1VO> map(@NotNull HotelsMapCardV1DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
