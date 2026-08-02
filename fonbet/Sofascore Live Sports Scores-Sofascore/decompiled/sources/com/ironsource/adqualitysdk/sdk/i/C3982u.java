package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3982u extends WebChromeClient implements InterfaceC0823 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebChromeClient f269;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f268 = StringFog.decrypt("1pJNfMveyYLktENWxsLSq+SUQE3C2Mmd\n", "gfcvP6Ospu8=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f267 = StringFog.decrypt("uE5Uz6moZXy6T3f9uYp9frBGRdu3oHBiqw==\n", "3ysgmNvJFQw=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f266 = StringFog.decrypt("kpcLoNP2eSu2mg2b3MRfJZyXEYA=\n", "9fJ/9LGhHEk=\n");

    public C3982u(WebChromeClient webChromeClient) {
        this.f269 = webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        try {
            this.f269.getDefaultVideoPoster();
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("Hugp1jPcsY979w/bDZWrlT70Psthm72VH/892DSQrLcy/j7WEZOrlT7o\n", "W5pbuUH82OE=\n"), th, false);
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        try {
            this.f269.getVideoLoadingProgressView();
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("1bxSyDNwQGiwo3TFDTlacvWgRdVhN0xyxqdEwi4cRmf0p07AESJGYeKrU9QXOUxx\n", "kM4gp0FQKQY=\n"), th, false);
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback valueCallback) {
        try {
            this.f269.getVisitedHistory(valueCallback);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("ptJWBL9GvzLDzXAJgQ+lKIbOQRntAbMotclXArkDshSK01AEvx8=\n", "46Aka81m1lw=\n"), th, false);
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        try {
            this.f269.onCloseWindow(webView);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("9eSbRXw5/dyQ+71IQnDnxtX4jFgudvrx3PmaT1lw+tbf4Q==\n", "sJbpKg4ZlLI=\n"), th, false);
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f269.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("R9tCehcAG5EixGR3KUkBi2fHVWdFTxy8bcdDeglFP5px2lFyAA==\n", "AqkwFWUgcv8=\n"), th, false);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        try {
            this.f269.onCreateWindow(webView, z, z2, message);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("WTn9QLgt4sE8JttNhmT423kl6l3qYuXsbi7uW69a4sF4JPg=\n", "HEuPL8oNi68=\n"), th, false);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        try {
            this.f269.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("L6+hv0Gh99FKsIeyf+jtyw+ztqIT7vD6Er62tVfk+vsLqbKyUvL77h+yp7E=\n", "at3T0DOBnr8=\n"), th, false);
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        try {
            this.f269.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("SloxdwMAFEwvRRd6PUkOVmpGJmpRTxNlakcvdxJBCUtgRhN9A00UUXxBLHYCaBRGangxdxxQCQ==\n", "DyhDGHEgfSI=\n"), th, false);
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        try {
            this.f269.onGeolocationPermissionsShowPrompt(str, callback);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("6s+XojS9xOCP0LGvCvTe+srTgL9m8sPJytKJoiX82efA07WoNPDE/dzUiqM1zsXh2O2Xoivt2Q==\n", "r73lzUadrY4=\n"), th, false);
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        try {
            this.f269.onHideCustomView();
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("ty009fFGiRPSMhL4zw+TCZcxI+ijCY41mzsj2fYVlBKfCS//9A==\n", "8l9GmoNm4H0=\n"), th, false);
        }
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f269.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("qnMdS+PYN3zPbDtG3ZEtZopvClaxlzBYnEADQeOM\n", "7wFvJJH4XhI=\n"), th, false);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f269.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("JwqLCjKJwxpCFa0HDMDZAAcWnBdgxsQ+ETqcAy/bzyEMFJYEJA==\n", "Ynj5ZUCpqnQ=\n"), th, false);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f269.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("giViwDRaDdDnOkTNChMXyqI5dd1mFQr0tBR/wSATFtM=\n", "x1cQr0Z6ZL4=\n"), th, false);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            try {
                this.f269.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                webView = webView;
                str = str;
                str2 = str2;
                str3 = str3;
                jsPromptResult = jsPromptResult;
            } catch (Throwable th) {
                th = th;
                webView = webView;
                str = str;
                str2 = str2;
                str3 = str3;
                jsPromptResult = jsPromptResult;
                AbstractC0356.m204(f268, StringFog.decrypt("Xg4sKCfg3rg7EQolGanEon4SOzV1r9mcaCwsKDiwww==\n", "G3xeR1XAt9Y=\n"), th, false);
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        try {
            this.f269.onJsTimeout();
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("zTBM3rQG7sWoL2rTik/03+0sW8PmSenh+xZX3KNJ8t8=\n", "iEI+scYmh6s=\n"), th, false);
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            this.f269.onPermissionRequest(permissionRequest);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("k3aku5zHmLP2aYK2oo6CqbNqs6bOiJ+Ns3a7vZ2UmLK4VrOlm4KCqQ==\n", "1gTW1O7n8d0=\n"), th, false);
        }
        try {
            super.onPermissionRequest(permissionRequest);
        } catch (Throwable th2) {
            AbstractC0356.m204(f268, StringFog.decrypt("CcOzyV9wL/ls0qDKQTko8Gzes89KOSi3I9+Rw189L+Q/2K7IfzU34inCtQ==\n", "TLHBpi1QRpc=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f269.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("BgcNlrdHfLtjGCubiQ5moSYbGovlCHuFJgcSkLYUfLotJxqIsAJmoQAUEZqgC3Cx\n", "Q3V/+cVnFdU=\n"), th, false);
        }
        try {
            super.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            AbstractC0356.m204(f268, StringFog.decrypt("GiHlZidMMep/MPZlOQU243885WAyBTakMD3HbCcBMfcsOvhnBwkp8Tog40o0AjvhMzbz\n", "X1OXCVVsWIQ=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        try {
            this.f269.onProgressChanged(webView, i);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("YiwU88Q+b2kHMzL++nd1c0IwA+6WcWhXVTEB7tNtdURPPwj703o=\n", "J15mnLYeBgc=\n"), th, false);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        try {
            this.f269.onReceivedIcon(webView, bitmap);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("tVcyz4jO4LLQSBTCtof6qJVLJdLageeOlUYlyYyL7ZWTSi4=\n", "8CVAoPruidw=\n"), th, false);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        try {
            this.f269.onReceivedTitle(webView, str);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("AKgM8trcYVFltyr/5JV7SyC0G++Ik2ZtILkb9N6ZbGssrhL4\n", "Rdp+naj8CD8=\n"), th, false);
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        try {
            this.f269.onReceivedTouchIconUrl(webView, str, z);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("CU9P5J0rS3JsUGnpo2JRaClTWPnPZExOKV5Y4pluRkgjSF7jpmhNchlPUQ==\n", "TD09i+8LIhw=\n"), th, false);
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        try {
            this.f269.onRequestFocus(webView);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("WIJf5NpwNNc9nXnp5DkuzXieSPmIPzPreIFY7tskG9Z+hV4=\n", "HfAti6hQXbk=\n"), th, false);
        }
        super.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f269.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("ssVUcmjKFEnX2nJ/VoMOU5LZQ286hRN0n9hRXm+ZCUia4U94bQ==\n", "97cmHRrqfSc=\n"), th, false);
        }
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        try {
            this.f269.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("7jrMHdfwOqCLJeoQ6bkgus4m2wCFvz2dwyfJNMy8No3DJ9EBwKI=\n", "q0i+cqXQU84=\n"), th, false);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0823
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo55(C1102 c1102, String str, ArrayList arrayList, C0683 c0683, C0950 c0950) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            AbstractC0962.m595(c1102.m651(), AbstractC1133.m662("Pw==\n", "GCWCxWLVaq4=\n", AbstractC1072.m642("z2BrElgAsKTjfnxdT1iir/9mcBNNAJCp6FFxD0VNoo/me3wTXmSir+VgeAlFUuei62ZwC08Aqqn+\nenYZCgc=\n", "ihIZfSogx8w=\n", new StringBuilder(), str)), e, null);
        }
        if (hashCode != 1395849045) {
            if (hashCode == 1442029578 && str.equals(f267)) {
                c = 0;
                if (c != 0) {
                    return null;
                }
                if (c == 1) {
                    return this.f269;
                }
                new C0315(c1102, c0950, f268, str).m277(c1102.m651());
                return null;
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals(f266)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f269.onShowCustomView(view, i, customViewCallback);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("fl4uR8t9FMsbQQhK9TQO0V5COVqZMhP2U0Mra8wuCcpWejVNzg==\n", "OyxcKLldfaU=\n"), th, false);
        }
        super.onShowCustomView(view, i, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        try {
            this.f269.onConsoleMessage(str, i, str2);
        } catch (Throwable th) {
            AbstractC0356.m204(f268, StringFog.decrypt("0t6P73dVQT23waniSRxbJ/LCmPIlGkYQ+MKO72kQZTbk35znYA==\n", "l6z9gAV1KFM=\n"), th, false);
        }
        super.onConsoleMessage(str, i, str2);
    }
}
