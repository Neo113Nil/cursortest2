package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.dt;
import xsna.epx;
import xsna.j5g;
import xsna.jgp;
import xsna.n7i;
import xsna.o7i;
import xsna.p7i;
import xsna.rsr;
import xsna.ttk0;
import xsna.utk0;
import xsna.vtk0;
import xsna.xh50;
import xsna.zcl;
import xsna.zrl;

/* compiled from: AndroidWebViewClient.kt */
/* loaded from: classes14.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final xh50<Boolean> _isRenderProcessGone;
    private final n7i<List<WebViewClientError>> _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final ttk0<Boolean> isRenderProcessGone;
    private final xh50<List<WebViewClientError>> loadErrors = vtk0.a(EmptyList.b);
    private final zrl<List<WebViewClientError>> onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final xh50<String> webviewType;

    /* compiled from: AndroidWebViewClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        o7i a = p7i.a();
        this._onLoadFinished = a;
        this.onLoadFinished = a;
        utk0 a2 = vtk0.a(Boolean.FALSE);
        this._isRenderProcessGone = a2;
        this.isRenderProcessGone = rsr.f(a2);
        this.webviewType = vtk0.a("");
    }

    public final zrl<List<WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final ttk0<Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String str2;
        if (str.equals(BLANK_PAGE)) {
            xh50<List<WebViewClientError>> xh50Var = this.loadErrors;
            while (true) {
                List<WebViewClientError> value = xh50Var.getValue();
                str2 = str;
                if (xh50Var.compareAndSet(value, j5g.v0(new WebViewClientError(str2, ErrorReason.REASON_WEB_BLANK, null, 4, null), value))) {
                    break;
                } else {
                    str = str2;
                }
            }
        } else {
            str2 = str;
        }
        super.onPageFinished(webView, str2);
        this._onLoadFinished.h(this.loadErrors.getValue());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        List<WebViewClientError> value;
        ViewExtensionsKt.removeViewFromParent(webView);
        webView.destroy();
        if (this._onLoadFinished.m()) {
            this._isRenderProcessGone.setValue(Boolean.TRUE);
            return true;
        }
        xh50<List<WebViewClientError>> xh50Var = this.loadErrors;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, j5g.v0(new WebViewClientError(String.valueOf(webView.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null), value)));
        this._onLoadFinished.h(this.loadErrors.getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Object failure;
        Uri url = webResourceRequest.getUrl();
        try {
            if (url == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            try {
                failure = url.getQueryParameter("webviewType");
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            String str = (String) failure;
            if (str != null && !drm0.N(str)) {
                this.webviewType.setValue(str);
            }
            return epx.f(url.getLastPathSegment(), "favicon.ico") ? new WebResourceResponse("image/png", null, null) : this.getCachedAsset.invoke(webResourceRequest.getUrl(), this.webviewType.getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", (Double) null, message != null ? dt.b("reason", message) : jgp.b, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }
}
