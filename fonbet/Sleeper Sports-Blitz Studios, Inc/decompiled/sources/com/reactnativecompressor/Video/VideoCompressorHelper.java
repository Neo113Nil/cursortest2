package com.reactnativecompressor.Video;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativecompressor.Utils.EventEmitterHandler;
import com.reactnativecompressor.Utils.Utils;
import com.reactnativecompressor.Video.VideoCompressorHelper;
import io.sentry.SpanContext;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoCompressorHelper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006%"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressorHelper;", "", "<init>", "()V", "compressionMethod", "Lcom/reactnativecompressor/Video/VideoCompressorHelper$CompressionMethod;", "getCompressionMethod", "()Lcom/reactnativecompressor/Video/VideoCompressorHelper$CompressionMethod;", "setCompressionMethod", "(Lcom/reactnativecompressor/Video/VideoCompressorHelper$CompressionMethod;)V", "bitrate", "", "getBitrate", "()F", "setBitrate", "(F)V", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "getMaxSize", "setMaxSize", "progressDivider", "", "getProgressDivider", "()Ljava/lang/Integer;", "setProgressDivider", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "minimumFileSizeForCompress", "getMinimumFileSizeForCompress", "setMinimumFileSizeForCompress", "CompressionMethod", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VideoCompressorHelper {
    private static ReactApplicationContext _reactContext;
    private static String backgroundId;
    private static Handler handler;
    private static PowerManager powerManager;
    private static Runnable runnable;
    private static PowerManager.WakeLock wakeLock;
    private float bitrate;
    private float minimumFileSizeForCompress;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LifecycleEventListener listener = new LifecycleEventListener() { // from class: com.reactnativecompressor.Video.VideoCompressorHelper$Companion$listener$1
        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            String str;
            PowerManager.WakeLock wakeLock2 = VideoCompressorHelper.wakeLock;
            Intrinsics.checkNotNull(wakeLock2);
            if (wakeLock2.isHeld()) {
                PowerManager.WakeLock wakeLock3 = VideoCompressorHelper.wakeLock;
                Intrinsics.checkNotNull(wakeLock3);
                wakeLock3.release();
                EventEmitterHandler.Companion companion = EventEmitterHandler.INSTANCE;
                str = VideoCompressorHelper.backgroundId;
                companion.emitBackgroundTaskExpired(str);
            }
        }
    };
    private CompressionMethod compressionMethod = CompressionMethod.auto;
    private String uuid = "";
    private float maxSize = 640.0f;
    private Integer progressDivider = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCompressorHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressorHelper$CompressionMethod;", "", "<init>", "(Ljava/lang/String;I)V", "auto", SpanContext.DEFAULT_ORIGIN, "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompressionMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CompressionMethod[] $VALUES;
        public static final CompressionMethod auto = new CompressionMethod("auto", 0);
        public static final CompressionMethod manual = new CompressionMethod(SpanContext.DEFAULT_ORIGIN, 1);

        private static final /* synthetic */ CompressionMethod[] $values() {
            return new CompressionMethod[]{auto, manual};
        }

        public static EnumEntries<CompressionMethod> getEntries() {
            return $ENTRIES;
        }

        private CompressionMethod(String str, int i) {
        }

        static {
            CompressionMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static CompressionMethod valueOf(String str) {
            return (CompressionMethod) Enum.valueOf(CompressionMethod.class, str);
        }

        public static CompressionMethod[] values() {
            return (CompressionMethod[]) $VALUES.clone();
        }
    }

    public final CompressionMethod getCompressionMethod() {
        return this.compressionMethod;
    }

    public final void setCompressionMethod(CompressionMethod compressionMethod) {
        Intrinsics.checkNotNullParameter(compressionMethod, "<set-?>");
        this.compressionMethod = compressionMethod;
    }

    public final float getBitrate() {
        return this.bitrate;
    }

    public final void setBitrate(float f) {
        this.bitrate = f;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final float getMaxSize() {
        return this.maxSize;
    }

    public final void setMaxSize(float f) {
        this.maxSize = f;
    }

    public final Integer getProgressDivider() {
        return this.progressDivider;
    }

    public final void setProgressDivider(Integer num) {
        this.progressDivider = num;
    }

    public final float getMinimumFileSizeForCompress() {
        return this.minimumFileSizeForCompress;
    }

    public final void setMinimumFileSizeForCompress(float f) {
        this.minimumFileSizeForCompress = f;
    }

    /* compiled from: VideoCompressorHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014J*\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J.\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressorHelper$Companion;", "", "<init>", "()V", "_reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "backgroundId", "", "handler", "Landroid/os/Handler;", "runnable", "Ljava/lang/Runnable;", "powerManager", "Landroid/os/PowerManager;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/bridge/LifecycleEventListener;", "video_activateBackgroundTask_helper", "options", "Lcom/facebook/react/bridge/ReadableMap;", "reactContext", "video_deactivateBackgroundTask_helper", "fromMap", "Lcom/reactnativecompressor/Video/VideoCompressorHelper;", "map", "VideoCompressManual", "", "fileUrl", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "VideoCompressAuto", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void video_activateBackgroundTask_helper$lambda$0() {
        }

        private Companion() {
        }

        public final String video_activateBackgroundTask_helper(ReadableMap options, ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            VideoCompressorHelper._reactContext = reactContext;
            VideoCompressorHelper.backgroundId = UUID.randomUUID().toString();
            Object systemService = reactContext.getSystemService("power");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            VideoCompressorHelper.powerManager = (PowerManager) systemService;
            PowerManager powerManager = VideoCompressorHelper.powerManager;
            Intrinsics.checkNotNull(powerManager);
            VideoCompressorHelper.wakeLock = powerManager.newWakeLock(1, "bg_wakelock");
            reactContext.addLifecycleEventListener(VideoCompressorHelper.listener);
            PowerManager.WakeLock wakeLock = VideoCompressorHelper.wakeLock;
            Intrinsics.checkNotNull(wakeLock);
            if (!wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = VideoCompressorHelper.wakeLock;
                Intrinsics.checkNotNull(wakeLock2);
                wakeLock2.acquire();
            }
            VideoCompressorHelper.handler = new Handler();
            VideoCompressorHelper.runnable = new Runnable() { // from class: com.reactnativecompressor.Video.VideoCompressorHelper$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCompressorHelper.Companion.video_activateBackgroundTask_helper$lambda$0();
                }
            };
            Handler handler = VideoCompressorHelper.handler;
            Intrinsics.checkNotNull(handler);
            Runnable runnable = VideoCompressorHelper.runnable;
            Intrinsics.checkNotNull(runnable);
            handler.post(runnable);
            return "";
        }

        public final String video_deactivateBackgroundTask_helper(ReadableMap options, ReactApplicationContext reactContext) {
            PowerManager.WakeLock wakeLock = VideoCompressorHelper.wakeLock;
            Intrinsics.checkNotNull(wakeLock);
            if (wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = VideoCompressorHelper.wakeLock;
                Intrinsics.checkNotNull(wakeLock2);
                wakeLock2.release();
            }
            if (VideoCompressorHelper.handler != null) {
                Handler handler = VideoCompressorHelper.handler;
                Intrinsics.checkNotNull(handler);
                Runnable runnable = VideoCompressorHelper.runnable;
                Intrinsics.checkNotNull(runnable);
                handler.removeCallbacks(runnable);
            }
            VideoCompressorHelper.backgroundId = "";
            return "";
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final VideoCompressorHelper fromMap(ReadableMap map) {
            Intrinsics.checkNotNullParameter(map, "map");
            VideoCompressorHelper videoCompressorHelper = new VideoCompressorHelper();
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (nextKey.hashCode()) {
                    case -102270099:
                        if (!nextKey.equals("bitrate")) {
                            break;
                        } else {
                            videoCompressorHelper.setBitrate((float) map.getDouble(nextKey));
                            break;
                        }
                    case 3601339:
                        if (!nextKey.equals("uuid")) {
                            break;
                        } else {
                            videoCompressorHelper.setUuid(map.getString(nextKey));
                            break;
                        }
                    case 291107303:
                        if (!nextKey.equals("compressionMethod")) {
                            break;
                        } else {
                            String string = map.getString(nextKey);
                            Intrinsics.checkNotNull(string);
                            videoCompressorHelper.setCompressionMethod(CompressionMethod.valueOf(string));
                            break;
                        }
                    case 583437356:
                        if (!nextKey.equals("progressDivider")) {
                            break;
                        } else {
                            videoCompressorHelper.setProgressDivider(Integer.valueOf(map.getInt(nextKey)));
                            break;
                        }
                    case 844081029:
                        if (!nextKey.equals(SDKConstants.PARAM_CONTEXT_MAX_SIZE)) {
                            break;
                        } else {
                            videoCompressorHelper.setMaxSize((float) map.getDouble(nextKey));
                            break;
                        }
                    case 1180564608:
                        if (!nextKey.equals("minimumFileSizeForCompress")) {
                            break;
                        } else {
                            videoCompressorHelper.setMinimumFileSizeForCompress((float) map.getDouble(nextKey));
                            break;
                        }
                }
            }
            return videoCompressorHelper;
        }

        public final void VideoCompressManual(String fileUrl, VideoCompressorHelper options, Promise promise, ReactApplicationContext reactContext) {
            Promise promise2;
            Exception exc;
            String path;
            String generateCacheFilePath;
            int i;
            int i2;
            float bitrate;
            String uuid;
            Integer progressDivider;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(promise, "promise");
            try {
                path = Uri.parse(fileUrl).getPath();
                Intrinsics.checkNotNull(reactContext);
                generateCacheFilePath = Utils.generateCacheFilePath(RRWebVideoEvent.REPLAY_CONTAINER, reactContext);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(path);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
                Intrinsics.checkNotNull(extractMetadata);
                int parseInt = Integer.parseInt(extractMetadata);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                Intrinsics.checkNotNull(extractMetadata2);
                int parseInt2 = Integer.parseInt(extractMetadata2);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
                Intrinsics.checkNotNull(extractMetadata3);
                int parseInt3 = Integer.parseInt(extractMetadata3);
                boolean z = parseInt > parseInt2;
                int maxSize = (int) options.getMaxSize();
                if (z && parseInt > maxSize) {
                    i2 = (int) ((maxSize / parseInt) * parseInt2);
                    i = maxSize;
                } else if (parseInt2 > maxSize) {
                    i = (int) ((maxSize / parseInt2) * parseInt);
                    i2 = maxSize;
                } else {
                    if (options.getBitrate() == 0.0f) {
                        try {
                            options.setBitrate((int) (parseInt3 * 0.8d));
                        } catch (Exception e) {
                            exc = e;
                            promise2 = promise;
                            promise2.reject(exc);
                        }
                    }
                    i = parseInt;
                    i2 = parseInt2;
                }
                bitrate = options.getBitrate() > 0.0f ? options.getBitrate() : (float) (i * i2 * 1.5d);
                Intrinsics.checkNotNull(path);
                uuid = options.getUuid();
                Intrinsics.checkNotNull(uuid);
                progressDivider = options.getProgressDivider();
                Intrinsics.checkNotNull(progressDivider);
                promise2 = promise;
            } catch (Exception e2) {
                e = e2;
                promise2 = promise;
            }
            try {
                Utils.compressVideo(path, generateCacheFilePath, i2, i, bitrate, uuid, progressDivider.intValue(), promise2, reactContext);
            } catch (Exception e3) {
                e = e3;
                exc = e;
                promise2.reject(exc);
            }
        }

        public final void VideoCompressAuto(String fileUrl, VideoCompressorHelper options, Promise promise, ReactApplicationContext reactContext) {
            AutoVideoCompression autoVideoCompression = AutoVideoCompression.INSTANCE;
            Intrinsics.checkNotNull(options);
            Intrinsics.checkNotNull(promise);
            autoVideoCompression.createCompressionSettings(fileUrl, options, promise, reactContext);
        }
    }
}
