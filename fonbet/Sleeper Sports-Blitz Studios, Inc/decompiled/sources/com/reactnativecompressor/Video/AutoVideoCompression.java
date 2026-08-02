package com.reactnativecompressor.Video;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecompressor.Utils.Utils;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoVideoCompression.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ.\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lcom/reactnativecompressor/Video/AutoVideoCompression;", "", "<init>", "()V", "createCompressionSettings", "", "fileUrl", "", "options", "Lcom/reactnativecompressor/Video/VideoCompressorHelper;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "makeVideoBitrate", "", "originalHeight", "originalWidth", "originalBitrate", "height", "width", "getVideoBitrateWithFactor", "f", "", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoVideoCompression {
    public static final AutoVideoCompression INSTANCE = new AutoVideoCompression();

    private final int getVideoBitrateWithFactor(float f) {
        return (int) (f * 2000.0f * 1000.0f * 1.13f);
    }

    private AutoVideoCompression() {
    }

    public final void createCompressionSettings(String fileUrl, VideoCompressorHelper options, Promise promise, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        float maxSize = options.getMaxSize();
        float minimumFileSizeForCompress = options.getMinimumFileSizeForCompress();
        try {
            String path = Uri.parse(fileUrl).getPath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            if (new File(path).length() / 1048576 > minimumFileSizeForCompress) {
                Intrinsics.checkNotNull(reactContext);
                String generateCacheFilePath = Utils.generateCacheFilePath(RRWebVideoEvent.REPLAY_CONTAINER, reactContext);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
                Intrinsics.checkNotNull(extractMetadata);
                int parseInt = Integer.parseInt(extractMetadata);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                Intrinsics.checkNotNull(extractMetadata2);
                int parseInt2 = Integer.parseInt(extractMetadata2);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
                Intrinsics.checkNotNull(extractMetadata3);
                int parseInt3 = Integer.parseInt(extractMetadata3);
                float f = maxSize / (parseInt2 > parseInt ? parseInt2 : parseInt);
                float f2 = 2;
                int round = Math.round((parseInt2 * Math.min(f, 1.0f)) / f2) * 2;
                int round2 = Math.round((parseInt * Math.min(f, 1.0f)) / f2) * 2;
                float makeVideoBitrate = makeVideoBitrate(parseInt, parseInt2, parseInt3, round2, round);
                Intrinsics.checkNotNull(path);
                String uuid = options.getUuid();
                Intrinsics.checkNotNull(uuid);
                Integer progressDivider = options.getProgressDivider();
                Intrinsics.checkNotNull(progressDivider);
                Utils.compressVideo(path, generateCacheFilePath, round, round2, makeVideoBitrate, uuid, progressDivider.intValue(), promise, reactContext);
                return;
            }
            promise.resolve(fileUrl);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public final int makeVideoBitrate(int originalHeight, int originalWidth, int originalBitrate, int height, int width) {
        int min = (int) (((int) (originalBitrate / Math.min(originalHeight / height, originalWidth / width))) * 0.8f);
        int videoBitrateWithFactor = (int) (getVideoBitrateWithFactor(0.8f) / (921600.0f / (width * height)));
        if (originalBitrate < videoBitrateWithFactor) {
            return min;
        }
        if (min > 1669000) {
            return 1669000;
        }
        return Math.max(min, videoBitrateWithFactor);
    }
}
