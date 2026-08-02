package com.socure.docv.capturesdk.feature.scanner.data;

import android.app.Activity;
import android.widget.VideoView;
import com.socure.docv.capturesdk.core.provider.interfaces.IFrameDispatcher;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrameGenerator.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGenerator;", "", "manualCaptureOnly", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "videoView", "Landroid/widget/VideoView;", "filePath", "", "callback", "Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGeneratorCallback;", "(ZLandroid/app/Activity;Landroid/widget/VideoView;Ljava/lang/String;Lcom/socure/docv/capturesdk/feature/scanner/data/FrameGeneratorCallback;)V", "frameDispatcher", "Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameDispatcher;", "addFrameDispatcher", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrameGenerator {
    public static final int $stable = 8;
    private final Activity activity;
    private final FrameGeneratorCallback callback;
    private final String filePath;
    private IFrameDispatcher frameDispatcher;
    private final boolean manualCaptureOnly;
    private final VideoView videoView;

    public FrameGenerator(boolean z, Activity activity, VideoView videoView, String filePath, FrameGeneratorCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manualCaptureOnly = z;
        this.activity = activity;
        this.videoView = videoView;
        this.filePath = filePath;
        this.callback = callback;
    }

    public final void addFrameDispatcher(IFrameDispatcher frameDispatcher) {
        Intrinsics.checkNotNullParameter(frameDispatcher, "frameDispatcher");
        this.frameDispatcher = frameDispatcher;
    }
}
