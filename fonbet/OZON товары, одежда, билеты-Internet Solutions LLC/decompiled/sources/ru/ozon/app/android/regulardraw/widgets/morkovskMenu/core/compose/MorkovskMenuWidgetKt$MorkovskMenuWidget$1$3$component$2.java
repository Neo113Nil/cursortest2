package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/di/MorkovskMenuComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$component$2 extends AbstractC7737t implements Function0<MorkovskMenuComponent> {
    final /* synthetic */ j<MorkovskMenuDTO, MorkovskMenuVO> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$component$2(j<MorkovskMenuDTO, MorkovskMenuVO> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MorkovskMenuComponent invoke() {
        return (MorkovskMenuComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(MorkovskMenuComponent.class);
    }
}
