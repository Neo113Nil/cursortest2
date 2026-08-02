package com.giphyreactnativesdk;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import Ph.P;
import V8.U;
import a9.e;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import com.twilio.voice.EventGroupType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractActivityC5481c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\t\u0018\u0000 '2\u00020\u0001:\u0001(B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphyDialogModule;", "Lcom/giphyreactnativesdk/RTNGiphyDialogModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "initializeDialog", "()V", "com/giphyreactnativesdk/RTNGiphyDialogModule$b", "getGifSelectionListener", "()Lcom/giphyreactnativesdk/RTNGiphyDialogModule$b;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "sendEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "configure", "(Lcom/facebook/react/bridge/ReadableMap;)V", "show", "hide", "eventType", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "Lcom/giphy/sdk/ui/GPHSettings;", EventGroupType.SETTINGS_GROUP, "Lcom/giphy/sdk/ui/GPHSettings;", "LV8/U;", "gifsDialog", "LV8/U;", "Companion", "a", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTNGiphyDialogModule extends RTNGiphyDialogModuleSpec {

    @NotNull
    public static final String NAME = "RTNGiphyDialogModule";

    @Nullable
    private U gifsDialog;

    @NotNull
    private GPHSettings settings;

    public static final class b implements U.b {
        public b() {
        }

        @Override // V8.U.b
        public void a(Media media, String str, GPHContentType selectedContentType) {
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(selectedContentType, "selectedContentType");
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("media", Y8.b.f14087a.c(media, RTNGiphyDialogModule.this.settings.getRenditionType()));
            RTNGiphyDialogModule.this.sendEvent("onMediaSelect", createMap);
        }

        @Override // V8.U.b
        public void b(GPHContentType selectedContentType) {
            Intrinsics.checkNotNullParameter(selectedContentType, "selectedContentType");
            RTNGiphyDialogModule.this.sendEvent("onDismiss", Arguments.createMap());
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f31860n;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RTNGiphyDialogModule.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f31860n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            U u10 = RTNGiphyDialogModule.this.gifsDialog;
            Intrinsics.checkNotNull(u10);
            u10.dismiss();
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f31862n;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RTNGiphyDialogModule.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f31862n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RTNGiphyDialogModule.this.initializeDialog();
            Activity currentActivity = RTNGiphyDialogModule.this.getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FragmentManager supportFragmentManager = ((AbstractActivityC5481c) currentActivity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            U u10 = RTNGiphyDialogModule.this.gifsDialog;
            Intrinsics.checkNotNull(u10);
            u10.K0(RTNGiphyDialogModule.this.getGifSelectionListener());
            U u11 = RTNGiphyDialogModule.this.gifsDialog;
            Intrinsics.checkNotNull(u11);
            u11.show(supportFragmentManager, "giphy_view");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTNGiphyDialogModule(@NotNull ReactApplicationContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.settings = new GPHSettings(null, null, false, false, null, null, null, null, false, 0, null, false, false, false, false, null, false, 0.0f, false, false, 1048575, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getGifSelectionListener() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeDialog() {
        U a10;
        a10 = U.INSTANCE.a((r30 & 1) != 0 ? new GPHSettings(null, null, false, false, null, null, null, null, false, 0, null, false, false, false, false, null, false, 0.0f, false, false, 1048575, null) : this.settings, (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) == 0 ? e.a() : null, (r30 & 16) != 0 ? new HashMap() : null);
        this.gifsDialog = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String eventName, WritableMap params) {
        if (getReactApplicationContext().hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
        }
    }

    @Override // com.giphyreactnativesdk.NativeGiphyDialogSpec
    @ReactMethod
    public void addListener(@Nullable String eventType) {
    }

    @Override // com.giphyreactnativesdk.NativeGiphyDialogSpec
    @ReactMethod
    public void configure(@Nullable ReadableMap options) {
        GPHSettings b10;
        if (options == null) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        b10 = X8.b.b(options, reactApplicationContext, this.settings);
        this.settings = b10;
    }

    @Override // com.giphyreactnativesdk.NativeGiphyDialogSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RTNGiphyDialogModule";
    }

    @Override // com.giphyreactnativesdk.NativeGiphyDialogSpec
    @ReactMethod
    public void hide() {
        AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, new c(null), 2, null);
    }

    @Override // com.giphyreactnativesdk.NativeGiphyDialogSpec
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.giphyreactnativesdk.NativeGiphyDialogSpec
    @ReactMethod
    public void show() {
        AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, new d(null), 2, null);
    }
}
