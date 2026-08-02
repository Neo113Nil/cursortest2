package io.radar.sdk;

import android.os.Handler;
import com.facebook.common.util.UriUtil;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarReplay;
import io.radar.sdk.util.Flushable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"io/radar/sdk/Radar$flushReplays$1", "Lio/radar/sdk/RadarApiClient$RadarReplayApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$flushReplays$1 implements RadarApiClient.RadarReplayApiCallback {
    final /* synthetic */ Radar.RadarTrackCallback $callback;
    final /* synthetic */ JSONObject $replayParams;
    final /* synthetic */ Flushable<RadarReplay> $replaysStash;

    Radar$flushReplays$1(Flushable<RadarReplay> flushable, JSONObject jSONObject, Radar.RadarTrackCallback radarTrackCallback) {
        this.$replaysStash = flushable;
        this.$replayParams = jSONObject;
        this.$callback = radarTrackCallback;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarReplayApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status == Radar.RadarStatus.SUCCESS) {
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Successfully flushed replays", null, null, 6, null);
            this.$replaysStash.onFlush(true);
            Radar.flushLogs$sdk_release();
        } else if (this.$replayParams != null) {
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Failed to flush replays, adding track update to buffer", null, null, 6, null);
            Radar.addReplay$sdk_release(this.$replayParams);
        }
        Radar.INSTANCE.setFlushingReplays$sdk_release(false);
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarTrackCallback radarTrackCallback = this.$callback;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$flushReplays$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$flushReplays$1.onComplete$lambda$0(Radar.RadarTrackCallback.this, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarTrackCallback radarTrackCallback, Radar.RadarStatus status) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (radarTrackCallback != null) {
            Radar.RadarTrackCallback.DefaultImpls.onComplete$default(radarTrackCallback, status, null, null, null, 14, null);
        }
    }
}
