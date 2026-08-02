package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.R$layout;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.data.HotelsPageMapPreviewDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.di.HotelsPageMapPreviewComponent;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/di/HotelsPageMapPreviewComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/di/HotelsPageMapPreviewComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewWidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewWidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/di/HotelsPageMapPreviewComponent;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewViewMapper extends g<HotelsPageMapPreviewDTO, HotelsPageMapPreviewVO> {

    @NotNull
    private final HotelsPageMapPreviewComponent component;
    private final int layout;

    public HotelsPageMapPreviewViewMapper(@NotNull HotelsPageMapPreviewComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_hotels_page_map_preview;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsPageMapPreviewVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsPageMapPreviewWidgetViewHolder(view, this.component.getCustomActionHandlersStoreFactory(), container, this.component.getTravelGeoProviderStorage(), this.component.getTokenizedAnalytics(), this.component.getMiniApp());
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsPageMapPreviewVO> map(@NotNull HotelsPageMapPreviewDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
