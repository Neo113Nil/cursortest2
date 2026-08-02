package com.turboimage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.decode.SvgDecoder;
import coil.fetch.SourceResult;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.size.Dimension;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.CoilUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.turboimage.decoder.APNGDecoder;
import com.turboimage.events.CompletionEvent;
import com.turboimage.events.FailureEvent;
import com.turboimage.events.ProgressEvent;
import com.turboimage.events.StartEvent;
import com.turboimage.events.SuccessEvent;
import com.turboimage.events.interceptor.ProgressInterceptor;
import com.turboimage.events.interceptor.ProgressListener;
import com.turboimage.events.interceptor.ProgressRegistry;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: TurboImageViewManager.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0007J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0007J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u001dJ\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u00104\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'J\u001f\u00106\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u001dJ\u001a\u00108\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010:\u001a\u00020\u0012H\u0016J\b\u0010;\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\u0002X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/turboimage/TurboImageViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/turboimage/TurboImageView;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "<init>", "()V", "getName", "", "imageView", "isInBackground", "", "getExportedCustomDirectEventTypeConstants", "", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onAfterUpdateTransaction", "", ViewHierarchyConstants.VIEW_KEY, "onDropViewInstance", "reloadImage", "setSource", "source", "Lcom/facebook/react/bridge/ReadableMap;", "setPlaceholder", "placeholder", "setShowPlaceholderOnFailure", "showPlaceholderOnFailure", "(Lcom/turboimage/TurboImageView;Ljava/lang/Boolean;)V", "setCachePolicy", "cachePolicy", "setResizeMode", ViewProps.RESIZE_MODE, "setIndicator", "indicator", "setCrossfade", "crossfade", "", "(Lcom/turboimage/TurboImageView;Ljava/lang/Integer;)V", "setRounded", "rounded", "setBlur", ConstantsKt.BLUR, "setMonochrome", "monochrome", "setResize", "resize", "setResizeWidth", "resizeWidth", "setResizeHeight", "resizeHeight", "setTint", "tint", "setAllowHardware", "allowHardware", "setFormat", "format", "onHostResume", "onHostPause", "onHostDestroy", "Companion", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurboImageViewManager extends SimpleViewManager<TurboImageView> implements LifecycleEventListener {
    private static final String REACT_CLASS = "TurboImageView";
    private TurboImageView imageView;
    private boolean isInBackground;
    private static final Map<String, ImageView.ScaleType> RESIZE_MODE = MapsKt.mapOf(TuplesKt.to("contain", ImageView.ScaleType.FIT_CENTER), TuplesKt.to("cover", ImageView.ScaleType.CENTER_CROP), TuplesKt.to("stretch", ImageView.ScaleType.FIT_XY), TuplesKt.to("center", ImageView.ScaleType.CENTER_INSIDE));

    @ReactProp(name = "resizeHeight")
    public final void setResizeHeight(TurboImageView view, Integer resizeHeight) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @ReactProp(name = "resizeWidth")
    public final void setResizeWidth(TurboImageView view, Integer resizeWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of(StartEvent.EVENT_NAME, MapBuilder.of("registrationName", StartEvent.EVENT_NAME), ProgressEvent.EVENT_NAME, MapBuilder.of("registrationName", ProgressEvent.EVENT_NAME), SuccessEvent.EVENT_NAME, MapBuilder.of("registrationName", SuccessEvent.EVENT_NAME), FailureEvent.EVENT_NAME, MapBuilder.of("registrationName", FailureEvent.EVENT_NAME), CompletionEvent.EVENT_NAME, MapBuilder.of("registrationName", CompletionEvent.EVENT_NAME));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public TurboImageView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(this);
        TurboImageView turboImageView = new TurboImageView(reactContext);
        this.imageView = turboImageView;
        return turboImageView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(TurboImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((TurboImageViewManager) view);
        reloadImage(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(TurboImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance((TurboImageViewManager) view);
        String currentProgressId = view.getCurrentProgressId();
        if (currentProgressId != null) {
            ProgressRegistry.INSTANCE.unregister(currentProgressId);
        }
        view.setCurrentProgressId(null);
        CoilUtils.dispose(view);
    }

    private final void reloadImage(final TurboImageView view) {
        int i = (view.getThumbhashDrawable() == null && view.getBlurhashDrawable() == null) ? 100 : 0;
        String currentProgressId = view.getCurrentProgressId();
        if (currentProgressId != null) {
            ProgressRegistry.INSTANCE.unregister(currentProgressId);
        }
        final String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        view.setCurrentProgressId(uuid);
        ProgressRegistry.INSTANCE.register(uuid, new ProgressListener() { // from class: com.turboimage.TurboImageViewManager$$ExternalSyntheticLambda0
            @Override // com.turboimage.events.interceptor.ProgressListener
            public final void update(long j, long j2, boolean z) {
                TurboImageViewManager.reloadImage$lambda$4(TurboImageView.this, j, j2, z);
            }
        });
        ImageLoaderProvider imageLoaderProvider = ImageLoaderProvider.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader imageLoader = imageLoaderProvider.get(context, Intrinsics.areEqual(view.getCachePolicy(), "urlCache"));
        TurboImageView turboImageView = view;
        ImageRequest.Builder target = new ImageRequest.Builder(turboImageView.getContext()).data(view.getUri()).target(turboImageView);
        String cacheKey = view.getCacheKey();
        if (cacheKey != null) {
            target.memoryCacheKey(cacheKey);
            target.diskCacheKey(cacheKey);
        }
        Boolean allowHardware = view.getAllowHardware();
        if (allowHardware != null) {
            target.allowHardware(allowHardware.booleanValue());
        }
        target.listener(new TurboImageListener(view, new Function0() { // from class: com.turboimage.TurboImageViewManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reloadImage$lambda$16$lambda$7;
                reloadImage$lambda$16$lambda$7 = TurboImageViewManager.reloadImage$lambda$16$lambda$7(uuid, view);
                return reloadImage$lambda$16$lambda$7;
            }
        }));
        String format = view.getFormat();
        if (format != null) {
            int hashCode = format.hashCode();
            if (hashCode == 102340) {
                if (format.equals("gif")) {
                    target.decoderFactory(new Decoder.Factory() { // from class: com.turboimage.TurboImageViewManager$$ExternalSyntheticLambda3
                        @Override // coil.decode.Decoder.Factory
                        public final Decoder create(SourceResult sourceResult, Options options, ImageLoader imageLoader2) {
                            Decoder reloadImage$lambda$16$lambda$11$lambda$9;
                            reloadImage$lambda$16$lambda$11$lambda$9 = TurboImageViewManager.reloadImage$lambda$16$lambda$11$lambda$9(sourceResult, options, imageLoader2);
                            return reloadImage$lambda$16$lambda$11$lambda$9;
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            } else if (hashCode == 114276) {
                if (format.equals("svg")) {
                    target.decoderFactory(new Decoder.Factory() { // from class: com.turboimage.TurboImageViewManager$$ExternalSyntheticLambda2
                        @Override // coil.decode.Decoder.Factory
                        public final Decoder create(SourceResult sourceResult, Options options, ImageLoader imageLoader2) {
                            Decoder reloadImage$lambda$16$lambda$11$lambda$8;
                            reloadImage$lambda$16$lambda$11$lambda$8 = TurboImageViewManager.reloadImage$lambda$16$lambda$11$lambda$8(sourceResult, options, imageLoader2);
                            return reloadImage$lambda$16$lambda$11$lambda$8;
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            } else {
                if (hashCode == 3000872 && format.equals("apng")) {
                    target.decoderFactory(new Decoder.Factory() { // from class: com.turboimage.TurboImageViewManager$$ExternalSyntheticLambda4
                        @Override // coil.decode.Decoder.Factory
                        public final Decoder create(SourceResult sourceResult, Options options, ImageLoader imageLoader2) {
                            Decoder reloadImage$lambda$16$lambda$11$lambda$10;
                            reloadImage$lambda$16$lambda$11$lambda$10 = TurboImageViewManager.reloadImage$lambda$16$lambda$11$lambda$10(sourceResult, options, imageLoader2);
                            return reloadImage$lambda$16$lambda$11$lambda$10;
                        }
                    });
                }
                Unit unit22 = Unit.INSTANCE;
            }
        }
        CircularProgressDrawable thumbhashDrawable = view.getThumbhashDrawable();
        if (thumbhashDrawable == null && (thumbhashDrawable = view.getBlurhashDrawable()) == null) {
            thumbhashDrawable = view.getCircleProgressDrawable();
        }
        target.placeholder(thumbhashDrawable);
        String memoryCacheKey = view.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            target.placeholderMemoryCacheKey(memoryCacheKey);
        }
        target.transformations(view.getTransformations());
        Integer crossfade = view.getCrossfade();
        if (crossfade != null) {
            i = crossfade.intValue();
        }
        target.crossfade(i);
        Boolean showPlaceholderOnFailure = view.getShowPlaceholderOnFailure();
        if (showPlaceholderOnFailure != null) {
            showPlaceholderOnFailure.booleanValue();
            if (view.getMemoryCacheKey() != null) {
                MemoryCache memoryCache = imageLoader.getMemoryCache();
                if (memoryCache != null) {
                    String memoryCacheKey2 = view.getMemoryCacheKey();
                    Intrinsics.checkNotNull(memoryCacheKey2);
                    MemoryCache.Value value = memoryCache.get(new MemoryCache.Key(memoryCacheKey2, null, 2, null));
                    if (value != null) {
                        target.error(new BitmapDrawable(view.getContext().getResources(), value.getBitmap()));
                    }
                }
            } else {
                Drawable thumbhashDrawable2 = view.getThumbhashDrawable();
                if (thumbhashDrawable2 == null) {
                    thumbhashDrawable2 = view.getBlurhashDrawable();
                }
                target.error(thumbhashDrawable2);
            }
        }
        Size resize = view.getResize();
        if (resize != null) {
            target.size(resize);
        }
        Headers headers = view.getHeaders();
        if (headers == null) {
            headers = new Headers.Builder().build();
        }
        target.headers(headers.newBuilder().set(ProgressInterceptor.PROGRESS_ID_HEADER, uuid).build());
        imageLoader.enqueue(target.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadImage$lambda$4(TurboImageView turboImageView, long j, long j2, boolean z) {
        Context context = turboImageView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext, turboImageView.getId());
        if (eventDispatcher != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(MetricTracker.Action.COMPLETED, j);
            createMap.putDouble("total", j2);
            eventDispatcher.dispatchEvent(new ProgressEvent(UIManagerHelper.getSurfaceId(reactContext), turboImageView.getId(), createMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reloadImage$lambda$16$lambda$7(String str, TurboImageView turboImageView) {
        ProgressRegistry.INSTANCE.unregister(str);
        if (Intrinsics.areEqual(turboImageView.getCurrentProgressId(), str)) {
            turboImageView.setCurrentProgressId(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Decoder reloadImage$lambda$16$lambda$11$lambda$8(SourceResult result, Options options, ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(imageLoader, "<unused var>");
        return new SvgDecoder(result.getSource(), options, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Decoder reloadImage$lambda$16$lambda$11$lambda$9(SourceResult result, Options options, ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(imageLoader, "<unused var>");
        if (Build.VERSION.SDK_INT >= 28) {
            return new ImageDecoderDecoder(result.getSource(), options, false, 4, null);
        }
        return new GifDecoder(result.getSource(), options, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Decoder reloadImage$lambda$16$lambda$11$lambda$10(SourceResult result, Options options, ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(options, "<unused var>");
        Intrinsics.checkNotNullParameter(imageLoader, "<unused var>");
        return new APNGDecoder(result.getSource());
    }

    @ReactProp(name = "source")
    public final void setSource(TurboImageView view, ReadableMap source) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(source, "source");
        Object obj = source.toHashMap().get("uri");
        view.setUri(obj instanceof String ? (String) obj : null);
        Object obj2 = source.toHashMap().get("headers");
        HashMap hashMap = obj2 instanceof HashMap ? (HashMap) obj2 : null;
        Headers.Builder builder = new Headers.Builder();
        if (hashMap != null) {
            HashMap hashMap2 = hashMap;
            ArrayList arrayList = new ArrayList(hashMap2.size());
            for (Map.Entry entry : hashMap2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(builder.add((String) key, (String) value));
            }
        }
        view.setHeaders(builder.build());
        Object obj3 = source.toHashMap().get("cacheKey");
        view.setCacheKey(obj3 instanceof String ? (String) obj3 : null);
    }

    @ReactProp(name = "placeholder")
    public final void setPlaceholder(TurboImageView view, ReadableMap placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlurhash(placeholder != null ? placeholder.getString("blurhash") : null);
        view.setThumbhash(placeholder != null ? placeholder.getString("thumbhash") : null);
        view.setMemoryCacheKey(placeholder != null ? placeholder.getString("memoryCacheKey") : null);
    }

    @ReactProp(name = "showPlaceholderOnFailure")
    public final void setShowPlaceholderOnFailure(TurboImageView view, Boolean showPlaceholderOnFailure) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShowPlaceholderOnFailure(showPlaceholderOnFailure);
    }

    @ReactProp(name = "cachePolicy")
    public final void setCachePolicy(TurboImageView view, String cachePolicy) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCachePolicy(cachePolicy);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(TurboImageView view, String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleType(RESIZE_MODE.get(resizeMode));
    }

    @ReactProp(name = "indicator")
    public final void setIndicator(TurboImageView view, ReadableMap indicator) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (indicator != null) {
            if (!indicator.hasKey("style")) {
                view.getIndicator().put("style", "medium");
            } else {
                HashMap<String, Object> indicator2 = view.getIndicator();
                String string = indicator.getString("style");
                indicator2.put("style", string != null ? string : "medium");
            }
            if (indicator.hasKey("color")) {
                view.getIndicator().put("color", Integer.valueOf(indicator.getInt("color")));
            }
        }
    }

    @ReactProp(name = "fadeDuration")
    public final void setCrossfade(TurboImageView view, Integer crossfade) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCrossfade(crossfade);
    }

    @ReactProp(name = "rounded")
    public final void setRounded(TurboImageView view, Boolean rounded) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRounded(rounded);
    }

    @ReactProp(name = ConstantsKt.BLUR)
    public final void setBlur(TurboImageView view, Integer blur) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlur(blur);
    }

    @ReactProp(name = "monochrome")
    public final void setMonochrome(TurboImageView view, Integer monochrome) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setMonochrome(monochrome);
    }

    @ReactProp(name = "resize")
    public final void setResize(TurboImageView view, Integer resize) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resize != null) {
            resize.intValue();
            view.setResize(Sizes.Size((int) PixelUtil.toPixelFromDIP(resize.intValue()), Dimension.Undefined.INSTANCE));
        }
    }

    @ReactProp(name = "tint")
    public final void setTint(TurboImageView view, Integer tint) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTint(tint);
    }

    @ReactProp(name = "allowHardware")
    public final void setAllowHardware(TurboImageView view, Boolean allowHardware) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAllowHardware(allowHardware);
    }

    @ReactProp(name = "format")
    public final void setFormat(TurboImageView view, String format) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFormat(format);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (this.isInBackground) {
            TurboImageView turboImageView = this.imageView;
            if (turboImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                turboImageView = null;
            }
            reloadImage(turboImageView);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        TurboImageView turboImageView = this.imageView;
        TurboImageView turboImageView2 = null;
        if (turboImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            turboImageView = null;
        }
        String currentProgressId = turboImageView.getCurrentProgressId();
        if (currentProgressId != null) {
            ProgressRegistry.INSTANCE.unregister(currentProgressId);
        }
        TurboImageView turboImageView3 = this.imageView;
        if (turboImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            turboImageView3 = null;
        }
        turboImageView3.setCurrentProgressId(null);
        TurboImageView turboImageView4 = this.imageView;
        if (turboImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            turboImageView2 = turboImageView4;
        }
        CoilUtils.dispose(turboImageView2);
        this.isInBackground = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        TurboImageView turboImageView = this.imageView;
        TurboImageView turboImageView2 = null;
        if (turboImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            turboImageView = null;
        }
        String currentProgressId = turboImageView.getCurrentProgressId();
        if (currentProgressId != null) {
            ProgressRegistry.INSTANCE.unregister(currentProgressId);
        }
        TurboImageView turboImageView3 = this.imageView;
        if (turboImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            turboImageView3 = null;
        }
        turboImageView3.setCurrentProgressId(null);
        TurboImageView turboImageView4 = this.imageView;
        if (turboImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            turboImageView2 = turboImageView4;
        }
        CoilUtils.dispose(turboImageView2);
    }
}
