package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˍ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0326 extends WebViewApp implements InterfaceC0873 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0322 f801;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0683 f802;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebViewApp f803;

    public C0326(C0322 c0322, WebViewApp webViewApp, C0683 c0683) {
        this.f801 = c0322;
        this.f803 = webViewApp;
        this.f802 = c0683;
    }

    public final void addCallback(NativeCallback nativeCallback) {
        this.f801.m270(this, this.f802, StringFog.decrypt("CCgPRYBMjBovPUNyjU24OjMhD3KKQg==\n", "X01tE+kp+1s=\n"), nativeCallback);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.addCallback(nativeCallback);
        }
    }

    public final NativeCallback getCallback(String str) {
        this.f801.m270(this, this.f802, StringFog.decrypt("1e4w6K78A8ry+3zZou036u7nMN+k8g==\n", "gotSvseZdIs=\n"), str);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.getCallback(str);
        }
        return null;
    }

    public final Configuration getConfiguration() {
        this.f801.m270(this, this.f802, StringFog.decrypt("RjelykRqFVJhIun7SHshfH80rvtYfQNneD2p\n", "EVLHnC0PYhM=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.getConfiguration();
        }
        return null;
    }

    public final ErrorState getErrorStateFromWebAppCode() {
        this.f801.m270(this, this.f802, StringFog.decrypt("n9nGrdxh21a4zIqc0HDpZbrT1qjBZdhyjs7LluJhzla4zOeU0WE=\n", "yLyk+7UErBc=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.getErrorStateFromWebAppCode();
        }
        return null;
    }

    public final int getWebAppFailureCode() {
        this.f801.m270(this, this.f802, StringFog.decrypt("OCav+A1SmYsfM+PJAUO5rw0Cvd4iVoemGjGo7QtTiw==\n", "b0PNrmQ37so=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.getWebAppFailureCode();
        }
        return 0;
    }

    public final String getWebAppFailureMessage() {
        this.f801.m270(this, this.f802, StringFog.decrypt("YsT08PCYcRVF0bjB/IlRMVfg5tbfnG84QNPz6/yOdTVSxA==\n", "NaGWppn9BlQ=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.getWebAppFailureMessage();
        }
        return null;
    }

    public final WebView getWebView() {
        this.f801.m270(this, this.f802, StringFog.decrypt("2bNOms81s7L+pgKrwySTluyARanR\n", "jtYszKZQxPM=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.getWebView();
        }
        return null;
    }

    public final boolean invokeCallback(Invocation invocation) {
        this.f801.m270(this, this.f802, StringFog.decrypt("+JwzuDJL+QzfiX+HNVjhJsq6MII3TO8uxA==\n", "r/lR7lsujk0=\n"), invocation);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.invokeCallback(invocation);
        }
        return false;
    }

    public final boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        this.f801.m270(this, this.f802, StringFog.decrypt("ykS5erKMi9XtUfVFtZ+T//hsvlizhpg=\n", "nSHbLNvp/JQ=\n"), str, str2, method, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }
        return false;
    }

    public final boolean isWebAppInitialized() {
        this.f801.m270(this, this.f802, StringFog.decrypt("ZYmsSk5/YNJCnOB1VE1y8XOcvlVJc2P6U4CnZkJ+\n", "MuzOHCcaF5M=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.isWebAppInitialized();
        }
        return false;
    }

    public final boolean isWebAppLoaded() {
        this.f801.m270(this, this.f802, StringFog.decrypt("ygCvIPtPdiftFeMf4X1kBNwVvTr9S2UD+Q==\n", "nWXNdpIqAWY=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.isWebAppLoaded();
        }
        return false;
    }

    public final void removeCallback(NativeCallback nativeCallback) {
        this.f801.m270(this, this.f802, StringFog.decrypt("UFtjQ3IEje53Ti9nfgyV2WJ9YHl3A5vMbA==\n", "Bz4BFRth+q8=\n"), nativeCallback);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.removeCallback(nativeCallback);
        }
    }

    public final void resetWebViewAppInitialization() {
        this.f801.m270(this, this.f802, StringFog.decrypt("HJ5NmbOUYVk7iwG9v4JzbByeTZmzlGFZO4tmobOFf3knklWurph5dg==\n", "S/svz9rxFhg=\n"), new Object[0]);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.resetWebViewAppInitialization();
        }
    }

    public final boolean sendEvent(Enum r5, Enum r6, Object... objArr) {
        this.f801.m270(this, this.f802, StringFog.decrypt("0GrAQqXxGtX3f4xnqfoJ0fFqzGA=\n", "hw+iFMyUbZQ=\n"), r5, r6, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            return webViewApp.sendEvent(r5, r6, objArr);
        }
        return false;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f801.m270(this, this.f802, StringFog.decrypt("fITMHOToBwFbkYA56PkzL0WHxy34/xE0Qo7A\n", "K+GuSo2NcEA=\n"), configuration);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.setConfiguration(configuration);
        }
    }

    public final void setWebAppFailureCode(int i) {
        this.f801.m270(this, this.f802, StringFog.decrypt("wnN9mNdoGsPlZjG923k65/dXb774bATu4GR6jdFpCA==\n", "lRYfzr4NbYI=\n"), Integer.valueOf(i));
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureCode(i);
        }
    }

    public final void setWebAppFailureMessage(String str) {
        this.f801.m270(this, this.f802, StringFog.decrypt("tDTUuDFNFjaTIZidPVw2EoEQxp4eSQgbliPToz1bEhaENA==\n", "41G27lgoYXc=\n"), str);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureMessage(str);
        }
    }

    public final void setWebAppInitialized(boolean z) {
        this.f801.m270(this, this.f802, StringFog.decrypt("/7eXM3BzxsTYotsWfGLm4MqThRVQeNjxwbOZDGNz1Q==\n", "qNL1ZRkWsYU=\n"), Boolean.valueOf(z));
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.setWebAppInitialized(z);
        }
    }

    public final void setWebAppLoaded(boolean z) {
        this.f801.m270(this, this.f802, StringFog.decrypt("XYqP3uXGoIl6n8P76deArWiunfjAzLasb4s=\n", "Cu/tiIyj18g=\n"), Boolean.valueOf(z));
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.setWebAppLoaded(z);
        }
    }

    public final void setWebView(WebView webView) {
        this.f801.m270(this, this.f802, StringFog.decrypt("d0Pbxu0EpZlQVpfj4RWFvUJw0PXz\n", "ICa5kIRh0tg=\n"), webView);
        WebViewApp webViewApp = this.f803;
        if (webViewApp != null) {
            webViewApp.setWebView(webView);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this.f803;
    }
}
