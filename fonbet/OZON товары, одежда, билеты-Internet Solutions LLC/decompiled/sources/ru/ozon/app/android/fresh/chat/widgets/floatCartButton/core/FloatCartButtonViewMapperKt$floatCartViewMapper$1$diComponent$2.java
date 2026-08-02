package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data.FloatCartButtonDTO;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonVO;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonDIComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FloatCartButtonViewMapperKt$floatCartViewMapper$1$diComponent$2 extends AbstractC7737t implements Function0<FloatCartButtonDIComponent> {
    final /* synthetic */ e<FloatCartButtonDTO, FloatCartButtonVO> $this_overlayViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatCartButtonViewMapperKt$floatCartViewMapper$1$diComponent$2(e<FloatCartButtonDTO, FloatCartButtonVO> eVar) {
        super(0);
        this.$this_overlayViewMapper = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FloatCartButtonDIComponent invoke() {
        return (FloatCartButtonDIComponent) this.$this_overlayViewMapper.getWidgetComponentStorage().getComponent(FloatCartButtonDIComponent.class);
    }
}
