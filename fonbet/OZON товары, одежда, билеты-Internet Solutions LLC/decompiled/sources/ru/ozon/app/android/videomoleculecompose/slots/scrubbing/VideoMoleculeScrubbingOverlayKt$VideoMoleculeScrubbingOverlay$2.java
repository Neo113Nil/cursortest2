package ru.ozon.app.android.videomoleculecompose.slots.scrubbing;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeScrubbingOverlayKt$VideoMoleculeScrubbingOverlay$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $currentTimeText;
    final /* synthetic */ String $durationText;
    final /* synthetic */ boolean $isCompact;
    final /* synthetic */ boolean $isLandscape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeScrubbingOverlayKt$VideoMoleculeScrubbingOverlay$2(String str, String str2, boolean z11, boolean z12, int i11) {
        super(2);
        this.$currentTimeText = str;
        this.$durationText = str2;
        this.$isCompact = z11;
        this.$isLandscape = z12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeScrubbingOverlayKt.VideoMoleculeScrubbingOverlay(this.$currentTimeText, this.$durationText, this.$isCompact, this.$isLandscape, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
