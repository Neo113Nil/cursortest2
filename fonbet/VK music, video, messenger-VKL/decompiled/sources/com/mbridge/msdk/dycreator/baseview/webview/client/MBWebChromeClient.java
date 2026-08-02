package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes13.dex */
public class MBWebChromeClient extends WebChromeClient {
    private final String a = "MBWebChromeClient";
    private WebViewEventListener b;
    private WebCommunicator c;

    private boolean a(String str) {
        WebCommunicator webCommunicator;
        try {
        } catch (Throwable th) {
            q0.b("MBWebChromeClient", th.getMessage());
        }
        if (!str.startsWith("mv:")) {
            if (str.startsWith("mraid:")) {
            }
            return false;
        }
        if (str.contains("wv_hybrid:")) {
            str = str.substring(0, str.lastIndexOf(" ") + 1);
        }
        q0.a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + " " + str);
        if (!TextUtils.isEmpty(str) && (webCommunicator = this.c) != null) {
            webCommunicator.onCommunication(str);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (TextUtils.isEmpty(consoleMessage.message()) || !a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (TextUtils.isEmpty(str2) || !a(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i);
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.b = webViewEventListener;
    }
}
