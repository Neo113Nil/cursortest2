package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class VideoMoleculeControlPanelKt$LandscapeControlPanel$1$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ControlPanelActions $actions;
    final /* synthetic */ boolean $isFullscreen;
    final /* synthetic */ p<Boolean, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $modeButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeControlPanelKt$LandscapeControlPanel$1$2(p<? super Boolean, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, boolean z11, ControlPanelActions controlPanelActions) {
        super(2);
        this.$modeButton = pVar;
        this.$isFullscreen = z11;
        this.$actions = controlPanelActions;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            this.$modeButton.invoke(Boolean.valueOf(this.$isFullscreen), a0.d(e.f40358c0), this.$actions.getOnFullscreenClick(), interfaceC3967k, 48);
        }
    }
}
