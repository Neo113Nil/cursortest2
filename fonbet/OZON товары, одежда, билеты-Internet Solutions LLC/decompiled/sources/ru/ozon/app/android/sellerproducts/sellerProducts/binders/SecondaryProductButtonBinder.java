package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton.UwButtonsContainerView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/SecondaryProductButtonBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetBinder;", "<init>", "()V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "Lru/ozon/composer/ui/widget/k;", "holder", "", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/UwButtonsContainerView;", "buttonsContainer$delegate", "LSc/j;", "getButtonsContainer", "()Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/UwButtonsContainerView;", "buttonsContainer", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecondaryProductButtonBinder extends ProductActionSheetBinder {

    /* renamed from: buttonsContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsContainer = k.b(new SecondaryProductButtonBinder$buttonsContainer$2(this));

    private final UwButtonsContainerView getButtonsContainer() {
        return (UwButtonsContainerView) this.buttonsContainer.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        getButtonsContainer().bindSecondaryButton(product.getSecondaryButton());
        getButtonsContainer().getSecondaryButton().setOnAction(getHandler());
    }
}
