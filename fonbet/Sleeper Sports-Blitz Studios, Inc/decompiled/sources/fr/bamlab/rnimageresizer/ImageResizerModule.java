package fr.bamlab.rnimageresizer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes9.dex */
public class ImageResizerModule extends ReactContextBaseJavaModule {
    private Context context;

    public ImageResizerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageResizerAndroid";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fr.bamlab.rnimageresizer.ImageResizerModule$1] */
    @ReactMethod
    public void createResizedImage(final String str, final int i, final int i2, final String str2, final int i3, final int i4, final String str3, final boolean z, final ReadableMap readableMap, final Callback callback, final Callback callback2) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: fr.bamlab.rnimageresizer.ImageResizerModule.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) {
                try {
                    ImageResizerModule.this.createResizedImageWithExceptions(str, i, i2, str2, i3, i4, str3, z, readableMap, callback, callback2);
                } catch (IOException e) {
                    callback2.invoke(e.getMessage());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createResizedImageWithExceptions(String str, int i, int i2, String str2, int i3, int i4, String str3, boolean z, ReadableMap readableMap, Callback callback, Callback callback2) throws IOException {
        Bitmap.CompressFormat valueOf = Bitmap.CompressFormat.valueOf(str2);
        Uri parse = Uri.parse(str);
        Bitmap createResizedImage = ImageResizer.createResizedImage(this.context, parse, i, i2, i3, i4, readableMap.getString("mode"), readableMap.getBoolean("onlyScaleDown"));
        if (createResizedImage == null) {
            throw new IOException("The image failed to be resized; invalid Bitmap result.");
        }
        File cacheDir = this.context.getCacheDir();
        if (str3 != null) {
            cacheDir = new File(str3);
        }
        File saveImage = ImageResizer.saveImage(createResizedImage, cacheDir, UUID.randomUUID().toString(), valueOf, i3);
        if (saveImage.isFile()) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("path", saveImage.getAbsolutePath());
            createMap.putString("uri", Uri.fromFile(saveImage).toString());
            createMap.putString("name", saveImage.getName());
            createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, saveImage.length());
            createMap.putDouble("width", createResizedImage.getWidth());
            createMap.putDouble("height", createResizedImage.getHeight());
            if (z) {
                try {
                    ImageResizer.copyExif(this.context, parse, saveImage.getAbsolutePath());
                } catch (Exception e) {
                    Log.e("ImageResizer::createResizedImageWithExceptions", "EXIF copy failed", e);
                }
            }
            callback.invoke(createMap);
        } else {
            callback2.invoke("Error getting resized image path");
        }
        createResizedImage.recycle();
    }
}
