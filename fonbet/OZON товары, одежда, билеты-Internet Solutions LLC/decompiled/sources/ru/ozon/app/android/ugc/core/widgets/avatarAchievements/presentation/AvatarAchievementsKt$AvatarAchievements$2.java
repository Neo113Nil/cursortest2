package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AvatarAchievements$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AvatarAchievementsVO $item;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onTooltipClosed;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AvatarAchievementsKt$AvatarAchievements$2(AvatarAchievementsVO avatarAchievementsVO, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12, Function1<? super String, Boolean> function13, Function1<? super String, Unit> function14, Function0<Unit> function0, int i11) {
        super(2);
        this.$item = avatarAchievementsVO;
        this.$onView = function1;
        this.$onClick = function12;
        this.$shouldShowTooltip = function13;
        this.$onTooltipShown = function14;
        this.$onTooltipClosed = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AvatarAchievementsKt.AvatarAchievements(this.$item, this.$onView, this.$onClick, this.$shouldShowTooltip, this.$onTooltipShown, this.$onTooltipClosed, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
