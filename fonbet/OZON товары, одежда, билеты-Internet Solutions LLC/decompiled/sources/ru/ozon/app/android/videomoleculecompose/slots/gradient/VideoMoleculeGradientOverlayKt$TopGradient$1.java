package ru.ozon.app.android.videomoleculecompose.slots.gradient;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9893b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeGradientOverlayKt$TopGradient$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $height;
    final /* synthetic */ InterfaceC9893b $this_TopGradient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeGradientOverlayKt$TopGradient$1(InterfaceC9893b interfaceC9893b, float f7, int i11, int i12) {
        super(2);
        this.$this_TopGradient = interfaceC9893b;
        this.$height = f7;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeGradientOverlayKt.m1556TopGradientrAjV9yQ(this.$this_TopGradient, this.$height, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
