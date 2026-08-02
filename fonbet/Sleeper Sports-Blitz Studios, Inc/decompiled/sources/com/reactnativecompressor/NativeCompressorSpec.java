package com.reactnativecompressor;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public abstract class NativeCompressorSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Compressor";

    @ReactMethod
    public abstract void activateBackgroundTask(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void cancelCompression(String str);

    @ReactMethod
    public abstract void cancelUpload(String str, boolean z);

    @ReactMethod
    public abstract void clearCache(@Nullable String str, Promise promise);

    @ReactMethod
    public abstract void compress(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void compress_audio(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void createVideoThumbnail(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void deactivateBackgroundTask(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void download(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void generateFilePath(String str, Promise promise);

    @ReactMethod
    public abstract void getFileSize(String str, Promise promise);

    @ReactMethod
    public abstract void getImageMetaData(String str, Promise promise);

    @ReactMethod
    public abstract void getRealPath(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getVideoMetaData(String str, Promise promise);

    @ReactMethod
    public abstract void image_compress(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void upload(String str, ReadableMap readableMap, Promise promise);

    public NativeCompressorSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "Compressor";
    }
}
