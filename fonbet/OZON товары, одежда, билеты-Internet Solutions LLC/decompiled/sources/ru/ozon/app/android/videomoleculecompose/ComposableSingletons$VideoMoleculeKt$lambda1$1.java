package ru.ozon.app.android.videomoleculecompose;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.slots.gradient.VideoMoleculeGradientOverlayKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "slotModifier", "", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.videomoleculecompose.ComposableSingletons$VideoMoleculeKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$VideoMoleculeKt$lambda1$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$VideoMoleculeKt$lambda1$1 INSTANCE = new ComposableSingletons$VideoMoleculeKt$lambda1$1();

    ComposableSingletons$VideoMoleculeKt$lambda1$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(eVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(e slotModifier, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(slotModifier, "slotModifier");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(slotModifier) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            VideoMoleculeGradientOverlayKt.VideoMoleculeGradientOverlay(slotModifier, interfaceC3967k, i11 & 14, 0);
        }
    }
}
