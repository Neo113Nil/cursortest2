package com.blaze.blazesdk.delegates;

import androidx.annotation.Keep;
import com.blaze.blazesdk.analytics.models.BlazeAnalyticsEvent;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationRequest;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationResponse;
import com.blaze.blazesdk.shared.results.BlazeResult;
import defpackage.rq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/delegates/BlazeSDKDelegate;", "", "Lcom/blaze/blazesdk/analytics/models/BlazeAnalyticsEvent;", "eventData", "", "onEventTriggered", "(Lcom/blaze/blazesdk/analytics/models/BlazeAnalyticsEvent;)V", "Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;", "error", "onErrorThrown", "(Lcom/blaze/blazesdk/shared/results/BlazeResult$Error;)V", "Lcom/blaze/blazesdk/delegates/models/BlazePlaybackModificationRequest;", "request", "Lcom/blaze/blazesdk/delegates/models/BlazePlaybackModificationResponse;", "playbackModificationHandler", "(Lcom/blaze/blazesdk/delegates/models/BlazePlaybackModificationRequest;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeSDKDelegate {
    static /* synthetic */ Object playbackModificationHandler$suspendImpl(BlazeSDKDelegate blazeSDKDelegate, BlazePlaybackModificationRequest blazePlaybackModificationRequest, rq3<? super BlazePlaybackModificationResponse> rq3Var) {
        return BlazePlaybackModificationRequest.response$default(blazePlaybackModificationRequest, null, 1, null);
    }

    default void onErrorThrown(@NotNull BlazeResult.Error error) {
        error.getClass();
    }

    default void onEventTriggered(@NotNull BlazeAnalyticsEvent eventData) {
        eventData.getClass();
    }

    @Nullable
    default Object playbackModificationHandler(@NotNull BlazePlaybackModificationRequest blazePlaybackModificationRequest, @NotNull rq3<? super BlazePlaybackModificationResponse> rq3Var) {
        return playbackModificationHandler$suspendImpl(this, blazePlaybackModificationRequest, rq3Var);
    }
}
