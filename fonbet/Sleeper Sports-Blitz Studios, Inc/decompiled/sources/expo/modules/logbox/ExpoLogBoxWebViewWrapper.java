package expo.modules.logbox;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.turboimage.events.FailureEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ExpoLogBoxWebViewWrapper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0002\"#B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u001e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006J\"\u0010\u0019\u001a\u00020\u00162\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006J\u001a\u0010\u0019\u001a\u00020\u00162\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;", "", "actions", "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", "props", "", "", "context", "Landroid/app/Activity;", "<init>", "(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;Ljava/util/Map;Landroid/app/Activity;)V", "getActions", "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", "getProps", "()Ljava/util/Map;", "getContext", "()Landroid/app/Activity;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "initializeLogBoxDomEnvironment", "", "processMessageFromWebView", "rawMessage", "sendReturn", "result", "uid", "actionId", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data", "value", "Companion", "Actions", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpoLogBoxWebViewWrapper {
    private static final String DOM_EVENT = "$$dom_event";
    private static final String NATIVE_ACTION = "$$native_action";
    private static final String NATIVE_ACTION_RESULT = "$$native_action_result";
    private final Actions actions;
    private final Activity context;
    private final Map<String, Object> props;
    private final WebView webView;

    public ExpoLogBoxWebViewWrapper(Actions actions, Map<String, ? extends Object> props, Activity context) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(context, "context");
        this.actions = actions;
        this.props = props;
        this.context = context;
        WebView webView = new WebView(context);
        webView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        webView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        webView.addJavascriptInterface(new Object() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$webView$1$1
            @JavascriptInterface
            public final void postMessage(String rawMessage) {
                Intrinsics.checkNotNullParameter(rawMessage, "rawMessage");
                ExpoLogBoxWebViewWrapper.this.processMessageFromWebView(rawMessage);
            }
        }, "ReactNativeWebView");
        webView.setWebViewClient(new WebViewClient() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$webView$1$2
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                ExpoLogBoxWebViewWrapper.this.initializeLogBoxDomEnvironment();
            }
        });
        webView.loadUrl("file:///android_asset/ExpoLogBox.bundle/index.html");
        this.webView = webView;
    }

    public final Actions getActions() {
        return this.actions;
    }

    public final Map<String, Object> getProps() {
        return this.props;
    }

    public final Activity getContext() {
        return this.context;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeLogBoxDomEnvironment() {
        String json = new Gson().toJson(MapsKt.mapOf(TuplesKt.to("names", this.actions.getNames()), TuplesKt.to("props", this.props)));
        final String trimIndent = StringsKt.trimIndent("\n            var process=globalThis.process||{};process.env=process.env||{};\n            process.env.EXPO_DEV_SERVER_ORIGIN='" + ("http://" + AndroidInfoHelpers.getServerHost(this.context)) + "';\n            window.$$EXPO_DOM_HOST_OS = 'android';\n            window.$$EXPO_INITIAL_PROPS = " + json + ";\n    ");
        this.webView.post(new Runnable() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ExpoLogBoxWebViewWrapper.initializeLogBoxDomEnvironment$lambda$1(ExpoLogBoxWebViewWrapper.this, trimIndent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeLogBoxDomEnvironment$lambda$1(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, String str) {
        expoLogBoxWebViewWrapper.webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMessageFromWebView(String rawMessage) {
        JsonObject jsonObject = (JsonObject) new Gson().fromJson(rawMessage, JsonObject.class);
        JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive("type");
        if (asJsonPrimitive.isString() && Intrinsics.areEqual(asJsonPrimitive.getAsString(), NATIVE_ACTION)) {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("data");
            JsonPrimitive asJsonPrimitive2 = asJsonObject.getAsJsonPrimitive("actionId");
            JsonPrimitive asJsonPrimitive3 = asJsonObject.getAsJsonPrimitive("uid");
            JsonArray asJsonArray = asJsonObject.getAsJsonArray(StepData.ARGS);
            if (asJsonPrimitive2.isString() && asJsonPrimitive3.isString() && asJsonArray.isJsonArray()) {
                String asString = asJsonPrimitive2.getAsString();
                if (Intrinsics.areEqual(asString, "onReload")) {
                    this.actions.getOnReload().getAction().invoke();
                } else if (Intrinsics.areEqual(asString, "fetchTextAsync")) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new ExpoLogBoxWebViewWrapper$processMessageFromWebView$1(asJsonArray, this, asJsonPrimitive3, asJsonPrimitive2, null), 3, null);
                }
            }
        }
    }

    public final void sendReturn(Object result, String uid, String actionId) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        sendReturn(MapsKt.mapOf(TuplesKt.to("type", NATIVE_ACTION_RESULT), TuplesKt.to("data", MapsKt.mapOf(TuplesKt.to("uid", uid), TuplesKt.to("actionId", actionId), TuplesKt.to("result", result)))));
    }

    public final void sendReturn(Exception exception, String uid, String actionId) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        sendReturn(MapsKt.mapOf(TuplesKt.to("type", NATIVE_ACTION_RESULT), TuplesKt.to("data", MapsKt.mapOf(TuplesKt.to("uid", uid), TuplesKt.to("actionId", actionId), TuplesKt.to("error", MapsKt.mapOf(TuplesKt.to("message", String.valueOf(exception))))))));
    }

    public final void sendReturn(Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String json = new Gson().toJson(MapsKt.mapOf(TuplesKt.to("detail", data)));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        sendReturn(json);
    }

    public final void sendReturn(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        final String str = "\n            ;\n            (function() {\n                try {\n                    console.log(\"received\", " + value + ")\n                    window.dispatchEvent(new CustomEvent(\"$$dom_event\", " + value + "));\n                } catch (e) {\n                    console.log('error', e)\n                }\n            })();\n            true;\n            ";
        this.webView.post(new Runnable() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ExpoLogBoxWebViewWrapper.sendReturn$lambda$2(ExpoLogBoxWebViewWrapper.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendReturn$lambda$2(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, String str) {
        expoLogBoxWebViewWrapper.webView.evaluateJavascript(str, null);
    }

    /* compiled from: ExpoLogBoxWebViewWrapper.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;", "", "onReload", "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", "fetchTextAsync", "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", "<init>", "(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)V", "getOnReload", "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", "getFetchTextAsync", "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", "getNames", "", "", "()[Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "OnReload", "FetchTextAsync", "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Actions {
        private final FetchTextAsync fetchTextAsync;
        private final OnReload onReload;

        public static /* synthetic */ Actions copy$default(Actions actions, OnReload onReload, FetchTextAsync fetchTextAsync, int i, Object obj) {
            if ((i & 1) != 0) {
                onReload = actions.onReload;
            }
            if ((i & 2) != 0) {
                fetchTextAsync = actions.fetchTextAsync;
            }
            return actions.copy(onReload, fetchTextAsync);
        }

        /* renamed from: component1, reason: from getter */
        public final OnReload getOnReload() {
            return this.onReload;
        }

        /* renamed from: component2, reason: from getter */
        public final FetchTextAsync getFetchTextAsync() {
            return this.fetchTextAsync;
        }

        public final Actions copy(OnReload onReload, FetchTextAsync fetchTextAsync) {
            Intrinsics.checkNotNullParameter(onReload, "onReload");
            Intrinsics.checkNotNullParameter(fetchTextAsync, "fetchTextAsync");
            return new Actions(onReload, fetchTextAsync);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) other;
            return Intrinsics.areEqual(this.onReload, actions.onReload) && Intrinsics.areEqual(this.fetchTextAsync, actions.fetchTextAsync);
        }

        public int hashCode() {
            return (this.onReload.hashCode() * 31) + this.fetchTextAsync.hashCode();
        }

        public String toString() {
            return "Actions(onReload=" + this.onReload + ", fetchTextAsync=" + this.fetchTextAsync + ")";
        }

        public Actions(OnReload onReload, FetchTextAsync fetchTextAsync) {
            Intrinsics.checkNotNullParameter(onReload, "onReload");
            Intrinsics.checkNotNullParameter(fetchTextAsync, "fetchTextAsync");
            this.onReload = onReload;
            this.fetchTextAsync = fetchTextAsync;
        }

        public final OnReload getOnReload() {
            return this.onReload;
        }

        public final FetchTextAsync getFetchTextAsync() {
            return this.fetchTextAsync;
        }

        public final String[] getNames() {
            return new String[]{this.onReload.getName(), this.fetchTextAsync.getName()};
        }

        /* compiled from: ExpoLogBoxWebViewWrapper.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;", "", "action", "Lkotlin/Function0;", "", "name", "", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnReload {
            private final Function0<Unit> action;
            private final String name;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OnReload copy$default(OnReload onReload, Function0 function0, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    function0 = onReload.action;
                }
                if ((i & 2) != 0) {
                    str = onReload.name;
                }
                return onReload.copy(function0, str);
            }

            public final Function0<Unit> component1() {
                return this.action;
            }

            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final OnReload copy(Function0<Unit> action, String name) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(name, "name");
                return new OnReload(action, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnReload)) {
                    return false;
                }
                OnReload onReload = (OnReload) other;
                return Intrinsics.areEqual(this.action, onReload.action) && Intrinsics.areEqual(this.name, onReload.name);
            }

            public int hashCode() {
                return (this.action.hashCode() * 31) + this.name.hashCode();
            }

            public String toString() {
                return "OnReload(action=" + this.action + ", name=" + this.name + ")";
            }

            public OnReload(Function0<Unit> action, String name) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(name, "name");
                this.action = action;
                this.name = name;
            }

            public final Function0<Unit> getAction() {
                return this.action;
            }

            public /* synthetic */ OnReload(Function0 function0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(function0, (i & 2) != 0 ? "onReload" : str);
            }

            public final String getName() {
                return this.name;
            }
        }

        /* compiled from: ExpoLogBoxWebViewWrapper.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¦\u0001\u0012\u0092\u0001\u0010\u0002\u001a\u008d\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012#\u0012!\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0095\u0001\u0010\u0016\u001a\u008d\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012#\u0012!\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003Jª\u0001\u0010\u0018\u001a\u00020\u00002\u0094\u0001\b\u0002\u0010\u0002\u001a\u008d\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012#\u0012!\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u009d\u0001\u0010\u0002\u001a\u008d\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012#\u0012!\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;", "", "action", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "url", "method", "body", "Lkotlin/Function1;", "", "onResult", "Ljava/lang/Exception;", "Lkotlin/Exception;", FailureEvent.EVENT_NAME, "<init>", "(Lkotlin/jvm/functions/Function5;Ljava/lang/String;)V", "getAction", "()Lkotlin/jvm/functions/Function5;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-log-box_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FetchTextAsync {
            private final Function5<String, String, String, Function1<? super String, Unit>, Function1<? super Exception, Unit>, Unit> action;
            private final String name;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FetchTextAsync copy$default(FetchTextAsync fetchTextAsync, Function5 function5, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    function5 = fetchTextAsync.action;
                }
                if ((i & 2) != 0) {
                    str = fetchTextAsync.name;
                }
                return fetchTextAsync.copy(function5, str);
            }

            public final Function5<String, String, String, Function1<? super String, Unit>, Function1<? super Exception, Unit>, Unit> component1() {
                return this.action;
            }

            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final FetchTextAsync copy(Function5<? super String, ? super String, ? super String, ? super Function1<? super String, Unit>, ? super Function1<? super Exception, Unit>, Unit> action, String name) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(name, "name");
                return new FetchTextAsync(action, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchTextAsync)) {
                    return false;
                }
                FetchTextAsync fetchTextAsync = (FetchTextAsync) other;
                return Intrinsics.areEqual(this.action, fetchTextAsync.action) && Intrinsics.areEqual(this.name, fetchTextAsync.name);
            }

            public int hashCode() {
                return (this.action.hashCode() * 31) + this.name.hashCode();
            }

            public String toString() {
                return "FetchTextAsync(action=" + this.action + ", name=" + this.name + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FetchTextAsync(Function5<? super String, ? super String, ? super String, ? super Function1<? super String, Unit>, ? super Function1<? super Exception, Unit>, Unit> action, String name) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(name, "name");
                this.action = action;
                this.name = name;
            }

            public final Function5<String, String, String, Function1<? super String, Unit>, Function1<? super Exception, Unit>, Unit> getAction() {
                return this.action;
            }

            public /* synthetic */ FetchTextAsync(Function5 function5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(function5, (i & 2) != 0 ? "fetchTextAsync" : str);
            }

            public final String getName() {
                return this.name;
            }
        }
    }
}
