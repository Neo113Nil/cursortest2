package com.turboimage;

import android.content.Context;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.turboimage.events.CompletionEvent;
import com.turboimage.events.FailureEvent;
import com.turboimage.events.StartEvent;
import com.turboimage.events.SuccessEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TurboImageListener.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/turboimage/TurboImageListener;", "Lcoil/request/ImageRequest$Listener;", ViewHierarchyConstants.VIEW_KEY, "Lcom/turboimage/TurboImageView;", "onComplete", "Lkotlin/Function0;", "", "<init>", "(Lcom/turboimage/TurboImageView;Lkotlin/jvm/functions/Function0;)V", StartEvent.EVENT_NAME, "request", "Lcoil/request/ImageRequest;", SuccessEvent.EVENT_NAME, "result", "Lcoil/request/SuccessResult;", "onError", "Lcoil/request/ErrorResult;", "onCancel", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurboImageListener implements ImageRequest.Listener {
    private final Function0<Unit> onComplete;
    private final TurboImageView view;

    public TurboImageListener(TurboImageView view, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.onComplete = function0;
    }

    public /* synthetic */ TurboImageListener(TurboImageView turboImageView, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(turboImageView, (i & 2) != 0 ? null : function0);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onStart(ImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.onStart(request);
        Context context = this.view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext, this.view.getId());
        if (eventDispatcher != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("state", "running");
            eventDispatcher.dispatchEvent(new StartEvent(UIManagerHelper.getSurfaceId(reactContext), this.view.getId(), createMap));
        }
    }

    @Override // coil.request.ImageRequest.Listener
    public void onSuccess(ImageRequest request, SuccessResult result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        super.onSuccess(request, result);
        Context context = this.view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext, this.view.getId());
        if (eventDispatcher != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("width", result.getDrawable().getIntrinsicWidth());
            createMap.putInt("height", result.getDrawable().getIntrinsicHeight());
            createMap.putString("source", request.getData().toString());
            eventDispatcher.dispatchEvent(new SuccessEvent(UIManagerHelper.getSurfaceId(reactContext), this.view.getId(), createMap));
        }
        EventDispatcher eventDispatcher2 = UIManagerHelper.getEventDispatcher(reactContext, this.view.getId());
        if (eventDispatcher2 != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("state", MetricTracker.Action.COMPLETED);
            eventDispatcher2.dispatchEvent(new CompletionEvent(UIManagerHelper.getSurfaceId(reactContext), this.view.getId(), createMap2));
        }
        Function0<Unit> function0 = this.onComplete;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // coil.request.ImageRequest.Listener
    public void onError(ImageRequest request, ErrorResult result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        super.onError(request, result);
        Context context = this.view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext, this.view.getId());
        if (eventDispatcher != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("error", result.getThrowable().getMessage());
            eventDispatcher.dispatchEvent(new FailureEvent(UIManagerHelper.getSurfaceId(reactContext), this.view.getId(), createMap));
        }
        EventDispatcher eventDispatcher2 = UIManagerHelper.getEventDispatcher(reactContext, this.view.getId());
        if (eventDispatcher2 != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("state", MetricTracker.Action.COMPLETED);
            eventDispatcher2.dispatchEvent(new CompletionEvent(UIManagerHelper.getSurfaceId(reactContext), this.view.getId(), createMap2));
        }
        Function0<Unit> function0 = this.onComplete;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // coil.request.ImageRequest.Listener
    public void onCancel(ImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.onCancel(request);
        Function0<Unit> function0 = this.onComplete;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
