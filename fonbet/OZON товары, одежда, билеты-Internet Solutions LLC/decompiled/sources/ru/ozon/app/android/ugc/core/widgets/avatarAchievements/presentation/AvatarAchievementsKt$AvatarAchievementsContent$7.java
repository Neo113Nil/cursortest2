package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AvatarAchievementsContent$7 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AvatarAchievementsVO $item;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onTooltipClosed;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AvatarAchievementsKt$AvatarAchievementsContent$7(e eVar, AvatarAchievementsVO avatarAchievementsVO, Function1<? super AtomAction, Unit> function1, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$item = avatarAchievementsVO;
        this.$onClick = function1;
        this.$shouldShowTooltip = function12;
        this.$onTooltipShown = function13;
        this.$onTooltipClosed = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AvatarAchievementsKt.AvatarAchievementsContent(this.$modifier, this.$item, this.$onClick, this.$shouldShowTooltip, this.$onTooltipShown, this.$onTooltipClosed, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
