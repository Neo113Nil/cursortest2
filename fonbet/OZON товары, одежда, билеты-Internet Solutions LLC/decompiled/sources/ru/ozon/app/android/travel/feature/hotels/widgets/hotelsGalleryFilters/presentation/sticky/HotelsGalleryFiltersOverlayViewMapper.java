package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.data.HotelsGalleryFiltersDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.di.HotelsGalleryFiltersComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersViewModel;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/sticky/HotelsGalleryFiltersOverlayViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/di/HotelsGalleryFiltersComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersOverlayViewMapper extends r<HotelsGalleryFiltersDTO, HotelsGalleryFiltersVI> {

    @NotNull
    private final HotelsGalleryFiltersComponent component;

    @NotNull
    private final r.a viewType;

    public HotelsGalleryFiltersOverlayViewMapper(@NotNull HotelsGalleryFiltersComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    private final RecyclerView createView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayViewMapper$createView$roundedOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, -DesignSystemDimensProvider.this.getMargin24(), view.getWidth(), view.getHeight(), DesignSystemDimensProvider.this.getRadius24());
            }
        };
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOutlineProvider(viewOutlineProvider);
        recyclerView.setClipToOutline(true);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        recyclerView.setVisibility(8);
        return recyclerView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsGalleryFiltersVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new HotelsGalleryFiltersOverlayWidgetViewHolder(container.Z(), createView(container.Z()), container, (HotelsGalleryFiltersViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                HotelsGalleryFiltersComponent hotelsGalleryFiltersComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                hotelsGalleryFiltersComponent = HotelsGalleryFiltersOverlayViewMapper.this.component;
                HotelsGalleryFiltersViewModel viewModel = hotelsGalleryFiltersComponent.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(HotelsGalleryFiltersViewModel.class), this.component.getHandlersInhibitor(), this.component.getTokenizedAnalytics());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsGalleryFiltersVI> map(@NotNull HotelsGalleryFiltersDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
