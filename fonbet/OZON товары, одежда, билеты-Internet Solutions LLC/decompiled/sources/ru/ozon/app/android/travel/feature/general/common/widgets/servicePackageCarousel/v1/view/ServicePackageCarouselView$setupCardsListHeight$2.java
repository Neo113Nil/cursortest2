package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class ServicePackageCarouselView$setupCardsListHeight$2 extends C7735q implements Function1<Integer, Unit> {
    ServicePackageCarouselView$setupCardsListHeight$2(Object obj) {
        super(1, obj, ServicePackageCarouselView.class, "setupCardsListHeight", "setupCardsListHeight(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((ServicePackageCarouselView) this.receiver).setupCardsListHeight(i11);
    }
}
