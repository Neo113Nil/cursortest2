package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.ActiveTooltip;
import ru.ozon.composer.compose.widget.scrollable.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/h;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/h;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AvatarAchievementsContent$5$1$1 extends AbstractC7737t implements Function1<h, Unit> {
    final /* synthetic */ InterfaceC3978p0<ActiveTooltip> $activeTooltip$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isWidgetVisible$delegate;
    final /* synthetic */ Function0<Unit> $onTooltipClosed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarAchievementsKt$AvatarAchievementsContent$5$1$1(Function0<Unit> function0, InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3978p0<ActiveTooltip> interfaceC3978p02) {
        super(1);
        this.$onTooltipClosed = function0;
        this.$isWidgetVisible$delegate = interfaceC3978p0;
        this.$activeTooltip$delegate = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(h hVar) {
        invoke2(hVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(h onVisibleAreaChanged) {
        ActiveTooltip AvatarAchievementsContent$lambda$8;
        Intrinsics.checkNotNullParameter(onVisibleAreaChanged, "$this$onVisibleAreaChanged");
        boolean z11 = onVisibleAreaChanged.a(false) >= 0.5f;
        AvatarAchievementsKt.AvatarAchievementsContent$lambda$12(this.$isWidgetVisible$delegate, z11);
        if (z11) {
            return;
        }
        AvatarAchievementsContent$lambda$8 = AvatarAchievementsKt.AvatarAchievementsContent$lambda$8(this.$activeTooltip$delegate);
        if (AvatarAchievementsContent$lambda$8 != null) {
            this.$onTooltipClosed.invoke();
        }
    }
}
