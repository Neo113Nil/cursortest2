package com.turboimage;

import coil.Coil;
import coil.ImageLoader;
import coil.disk.DiskCache;
import coil.memory.MemoryCache;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.Headers;

/* compiled from: TurboImageModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/turboimage/TurboImageModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "imageLoader", "Lcoil/ImageLoader;", "getName", "", "prefetch", "", "sources", "Lcom/facebook/react/bridge/ReadableArray;", "cachePolicy", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "dispose", "clearMemoryCache", "clearDiskCache", "Companion", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurboImageModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "TurboImageViewManager";
    private final ReactApplicationContext context;
    private ImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TurboImageModule(ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public final void prefetch(ReadableArray sources, String cachePolicy, Promise promise) {
        final Promise promise2;
        final ReadableArray readableArray;
        ImageRequest build;
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(cachePolicy, "cachePolicy");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final Ref.IntRef intRef = new Ref.IntRef();
        ArrayList<Object> arrayList = sources.toArrayList();
        ArrayList<ImageRequest> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            Object obj2 = ((HashMap) obj).get("uri");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = ((Map) obj).get("headers");
            HashMap hashMap = obj3 instanceof HashMap ? (HashMap) obj3 : null;
            if (hashMap != null) {
                Headers.Builder builder = new Headers.Builder();
                HashMap hashMap2 = hashMap;
                ArrayList arrayList3 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                    arrayList3.add(builder.add((String) key, (String) value));
                }
                ImageRequest.Builder data = new ImageRequest.Builder(this.context).headers(builder.build()).data(str);
                final ReadableArray readableArray2 = sources;
                final Promise promise3 = promise;
                readableArray = sources;
                promise2 = promise;
                build = data.listener(new ImageRequest.Listener() { // from class: com.turboimage.TurboImageModule$prefetch$lambda$5$$inlined$listener$default$1
                    @Override // coil.request.ImageRequest.Listener
                    public void onCancel(ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onStart(ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onError(ImageRequest request, ErrorResult result) {
                        TurboImageModule.prefetch$handleRequestCount(Ref.IntRef.this, readableArray, promise2);
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onSuccess(ImageRequest request, SuccessResult result) {
                        TurboImageModule.prefetch$handleRequestCount(intRef, readableArray2, promise3);
                    }
                }).build();
            } else {
                promise2 = promise;
                ImageRequest.Builder data2 = new ImageRequest.Builder(this.context).data(str);
                final ReadableArray readableArray3 = sources;
                readableArray = sources;
                build = data2.listener(new ImageRequest.Listener() { // from class: com.turboimage.TurboImageModule$prefetch$lambda$5$$inlined$listener$default$2
                    @Override // coil.request.ImageRequest.Listener
                    public void onCancel(ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onStart(ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onError(ImageRequest request, ErrorResult result) {
                        TurboImageModule.prefetch$handleRequestCount(Ref.IntRef.this, readableArray, promise2);
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onSuccess(ImageRequest request, SuccessResult result) {
                        TurboImageModule.prefetch$handleRequestCount(intRef, readableArray3, promise2);
                    }
                }).build();
            }
            arrayList2.add(build);
            sources = readableArray;
            promise = promise2;
        }
        this.imageLoader = ImageLoaderProvider.INSTANCE.get(this.context, Intrinsics.areEqual(cachePolicy, "urlCache"));
        for (ImageRequest imageRequest : arrayList2) {
            ImageLoader imageLoader = this.imageLoader;
            if (imageLoader != null) {
                imageLoader.enqueue(imageRequest);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prefetch$handleRequestCount(Ref.IntRef intRef, ReadableArray readableArray, Promise promise) {
        intRef.element++;
        if (readableArray.size() == intRef.element) {
            promise.resolve(true);
        }
    }

    @ReactMethod
    public final void dispose(ReadableArray sources, Promise promise) {
        Disposable enqueue;
        ImageRequest build;
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ArrayList<Object> arrayList = sources.toArrayList();
        ArrayList<ImageRequest> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            Object obj2 = ((HashMap) obj).get("uri");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = ((Map) obj).get("headers");
            HashMap hashMap = obj3 instanceof HashMap ? (HashMap) obj3 : null;
            if (hashMap != null) {
                Headers.Builder builder = new Headers.Builder();
                HashMap hashMap2 = hashMap;
                ArrayList arrayList3 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                    arrayList3.add(builder.add((String) key, (String) value));
                }
                build = new ImageRequest.Builder(this.context).headers(builder.build()).data(str).build();
            } else {
                build = new ImageRequest.Builder(this.context).data(str).build();
            }
            arrayList2.add(build);
        }
        for (ImageRequest imageRequest : arrayList2) {
            ImageLoader imageLoader = this.imageLoader;
            if (imageLoader != null && (enqueue = imageLoader.enqueue(imageRequest)) != null) {
                enqueue.dispose();
            }
        }
        promise.resolve("Success");
    }

    @ReactMethod
    public final void clearMemoryCache(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        MemoryCache memoryCache = Coil.imageLoader(this.context).getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
        promise.resolve("Success");
    }

    @ReactMethod
    public final void clearDiskCache(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        DiskCache diskCache = Coil.imageLoader(this.context).getDiskCache();
        if (diskCache != null) {
            diskCache.clear();
        }
        promise.resolve("Success");
    }
}
