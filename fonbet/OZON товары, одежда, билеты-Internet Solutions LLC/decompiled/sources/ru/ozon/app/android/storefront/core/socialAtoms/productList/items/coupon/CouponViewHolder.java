package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewSocialCouponBinding;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent1;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent2;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientAccent4;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponViewHolder;", "", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialCouponBinding;", "binding", "Landroid/widget/TextView;", "titleView", "subtitleView", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialCouponBinding;Landroid/widget/TextView;Landroid/widget/TextView;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponVO;", "vo", "", "elevation", "", "bind", "(Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponVO;F)V", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialCouponBinding;", "getBinding", "()Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialCouponBinding;", "Landroid/widget/TextView;", "", "currentCouponId", "Ljava/lang/Integer;", "getCurrentCouponId", "()Ljava/lang/Integer;", "setCurrentCouponId", "(Ljava/lang/Integer;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponWithDotsBackgroundDrawable;", "couponUsualDrawable", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponWithDotsBackgroundDrawable;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponWithIconBackgroundDrawable;", "couponWinnerDrawable", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponWithIconBackgroundDrawable;", "couponAllProductDrawable", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CouponViewHolder {

    @NotNull
    private final ViewSocialCouponBinding binding;

    @NotNull
    private final CouponWithDotsBackgroundDrawable couponAllProductDrawable;

    @NotNull
    private final CouponWithDotsBackgroundDrawable couponUsualDrawable;

    @NotNull
    private final CouponWithIconBackgroundDrawable couponWinnerDrawable;
    private Integer currentCouponId;

    @NotNull
    private final TextView subtitleView;

    @NotNull
    private final TextView titleView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialProductListDTO.ProductListItemDTO.CouponDTO.CouponType.values().length];
            try {
                iArr[SocialProductListDTO.ProductListItemDTO.CouponDTO.CouponType.COUPON_USUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialProductListDTO.ProductListItemDTO.CouponDTO.CouponType.COUPON_WINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocialProductListDTO.ProductListItemDTO.CouponDTO.CouponType.COUPON_ALL_PRODUCTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocialProductListDTO.ProductListItemDTO.CouponDTO.CouponType.COUPON_TYPE_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CouponViewHolder(@NotNull ViewGroup parent, @NotNull ViewSocialCouponBinding binding, @NotNull TextView titleView, @NotNull TextView subtitleView) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(subtitleView, "subtitleView");
        this.binding = binding;
        this.titleView = titleView;
        this.subtitleView = subtitleView;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.couponUsualDrawable = new CouponWithDotsBackgroundDrawable(context, parent.getContext().getColor(R$color.oz_semantic_accent_feed_2), new OzGradientAccent1());
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.couponWinnerDrawable = new CouponWithIconBackgroundDrawable(context2, parent.getContext().getColor(R$color.oz_semantic_accent_feed_2), new OzGradientAccent2());
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.couponAllProductDrawable = new CouponWithDotsBackgroundDrawable(context3, parent.getContext().getColor(R$color.oz_semantic_accent_feed_2), new OzGradientAccent4());
    }

    public final void bind(@NotNull CouponVO vo, float elevation) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.currentCouponId = Integer.valueOf(vo.getId());
        this.binding.getConstraintLayout().setElevation(elevation);
        TextView textView = this.titleView;
        textView.setText(vo.getTitle());
        textView.setContentDescription(vo.getTitle());
        this.subtitleView.setText(vo.getSubtitle());
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        int i11 = WhenMappings.$EnumSwitchMapping$0[vo.getType().ordinal()];
        if (i11 == 1) {
            drawable = this.couponUsualDrawable;
        } else if (i11 == 2) {
            drawable = this.couponWinnerDrawable;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    throw new IllegalStateException("Invalid coupon type");
                }
                throw new o();
            }
            drawable = this.couponAllProductDrawable;
        }
        constraintLayout.setBackground(drawable);
    }

    @NotNull
    public final ViewSocialCouponBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CouponViewHolder(ViewGroup viewGroup, ViewSocialCouponBinding viewSocialCouponBinding, TextView textView, TextView textView2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, viewSocialCouponBinding, (i11 & 4) != 0 ? viewSocialCouponBinding.titleView : textView, (i11 & 8) != 0 ? viewSocialCouponBinding.subtitleView : textView2);
        viewSocialCouponBinding = (i11 & 2) != 0 ? ViewSocialCouponBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false) : viewSocialCouponBinding;
    }
}
