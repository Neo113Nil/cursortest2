package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import B1.B;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.ActiveTooltip;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsKt$AchievementItem$3$1$1", f = "AvatarAchievements.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AchievementItem$3$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AvatarAchievementsVO.AchievementVO $achievement;
    final /* synthetic */ String $activeTooltipKey;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ boolean $isReady;
    final /* synthetic */ Function1<ActiveTooltip, Unit> $onTooltipRequest;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;
    final /* synthetic */ TooltipDTO $tooltip;
    final /* synthetic */ InterfaceC3978p0<B> $tooltipAnchorCoordinates$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AvatarAchievementsKt$AchievementItem$3$1$1(boolean z11, boolean z12, Function1<? super ActiveTooltip, Unit> function1, String str, Function1<? super String, Boolean> function12, AvatarAchievementsVO.AchievementVO achievementVO, TooltipDTO tooltipDTO, Function1<? super String, Unit> function13, InterfaceC3978p0<B> interfaceC3978p0, d<? super AvatarAchievementsKt$AchievementItem$3$1$1> dVar) {
        super(2, dVar);
        this.$isReady = z11;
        this.$isActive = z12;
        this.$onTooltipRequest = function1;
        this.$activeTooltipKey = str;
        this.$shouldShowTooltip = function12;
        this.$achievement = achievementVO;
        this.$tooltip = tooltipDTO;
        this.$onTooltipShown = function13;
        this.$tooltipAnchorCoordinates$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AvatarAchievementsKt$AchievementItem$3$1$1(this.$isReady, this.$isActive, this.$onTooltipRequest, this.$activeTooltipKey, this.$shouldShowTooltip, this.$achievement, this.$tooltip, this.$onTooltipShown, this.$tooltipAnchorCoordinates$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B AchievementItem$lambda$25;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (!this.$isReady) {
            if (this.$isActive) {
                this.$onTooltipRequest.invoke(null);
            }
            return Unit.f71690a;
        }
        if (this.$isActive || (this.$activeTooltipKey == null && this.$shouldShowTooltip.invoke(this.$achievement.getTooltipKey()).booleanValue())) {
            Function1<ActiveTooltip, Unit> function1 = this.$onTooltipRequest;
            String tooltipKey = this.$achievement.getTooltipKey();
            TooltipDTO tooltipDTO = this.$tooltip;
            AchievementItem$lambda$25 = AvatarAchievementsKt.AchievementItem$lambda$25(this.$tooltipAnchorCoordinates$delegate);
            function1.invoke(new ActiveTooltip(tooltipKey, tooltipDTO, AchievementItem$lambda$25));
            if (!this.$isActive) {
                this.$onTooltipShown.invoke(this.$achievement.getTooltipKey());
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AvatarAchievementsKt$AchievementItem$3$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
