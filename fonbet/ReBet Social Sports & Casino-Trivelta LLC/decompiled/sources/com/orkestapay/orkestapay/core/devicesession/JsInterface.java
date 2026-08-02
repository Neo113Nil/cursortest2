package com.orkestapay.orkestapay.core.devicesession;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.orkestapay.orkestapay.core.devicesession.JsInterface;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/orkestapay/orkestapay/core/devicesession/JsInterface;", "", "callback", "Lcom/orkestapay/orkestapay/core/devicesession/DeviceSessionListener;", "webView", "Landroid/webkit/WebView;", "(Lcom/orkestapay/orkestapay/core/devicesession/DeviceSessionListener;Landroid/webkit/WebView;)V", "receiveMessage", "", EventKeys.VALUE_KEY, "", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsInterface {

    @NotNull
    private final DeviceSessionListener callback;

    @NotNull
    private final WebView webView;

    public JsInterface(@NotNull DeviceSessionListener callback, @NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.callback = callback;
        this.webView = webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void receiveMessage$lambda$0(JsInterface this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.webView.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void receiveMessage$lambda$1(JsInterface this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.webView.destroy();
    }

    @JavascriptInterface
    public final void receiveMessage(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject(value);
        if (jSONObject.has("device_session_id")) {
            DeviceSessionClientKt.hasSession = true;
            this.callback.onSuccess(jSONObject.get("device_session_id").toString());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fc.a
                @Override // java.lang.Runnable
                public final void run() {
                    JsInterface.receiveMessage$lambda$0(JsInterface.this);
                }
            });
        }
        if (jSONObject.has("error")) {
            DeviceSessionClientKt.hasSession = true;
            this.callback.onError(jSONObject.getJSONObject("error").get("message").toString());
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: fc.b
                @Override // java.lang.Runnable
                public final void run() {
                    JsInterface.receiveMessage$lambda$1(JsInterface.this);
                }
            });
        }
    }
}
