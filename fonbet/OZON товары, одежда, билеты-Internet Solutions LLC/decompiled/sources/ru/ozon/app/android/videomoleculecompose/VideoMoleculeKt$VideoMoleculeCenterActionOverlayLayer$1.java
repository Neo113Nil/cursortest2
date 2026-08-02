package ru.ozon.app.android.videomoleculecompose;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$1 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ VideoMoleculeCenterActionState $centerActionState;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ p<VideoMoleculeCenterActionState, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $slot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$1(p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, VideoMoleculeCenterActionState videoMoleculeCenterActionState, Function0<Unit> function0) {
        super(3);
        this.$slot = pVar;
        this.$centerActionState = videoMoleculeCenterActionState;
        this.$onClick = function0;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        this.$slot.invoke(this.$centerActionState, a0.d(e.f40358c0), this.$onClick, interfaceC3967k, 48);
    }
}
