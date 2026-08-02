package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.data.MorkovskTabbarDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.di.MorkovskTabbarComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.composer.compose.widget.overlay.e;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/di/MorkovskTabbarComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$component$2 extends AbstractC7737t implements Function0<MorkovskTabbarComponent> {
    final /* synthetic */ e<MorkovskTabbarDTO, MorkovskTabbarVI> $this_overlayViewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$component$2(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
        super(0);
        this.$this_overlayViewMapper = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MorkovskTabbarComponent invoke() {
        return (MorkovskTabbarComponent) this.$this_overlayViewMapper.getWidgetComponentStorage().getComponent(MorkovskTabbarComponent.class);
    }
}
