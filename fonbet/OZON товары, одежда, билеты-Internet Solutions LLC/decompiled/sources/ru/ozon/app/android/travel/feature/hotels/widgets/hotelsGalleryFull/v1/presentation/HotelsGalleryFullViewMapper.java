package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.data.HotelsGalleryFullDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.di.HotelsGalleryFullComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R<\u0010\u0017\u001a$\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/di/HotelsGalleryFullComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/di/HotelsGalleryFullComponent;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/di/HotelsGalleryFullComponent;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullSelectedPositionUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullViewMapper extends WidgetViewMapper<HotelsGalleryFullDTO, HotelsGalleryFullVI> {

    @NotNull
    private final HotelsGalleryFullComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<HotelsGalleryFullVI>> holderProducer;

    @NotNull
    private final List<Class<HotelsGalleryFullSelectedPositionUpdate>> supportedUpdates;

    public HotelsGalleryFullViewMapper(@NotNull HotelsGalleryFullComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new HotelsGalleryFullViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.a0(HotelsGalleryFullSelectedPositionUpdate.class);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsGalleryFullView hotelsGalleryFullView = new HotelsGalleryFullView(context);
        hotelsGalleryFullView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = hotelsGalleryFullView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        hotelsGalleryFullView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.bgDarkKey));
        return hotelsGalleryFullView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotelsGalleryFullVI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsGalleryFullDTO, d, List<HotelsGalleryFullVI>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotelsGalleryFullSelectedPositionUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsGalleryFullVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsGalleryFullVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof HotelsGalleryFullSelectedPositionUpdate)) {
            return null;
        }
        List<HotelsGalleryFullVI.GalleryItem> items = oldItem.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            HotelsGalleryFullVI.GalleryItem galleryItem = (HotelsGalleryFullVI.GalleryItem) obj;
            galleryItem.setSelected(i11 == ((HotelsGalleryFullSelectedPositionUpdate) update).getNewSelectedPosition());
            arrayList.add(galleryItem);
            i11 = i12;
        }
        return HotelsGalleryFullVI.copy$default(oldItem, 0L, arrayList, null, null, 0, 29, null);
    }
}
