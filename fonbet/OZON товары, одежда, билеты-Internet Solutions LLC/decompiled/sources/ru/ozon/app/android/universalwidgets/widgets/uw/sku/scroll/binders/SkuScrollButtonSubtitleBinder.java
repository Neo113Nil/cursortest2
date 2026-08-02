package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.texts.TextAtomWithIconHolderKt;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u00030\tj\u0006\u0012\u0002\b\u0003`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollButtonSubtitleBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holder", "", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitle$delegate", "LSc/j;", "getButtonSubtitle", "()Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitle", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollButtonSubtitleBinder extends ProductPropertyBinder<ProductVO> {

    /* renamed from: buttonSubtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonSubtitle = k.a(n.NONE, new SkuScrollButtonSubtitleBinder$buttonSubtitle$2(this));

    private final TextAtomWithIconView getButtonSubtitle() {
        return (TextAtomWithIconView) this.buttonSubtitle.getValue();
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
        super.bind((SkuScrollButtonSubtitleBinder) product, info, holder);
        TextAtomWithIconView buttonSubtitle = getButtonSubtitle();
        if (product.getButtonSubtitleHeight() == 0) {
            ViewExtKt.gone(buttonSubtitle);
            return;
        }
        ViewGroup.LayoutParams layoutParams = buttonSubtitle.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = product.getButtonSubtitleHeight();
        buttonSubtitle.setLayoutParams(layoutParams);
        TextAtomWithIconHolderKt.bindOrInvisible$default(buttonSubtitle, product.getButtonSubtitle(), null, 2, null);
    }
}
