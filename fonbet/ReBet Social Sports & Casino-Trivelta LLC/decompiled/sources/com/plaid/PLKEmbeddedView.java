package com.plaid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.link.OpenPlaidLink;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fJ\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/plaid/PLKEmbeddedView;", "Landroid/widget/FrameLayout;", "Lcom/plaid/ActivityResultHandler;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "themedReactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "TAG", "", "LINK_ACTIVITY_REQUEST_CODE", "", "EVENT_NAME", "jsonConverter", "Lcom/plaid/gson/PlaidJsonConverter;", "setToken", "", "token", "onAttachedToWindow", "onDetachedFromWindow", "createEmbedded", "Landroid/view/View;", "setupOnEventListener", "handleActivityResult", "requestCode", "resultCode", EventKeys.DATA, "Landroid/content/Intent;", "handleLinkExit", "linkExit", "Lcom/plaid/link/result/LinkExit;", "sendLinkExitFrom", com.bumptech.glide.gifdecoder.e.f29601m, "Lorg/json/JSONException;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PLKEmbeddedView extends FrameLayout implements ActivityResultHandler {

    @NotNull
    private final String EVENT_NAME;
    private final int LINK_ACTIVITY_REQUEST_CODE;

    @NotNull
    private final String TAG;

    @NotNull
    private final PlaidJsonConverter jsonConverter;

    @NotNull
    private final ThemedReactContext themedReactContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PLKEmbeddedView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View createEmbedded(String token) {
        LinkTokenConfiguration build = new LinkTokenConfiguration.Builder().token(token).build();
        Activity currentActivity = this.themedReactContext.getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return Plaid.createLinkEmbeddedView(currentActivity, build, (Function1<? super LinkTokenConfiguration, Unit>) new Function1() { // from class: com.plaid.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createEmbedded$lambda$0;
                createEmbedded$lambda$0 = PLKEmbeddedView.createEmbedded$lambda$0(PLKEmbeddedView.this, (LinkTokenConfiguration) obj);
                return createEmbedded$lambda$0;
            }
        }, (Function1<? super LinkExit, Unit>) new Function1() { // from class: com.plaid.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createEmbedded$lambda$1;
                createEmbedded$lambda$1 = PLKEmbeddedView.createEmbedded$lambda$1(PLKEmbeddedView.this, (LinkExit) obj);
                return createEmbedded$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createEmbedded$lambda$0(PLKEmbeddedView pLKEmbeddedView, LinkTokenConfiguration linkTokenConfiguration) {
        Context applicationContext = pLKEmbeddedView.themedReactContext.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Intrinsics.checkNotNull(linkTokenConfiguration);
        PlaidHandler create = Plaid.create((Application) applicationContext, linkTokenConfiguration);
        Activity currentActivity = pLKEmbeddedView.themedReactContext.getCurrentActivity();
        if (currentActivity != null) {
            create.open(currentActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createEmbedded$lambda$1(PLKEmbeddedView pLKEmbeddedView, LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        pLKEmbeddedView.handleLinkExit(linkExit);
        return Unit.INSTANCE;
    }

    private final void handleLinkExit(LinkExit linkExit) {
        try {
            WritableMap convertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(this.jsonConverter.convert(linkExit)));
            convertJsonToMap.putString("embeddedEventName", "onExit");
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), PLKEmbeddedViewManager.EVENT_NAME, convertJsonToMap);
        } catch (JSONException e10) {
            Log.e(this.TAG, "JSON Exception: " + e10);
            sendLinkExitFrom(e10);
        }
    }

    private final void sendLinkExitFrom(JSONException e10) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        WritableMap createMap3 = Arguments.createMap();
        createMap2.putString(EventKeys.ERROR_MESSAGE_KEY, e10.getMessage());
        createMap2.putString("json", e10.getMessage());
        createMap2.putString("error_type", "JSONException");
        createMap2.putInt(EventKeys.ERROR_CODE_KEY, 499);
        createMap3.putString(EventKeys.ERROR_MESSAGE_KEY, e10.getMessage());
        createMap3.putString("json", e10.getMessage());
        createMap3.putString("error_type", "JSONException");
        createMap3.putInt(EventKeys.ERROR_CODE_KEY, 499);
        createMap.putString("eventName", "EXIT");
        createMap.putMap("metadata", createMap3);
        createMap.putMap("error", createMap2);
        createMap.putString("embeddedEventName", "onExit");
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), PLKEmbeddedViewManager.EVENT_NAME, createMap);
    }

    private final void setupOnEventListener() {
        Plaid.setLinkEventListener(new Function1() { // from class: com.plaid.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit;
                unit = PLKEmbeddedView.setupOnEventListener$lambda$2(PLKEmbeddedView.this, (LinkEvent) obj);
                return unit;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupOnEventListener$lambda$2(PLKEmbeddedView pLKEmbeddedView, LinkEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            WritableMap convertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(pLKEmbeddedView.jsonConverter.convert(event)));
            convertJsonToMap.putString("embeddedEventName", "onEvent");
            Context context = pLKEmbeddedView.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(pLKEmbeddedView.getId(), PLKEmbeddedViewManager.EVENT_NAME, convertJsonToMap);
            return Unit.INSTANCE;
        } catch (JSONException e10) {
            Log.e(pLKEmbeddedView.TAG, "JSON Exception: " + e10);
            return Unit.INSTANCE;
        }
    }

    @Override // com.plaid.ActivityResultHandler
    public void handleActivityResult(int requestCode, int resultCode, @NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == this.LINK_ACTIVITY_REQUEST_CODE) {
            LinkResult parseResult = new OpenPlaidLink().parseResult(resultCode, data);
            if (!(parseResult instanceof LinkSuccess)) {
                if (parseResult instanceof LinkExit) {
                    handleLinkExit((LinkExit) parseResult);
                    return;
                } else {
                    Log.e(this.TAG, "Unhandled LinkResult");
                    return;
                }
            }
            try {
                WritableMap convertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(this.jsonConverter.convert((LinkSuccess) parseResult)));
                convertJsonToMap.putString("embeddedEventName", "onSuccess");
                Context context = getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), PLKEmbeddedViewManager.EVENT_NAME, convertJsonToMap);
            } catch (JSONException e10) {
                Log.e(this.TAG, "JSON Exception parsing LinkSuccess");
                sendLinkExitFrom(e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeModule nativeModule = this.themedReactContext.getNativeModule((Class<NativeModule>) PlaidModule.class);
        if (nativeModule instanceof PlaidModule) {
            ((PlaidModule) nativeModule).getMActivityResultManager().put(Integer.valueOf(this.LINK_ACTIVITY_REQUEST_CODE), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NativeModule nativeModule = this.themedReactContext.getNativeModule((Class<NativeModule>) PlaidModule.class);
        if (nativeModule instanceof PlaidModule) {
            ((PlaidModule) nativeModule).getMActivityResultManager().remove(Integer.valueOf(this.LINK_ACTIVITY_REQUEST_CODE));
        }
    }

    public final void setToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        ((FrameLayout) findViewById(R.id.embedded_frame_layout)).addView(createEmbedded(token));
    }

    public /* synthetic */ PLKEmbeddedView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PLKEmbeddedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.themedReactContext = (ThemedReactContext) context;
        this.TAG = "EmbeddedSearch";
        this.LINK_ACTIVITY_REQUEST_CODE = 3364;
        this.EVENT_NAME = "OnEmbeddedEvent";
        this.jsonConverter = new PlaidJsonConverter();
        View.inflate(context, R.layout.plk_embedded_view, this);
        setupOnEventListener();
    }
}
