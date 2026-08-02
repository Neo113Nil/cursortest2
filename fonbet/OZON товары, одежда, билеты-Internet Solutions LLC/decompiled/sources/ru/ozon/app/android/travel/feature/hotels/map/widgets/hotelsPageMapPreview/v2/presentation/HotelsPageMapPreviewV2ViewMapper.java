package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data.HotelsPageMapPreviewV2DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.view.MapPreviewV2View;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/di/HotelsPageMapPreviewV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/di/HotelsPageMapPreviewV2Component;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2WidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/di/HotelsPageMapPreviewV2Component;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewV2ViewMapper extends g<HotelsPageMapPreviewV2DTO, HotelsPageMapPreviewV2VO> {

    @NotNull
    private final HotelsPageMapPreviewV2Component component;

    public HotelsPageMapPreviewV2ViewMapper(@NotNull HotelsPageMapPreviewV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MapPreviewV2View mapPreviewV2View = new MapPreviewV2View(context);
        mapPreviewV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return mapPreviewV2View;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsPageMapPreviewV2VO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsPageMapPreviewV2WidgetViewHolder((MapPreviewV2View) view, this.component.getCustomActionHandlersStoreFactory(), container, this.component.getTravelGeoProviderStorage(), this.component.getTokenizedAnalytics(), this.component.getMiniApp());
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsPageMapPreviewV2VO> map(@NotNull HotelsPageMapPreviewV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
