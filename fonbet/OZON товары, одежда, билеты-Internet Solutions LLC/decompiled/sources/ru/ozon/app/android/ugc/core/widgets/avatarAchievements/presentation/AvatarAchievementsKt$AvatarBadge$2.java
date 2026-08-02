package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import u0.InterfaceC9893b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AvatarBadge$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AvatarAchievementsVO.AvatarVO $avatar;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;
    final /* synthetic */ InterfaceC9893b $this_AvatarBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AvatarAchievementsKt$AvatarBadge$2(InterfaceC9893b interfaceC9893b, AvatarAchievementsVO.AvatarVO avatarVO, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$this_AvatarBadge = interfaceC9893b;
        this.$avatar = avatarVO;
        this.$onClick = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AvatarAchievementsKt.AvatarBadge(this.$this_AvatarBadge, this.$avatar, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
