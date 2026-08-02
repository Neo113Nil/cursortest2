package com.reactnativecompressor;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.reactnativecompressor.Audio.AudioMain;
import com.reactnativecompressor.Image.ImageMain;
import com.reactnativecompressor.Utils.CreateVideoThumbnailClass;
import com.reactnativecompressor.Utils.Downloader;
import com.reactnativecompressor.Utils.EventEmitterHandler;
import com.reactnativecompressor.Utils.Uploader;
import com.reactnativecompressor.Utils.Utils;
import com.reactnativecompressor.Video.VideoMain;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompressorModule.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J \u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0013H\u0017J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J \u0010#\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J \u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J \u0010+\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010,\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.H\u0017J \u0010/\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J \u00100\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u001a\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0013H\u0017J\u0010\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u000207H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/reactnativecompressor/CompressorModule;", "Lcom/reactnativecompressor/CompressorSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "imageMain", "Lcom/reactnativecompressor/Image/ImageMain;", "videoMain", "Lcom/reactnativecompressor/Video/VideoMain;", "audioMain", "Lcom/reactnativecompressor/Audio/AudioMain;", "uploader", "Lcom/reactnativecompressor/Utils/Uploader;", "videoThumbnail", "Lcom/reactnativecompressor/Utils/CreateVideoThumbnailClass;", "initialize", "", "getName", "", "image_compress", "imagePath", "optionMap", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getImageMetaData", "filePath", "compress", "fileUrl", "cancelCompression", "uuid", "activateBackgroundTask", "options", "deactivateBackgroundTask", "compress_audio", "generateFilePath", "_extension", "getRealPath", "path", "type", "getVideoMetaData", "getFileSize", UnstructuredDocViewModelExtKt.UPLOAD, "cancelUpload", "shouldCancelAll", "", "download", "createVideoThumbnail", "clearCache", "cacheDir", "addListener", "eventName", "removeListeners", "count", "", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompressorModule extends CompressorSpec {
    public static final String NAME = "Compressor";
    private final AudioMain audioMain;
    private final ImageMain imageMain;
    private final ReactApplicationContext reactContext;
    private final Uploader uploader;
    private final VideoMain videoMain;
    private final CreateVideoThumbnailClass videoThumbnail;

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void removeListeners(double count) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressorModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.imageMain = new ImageMain(reactContext);
        this.videoMain = new VideoMain(reactContext);
        this.audioMain = new AudioMain(reactContext);
        this.uploader = new Uploader(reactContext);
        this.videoThumbnail = new CreateVideoThumbnailClass(reactContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        EventEmitterHandler.INSTANCE.setReactContext(this.reactContext);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Compressor";
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void image_compress(String imagePath, ReadableMap optionMap, Promise promise) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(optionMap, "optionMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.imageMain.image_compress(imagePath, optionMap, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void getImageMetaData(String filePath, Promise promise) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.imageMain.getImageMetaData(filePath, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void compress(String fileUrl, ReadableMap optionMap, Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(optionMap, "optionMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.videoMain.compress(fileUrl, optionMap, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void cancelCompression(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.videoMain.cancelCompression(uuid);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void activateBackgroundTask(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.videoMain.activateBackgroundTask(options, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void deactivateBackgroundTask(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.videoMain.deactivateBackgroundTask(options, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void compress_audio(String fileUrl, ReadableMap optionMap, Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(optionMap, "optionMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.audioMain.compress_audio(fileUrl, optionMap, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void generateFilePath(String _extension, Promise promise) {
        Intrinsics.checkNotNullParameter(_extension, "_extension");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Utils.generateCacheFilePath(_extension, this.reactContext));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void getRealPath(String path, String type, Promise promise) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve("file://" + Utils.getRealPath(path, this.reactContext, new Object[0]));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void getVideoMetaData(String filePath, Promise promise) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.videoMain.getVideoMetaData(filePath, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void getFileSize(String filePath, Promise promise) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Utils.INSTANCE.getFileSize(filePath, promise, this.reactContext);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void upload(String fileUrl, ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.uploader.upload(fileUrl, options, this.reactContext, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void cancelUpload(String uuid, boolean shouldCancelAll) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uploader.cancelUpload(uuid, shouldCancelAll);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void download(String fileUrl, ReadableMap options, Promise promise) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (!options.hasKey("uuid")) {
            str = "";
        } else {
            str = options.getString("uuid");
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
        }
        if (options.hasKey("progressDivider")) {
            Object string = options.getString("progressDivider");
            Intrinsics.checkNotNull(string, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) string).intValue();
        } else {
            i = 0;
        }
        String downloadMediaWithProgress = Downloader.INSTANCE.downloadMediaWithProgress(fileUrl, str, i, this.reactContext);
        if (downloadMediaWithProgress != null) {
            promise.resolve(downloadMediaWithProgress);
        } else {
            promise.reject("Unable to download");
        }
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void createVideoThumbnail(String fileUrl, ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.videoThumbnail.create(fileUrl, options, promise);
    }

    @Override // com.reactnativecompressor.NativeCompressorSpec
    @ReactMethod
    public void clearCache(String cacheDir, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        CreateVideoThumbnailClass.INSTANCE.clearCache(cacheDir, promise, this.reactContext);
    }
}
