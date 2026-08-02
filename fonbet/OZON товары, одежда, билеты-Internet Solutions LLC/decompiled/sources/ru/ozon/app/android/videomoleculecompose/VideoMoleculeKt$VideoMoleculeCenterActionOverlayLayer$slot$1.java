package ru.ozon.app.android.videomoleculecompose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineState;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeInteractionState;
import ru.ozon.app.android.videomoleculecompose.slots.centeraction.VideoMoleculeCenterActionState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$slot$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<VideoMoleculeCenterActionState, e, Function0<Unit>, InterfaceC3967k, Integer, Unit> $centerActionOverlay;
    final /* synthetic */ VideoMoleculeInteractionState $interactionState;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<VideoMoleculeIntent, Unit> $onIntent;
    final /* synthetic */ PlayerTimelineState $timelineState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoMoleculeKt$VideoMoleculeCenterActionOverlayLayer$slot$1(p<? super VideoMoleculeCenterActionState, ? super e, ? super Function0<Unit>, ? super InterfaceC3967k, ? super Integer, Unit> pVar, PlayerTimelineState playerTimelineState, VideoMoleculeInteractionState videoMoleculeInteractionState, Function1<? super VideoMoleculeIntent, Unit> function1, e eVar, int i11, int i12) {
        super(2);
        this.$centerActionOverlay = pVar;
        this.$timelineState = playerTimelineState;
        this.$interactionState = videoMoleculeInteractionState;
        this.$onIntent = function1;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VideoMoleculeKt.VideoMoleculeCenterActionOverlayLayer(this.$centerActionOverlay, this.$timelineState, this.$interactionState, this.$onIntent, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
