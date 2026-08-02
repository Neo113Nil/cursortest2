package ru.ozon.app.android.fresh.chat.widgets.textInput;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.chat.widgets.textInput.data.TextInputDTO;
import ru.ozon.app.android.fresh.chat.widgets.textInput.di.TextInputDIComponent;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputVO;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/chat/widgets/textInput/di/TextInputDIComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$diComponent$2 extends AbstractC7737t implements Function0<TextInputDIComponent> {
    final /* synthetic */ e<TextInputDTO, TextInputVO> $this_overlayViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$diComponent$2(e<TextInputDTO, TextInputVO> eVar) {
        super(0);
        this.$this_overlayViewMapper = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextInputDIComponent invoke() {
        return (TextInputDIComponent) this.$this_overlayViewMapper.getWidgetComponentStorage().getComponent(TextInputDIComponent.class);
    }
}
