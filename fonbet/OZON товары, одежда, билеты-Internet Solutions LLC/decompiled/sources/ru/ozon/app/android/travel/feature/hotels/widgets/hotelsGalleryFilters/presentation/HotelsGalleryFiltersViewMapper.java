package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.data.HotelsGalleryFiltersDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.di.HotelsGalleryFiltersComponent;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersViewMapper extends g<HotelsGalleryFiltersDTO, HotelsGalleryFiltersVI> {

    @NotNull
    private final HotelsGalleryFiltersComponent component;

    public HotelsGalleryFiltersViewMapper(@NotNull HotelsGalleryFiltersComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsGalleryFiltersVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsGalleryFiltersWidgetViewHolder((RecyclerView) view, container, (HotelsGalleryFiltersViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                HotelsGalleryFiltersComponent hotelsGalleryFiltersComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                hotelsGalleryFiltersComponent = HotelsGalleryFiltersViewMapper.this.component;
                HotelsGalleryFiltersViewModel viewModel = hotelsGalleryFiltersComponent.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(HotelsGalleryFiltersViewModel.class), this.component.getHandlersInhibitor(), this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        return recyclerView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsGalleryFiltersVI> map(@NotNull HotelsGalleryFiltersDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
