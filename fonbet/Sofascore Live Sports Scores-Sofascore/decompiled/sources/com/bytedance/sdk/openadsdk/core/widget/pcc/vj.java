package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.utils.lo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends WebChromeClient {
    private static final String pcc = "WebChromeClient";
    private hc gm;
    private com.bytedance.sdk.openadsdk.common.vj oo;
    private final mu sf;

    public vj(mu muVar, hc hcVar) {
        this.sf = muVar;
        this.gm = hcVar;
    }

    private boolean pcc(@NonNull final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.vj.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lo.pcc(Uri.parse(str), vj.this.sf);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null && !TextUtils.isEmpty(consoleMessage.message())) {
            boolean pcc2 = pcc(consoleMessage.message());
            com.bytedance.sdk.component.utils.lo.pcc(pcc, "onConsoleMessage: " + consoleMessage.message());
            if (pcc2) {
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        hc hcVar = this.gm;
        if (hcVar != null) {
            hcVar.pcc(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.vj vjVar = this.oo;
        if (vjVar != null) {
            vjVar.pcc(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    public vj(mu muVar, hc hcVar, com.bytedance.sdk.openadsdk.common.vj vjVar) {
        this(muVar, hcVar);
        this.oo = vjVar;
    }

    public vj(mu muVar) {
        this.sf = muVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            pcc(str);
        }
        super.onConsoleMessage(str, i, str2);
    }
}
