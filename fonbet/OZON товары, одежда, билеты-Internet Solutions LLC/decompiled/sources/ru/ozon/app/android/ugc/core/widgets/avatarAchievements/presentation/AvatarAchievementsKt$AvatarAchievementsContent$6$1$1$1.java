package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.ActiveTooltip;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/ui/configurators/tooltip/ActiveTooltip;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsKt$AvatarAchievementsContent$6$1$1$1 extends AbstractC7737t implements Function1<ActiveTooltip, Unit> {
    final /* synthetic */ InterfaceC3978p0<ActiveTooltip> $activeTooltip$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarAchievementsKt$AvatarAchievementsContent$6$1$1$1(InterfaceC3978p0<ActiveTooltip> interfaceC3978p0) {
        super(1);
        this.$activeTooltip$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActiveTooltip activeTooltip) {
        invoke2(activeTooltip);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActiveTooltip activeTooltip) {
        this.$activeTooltip$delegate.setValue(activeTooltip);
    }
}
