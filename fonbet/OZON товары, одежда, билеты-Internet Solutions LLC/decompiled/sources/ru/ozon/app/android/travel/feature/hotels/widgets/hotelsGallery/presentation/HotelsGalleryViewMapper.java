package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.di.HotelsGalleryComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view.HotelsGalleryView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00182\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R<\u0010'\u001a$\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/di/HotelsGalleryComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ljava/lang/ref/WeakReference;", "composerScreenUiContainer", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "getMapper", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryViewMapper extends WidgetViewMapper2<HotelsGalleryComponent, HotelsGalleryDTO, HotelsGalleryVO> {
    private WeakReference<i> composerScreenUiContainer;

    @NotNull
    private final Function2<View, ComposerReferences, k<HotelsGalleryVO>> holderProducer = new HotelsGalleryViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        this.composerScreenUiContainer = new WeakReference<>(container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsGalleryView hotelsGalleryView = new HotelsGalleryView(context);
        hotelsGalleryView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return hotelsGalleryView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotelsGalleryVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsGalleryDTO, d, List<HotelsGalleryVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsGalleryComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsGalleryComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, m20.InterfaceC8046a
    @NotNull
    public List<HotelsGalleryVO> map(@NotNull HotelsGalleryDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
