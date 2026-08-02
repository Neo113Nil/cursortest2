package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.texts.TextAtomWithIconHolderKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonSubtitleBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "<init>", "()V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "", "bindSubtitle", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;)V", "Ll20/d;", "info", "Lru/ozon/composer/ui/widget/k;", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitleView$delegate", "LSc/j;", "getButtonSubtitleView", "()Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buttonSubtitleView", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductButtonSubtitleBinder extends ProductPropertyBinder {

    /* renamed from: buttonSubtitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonSubtitleView = k.b(new ProductButtonSubtitleBinder$buttonSubtitleView$2(this));

    private final void bindSubtitle(ProductVO product) {
        TextAtomWithIconView buttonSubtitleView = getButtonSubtitleView();
        ViewGroup.LayoutParams layoutParams = buttonSubtitleView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        buttonSubtitleView.setLayoutParams(layoutParams);
        TextAtomWithIconHolderKt.bindOrGone$default(buttonSubtitleView, product.getButtonSubtitle(), null, 2, null);
    }

    private final TextAtomWithIconView getButtonSubtitleView() {
        return (TextAtomWithIconView) this.buttonSubtitleView.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        bindSubtitle(product);
    }
}
