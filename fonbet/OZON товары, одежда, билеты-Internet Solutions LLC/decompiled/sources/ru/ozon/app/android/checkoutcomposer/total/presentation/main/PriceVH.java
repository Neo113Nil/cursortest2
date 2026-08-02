package ru.ozon.app.android.checkoutcomposer.total.presentation.main;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.checkout.databinding.WidgetTotalCommonPriceBinding;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/main/PriceVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonPriceBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonPriceBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Price;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$Price;)V", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonPriceBinding;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceVH extends RecyclerView.C {

    @NotNull
    private final WidgetTotalCommonPriceBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceVH(@NotNull WidgetTotalCommonPriceBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        binding.buttonBA.setOnAction(actionHandler);
    }

    public final void bind(@NotNull TotalVO.Summary.Price item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTotalCommonPriceBinding widgetTotalCommonPriceBinding = this.binding;
        widgetTotalCommonPriceBinding.titleTv.setText(item.getTitle());
        String image = item.getImage();
        if (image != null) {
            ImageView iconIv = widgetTotalCommonPriceBinding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ImageViewExtKt.load$default(iconIv, image, null, null, null, null, false, null, 126, null);
        }
        ImageView iconIv2 = widgetTotalCommonPriceBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        ViewExtKt.showOrGone(iconIv2, Boolean.valueOf(item.getImage() != null));
        TextView subtitleTv = widgetTotalCommonPriceBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
        Button button = item.getButton();
        if (button != null) {
            widgetTotalCommonPriceBinding.buttonBA.bind(button);
        }
        ButtonAtom buttonBA = widgetTotalCommonPriceBinding.buttonBA;
        Intrinsics.checkNotNullExpressionValue(buttonBA, "buttonBA");
        ViewExtKt.showOrGone(buttonBA, Boolean.valueOf(item.getButton() != null));
        widgetTotalCommonPriceBinding.originalPriceTv.setText(item.getOriginalPrice());
        Group originalPriceGroup = widgetTotalCommonPriceBinding.originalPriceGroup;
        Intrinsics.checkNotNullExpressionValue(originalPriceGroup, "originalPriceGroup");
        ViewExtKt.showOrGone(originalPriceGroup, Boolean.valueOf(item.getOriginalPrice() != null));
        widgetTotalCommonPriceBinding.priceTv.setText(item.getPrice());
        TextAtomV2View priceSubtitle = widgetTotalCommonPriceBinding.priceSubtitle;
        Intrinsics.checkNotNullExpressionValue(priceSubtitle, "priceSubtitle");
        TextHolderKt.bindOrGone$default(priceSubtitle, item.getPriceSubtitle(), null, 2, null);
    }
}
