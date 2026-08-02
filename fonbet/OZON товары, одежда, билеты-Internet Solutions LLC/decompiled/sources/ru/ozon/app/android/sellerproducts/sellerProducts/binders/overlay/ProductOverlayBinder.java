package ru.ozon.app.android.sellerproducts.sellerProducts.binders.overlay;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.product.OverlayTitleModel;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n \u0019*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/overlay/ProductOverlayBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "", "waveId", "overlayTitleViewId", "<init>", "(II)V", "Lru/ozon/app/android/product/common/wave/WaveModel;", "waveModel", "", "bindWaveView", "(Lru/ozon/app/android/product/common/wave/WaveModel;)V", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "imageOverlayTitleModel", "bindOverlayTitle", "(Lru/ozon/app/android/product/common/product/OverlayTitleModel;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "Lru/ozon/composer/ui/widget/k;", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/product/common/wave/WaveView;", "kotlin.jvm.PlatformType", "waveView$delegate", "LSc/j;", "getWaveView", "()Lru/ozon/app/android/product/common/wave/WaveView;", "waveView", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "overlayTitleView$delegate", "getOverlayTitleView", "()Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "overlayTitleView", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductOverlayBinder extends ProductPropertyBinder {

    /* renamed from: overlayTitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j overlayTitleView;

    /* renamed from: waveView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j waveView;

    public ProductOverlayBinder(int i11, int i12) {
        n nVar = n.NONE;
        this.waveView = k.a(nVar, new ProductOverlayBinder$waveView$2(this, i11));
        this.overlayTitleView = k.a(nVar, new ProductOverlayBinder$overlayTitleView$2(this, i12));
    }

    private final void bindOverlayTitle(OverlayTitleModel imageOverlayTitleModel) {
        if (imageOverlayTitleModel == null) {
            OverlayTitleView overlayTitleView = getOverlayTitleView();
            Intrinsics.checkNotNullExpressionValue(overlayTitleView, "<get-overlayTitleView>(...)");
            ViewExtKt.gone(overlayTitleView);
        } else {
            getOverlayTitleView().bind(imageOverlayTitleModel.getTitle(), imageOverlayTitleModel.getSize());
            OverlayTitleView overlayTitleView2 = getOverlayTitleView();
            Intrinsics.checkNotNullExpressionValue(overlayTitleView2, "<get-overlayTitleView>(...)");
            ViewExtKt.show(overlayTitleView2);
        }
    }

    private final void bindWaveView(WaveModel waveModel) {
        if (waveModel == null) {
            WaveView waveView = getWaveView();
            Intrinsics.checkNotNullExpressionValue(waveView, "<get-waveView>(...)");
            ViewExtKt.gone(waveView);
        } else {
            getWaveView().bind(waveModel);
            WaveView waveView2 = getWaveView();
            Intrinsics.checkNotNullExpressionValue(waveView2, "<get-waveView>(...)");
            ViewExtKt.show(waveView2);
        }
    }

    private final OverlayTitleView getOverlayTitleView() {
        return (OverlayTitleView) this.overlayTitleView.getValue();
    }

    private final WaveView getWaveView() {
        return (WaveView) this.waveView.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        bindWaveView(product.getWaveModel());
        bindOverlayTitle(product.getImageOverlayTitle());
    }
}
