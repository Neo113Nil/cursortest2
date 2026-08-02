package ru.ozon.app.android.cscore.orderdetails.molecule.media.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;", "media", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;Lkotlin/jvm/functions/Function1;)V", "badgeMargin", "I", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "productMediaView", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "getProductMediaView", "()Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductMediaImageView extends FrameLayout {
    private final int badgeMargin;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final ProductMediaView productMediaView;
    public static final int $stable = BadgeView.$stable | ProductMediaView.$stable;

    public /* synthetic */ ProductMediaImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull ProductMediaImageVO media, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(media, "media");
        ProductMediaView productMediaView = this.productMediaView;
        ProductMediaHolderKt.bind(productMediaView, media.getProductMedia(), onAction);
        productMediaView.setImageAlpha(media.getIsDisabled() ? 102 : 255);
        BadgeHolderKt.bindOrGone$default(this.badgeView, media.getBadgeCounter(), (Function1) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMediaImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.badgeMargin = px;
        ProductMediaView productMediaView = new ProductMediaView(context, null, 0, 6, null);
        productMediaView.setId(View.generateViewId());
        productMediaView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.productMediaView = productMediaView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int marginEnd = layoutParams.getMarginEnd();
        layoutParams.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i12;
        layoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = px;
        layoutParams.gravity = 8388691;
        badgeView.setLayoutParams(layoutParams);
        this.badgeView = badgeView;
        setId(View.generateViewId());
        addView(productMediaView);
        addView(badgeView);
    }
}
