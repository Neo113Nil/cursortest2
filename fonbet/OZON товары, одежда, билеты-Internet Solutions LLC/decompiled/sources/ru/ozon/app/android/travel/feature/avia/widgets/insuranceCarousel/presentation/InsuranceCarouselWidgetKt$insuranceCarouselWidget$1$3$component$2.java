package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.data.InsuranceCarouselDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.di.InsuranceCarouselComponent;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/di/InsuranceCarouselComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$component$2 extends AbstractC7737t implements Function0<InsuranceCarouselComponent> {
    final /* synthetic */ j<InsuranceCarouselDTO, InsuranceCarouselVI> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$component$2(j<InsuranceCarouselDTO, InsuranceCarouselVI> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InsuranceCarouselComponent invoke() {
        return (InsuranceCarouselComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(InsuranceCarouselComponent.class);
    }
}
