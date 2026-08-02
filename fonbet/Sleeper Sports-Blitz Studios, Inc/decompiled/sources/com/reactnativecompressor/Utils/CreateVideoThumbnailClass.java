package com.reactnativecompressor.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.webkit.URLUtil;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: createVideoThumbnail.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J(\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativecompressor/Utils/CreateVideoThumbnailClass;", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "create", "", "fileUrl", "", "options", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "processDataInBackground", "Lcom/facebook/react/bridge/ReactContext;", "filePath", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateVideoThumbnailClass {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ReactApplicationContext reactContext;

    public CreateVideoThumbnailClass(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @ReactMethod
    public final void create(String fileUrl, ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new CreateVideoThumbnailClass$create$1(this, fileUrl, options, promise, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processDataInBackground(ReactContext reactContext, String str, ReadableMap readableMap, Continuation<? super ReadableMap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CreateVideoThumbnailClass$processDataInBackground$2(reactContext, readableMap, str, null), continuation);
    }

    /* compiled from: createVideoThumbnail.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J8\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lcom/reactnativecompressor/Utils/CreateVideoThumbnailClass$Companion;", "", "<init>", "()V", "clearCache", "", "cacheDir", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createDirIfNotExists", "Ljava/io/File;", "path", "getBitmapAtTime", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "filePath", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "", "headers", "", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r2 == null) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void clearCache(String cacheDir, Promise promise, ReactApplicationContext reactContext) {
            File[] listFiles;
            Intrinsics.checkNotNullParameter(promise, "promise");
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            if (cacheDir != null) {
                if (cacheDir.length() <= 0) {
                    cacheDir = null;
                }
            }
            cacheDir = "/thumbnails";
            File createDirIfNotExists = createDirIfNotExists(reactContext.getApplicationContext().getCacheDir().getAbsolutePath() + cacheDir);
            if (createDirIfNotExists != null && (listFiles = createDirIfNotExists.listFiles()) != null) {
                Iterator it = ArrayIteratorKt.iterator(listFiles);
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }
            promise.resolve("done");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File createDirIfNotExists(String path) {
            File file = new File(path);
            if (file.exists()) {
                return file;
            }
            try {
                file.mkdirs();
                new File(path, ".nomedia").createNewFile();
                return file;
            } catch (IOException e) {
                e.printStackTrace();
                return file;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap getBitmapAtTime(Context context, String filePath, int time, Map<String, String> headers) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (URLUtil.isFileUrl(filePath)) {
                try {
                    filePath = URLDecoder.decode(filePath, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
                String str = filePath;
                Intrinsics.checkNotNull(str);
                mediaMetadataRetriever.setDataSource(StringsKt.replace$default(str, "file://", "", false, 4, (Object) null));
            } else {
                Intrinsics.checkNotNull(filePath);
                if (StringsKt.contains$default((CharSequence) filePath, (CharSequence) "content://", false, 2, (Object) null)) {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(filePath));
                } else {
                    mediaMetadataRetriever.setDataSource(filePath, headers);
                }
            }
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(time * 1000, 2);
            try {
                mediaMetadataRetriever.release();
                if (frameAtTime != null) {
                    return frameAtTime;
                }
                throw new IllegalStateException("File doesn't exist or not supported".toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
