package ru.ozon.app.android.videomoleculecompose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeInteractionState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMoleculeEffects$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ VideoMoleculeInteractionState $interactionState;
    final /* synthetic */ boolean $showPlay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeKt$VideoMoleculeEffects$3(VideoMoleculeInteractionState videoMoleculeInteractionState, boolean z11, int i11) {
        super(2);
        this.$interactionState = videoMoleculeInteractionState;
        this.$showPlay = z11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeKt.VideoMoleculeEffects(this.$interactionState, this.$showPlay, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
