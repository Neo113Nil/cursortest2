package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.data.HotelsGalleryFullV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.di.HotelsGalleryFullV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view.HotelsGalleryFullV2View;
import ru.ozon.app.android.video.player.soundservice.SoundScope;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0012j\b\u0012\u0004\u0012\u00020\u0003`\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/di/HotelsGalleryFullV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/di/HotelsGalleryFullV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/data/HotelsGalleryFullV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/di/HotelsGalleryFullV2Component;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2SelectedPositionUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2ViewMapper extends g<HotelsGalleryFullV2DTO, HotelsGalleryFullV2VI> {

    @NotNull
    private final HotelsGalleryFullV2Component component;

    @NotNull
    private final List<Class<HotelsGalleryFullV2SelectedPositionUpdate>> supportedUpdates;

    public HotelsGalleryFullV2ViewMapper(@NotNull HotelsGalleryFullV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(HotelsGalleryFullV2SelectedPositionUpdate.class);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsGalleryFullV2VI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        HotelsGalleryFullV2View hotelsGalleryFullV2View = (HotelsGalleryFullV2View) view;
        final HotelsGalleryFullV2Component hotelsGalleryFullV2Component = this.component;
        C c11 = new C(hotelsGalleryFullV2Component) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2ViewMapper$createHolder$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((HotelsGalleryFullV2Component) this.receiver).getVideoPlayer();
            }
        };
        return new HotelsGalleryFullV2WidgetViewHolder(hotelsGalleryFullV2View, this.component.getSoundService().getSoundController(SoundScope.COMMON), c11, container, this.component.getCustomActionHandlersStoreFactory(), this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsGalleryFullV2View hotelsGalleryFullV2View = new HotelsGalleryFullV2View(context);
        hotelsGalleryFullV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = hotelsGalleryFullV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        hotelsGalleryFullV2View.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.bgDarkKey));
        return hotelsGalleryFullV2View;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotelsGalleryFullV2SelectedPositionUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public HotelsGalleryFullV2VI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsGalleryFullV2VI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof HotelsGalleryFullV2SelectedPositionUpdate)) {
            return null;
        }
        int newSelectedPosition = ((HotelsGalleryFullV2SelectedPositionUpdate) update).getNewSelectedPosition();
        List<HotelsGalleryFullV2VI.GalleryItem> items = oldItem.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            HotelsGalleryFullV2VI.GalleryItem galleryItem = (HotelsGalleryFullV2VI.GalleryItem) obj;
            galleryItem.setSelected(i11 == newSelectedPosition);
            arrayList.add(galleryItem);
            i11 = i12;
        }
        return HotelsGalleryFullV2VI.copy$default(oldItem, 0L, arrayList, 0, null, 13, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsGalleryFullV2VI> map(@NotNull HotelsGalleryFullV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
