package ru.ozon.app.android.videomoleculecompose.slots.controlpanel;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarDefaults;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\n¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;", "slotState", "Landroidx/compose/ui/e;", "slotModifier", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "style", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;", "behavior", "Lkotlin/Function1;", "", "", "onScrubStart", "onScrubMove", "Lkotlin/Function2;", "", "onScrubEnd", "invoke", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarState;Landroidx/compose/ui/e;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarBehavior;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.videomoleculecompose.slots.controlpanel.ComposableSingletons$VideoMoleculeControlPanelKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$VideoMoleculeControlPanelKt$lambda2$1 extends AbstractC7737t implements t<SlimTimeBarState, e, SlimTimeBarStyle, SlimTimeBarBehavior, Function1<? super Long, ? extends Unit>, Function1<? super Long, ? extends Unit>, Function2<? super Long, ? super Boolean, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$VideoMoleculeControlPanelKt$lambda2$1 INSTANCE = new ComposableSingletons$VideoMoleculeControlPanelKt$lambda2$1();

    ComposableSingletons$VideoMoleculeControlPanelKt$lambda2$1() {
        super(9);
    }

    @Override // fd.t
    public /* bridge */ /* synthetic */ Unit invoke(SlimTimeBarState slimTimeBarState, e eVar, SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarBehavior slimTimeBarBehavior, Function1<? super Long, ? extends Unit> function1, Function1<? super Long, ? extends Unit> function12, Function2<? super Long, ? super Boolean, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(slimTimeBarState, eVar, slimTimeBarStyle, slimTimeBarBehavior, (Function1<? super Long, Unit>) function1, (Function1<? super Long, Unit>) function12, (Function2<? super Long, ? super Boolean, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(SlimTimeBarState slotState, e slotModifier, SlimTimeBarStyle style, SlimTimeBarBehavior behavior, Function1<? super Long, Unit> onScrubStart, Function1<? super Long, Unit> onScrubMove, Function2<? super Long, ? super Boolean, Unit> onScrubEnd, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(slotState, "slotState");
        Intrinsics.checkNotNullParameter(slotModifier, "slotModifier");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(onScrubStart, "onScrubStart");
        Intrinsics.checkNotNullParameter(onScrubMove, "onScrubMove");
        Intrinsics.checkNotNullParameter(onScrubEnd, "onScrubEnd");
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.n(slotState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3967k.n(slotModifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3967k.n(style) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC3967k.n(behavior) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= interfaceC3967k.F(onScrubStart) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= interfaceC3967k.F(onScrubMove) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= interfaceC3967k.F(onScrubEnd) ? 1048576 : 524288;
        }
        if ((4793491 & i12) == 4793490 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            SlimTimeBarDefaults.INSTANCE.TimeBarSlot(slotState, slotModifier, style, behavior, onScrubStart, onScrubMove, onScrubEnd, interfaceC3967k, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016));
        }
    }
}
