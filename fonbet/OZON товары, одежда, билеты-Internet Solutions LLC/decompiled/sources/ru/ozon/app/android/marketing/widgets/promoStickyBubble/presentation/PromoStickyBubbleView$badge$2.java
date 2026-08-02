package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/badge/BadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoStickyBubbleView$badge$2 extends AbstractC7737t implements Function0<BadgeView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PromoStickyBubbleView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleView$badge$2(Context context, PromoStickyBubbleView promoStickyBubbleView) {
        super(0);
        this.$context = context;
        this.this$0 = promoStickyBubbleView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeView invoke() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BadgeView badgeView = new BadgeView(this.$context, null, 0, 0, 14, null);
        PromoStickyBubbleView promoStickyBubbleView = this.this$0;
        i11 = promoStickyBubbleView.badgeId;
        badgeView.setId(i11);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        i12 = promoStickyBubbleView.imageViewId;
        bVar.f41656t = i12;
        i13 = promoStickyBubbleView.imageViewId;
        bVar.f41658v = i13;
        i14 = PromoStickyBubbleView.horizontalBadgeMargins;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i14;
        i15 = PromoStickyBubbleView.horizontalBadgeMargins;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i15;
        badgeView.setLayoutParams(bVar);
        return badgeView;
    }
}
