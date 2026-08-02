package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/badge/BadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutStickyTotalOverlayViewHolder$badgeView$2 extends AbstractC7737t implements Function0<BadgeView> {
    final /* synthetic */ CheckoutStickyTotalOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutStickyTotalOverlayViewHolder$badgeView$2(CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder) {
        super(0);
        this.this$0 = checkoutStickyTotalOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeView invoke() {
        Context context;
        context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        CheckoutStickyTotalOverlayViewHolder checkoutStickyTotalOverlayViewHolder = this.this$0;
        badgeView.setId(R$id.checkoutStickyTotalBadge);
        badgeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View view = checkoutStickyTotalOverlayViewHolder.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(badgeView, 0);
        }
        return badgeView;
    }
}
