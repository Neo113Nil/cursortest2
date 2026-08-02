package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.rateApp.data.RateAppDTO;
import ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppVO;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateAppComposeWidgetKt$rateAppComposeWidget$1$4$component$2 extends AbstractC7737t implements Function0<RateAppWidgetComponent> {
    final /* synthetic */ e<RateAppDTO, RateAppVO> $this_overlayViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateAppComposeWidgetKt$rateAppComposeWidget$1$4$component$2(e<RateAppDTO, RateAppVO> eVar) {
        super(0);
        this.$this_overlayViewMapper = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RateAppWidgetComponent invoke() {
        return (RateAppWidgetComponent) this.$this_overlayViewMapper.getWidgetComponentStorage().getComponent(RateAppWidgetComponent.class);
    }
}
