package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.data.HotelsGalleryFeedV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.di.HotelsGalleryFeedV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.view.HotelsGalleryFeedV2ItemView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0012j\b\u0012\u0004\u0012\u00020\u0003`\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/di/HotelsGalleryFeedV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/di/HotelsGalleryFeedV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2Decoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;)Lru/ozon/composer/ui/widget/h;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/di/HotelsGalleryFeedV2Component;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedV2ViewMapper extends g<HotelsGalleryFeedV2DTO, HotelsGalleryFeedV2VI> {

    @NotNull
    private final HotelsGalleryFeedV2Component component;

    public HotelsGalleryFeedV2ViewMapper(@NotNull HotelsGalleryFeedV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsGalleryFeedV2VI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsGalleryFeedV2WidgetViewHolder((HotelsGalleryFeedV2ItemView) view, container, this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsGalleryFeedV2ItemView hotelsGalleryFeedV2ItemView = new HotelsGalleryFeedV2ItemView(context);
        hotelsGalleryFeedV2ItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return hotelsGalleryFeedV2ItemView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<HotelsGalleryFeedV2Decoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new HotelsGalleryFeedV2Decoration(context));
    }

    @Override // ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull HotelsGalleryFeedV2DTO state, @NotNull HotelsGalleryFeedV2VI item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return (!(item instanceof HotelsGalleryFeedV2VI.GalleryImageItem) || ((HotelsGalleryFeedV2VI.GalleryImageItem) item).getIsLarge()) ? h.f.f94874b : h.b.f94870b;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsGalleryFeedV2VI> map(@NotNull HotelsGalleryFeedV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
