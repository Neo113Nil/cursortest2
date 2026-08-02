package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.products;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.ItemProductBinding;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPositionKt;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/products/ProductVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/ItemProductBinding;", "binding", "<init>", "(Lru/ozon/app/android/checkout/databinding/ItemProductBinding;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "promoIconPosition", "", "bindPromoIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)Lkotlin/Unit;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Product;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Product;)V", "Lru/ozon/app/android/checkout/databinding/ItemProductBinding;", "", "radius", "F", "strokeWidth", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductVH extends RecyclerView.C {

    @NotNull
    private final ItemProductBinding binding;
    private final float radius;
    private final float strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductVH(@NotNull ItemProductBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.radius = binding.getConstraintLayout().getResources().getDimensionPixelSize(R$dimen.design_default_radius);
        this.strokeWidth = ResourceExtKt.toPxF(1);
    }

    private final Unit bindPromoIcon(IconDTO promoIcon, PromoIconPosition promoIconPosition) {
        IconView iconView = this.binding.promoIconView;
        Intrinsics.f(iconView);
        IconHolderKt.bindOrGone$default(iconView, promoIcon, null, 2, null);
        if (promoIcon == null) {
            return null;
        }
        PromoIconPositionKt.setupPromoIconGravity(iconView, promoIconPosition);
        return Unit.f71690a;
    }

    public final void bind(@NotNull RealFbsSplitVO.Product item) {
        Integer num;
        Intrinsics.checkNotNullParameter(item, "item");
        ItemProductBinding itemProductBinding = this.binding;
        if (item.getBorderColor() != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String borderColor = item.getBorderColor();
            Context context2 = this.binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num = Integer.valueOf(styleParser.parseColor(context, borderColor, ThemeExtKt.themeColorRes(context2, R$attr.bgAccentPrimary)));
        } else {
            num = null;
        }
        if (num != null) {
            View view = itemProductBinding.borderV;
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = this.radius;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(num.intValue());
            shapeDrawable.getPaint().setStrokeWidth(this.strokeWidth);
            shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
            view.setBackground(shapeDrawable);
            View borderV = itemProductBinding.borderV;
            Intrinsics.checkNotNullExpressionValue(borderV, "borderV");
            ViewExtKt.show(borderV);
        } else {
            View borderV2 = itemProductBinding.borderV;
            Intrinsics.checkNotNullExpressionValue(borderV2, "borderV");
            ViewExtKt.gone(borderV2);
        }
        ShapeableImageView shapeableImageView = itemProductBinding.productIv;
        Intrinsics.f(shapeableImageView);
        ImageViewExtKt.load$default(shapeableImageView, item.getImage(), null, null, null, null, false, null, 126, null);
        Context context3 = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context3)) {
            shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(R$color.bg_light_key));
            ThemeExtKt.setParandjaForDarkTheme(shapeableImageView);
            Context context4 = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            shapeableImageView.setBackgroundTintList(ColorStateList.valueOf(ThemeExtKt.themeColor(context4, R$attr.layerOverlayParanja)));
        } else {
            shapeableImageView.setBackgroundColor(shapeableImageView.getContext().getColor(R$color.layer_overlay_paranja));
            shapeableImageView.setBackgroundTintList(null);
        }
        bindPromoIcon(item.getPromoIcon(), item.getPromoIconPosition());
        BadgeView badgeView = itemProductBinding.badgeView;
        Intrinsics.checkNotNullExpressionValue(badgeView, "badgeView");
        BadgeHolderKt.bindOrGone$default(badgeView, item.getBadge(), (Function1) null, 2, (Object) null);
        TextView quantityTv = itemProductBinding.quantityTv;
        Intrinsics.checkNotNullExpressionValue(quantityTv, "quantityTv");
        TextViewExtKt.setTextOrGone(quantityTv, item.getText());
    }
}
