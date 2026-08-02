package ru.ozon.app.android.videomoleculecompose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.fromMedia3.PlayerTimelineState;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1 extends AbstractC7737t implements Function0<Long> {
    final /* synthetic */ PlayerTimelineState $timelineState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeKt$VideoMolecule$positionMsProvider$1$1(PlayerTimelineState playerTimelineState) {
        super(0);
        this.$timelineState = playerTimelineState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(this.$timelineState.getPositionMs());
    }
}
