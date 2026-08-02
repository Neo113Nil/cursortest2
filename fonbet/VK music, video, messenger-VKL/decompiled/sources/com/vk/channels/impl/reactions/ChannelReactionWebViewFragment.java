package com.vk.channels.impl.reactions;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.X3;
import com.vk.channels.impl.reactions.model.ActionParamsStatus;
import com.vk.channels.impl.reactions.model.EventAction;
import com.vk.channels.impl.reactions.model.EventType;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiUris;
import xsna.brm0;
import xsna.drm0;
import xsna.dsw;
import xsna.epx;
import xsna.h40;
import xsna.hh1;
import xsna.i27;
import xsna.oz50;
import xsna.pu;
import xsna.v390;
import xsna.y390;

/* compiled from: ChannelReactionWebViewFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelReactionWebViewFragment extends FragmentImpl {
    public static final /* synthetic */ int Q = 0;
    public WebView N;
    public b O;
    public boolean P;

    /* compiled from: ChannelReactionWebViewFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ChannelReactionWebViewFragment.kt */
    public static final class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (webView != null) {
                webView.loadUrl("\n            javascript:(() => {\n              window.addEventListener('message', function (e) {\n                Android.postMessage(JSON.stringify(e.data));\n              });\n            })();\n        ");
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            String str = null;
            if (sslError != null && (url = sslError.getUrl()) != null && !drm0.N(url)) {
                str = url;
            }
            if (str != null) {
                dsw<UserId, v390> dswVar = y390.a;
                if (y390.a.a().d(str)) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"ChannelReaction: skip SSL for ".concat(str)});
                    }
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    /* compiled from: ChannelReactionWebViewFragment.kt */
    public interface c {
        @JavascriptInterface
        void postMessage(String str);
    }

    /* compiled from: ChannelReactionWebViewFragment.kt */
    public static final class d implements c {
        public final pu a;
        public final hh1 b;

        public d(pu puVar, hh1 hh1Var) {
            this.a = puVar;
            this.b = hh1Var;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        @Override // com.vk.channels.impl.reactions.ChannelReactionWebViewFragment.c
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void postMessage(String str) {
            i27 i27Var;
            EventAction eventAction;
            EventAction eventAction2;
            JSONObject jSONObject;
            JSONObject optJSONObject;
            h40 h40Var;
            EventAction eventAction3;
            ActionParamsStatus actionParamsStatus;
            if (str == null) {
                return;
            }
            try {
                String obj = drm0.p0(str).toString();
                if (brm0.B(obj, "\"", false)) {
                    obj = brm0.y(brm0.y(drm0.X(obj), "\\\"", "\""), "\\\\", "\\");
                }
                jSONObject = new JSONObject(obj);
                optJSONObject = jSONObject.optJSONObject("action_params");
            } catch (Exception unused) {
                i27Var = new i27(EventType.UNKNOWN, EventAction.UNKNOWN, null);
            }
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("status", "");
                if (optString != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1367724422) {
                        if (hashCode != -1313911455) {
                            if (hashCode != 3548) {
                                if (hashCode == 96784904 && optString.equals("error")) {
                                    actionParamsStatus = ActionParamsStatus.ERROR;
                                    h40Var = new h40(actionParamsStatus);
                                }
                            } else if (optString.equals(ApiUris.SCHEME_OK)) {
                                actionParamsStatus = ActionParamsStatus.OK;
                                h40Var = new h40(actionParamsStatus);
                            }
                        } else if (optString.equals("timeout")) {
                            actionParamsStatus = ActionParamsStatus.TIMEOUT;
                            h40Var = new h40(actionParamsStatus);
                        }
                    } else if (optString.equals("cancel")) {
                        actionParamsStatus = ActionParamsStatus.CANCEL;
                        h40Var = new h40(actionParamsStatus);
                    }
                    i27Var = new i27(EventType.UNKNOWN, EventAction.UNKNOWN, null);
                    eventAction = EventAction.PAY_SUCCESS;
                    eventAction2 = i27Var.b;
                    if (eventAction2 == eventAction) {
                        this.a.invoke();
                    }
                    if (eventAction2 == EventAction.CLOSE_WINDOW) {
                        this.b.invoke();
                    }
                    L l = L.a;
                    l.getClass();
                    if (L.m(LoggerOutputTarget.NONE)) {
                        return;
                    }
                    L.u(l, L.LogType.i, new Object[]{"Parsed billing event = " + i27Var});
                    return;
                }
                actionParamsStatus = ActionParamsStatus.UNKNOWN;
                h40Var = new h40(actionParamsStatus);
            } else {
                h40Var = null;
            }
            EventType eventType = epx.f(jSONObject.optString("type", ""), "billing") ? EventType.BILLING : EventType.UNKNOWN;
            String optString2 = jSONObject.optString("action", "");
            if (optString2 != null) {
                switch (optString2.hashCode()) {
                    case -787847194:
                        if (!optString2.equals("payFail")) {
                            break;
                        } else {
                            eventAction3 = EventAction.PAY_FAIL;
                            break;
                        }
                    case 277236744:
                        if (!optString2.equals("closeWindow")) {
                            break;
                        } else {
                            eventAction3 = EventAction.CLOSE_WINDOW;
                            break;
                        }
                    case 452824794:
                        if (!optString2.equals("openWindow")) {
                            break;
                        } else {
                            eventAction3 = EventAction.OPEN_WINDOW;
                            break;
                        }
                    case 460036667:
                        if (!optString2.equals("paySuccess")) {
                            break;
                        } else {
                            eventAction3 = EventAction.PAY_SUCCESS;
                            break;
                        }
                    case 473449418:
                        if (!optString2.equals("formLoad")) {
                            break;
                        } else {
                            eventAction3 = EventAction.FORM_LOAD;
                            break;
                        }
                    case 1346132544:
                        if (!optString2.equals("payError")) {
                            break;
                        } else {
                            eventAction3 = EventAction.ERROR;
                            break;
                        }
                }
                i27Var = new i27(eventType, eventAction3, h40Var);
                eventAction = EventAction.PAY_SUCCESS;
                eventAction2 = i27Var.b;
                if (eventAction2 == eventAction) {
                }
                if (eventAction2 == EventAction.CLOSE_WINDOW) {
                }
                L l2 = L.a;
                l2.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                }
            }
            eventAction3 = EventAction.UNKNOWN;
            i27Var = new i27(eventType, eventAction3, h40Var);
            eventAction = EventAction.PAY_SUCCESS;
            eventAction2 = i27Var.b;
            if (eventAction2 == eventAction) {
            }
            if (eventAction2 == EventAction.CLOSE_WINDOW) {
            }
            L l22 = L.a;
            l22.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.im_channel_reaction_webview_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.O = null;
        WebView webView = this.N;
        if (webView == null) {
            webView = null;
        }
        webView.stopLoading();
        webView.setWebChromeClient(null);
        webView.destroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pay_success", this.P);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        this.P = bundle != null ? bundle.getBoolean("pay_success") : false;
        this.N = (WebView) view.findViewById(R.id.webview);
        this.O = new b();
        WebView webView = this.N;
        if (webView == null) {
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView2 = this.N;
        if (webView2 == null) {
            webView2 = null;
        }
        webView2.addJavascriptInterface(new d(new pu(this, 19), new hh1(this, 10)), X3.d);
        WebView webView3 = this.N;
        if (webView3 == null) {
            webView3 = null;
        }
        b bVar = this.O;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        webView3.setWebViewClient(bVar);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("url_arg")) == null) {
            return;
        }
        WebView webView4 = this.N;
        (webView4 != null ? webView4 : null).loadUrl(string);
    }
}
