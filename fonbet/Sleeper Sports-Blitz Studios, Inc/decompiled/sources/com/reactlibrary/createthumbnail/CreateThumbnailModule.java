package com.reactlibrary.createthumbnail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.commons.io.comparator.LastModifiedFileComparator;

/* loaded from: classes8.dex */
public class CreateThumbnailModule extends ReactContextBaseJavaModule {
    private final Executor executor;
    private final Handler handler;
    private final ReactApplicationContext reactContext;

    public CreateThumbnailModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newSingleThreadExecutor();
        this.handler = new Handler(Looper.getMainLooper());
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CreateThumbnail";
    }

    @ReactMethod
    public void create(final ReadableMap readableMap, final Promise promise) {
        this.executor.execute(new Runnable() { // from class: com.reactlibrary.createthumbnail.CreateThumbnailModule$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CreateThumbnailModule.this.lambda$create$2(readableMap, promise);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$2(ReadableMap readableMap, final Promise promise) {
        try {
            final ReadableMap processData = processData(readableMap);
            this.handler.post(new Runnable() { // from class: com.reactlibrary.createthumbnail.CreateThumbnailModule$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Promise.this.resolve(processData);
                }
            });
        } catch (IOException | IllegalStateException e) {
            this.handler.post(new Runnable() { // from class: com.reactlibrary.createthumbnail.CreateThumbnailModule$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Promise.this.reject("CreateThumbnail_ERROR", e);
                }
            });
        }
    }

    private ReadableMap processData(ReadableMap readableMap) throws IOException {
        String str;
        StringBuilder sb;
        String string = readableMap.hasKey("format") ? readableMap.getString("format") : "jpeg";
        String string2 = readableMap.hasKey("cacheName") ? readableMap.getString("cacheName") : "";
        String str2 = this.reactContext.getApplicationContext().getCacheDir().getAbsolutePath() + "/thumbnails";
        File createDirIfNotExists = createDirIfNotExists(str2);
        if (TextUtils.isEmpty(string2)) {
            str = "";
        } else {
            str = "";
            File file = new File(str2, string2 + "." + string);
            if (file.exists()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("path", "file://" + file.getAbsolutePath());
                Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, (double) decodeFile.getByteCount());
                createMap.putString("mime", "image/" + string);
                createMap.putDouble("width", (double) decodeFile.getWidth());
                createMap.putDouble("height", (double) decodeFile.getHeight());
                return createMap;
            }
        }
        String string3 = readableMap.hasKey("url") ? readableMap.getString("url") : str;
        int i = readableMap.hasKey("dirSize") ? readableMap.getInt("dirSize") : 100;
        int i2 = readableMap.hasKey("timeStamp") ? readableMap.getInt("timeStamp") : 0;
        int i3 = readableMap.hasKey(ViewProps.MAX_WIDTH) ? readableMap.getInt(ViewProps.MAX_WIDTH) : 512;
        int i4 = readableMap.hasKey(ViewProps.MAX_HEIGHT) ? readableMap.getInt(ViewProps.MAX_HEIGHT) : 512;
        boolean z = readableMap.hasKey("onlySyncedFrames") ? readableMap.getBoolean("onlySyncedFrames") : true;
        HashMap<String, Object> hashMap = readableMap.hasKey("headers") ? readableMap.getMap("headers").toHashMap() : new HashMap<>();
        if (TextUtils.isEmpty(string2)) {
            sb = new StringBuilder("thumb-");
            sb.append(UUID.randomUUID().toString());
        } else {
            sb = new StringBuilder();
            sb.append(string2);
            sb.append(".");
            sb.append(string);
        }
        File file2 = new File(createDirIfNotExists, sb.toString());
        Bitmap bitmapAtTime = getBitmapAtTime(this.reactContext, string3, i2, i3, i4, z, hashMap);
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        if (string.equals("png")) {
            bitmapAtTime.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } else {
            bitmapAtTime.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        long j = i * 1048576;
        if (bitmapAtTime.getByteCount() + getDirSize(createDirIfNotExists) > j) {
            cleanDir(createDirIfNotExists, j / 2);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("path", "file://" + file2.getAbsolutePath());
        createMap2.putDouble(RRWebVideoEvent.JsonKeys.SIZE, (double) bitmapAtTime.getByteCount());
        createMap2.putString("mime", "image/" + string);
        createMap2.putDouble("width", (double) bitmapAtTime.getWidth());
        createMap2.putDouble("height", (double) bitmapAtTime.getHeight());
        return createMap2;
    }

    private static void cleanDir(File file, long j) {
        File[] listFiles = file.listFiles();
        Arrays.sort(listFiles, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);
        long j2 = 0;
        for (File file2 : listFiles) {
            j2 += file2.length();
            file2.delete();
            if (j2 >= j) {
                return;
            }
        }
    }

    private static File createDirIfNotExists(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        try {
            file.mkdirs();
            new File(str, ".nomedia").createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return file;
        }
    }

    private static Bitmap getBitmapAtTime(Context context, String str, int i, int i2, int i3, boolean z, Map map) throws IOException, IllegalStateException {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (URLUtil.isFileUrl(str)) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
            mediaMetadataRetriever.setDataSource(str.replace("file://", ""));
        } else if (str.contains("content://")) {
            mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
        } else {
            mediaMetadataRetriever.setDataSource(str, (Map<String, String>) map);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(i * 1000, 2, i2, i3);
        } else {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(i * 1000, 2);
            if (frameAtTime != null) {
                frameAtTime = Bitmap.createScaledBitmap(frameAtTime, i2, i3, true);
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new IllegalStateException("File doesn't exist or not supported");
    }

    private static long getDirSize(File file) {
        long j = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                j += file2.length();
            }
        }
        return j;
    }
}
