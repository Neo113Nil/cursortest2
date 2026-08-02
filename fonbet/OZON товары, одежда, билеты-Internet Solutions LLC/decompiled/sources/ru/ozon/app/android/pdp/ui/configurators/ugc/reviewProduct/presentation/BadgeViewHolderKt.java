package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.ReviewProductVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"applyMargins", "", "Landroid/view/View;", "item", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductVO$BadgeVO;", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeViewHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyMargins(View view, ReviewProductVO.BadgeVO badgeVO) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(badgeVO.getStartMargin());
        marginLayoutParams.setMarginEnd(badgeVO.getEndMargin());
        view.setLayoutParams(marginLayoutParams);
    }
}
