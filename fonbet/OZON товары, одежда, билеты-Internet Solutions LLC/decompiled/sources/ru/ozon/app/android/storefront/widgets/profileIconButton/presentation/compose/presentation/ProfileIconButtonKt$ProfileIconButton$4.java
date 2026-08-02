package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonKt$ProfileIconButton$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isRichTooltipAnimationEnabled;
    final /* synthetic */ Function1<AtomAction, Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onTooltipDismiss;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;
    final /* synthetic */ ProfileIconButtonVO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProfileIconButtonKt$ProfileIconButton$4(ProfileIconButtonVO profileIconButtonVO, boolean z11, Function1<? super AtomAction, Unit> function1, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function0<Unit> function0, int i11) {
        super(2);
        this.$state = profileIconButtonVO;
        this.$isRichTooltipAnimationEnabled = z11;
        this.$onClick = function1;
        this.$shouldShowTooltip = function12;
        this.$onTooltipShown = function13;
        this.$onTooltipDismiss = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProfileIconButtonKt.ProfileIconButton(this.$state, this.$isRichTooltipAnimationEnabled, this.$onClick, this.$shouldShowTooltip, this.$onTooltipShown, this.$onTooltipDismiss, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
