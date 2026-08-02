package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"VIEW_HEIGHT_PX", "", "fillWithDemoDataIfInEditMode", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadgeView;", "bindOrGone", "badge", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceCounterBadgeViewKt {
    private static final int VIEW_HEIGHT_PX = C6915b.c(ResourceExtKt.toPxF(20));

    public static final void bindOrGone(@NotNull PriceCounterBadgeView priceCounterBadgeView, PriceCounterBadge priceCounterBadge) {
        Intrinsics.checkNotNullParameter(priceCounterBadgeView, "<this>");
        priceCounterBadgeView.setVisibility(priceCounterBadge == null ? 8 : 0);
        if (priceCounterBadge != null) {
            priceCounterBadgeView.bind(priceCounterBadge);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fillWithDemoDataIfInEditMode(PriceCounterBadgeView priceCounterBadgeView) {
        if (priceCounterBadgeView.isInEditMode()) {
            priceCounterBadgeView.bind(new PriceCounterBadge("1", "ozblack", "ozgray60"));
        }
    }
}
