package ru.ozon.app.android.storefront.widgets.placementSlider.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.placementSlider.data.PromoPlacementDTO;
import ru.ozon.app.android.storefront.widgets.placementSlider.di.PromoPlacementWidgetComponent;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/placementSlider/di/PromoPlacementWidgetComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$component$2 extends AbstractC7737t implements Function0<PromoPlacementWidgetComponent> {
    final /* synthetic */ j<PromoPlacementDTO, PromoPlacementVO> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$component$2(j<PromoPlacementDTO, PromoPlacementVO> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PromoPlacementWidgetComponent invoke() {
        return (PromoPlacementWidgetComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(PromoPlacementWidgetComponent.class);
    }
}
