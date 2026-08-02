package ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation;

import S0.InterfaceC3967k;
import Tg.b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class StickyCellKt$StickyCell$3 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ Function1<b, Unit> $closeIfNeeded;
    final /* synthetic */ StickyCellVO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StickyCellKt$StickyCell$3(StickyCellVO stickyCellVO, Function1<? super b, Unit> function1, Function1<? super b, Unit> function12) {
        super(3);
        this.$state = stickyCellVO;
        this.$actionHandler = function1;
        this.$closeIfNeeded = function12;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        StickyCellKt.StickyCellContent(this.$state, this.$actionHandler, this.$closeIfNeeded, interfaceC3967k, 0);
    }
}
