package ru.ozon.app.android.video.playerV2.performance.playback;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.flags.PlayerLogVideoLoadErrorsFlag;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaybackStateManager$logPlayerErrors$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ PlaybackStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaybackStateManager$logPlayerErrors$2(PlaybackStateManager playbackStateManager) {
        super(0);
        this.this$0 = playbackStateManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FeatureService featureService;
        featureService = this.this$0.featureService;
        return Boolean.valueOf(featureService.getBooleanKey(PlayerLogVideoLoadErrorsFlag.INSTANCE));
    }
}
