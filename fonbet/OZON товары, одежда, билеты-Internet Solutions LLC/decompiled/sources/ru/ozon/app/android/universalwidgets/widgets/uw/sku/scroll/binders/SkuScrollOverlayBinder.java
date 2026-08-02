package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.product.OverlayTitleModel;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u00030\u0012j\u0006\u0012\u0002\b\u0003`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollOverlayBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "Lru/ozon/app/android/product/common/wave/WaveModel;", "waveModel", "", "bindWaveView", "(Lru/ozon/app/android/product/common/wave/WaveModel;)V", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "imageOverlayTitle", "bindOverlayTitle", "(Lru/ozon/app/android/product/common/product/OverlayTitleModel;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/product/common/wave/WaveView;", "waveView$delegate", "LSc/j;", "getWaveView", "()Lru/ozon/app/android/product/common/wave/WaveView;", "waveView", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "overlayTitle$delegate", "getOverlayTitle", "()Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "overlayTitle", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollOverlayBinder extends ProductPropertyBinder<ProductVO> {

    /* renamed from: overlayTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j overlayTitle;

    /* renamed from: waveView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveView;

    public SkuScrollOverlayBinder() {
        n nVar = n.NONE;
        this.waveView = k.a(nVar, new SkuScrollOverlayBinder$waveView$2(this));
        this.overlayTitle = k.a(nVar, new SkuScrollOverlayBinder$overlayTitle$2(this));
    }

    private final void bindOverlayTitle(OverlayTitleModel imageOverlayTitle) {
        if (imageOverlayTitle == null) {
            ViewExtKt.gone(getOverlayTitle());
        } else {
            getOverlayTitle().bind(imageOverlayTitle.getTitle(), imageOverlayTitle.getSize());
            ViewExtKt.show(getOverlayTitle());
        }
    }

    private final void bindWaveView(WaveModel waveModel) {
        if (waveModel == null) {
            ViewExtKt.gone(getWaveView());
        } else {
            getWaveView().bind(waveModel);
            ViewExtKt.show(getWaveView());
        }
    }

    private final OverlayTitleView getOverlayTitle() {
        return (OverlayTitleView) this.overlayTitle.getValue();
    }

    private final WaveView getWaveView() {
        return (WaveView) this.waveView.getValue();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((SkuScrollOverlayBinder) product, info, holder);
        bindOverlayTitle(product.getImageOverlayTitle());
        bindWaveView(product.getWaveModel());
    }
}
