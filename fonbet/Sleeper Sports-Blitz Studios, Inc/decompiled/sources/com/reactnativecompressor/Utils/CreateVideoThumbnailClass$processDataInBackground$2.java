package com.reactnativecompressor.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: createVideoThumbnail.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableMap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativecompressor.Utils.CreateVideoThumbnailClass$processDataInBackground$2", f = "createVideoThumbnail.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class CreateVideoThumbnailClass$processDataInBackground$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WritableMap>, Object> {
    final /* synthetic */ String $filePath;
    final /* synthetic */ ReadableMap $options;
    final /* synthetic */ ReactContext $reactContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateVideoThumbnailClass$processDataInBackground$2(ReactContext reactContext, ReadableMap readableMap, String str, Continuation<? super CreateVideoThumbnailClass$processDataInBackground$2> continuation) {
        super(2, continuation);
        this.$reactContext = reactContext;
        this.$options = readableMap;
        this.$filePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateVideoThumbnailClass$processDataInBackground$2(this.$reactContext, this.$options, this.$filePath, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
        return ((CreateVideoThumbnailClass$processDataInBackground$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File createDirIfNotExists;
        HashMap<String, Object> hashMap;
        StringBuilder sb;
        File file;
        Bitmap bitmapAtTime;
        FileOutputStream fileOutputStream;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WeakReference weakReference = new WeakReference(this.$reactContext.getApplicationContext());
        String string = this.$options.hasKey("cacheName") ? this.$options.getString("cacheName") : "";
        Object obj2 = weakReference.get();
        Intrinsics.checkNotNull(obj2);
        String str = ((Context) obj2).getApplicationContext().getCacheDir().getAbsolutePath() + "/thumbnails";
        createDirIfNotExists = CreateVideoThumbnailClass.INSTANCE.createDirIfNotExists(str);
        String str2 = string;
        if (!TextUtils.isEmpty(str2)) {
            File file2 = new File(str, string + ".jpeg");
            if (file2.exists()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("path", "file://" + file2.getAbsolutePath());
                createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, (double) BitmapFactory.decodeFile(file2.getAbsolutePath()).getByteCount());
                createMap.putString("mime", "image/jpeg");
                createMap.putDouble("width", r0.getWidth());
                createMap.putDouble("height", r0.getHeight());
                return createMap;
            }
        }
        if (this.$options.hasKey("headers")) {
            ReadableMap map = this.$options.getMap("headers");
            Intrinsics.checkNotNull(map);
            hashMap = map.toHashMap();
            Intrinsics.checkNotNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        } else {
            hashMap = new HashMap<>();
        }
        HashMap<String, Object> hashMap2 = hashMap;
        if (TextUtils.isEmpty(str2)) {
            UUID randomUUID = UUID.randomUUID();
            sb = new StringBuilder("thumb-");
            sb.append(randomUUID);
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append(".jpeg");
        }
        String sb2 = sb.toString();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                file = new File(createDirIfNotExists, sb2);
                bitmapAtTime = CreateVideoThumbnailClass.INSTANCE.getBitmapAtTime((Context) weakReference.get(), this.$filePath, 0, hashMap2);
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmapAtTime.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("path", "file://" + file.getAbsolutePath());
            createMap2.putDouble(RRWebVideoEvent.JsonKeys.SIZE, (double) bitmapAtTime.getByteCount());
            createMap2.putString("mime", "image/jpeg");
            createMap2.putDouble("width", bitmapAtTime.getWidth());
            createMap2.putDouble("height", bitmapAtTime.getHeight());
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            return createMap2;
        } catch (Exception e2) {
            throw e2;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
