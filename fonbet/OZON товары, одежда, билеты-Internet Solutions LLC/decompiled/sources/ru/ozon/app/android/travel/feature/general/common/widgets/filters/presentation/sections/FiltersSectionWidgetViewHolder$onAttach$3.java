package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.FiltersSectionView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FiltersSectionWidgetViewHolder$onAttach$3 extends C7735q implements Function1<List<? extends SliderWithLabelsSectionVO.SliderWithLabelsControlVO>, Unit> {
    FiltersSectionWidgetViewHolder$onAttach$3(Object obj) {
        super(1, obj, FiltersSectionView.class, "setSliderWithLabels", "setSliderWithLabels(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends SliderWithLabelsSectionVO.SliderWithLabelsControlVO> list) {
        invoke2((List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((FiltersSectionView) this.receiver).setSliderWithLabels(p02);
    }
}
