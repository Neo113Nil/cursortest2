package com.reactnativecompressor.Image;

import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.share.internal.ShareConstants;
import com.reactnativecompressor.Image.ImageCompressorOptions;
import com.reactnativecompressor.Utils.MediaCache;
import com.reactnativecompressor.Utils.Utils;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ImageMain.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/reactnativecompressor/Image/ImageMain;", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "image_compress", "", "imagePath", "", "optionMap", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getImageMetaData", "filePath", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageMain {
    private final ReactApplicationContext reactContext;

    public ImageMain(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final void image_compress(String imagePath, ReadableMap optionMap, Promise promise) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(optionMap, "optionMap");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            ImageCompressorOptions fromMap = ImageCompressorOptions.INSTANCE.fromMap(optionMap);
            String realPath = Utils.getRealPath(imagePath, this.reactContext, fromMap.getUuid(), fromMap.getProgressDivider());
            if (fromMap.getCompressionMethod() == ImageCompressorOptions.CompressionMethod.auto) {
                promise.resolve(ImageCompressor.INSTANCE.autoCompressImage(realPath, fromMap, this.reactContext));
            } else {
                promise.resolve(ImageCompressor.INSTANCE.manualCompressImage(realPath, fromMap, this.reactContext));
            }
            MediaCache.removeCompletedImagePath(realPath);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public final void getImageMetaData(String filePath, Promise promise) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String realPath = Utils.getRealPath(filePath, this.reactContext, new Object[0]);
            String path = Uri.parse(realPath).getPath();
            WritableMap createMap = Arguments.createMap();
            double length = new File(path).length();
            Intrinsics.checkNotNull(path);
            ExifInterface exifInterface = new ExifInterface(path);
            for (String str : Utils.INSTANCE.getExifAttributes()) {
                String attribute = exifInterface.getAttribute(str);
                if (attribute != null) {
                    createMap.putString(str, attribute);
                }
            }
            Intrinsics.checkNotNull(realPath);
            String substring = realPath.substring(StringsKt.lastIndexOf$default((CharSequence) realPath, ".", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, length);
            createMap.putString(ShareConstants.MEDIA_EXTENSION, substring);
            promise.resolve(createMap);
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
