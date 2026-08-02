package ru.ozon.app.android.videomoleculecompose;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.slots.buffering.VideoMoleculeBufferingKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isBuffering", "Landroidx/compose/ui/e;", "slotModifier", "", "invoke", "(ZLandroidx/compose/ui/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.videomoleculecompose.ComposableSingletons$VideoMoleculeKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$VideoMoleculeKt$lambda5$1 extends AbstractC7737t implements InterfaceC6512o<Boolean, e, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$VideoMoleculeKt$lambda5$1 INSTANCE = new ComposableSingletons$VideoMoleculeKt$lambda5$1();

    ComposableSingletons$VideoMoleculeKt$lambda5$1() {
        super(4);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(bool.booleanValue(), eVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, e slotModifier, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(slotModifier, "slotModifier");
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3967k.n(slotModifier) ? 32 : 16;
        }
        if ((i12 & 147) == 146 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            VideoMoleculeBufferingKt.VideoMoleculeBuffering(z11, slotModifier, interfaceC3967k, i12 & 126, 0);
        }
    }
}
