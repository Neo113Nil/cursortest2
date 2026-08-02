package ru.ozon.app.android.videomoleculecompose;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionOverlayKt;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;", "state", "Landroidx/compose/ui/e;", "slotModifier", "Lkotlin/Function0;", "", "onClick", "invoke", "(Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterActionState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.videomoleculecompose.ComposableSingletons$VideoMoleculeKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$VideoMoleculeKt$lambda2$1 extends AbstractC7737t implements p<VideoMoleculeCenterActionState, e, Function0<? extends Unit>, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$VideoMoleculeKt$lambda2$1 INSTANCE = new ComposableSingletons$VideoMoleculeKt$lambda2$1();

    ComposableSingletons$VideoMoleculeKt$lambda2$1() {
        super(5);
    }

    @Override // fd.p
    public /* bridge */ /* synthetic */ Unit invoke(VideoMoleculeCenterActionState videoMoleculeCenterActionState, e eVar, Function0<? extends Unit> function0, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(videoMoleculeCenterActionState, eVar, (Function0<Unit>) function0, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(VideoMoleculeCenterActionState state, e slotModifier, Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slotModifier, "slotModifier");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3967k.n(slotModifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3967k.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 1171) == 1170 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            VideoMoleculeCenterActionOverlayKt.VideoMoleculeCenterActionOverlay(state, slotModifier, onClick, interfaceC3967k, i12 & 1022, 0);
        }
    }
}
