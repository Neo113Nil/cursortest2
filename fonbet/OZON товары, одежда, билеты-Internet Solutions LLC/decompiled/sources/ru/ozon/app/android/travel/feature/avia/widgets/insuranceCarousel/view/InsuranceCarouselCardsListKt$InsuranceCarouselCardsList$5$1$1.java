package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$1$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ InsuranceCarouselVI $state;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$1$1(InsuranceCarouselVI insuranceCarouselVI, l lVar) {
        super(1);
        this.$state = insuranceCarouselVI;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        t viewTracking = this.$state.getInsurances().get(i11).getViewTracking();
        if (viewTracking != null) {
            m.c(this.$tokenizedAnalytics, viewTracking, null);
        }
    }
}
