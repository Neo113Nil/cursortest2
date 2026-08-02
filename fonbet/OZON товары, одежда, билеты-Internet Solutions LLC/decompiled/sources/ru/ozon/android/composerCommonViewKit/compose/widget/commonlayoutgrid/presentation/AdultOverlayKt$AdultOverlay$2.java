package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9893b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdultOverlayKt$AdultOverlay$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ InterfaceC9893b $this_AdultOverlay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultOverlayKt$AdultOverlay$2(InterfaceC9893b interfaceC9893b, int i11, int i12) {
        super(2);
        this.$this_AdultOverlay = interfaceC9893b;
        this.$index = i11;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        AdultOverlayKt.AdultOverlay(this.$this_AdultOverlay, this.$index, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
