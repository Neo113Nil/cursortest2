package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipCloseUpdateKey;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$onTooltipClosed$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ i<AvatarAchievementsVO> $this_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$onTooltipClosed$1$1(i<AvatarAchievementsVO> iVar, InterfaceC7851b interfaceC7851b) {
        super(0);
        this.$this_content = iVar;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$this_content.b().getIsTooltipClosed()) {
            return;
        }
        this.$controller.update(new TooltipCloseUpdateKey(this.$this_content.b().getId()));
    }
}
