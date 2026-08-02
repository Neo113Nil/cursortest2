package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.data.HotelsGalleryFeedDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.di.HotelsGalleryFeedComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.view.HotelsGalleryFeedItemView;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR<\u0010\"\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/di/HotelsGalleryFeedComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/presentation/HotelsGalleryFeedVO;)Lru/ozon/composer/ui/widget/h;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "getMapper", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryFeedViewMapper extends WidgetViewMapper2<HotelsGalleryFeedComponent, HotelsGalleryFeedDTO, HotelsGalleryFeedVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<HotelsGalleryFeedVO>> holderProducer = new HotelsGalleryFeedViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsGalleryFeedItemView hotelsGalleryFeedItemView = new HotelsGalleryFeedItemView(context);
        hotelsGalleryFeedItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return hotelsGalleryFeedItemView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<HotelsGalleryFeedDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new HotelsGalleryFeedDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotelsGalleryFeedVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsGalleryFeedDTO, d, List<HotelsGalleryFeedVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsGalleryFeedComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsGalleryFeedComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull HotelsGalleryFeedDTO state, @NotNull HotelsGalleryFeedVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
