package ru.ozon.app.android.ugc.payout.di.modules;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewConfig;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewItemViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewProductsV3Config;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewSectionHeaderViewMapper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/payout/di/modules/UgcPayoutWidgetsModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "pinnedReviewConfig", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewConfig;", "pinnedReviewViewMapper", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewViewMapper;", "promoReviewProductsV3Config", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewProductsV3Config;", "promoReviewItemViewMapper", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewItemViewMapper;", "promoReviewSectionHeaderViewMapper", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/core/PromoReviewSectionHeaderViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "provideWidgets$payout_prodGoogleAllVendorsRelease", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcPayoutWidgetsModule {
    @NotNull
    public final Set<Widget2> provideWidgets$payout_prodGoogleAllVendorsRelease(@NotNull PinnedReviewConfig pinnedReviewConfig, @NotNull PinnedReviewViewMapper pinnedReviewViewMapper, @NotNull PromoReviewProductsV3Config promoReviewProductsV3Config, @NotNull PromoReviewItemViewMapper promoReviewItemViewMapper, @NotNull PromoReviewSectionHeaderViewMapper promoReviewSectionHeaderViewMapper, @NotNull SeparatorViewMapper separatorViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(pinnedReviewConfig, "pinnedReviewConfig");
        Intrinsics.checkNotNullParameter(pinnedReviewViewMapper, "pinnedReviewViewMapper");
        Intrinsics.checkNotNullParameter(promoReviewProductsV3Config, "promoReviewProductsV3Config");
        Intrinsics.checkNotNullParameter(promoReviewItemViewMapper, "promoReviewItemViewMapper");
        Intrinsics.checkNotNullParameter(promoReviewSectionHeaderViewMapper, "promoReviewSectionHeaderViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Widget2[] elements = {new Widget2("rpProduct", "pinnedReview", pinnedReviewConfig, new ViewMapper2[]{pinnedReviewViewMapper}), new Widget2("rpProduct", "promoReviewProducts", promoReviewProductsV3Config, new ViewMapper2[]{separatorViewMapper, islandSeparatorViewMapper, promoReviewItemViewMapper, promoReviewSectionHeaderViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
