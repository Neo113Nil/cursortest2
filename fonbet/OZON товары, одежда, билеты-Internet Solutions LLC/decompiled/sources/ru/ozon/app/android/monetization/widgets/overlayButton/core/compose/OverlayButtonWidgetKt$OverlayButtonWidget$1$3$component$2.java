package ru.ozon.app.android.monetization.widgets.overlayButton.core.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.overlayButton.data.OverlayButtonDTO;
import ru.ozon.app.android.monetization.widgets.overlayButton.di.OverlayButtonComponent;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonVO;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/monetization/widgets/overlayButton/di/OverlayButtonComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class OverlayButtonWidgetKt$OverlayButtonWidget$1$3$component$2 extends AbstractC7737t implements Function0<OverlayButtonComponent> {
    final /* synthetic */ e<OverlayButtonDTO, OverlayButtonVO> $this_overlayViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OverlayButtonWidgetKt$OverlayButtonWidget$1$3$component$2(e<OverlayButtonDTO, OverlayButtonVO> eVar) {
        super(0);
        this.$this_overlayViewMapper = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OverlayButtonComponent invoke() {
        return (OverlayButtonComponent) this.$this_overlayViewMapper.getWidgetComponentStorage().getComponent(OverlayButtonComponent.class);
    }
}
