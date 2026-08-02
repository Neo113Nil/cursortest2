package ru.ozon.app.android.video.playerV2.performance.playback;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.player.flags.LvsPerfLoadVideoTrackingEnabledFlag;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaybackAnalyticsSender$loadVideoTrackingEnabled$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ PlaybackAnalyticsSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaybackAnalyticsSender$loadVideoTrackingEnabled$2(PlaybackAnalyticsSender playbackAnalyticsSender) {
        super(0);
        this.this$0 = playbackAnalyticsSender;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FeatureChecker featureChecker;
        featureChecker = this.this$0.featureChecker;
        return Boolean.valueOf(featureChecker.isEnabled(LvsPerfLoadVideoTrackingEnabledFlag.INSTANCE));
    }
}
