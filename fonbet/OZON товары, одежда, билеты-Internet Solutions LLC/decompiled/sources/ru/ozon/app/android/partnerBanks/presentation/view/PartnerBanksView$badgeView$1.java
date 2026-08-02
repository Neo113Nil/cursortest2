package ru.ozon.app.android.partnerBanks.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/badge/BadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PartnerBanksView$badgeView$1 extends AbstractC7737t implements Function0<BadgeView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PartnerBanksView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartnerBanksView$badgeView$1(Context context, PartnerBanksView partnerBanksView) {
        super(0);
        this.$context = context;
        this.this$0 = partnerBanksView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgeView invoke() {
        boolean checkTitleVisible;
        PartnerBanksView.Companion companion;
        int margin_between_items;
        boolean checkIconsVisible;
        BadgeView badgeView = new BadgeView(this.$context, null, 0, 0, 14, null);
        PartnerBanksView partnerBanksView = this.this$0;
        badgeView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        checkTitleVisible = partnerBanksView.checkTitleVisible();
        if (!checkTitleVisible) {
            checkIconsVisible = partnerBanksView.checkIconsVisible();
            if (!checkIconsVisible) {
                margin_between_items = 0;
                layoutParams.leftMargin = margin_between_items;
                badgeView.setLayoutParams(layoutParams);
                this.this$0.addView(badgeView);
                return badgeView;
            }
        }
        companion = PartnerBanksView.Companion;
        margin_between_items = companion.getMARGIN_BETWEEN_ITEMS();
        layoutParams.leftMargin = margin_between_items;
        badgeView.setLayoutParams(layoutParams);
        this.this$0.addView(badgeView);
        return badgeView;
    }
}
