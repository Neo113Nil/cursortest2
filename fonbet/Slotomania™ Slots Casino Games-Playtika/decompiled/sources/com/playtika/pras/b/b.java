package com.playtika.pras.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.playtika.pras.a.i;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class b extends com.playtika.pras.a.d {
    public static final String POPUP_BRIDGE_NAME = "popupBridge";
    public static final String POPUP_BRIDGE_URL_HOST = "popupbridgev1";
    public WebView d;
    public d e;
    public String f;

    public static b newInstance(AppCompatActivity appCompatActivity, WebView webView) {
        return newInstance((FragmentActivity) appCompatActivity, webView, true);
    }

    @JavascriptInterface
    public String getReturnUrlPrefix() {
        return getReturnUrlScheme() + "://popupbridgev1/";
    }

    @Override // com.playtika.pras.a.d
    public String getReturnUrlScheme() {
        return this.f;
    }

    @Override // com.playtika.pras.a.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f = context.getPackageName().toLowerCase().replace("_", "") + ".popupbridge";
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("com.braintreepayments.popupbridge.USE_CHROME_CUSTOM_TABS")) {
            return;
        }
        this.c = arguments.getBoolean("com.braintreepayments.popupbridge.USE_CHROME_CUSTOM_TABS", true);
    }

    @Override // com.playtika.pras.a.e
    public void onBrowserSwitchResult(int i, i iVar, Uri uri) {
        String str;
        d dVar = this.e;
        if (dVar != null) {
            dVar.a();
        }
        int i2 = iVar.a;
        if (i2 == 2) {
            this.d.post(new a(this, "if (typeof window.popupBridge.onCancel === 'function') {  window.popupBridge.onCancel();} else {  window.popupBridge.onComplete(null, null);}"));
            return;
        }
        String str2 = null;
        if (i2 != 1) {
            str = i2 == 3 ? "new Error('" + iVar.b + "')" : null;
        } else {
            if (uri == null || !uri.getScheme().equals(getReturnUrlScheme()) || !uri.getHost().equals(POPUP_BRIDGE_URL_HOST)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                for (String str3 : queryParameterNames) {
                    try {
                        jSONObject2.put(str3, uri.getQueryParameter(str3));
                    } catch (JSONException e) {
                        str2 = "new Error('Failed to parse query items from return URL. " + e.getLocalizedMessage() + "')";
                    }
                }
            }
            try {
                jSONObject.put("path", uri.getPath());
                jSONObject.put("queryItems", jSONObject2);
                jSONObject.put("hash", uri.getFragment());
            } catch (JSONException unused) {
            }
            String str4 = str2;
            str2 = jSONObject.toString();
            str = str4;
        }
        this.d.post(new a(this, "window.popupBridge.onComplete(" + str + ", " + str2 + ");"));
    }

    @Override // com.playtika.pras.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @JavascriptInterface
    public void open(String str) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.b(str);
        }
        browserSwitch(1, str);
        d dVar2 = this.e;
        if (dVar2 != null) {
            dVar2.a(str);
        }
    }

    @JavascriptInterface
    public void sendMessage(String str) {
    }

    @JavascriptInterface
    public void sendMessage(String str, String str2) {
    }

    public void setMessageListener(c cVar) {
    }

    public void setNavigationListener(d dVar) {
        this.e = dVar;
    }

    public static b newInstance(AppCompatActivity appCompatActivity, WebView webView, boolean z) {
        return newInstance((FragmentActivity) appCompatActivity, webView, z);
    }

    public static b newInstance(FragmentActivity fragmentActivity, WebView webView) {
        return newInstance(fragmentActivity, webView, true);
    }

    public static b newInstance(FragmentActivity fragmentActivity, WebView webView, boolean z) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("Activity is null");
        }
        if (webView != null) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            b bVar = (b) supportFragmentManager.findFragmentByTag("com.braintreepayments.popupbridge");
            if (bVar == null) {
                bVar = new b();
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.braintreepayments.popupbridge.USE_CHROME_CUSTOM_TABS", z);
                bVar.setArguments(bundle);
                try {
                    try {
                        supportFragmentManager.beginTransaction().add(bVar, "com.braintreepayments.popupbridge").commitNow();
                    } catch (IllegalStateException e) {
                        throw new IllegalArgumentException(e.getMessage());
                    }
                } catch (IllegalStateException | NullPointerException unused) {
                    supportFragmentManager.beginTransaction().add(bVar, "com.braintreepayments.popupbridge").commit();
                    try {
                        supportFragmentManager.executePendingTransactions();
                    } catch (IllegalStateException unused2) {
                    }
                }
            }
            webView.getSettings().setJavaScriptEnabled(true);
            bVar.d = webView;
            webView.addJavascriptInterface(bVar, POPUP_BRIDGE_NAME);
            return bVar;
        }
        throw new IllegalArgumentException("WebView is null");
    }
}
