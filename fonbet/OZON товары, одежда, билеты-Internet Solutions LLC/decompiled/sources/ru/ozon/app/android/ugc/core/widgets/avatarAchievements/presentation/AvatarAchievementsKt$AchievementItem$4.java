package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.ActiveTooltip;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AchievementItem$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AvatarAchievementsVO.AchievementVO $achievement;
    final /* synthetic */ String $activeTooltipKey;
    final /* synthetic */ boolean $isDarkTheme;
    final /* synthetic */ boolean $isTooltipClosed;
    final /* synthetic */ boolean $isWidgetVisible;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;
    final /* synthetic */ Function1<ActiveTooltip, Unit> $onTooltipRequest;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AvatarAchievementsKt$AchievementItem$4(e eVar, AvatarAchievementsVO.AchievementVO achievementVO, boolean z11, boolean z12, boolean z13, String str, Function1<? super AtomAction, Unit> function1, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function1<? super ActiveTooltip, Unit> function14, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$achievement = achievementVO;
        this.$isTooltipClosed = z11;
        this.$isDarkTheme = z12;
        this.$isWidgetVisible = z13;
        this.$activeTooltipKey = str;
        this.$onClick = function1;
        this.$shouldShowTooltip = function12;
        this.$onTooltipShown = function13;
        this.$onTooltipRequest = function14;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AvatarAchievementsKt.AchievementItem(this.$modifier, this.$achievement, this.$isTooltipClosed, this.$isDarkTheme, this.$isWidgetVisible, this.$activeTooltipKey, this.$onClick, this.$shouldShowTooltip, this.$onTooltipShown, this.$onTooltipRequest, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
