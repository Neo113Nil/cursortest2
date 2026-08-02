package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.extensions.ServicePackageCardViewHelper;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class ServicePackageCarouselView$setupCardsListHeight$1 extends C7735q implements Function1<View, Integer> {
    ServicePackageCarouselView$setupCardsListHeight$1(Object obj) {
        super(1, obj, ServicePackageCardViewHelper.Companion.class, "getCardWidth", "getCardWidth(Landroid/view/View;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Integer.valueOf(((ServicePackageCardViewHelper.Companion) this.receiver).getCardWidth(p02));
    }
}
