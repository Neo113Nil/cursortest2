package ru.ozon.app.android.ugc.payout.di.modules;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewConfig;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewItemViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewProductsV3Config;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewSectionHeaderViewMapper;

/* loaded from: classes7.dex */
public final class UgcPayoutWidgetsModule_ProvideWidgets$payout_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$payout_prodGoogleAllVendorsRelease(UgcPayoutWidgetsModule ugcPayoutWidgetsModule, PinnedReviewConfig pinnedReviewConfig, PinnedReviewViewMapper pinnedReviewViewMapper, PromoReviewProductsV3Config promoReviewProductsV3Config, PromoReviewItemViewMapper promoReviewItemViewMapper, PromoReviewSectionHeaderViewMapper promoReviewSectionHeaderViewMapper, SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Set<Widget2> provideWidgets$payout_prodGoogleAllVendorsRelease = ugcPayoutWidgetsModule.provideWidgets$payout_prodGoogleAllVendorsRelease(pinnedReviewConfig, pinnedReviewViewMapper, promoReviewProductsV3Config, promoReviewItemViewMapper, promoReviewSectionHeaderViewMapper, separatorViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideWidgets$payout_prodGoogleAllVendorsRelease);
        return provideWidgets$payout_prodGoogleAllVendorsRelease;
    }
}
