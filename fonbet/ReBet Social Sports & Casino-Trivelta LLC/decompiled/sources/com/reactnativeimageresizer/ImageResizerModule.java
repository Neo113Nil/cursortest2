package com.reactnativeimageresizer;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes4.dex */
public class ImageResizerModule extends ImageResizerSpec {
    public static final String NAME = "ImageResizer";

    public class a extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41400a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f41401b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double f41402c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f41403d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f41404e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Double f41405f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f41406g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Boolean f41407h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ WritableMap f41408i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Promise f41409j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, String str, double d10, double d11, String str2, double d12, Double d13, String str3, Boolean bool, WritableMap writableMap, Promise promise) {
            super(reactContext);
            this.f41400a = str;
            this.f41401b = d10;
            this.f41402c = d11;
            this.f41403d = str2;
            this.f41404e = d12;
            this.f41405f = d13;
            this.f41406g = str3;
            this.f41407h = bool;
            this.f41408i = writableMap;
            this.f41409j = promise;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                this.f41409j.resolve(ImageResizerModule.this.createResizedImageWithExceptions(this.f41400a, (int) this.f41401b, (int) this.f41402c, this.f41403d, (int) this.f41404e, this.f41405f.intValue(), this.f41406g, this.f41407h.booleanValue(), this.f41408i));
            } catch (IOException e10) {
                this.f41409j.reject(e10);
            }
        }
    }

    public ImageResizerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"LongLogTag"})
    public Object createResizedImageWithExceptions(String str, int i10, int i11, String str2, int i12, int i13, String str3, boolean z10, ReadableMap readableMap) {
        Bitmap.CompressFormat valueOf = Bitmap.CompressFormat.valueOf(str2);
        Uri parse = Uri.parse(str);
        Bitmap c10 = com.reactnativeimageresizer.a.c(getReactApplicationContext(), parse, i10, i11, i12, i13, readableMap.getString("mode"), readableMap.getBoolean("onlyScaleDown"));
        if (c10 == null) {
            throw new IOException("The image failed to be resized; invalid Bitmap result.");
        }
        File cacheDir = getReactApplicationContext().getCacheDir();
        if (str3 != null) {
            cacheDir = new File(str3);
        }
        File m10 = com.reactnativeimageresizer.a.m(c10, cacheDir, UUID.randomUUID().toString(), valueOf, i12);
        WritableMap createMap = Arguments.createMap();
        if (!m10.isFile()) {
            throw new IOException("Error getting resized image path");
        }
        createMap.putString("path", m10.getAbsolutePath());
        createMap.putString("uri", Uri.fromFile(m10).toString());
        createMap.putString("name", m10.getName());
        createMap.putDouble("size", m10.length());
        createMap.putDouble("width", c10.getWidth());
        createMap.putDouble("height", c10.getHeight());
        if (z10) {
            try {
                com.reactnativeimageresizer.a.b(getReactApplicationContext(), parse, m10.getAbsolutePath());
            } catch (Exception e10) {
                Log.e("ImageResizer::createResizedImageWithExceptions", "EXIF copy failed", e10);
            }
        }
        c10.recycle();
        return createMap;
    }

    @Override // com.reactnativeimageresizer.NativeImageResizerSpec
    @ReactMethod
    public void createResizedImage(String str, double d10, double d11, String str2, double d12, String str3, boolean z10, Double d13, String str4, Boolean bool, Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("mode", str3);
        createMap.putBoolean("onlyScaleDown", z10);
        new a(getReactApplicationContext(), str, d10, d11, str2, d12, d13, str4, bool, createMap, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.reactnativeimageresizer.NativeImageResizerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ImageResizer";
    }
}
