package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import J0.u3;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelState;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/C;", "", "invoke", "(Lu0/C;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$2 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ VideoMoleculeControlPanelState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseV2CustomizationsSlots$CustomizationControlPanel$1$4$2(VideoMoleculeControlPanelState videoMoleculeControlPanelState) {
        super(3);
        this.$state = videoMoleculeControlPanelState;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9890C, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9890C Button, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            u3.b(this.$state.getPlayPause().getShowPlay() ? "CUSTOM PLAY" : "CUSTOM PAUSE", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, interfaceC3967k, 0, 0, 131070);
        }
    }
}
