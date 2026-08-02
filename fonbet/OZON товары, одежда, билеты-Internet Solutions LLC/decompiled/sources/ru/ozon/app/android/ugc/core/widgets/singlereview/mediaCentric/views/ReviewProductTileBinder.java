package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import FV.c;
import WZ.l;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryReviewProductV2Binding;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/ReviewProductTileBinder;", "", "Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "binding", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "", "widgetId", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;Ljava/lang/Long;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "getBinding", "()Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewProductTileBinder {

    @NotNull
    private final ViewGalleryReviewProductV2Binding binding;

    public ReviewProductTileBinder(@NotNull ViewGalleryReviewProductV2Binding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        binding.productDescriptionTAV.setTextIsSelectable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(ReviewProductTileDTO reviewProductTileDTO, Function1 function1, View view) {
        AtomAction atomAction;
        AtomActionDTO action = reviewProductTileDTO.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, reviewProductTileDTO.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull ReviewProductTileDTO product, Long widgetId, @NotNull ReviewGalleryV2ProductButtonBinder cartButtonBinder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(cartButtonBinder, "cartButtonBinder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ViewGalleryReviewProductV2Binding viewGalleryReviewProductV2Binding = this.binding;
        viewGalleryReviewProductV2Binding.productContainerCl.setOnClickListener(new c(0, product, actionHandler));
        ShapeableImageView productIv = viewGalleryReviewProductV2Binding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.load$default(productIv, product.getImage(), null, null, null, null, false, null, 126, null);
        PriceView priceAtomView = viewGalleryReviewProductV2Binding.priceAtomView;
        Intrinsics.checkNotNullExpressionValue(priceAtomView, "priceAtomView");
        PriceHolderKt.bind$default(priceAtomView, product.getPrice(), null, 2, null);
        TextAtomV2View productDescriptionTAV = viewGalleryReviewProductV2Binding.productDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(productDescriptionTAV, "productDescriptionTAV");
        TextHolderKt.bind$default(productDescriptionTAV, TextMapperKt.getDsTextAtom(product.getText()), null, 2, null);
        AppCompatImageButton addToCartBtn = viewGalleryReviewProductV2Binding.addToCartBtn;
        Intrinsics.checkNotNullExpressionValue(addToCartBtn, "addToCartBtn");
        cartButtonBinder.bindOrGone(addToCartBtn, product.getAddToCartButton(), tokenizedAnalytics, widgetId);
    }

    @NotNull
    public final ViewGalleryReviewProductV2Binding getBinding() {
        return this.binding;
    }
}
