package com.facebook.react.modules.image;

import C7.C1055t;
import H6.a;
import H7.e;
import M6.c;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.drawee.backends.pipeline.d;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.image.ReactCallerContextFactory;
import com.facebook.react.views.imagehelper.ImageSource;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "LC7/t;", "imagePipeline", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;LC7/t;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "", "requestId", "LM6/c;", "Ljava/lang/Void;", "request", "", "registerRequest", "(ILM6/c;)V", "removeRequest", "(I)LM6/c;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "LC7/t;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "getCallerContext", "()Ljava/lang/Object;", EventKeys.VALUE_KEY, "getImagePipeline", "()LC7/t;", "setImagePipeline", "(LC7/t;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoaderModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoaderModule.kt\ncom/facebook/react/modules/image/ImageLoaderModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
/* loaded from: classes2.dex */
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {

    @NotNull
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";

    @NotNull
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";

    @NotNull
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";

    @NotNull
    public static final String NAME = "ImageLoader";

    @Nullable
    private C1055t _imagePipeline;

    @Nullable
    private final Object callerContext;

    @Nullable
    private ReactCallerContextFactory callerContextFactory;

    @NotNull
    private final Object enqueuedRequestMonitor;

    @NotNull
    private final SparseArray<c> enqueuedRequests;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        Object orCreateCallerContext;
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        return (reactCallerContextFactory == null || (orCreateCallerContext = reactCallerContextFactory.getOrCreateCallerContext("", "")) == null) ? this.callerContext : orCreateCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1055t getImagePipeline() {
        C1055t c1055t = this._imagePipeline;
        if (c1055t != null) {
            return c1055t;
        }
        C1055t a10 = d.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getImagePipeline(...)");
        return a10;
    }

    private final void registerRequest(int requestId, c request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c removeRequest(int requestId) {
        c cVar;
        synchronized (this.enqueuedRequestMonitor) {
            cVar = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return cVar;
    }

    private final void setImagePipeline(C1055t c1055t) {
        this._imagePipeline = c1055t;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        c removeRequest = removeRequest((int) requestId);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(@Nullable String uriString, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        b a10 = com.facebook.imagepipeline.request.c.x(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        getImagePipeline().k(a10, getCallerContext()).g(new M6.b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSize$dataSubscriber$1
            @Override // M6.b
            public void onFailureImpl(c dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Promise.this.reject("E_GET_SIZE_FAILURE", dataSource.f());
            }

            @Override // M6.b
            public void onNewResultImpl(c dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.d()) {
                    a aVar = (a) dataSource.getResult();
                    try {
                        if (aVar == null) {
                            Promise.this.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            return;
                        }
                        Object z02 = aVar.z0();
                        Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
                        e eVar = (e) z02;
                        WritableMap createMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                        readableMapBuilder.put("width", eVar.getWidth());
                        readableMapBuilder.put("height", eVar.getHeight());
                        Promise.this.resolve(createMap);
                    } catch (Exception e10) {
                        Promise.this.reject("E_GET_SIZE_FAILURE", e10);
                    } finally {
                        a.U(aVar);
                    }
                }
            }
        }, B6.a.d());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(@Nullable String uriString, @Nullable ReadableMap headers, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        com.facebook.imagepipeline.request.c x10 = com.facebook.imagepipeline.request.c.x(new ImageSource(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri());
        Intrinsics.checkNotNullExpressionValue(x10, "newBuilderWithSource(...)");
        getImagePipeline().k(ReactNetworkImageRequest.Companion.fromBuilderWithHeaders$default(ReactNetworkImageRequest.INSTANCE, x10, headers, null, 4, null), getCallerContext()).g(new M6.b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$getSizeWithHeaders$dataSubscriber$1
            @Override // M6.b
            public void onFailureImpl(c dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                Promise.this.reject("E_GET_SIZE_FAILURE", dataSource.f());
            }

            @Override // M6.b
            public void onNewResultImpl(c dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.d()) {
                    a aVar = (a) dataSource.getResult();
                    try {
                        if (aVar == null) {
                            Promise.this.reject("E_GET_SIZE_FAILURE", "Failed to get the size of the image");
                            return;
                        }
                        Object z02 = aVar.z0();
                        Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
                        e eVar = (e) z02;
                        WritableMap createMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                        readableMapBuilder.put("width", eVar.getWidth());
                        readableMapBuilder.put("height", eVar.getHeight());
                        Promise.this.resolve(createMap);
                    } catch (Exception e10) {
                        Promise.this.reject("E_GET_SIZE_FAILURE", e10);
                    } finally {
                        a.U(aVar);
                    }
                }
            }
        }, B6.a.d());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c valueAt = this.enqueuedRequests.valueAt(i10);
                    Intrinsics.checkNotNullExpressionValue(valueAt, "valueAt(...)");
                    valueAt.close();
                }
                this.enqueuedRequests.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(@Nullable String uriString, double requestIdAsDouble, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final int i10 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        b a10 = com.facebook.imagepipeline.request.c.x(Uri.parse(uriString)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        c C10 = getImagePipeline().C(a10, getCallerContext());
        M6.b bVar = new M6.b() { // from class: com.facebook.react.modules.image.ImageLoaderModule$prefetchImage$prefetchSubscriber$1
            @Override // M6.b
            public void onFailureImpl(c dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                try {
                    ImageLoaderModule.this.removeRequest(i10);
                    promise.reject("E_PREFETCH_FAILURE", dataSource.f());
                } finally {
                    dataSource.close();
                }
            }

            @Override // M6.b
            public void onNewResultImpl(c dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                if (dataSource.d()) {
                    try {
                        ImageLoaderModule.this.removeRequest(i10);
                        promise.resolve(Boolean.TRUE);
                    } catch (Exception e10) {
                        promise.reject("E_PREFETCH_FAILURE", e10);
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i10, C10);
        C10.g(bVar, B6.a.d());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(@NotNull final ReadableArray uris, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        new GuardedAsyncTask<Void, Void>(this, uris, reactApplicationContext) { // from class: com.facebook.react.modules.image.ImageLoaderModule$queryCache$1
            final /* synthetic */ ReadableArray $uris;
            final /* synthetic */ ImageLoaderModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(reactApplicationContext);
                Intrinsics.checkNotNull(reactApplicationContext);
            }

            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... params) {
                C1055t imagePipeline;
                Intrinsics.checkNotNullParameter(params, "params");
                ImageLoaderModule imageLoaderModule = this.this$0;
                ReadableArray readableArray = this.$uris;
                WritableMap createMap = Arguments.createMap();
                ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(createMap);
                imagePipeline = imageLoaderModule.getImagePipeline();
                int size = readableArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String string = readableArray.getString(i10);
                    if (string != null && string.length() != 0) {
                        Uri parse = Uri.parse(string);
                        if (imagePipeline.u(parse)) {
                            readableMapBuilder.put(string, "memory");
                        } else if (imagePipeline.w(parse)) {
                            readableMapBuilder.put(string, "disk");
                        }
                    }
                }
                Promise.this.resolve(createMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @Nullable Object obj) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(@NotNull ReactApplicationContext reactContext, @NotNull C1055t imagePipeline, @NotNull ReactCallerContextFactory callerContextFactory) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(imagePipeline, "imagePipeline");
        Intrinsics.checkNotNullParameter(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContextFactory = callerContextFactory;
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }
}
