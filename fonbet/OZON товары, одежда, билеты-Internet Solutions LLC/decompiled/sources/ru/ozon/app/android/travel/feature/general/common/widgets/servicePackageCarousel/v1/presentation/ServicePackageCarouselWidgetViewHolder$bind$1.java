package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class ServicePackageCarouselWidgetViewHolder$bind$1 extends C7735q implements Function2<Integer, List<? extends ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> {
    ServicePackageCarouselWidgetViewHolder$bind$1(Object obj) {
        super(2, obj, ServicePackageCarouselViewModel.class, "cardRequestFocusCallback", "cardRequestFocusCallback(ILjava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, List<? extends ServicePackageCarouselVO.ServicePackageCarouselCardVO> list) {
        invoke(num.intValue(), (List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>) list);
        return Unit.f71690a;
    }

    public final void invoke(int i11, List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((ServicePackageCarouselViewModel) this.receiver).cardRequestFocusCallback(i11, p12);
    }
}
