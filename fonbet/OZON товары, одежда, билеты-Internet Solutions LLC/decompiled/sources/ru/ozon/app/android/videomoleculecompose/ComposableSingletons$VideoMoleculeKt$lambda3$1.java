package ru.ozon.app.android.videomoleculecompose;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelKt;
import ru.ozon.app.android.videomoleculecompose.slots.controlpanel.VideoMoleculeControlPanelState;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;", "state", "Landroidx/compose/ui/e;", "slotModifier", "Lkotlin/Function1;", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntentHandler;", "intentHandler", "invoke", "(Lru/ozon/app/android/videomoleculecompose/slots/controlpanel/VideoMoleculeControlPanelState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.videomoleculecompose.ComposableSingletons$VideoMoleculeKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$VideoMoleculeKt$lambda3$1 extends AbstractC7737t implements p<VideoMoleculeControlPanelState, e, Function1<? super VideoMoleculeIntent, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$VideoMoleculeKt$lambda3$1 INSTANCE = new ComposableSingletons$VideoMoleculeKt$lambda3$1();

    ComposableSingletons$VideoMoleculeKt$lambda3$1() {
        super(5);
    }

    @Override // fd.p
    public /* bridge */ /* synthetic */ Unit invoke(VideoMoleculeControlPanelState videoMoleculeControlPanelState, e eVar, Function1<? super VideoMoleculeIntent, ? extends Unit> function1, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(videoMoleculeControlPanelState, eVar, (Function1<? super VideoMoleculeIntent, Unit>) function1, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(VideoMoleculeControlPanelState state, e slotModifier, Function1<? super VideoMoleculeIntent, Unit> intentHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slotModifier, "slotModifier");
        Intrinsics.checkNotNullParameter(intentHandler, "intentHandler");
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3967k.n(slotModifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3967k.F(intentHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 1171) == 1170 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            VideoMoleculeControlPanelKt.VideoMoleculeControlPanel(state, intentHandler, slotModifier, null, null, null, interfaceC3967k, (i12 & 14) | ((i12 >> 3) & 112) | ((i12 << 3) & 896), 56);
        }
    }
}
