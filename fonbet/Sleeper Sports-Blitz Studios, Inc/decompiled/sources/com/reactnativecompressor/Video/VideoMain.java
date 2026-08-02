package com.reactnativecompressor.Video;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.share.internal.ShareConstants;
import com.reactnativecompressor.Utils.Utils;
import com.reactnativecompressor.Video.VideoCompressorHelper;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: VideoMain.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/reactnativecompressor/Video/VideoMain;", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "compress", "", "fileUrl", "", "optionMap", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "cancelCompression", "uuid", "activateBackgroundTask", "options", "deactivateBackgroundTask", "getVideoMetaData", "filePath", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VideoMain {
    private final ReactApplicationContext reactContext;

    public VideoMain(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final void compress(String fileUrl, ReadableMap optionMap, Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(optionMap, "optionMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        VideoCompressorHelper fromMap = VideoCompressorHelper.INSTANCE.fromMap(optionMap);
        String realPath = Utils.getRealPath(fileUrl, this.reactContext, fromMap.getUuid(), fromMap.getProgressDivider());
        if (fromMap.getCompressionMethod() == VideoCompressorHelper.CompressionMethod.auto) {
            VideoCompressorHelper.INSTANCE.VideoCompressAuto(realPath, fromMap, promise, this.reactContext);
        } else {
            VideoCompressorHelper.INSTANCE.VideoCompressManual(realPath, fromMap, promise, this.reactContext);
        }
    }

    public final void cancelCompression(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Utils.INSTANCE.cancelCompressionHelper(uuid);
        Log.d("cancelCompression", uuid);
    }

    public final void activateBackgroundTask(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(VideoCompressorHelper.INSTANCE.video_activateBackgroundTask_helper(options, this.reactContext));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public final void deactivateBackgroundTask(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(VideoCompressorHelper.INSTANCE.video_deactivateBackgroundTask_helper(options, this.reactContext));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public final void getVideoMetaData(String filePath, Promise promise) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String realPath = Utils.getRealPath(filePath, this.reactContext, new Object[0]);
            String path = Uri.parse(realPath).getPath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            double length = new File(path).length();
            String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
            Intrinsics.checkNotNull(extractMetadata);
            int parseInt = Integer.parseInt(extractMetadata);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            Intrinsics.checkNotNull(extractMetadata2);
            int parseInt2 = Integer.parseInt(extractMetadata2);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            Intrinsics.checkNotNull(extractMetadata3);
            double parseDouble = Double.parseDouble(extractMetadata3);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(5);
            Intrinsics.checkNotNull(realPath);
            String substring = realPath.substring(StringsKt.lastIndexOf$default((CharSequence) realPath, ".", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, length);
            createMap.putInt("width", parseInt2);
            createMap.putInt("height", parseInt);
            createMap.putDouble("duration", parseDouble / 1000);
            createMap.putString(ShareConstants.MEDIA_EXTENSION, substring);
            createMap.putString("creationTime", String.valueOf(extractMetadata4));
            promise.resolve(createMap);
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
