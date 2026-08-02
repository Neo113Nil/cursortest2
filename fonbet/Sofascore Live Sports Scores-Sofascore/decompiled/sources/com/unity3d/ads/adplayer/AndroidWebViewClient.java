package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.google.protobuf.ByteString;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ddi;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.kea;
import defpackage.km5;
import defpackage.lm5;
import defpackage.p2g;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.u2g;
import defpackage.un0;
import defpackage.w2g;
import defpackage.wv8;
import defpackage.zu4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001f¨\u0006/"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lf1d;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "loadErrors", "Lf1d;", "Lpa3;", "_onLoadFinished", "Lpa3;", "Lzu4;", "onLoadFinished", "Lzu4;", "getOnLoadFinished", "()Lzu4;", "_isRenderProcessGone", "Lddi;", "isRenderProcessGone", "Lddi;", "()Lddi;", "webviewType", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {

    @NotNull
    public static final String BLANK_PAGE = "about:blank";

    @NotNull
    private final f1d _isRenderProcessGone;

    @NotNull
    private final pa3 _onLoadFinished;

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final ddi isRenderProcessGone;

    @NotNull
    private final f1d loadErrors;

    @NotNull
    private final zu4 onLoadFinished;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final f1d webviewType;

    public AndroidWebViewClient(@NotNull GetCachedAsset getCachedAsset, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        getCachedAsset.getClass();
        sendDiagnosticEvent.getClass();
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = gdi.a(km5.a);
        qa3 c = qx9.c();
        this._onLoadFinished = c;
        this.onLoadFinished = c;
        fdi a = gdi.a(Boolean.FALSE);
        this._isRenderProcessGone = a;
        this.isRenderProcessGone = un0.u(a);
        this.webviewType = gdi.a("");
    }

    @NotNull
    public final zu4 getOnLoadFinished() {
        return this.onLoadFinished;
    }

    @NotNull
    /* renamed from: isRenderProcessGone, reason: from getter */
    public final ddi getIsRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        String str;
        view.getClass();
        url.getClass();
        if (url.equals(BLANK_PAGE)) {
            f1d f1dVar = this.loadErrors;
            while (true) {
                fdi fdiVar = (fdi) f1dVar;
                Object value = fdiVar.getValue();
                str = url;
                if (fdiVar.k(value, CollectionsKt.x0((List) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        ((qa3) this._onLoadFinished).V(((fdi) this.loadErrors).getValue());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
        fdi fdiVar;
        Object value;
        view.getClass();
        detail.getClass();
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (((kea) this._onLoadFinished).t()) {
            f1d f1dVar = this._isRenderProcessGone;
            Boolean bool = Boolean.TRUE;
            fdi fdiVar2 = (fdi) f1dVar;
            fdiVar2.getClass();
            fdiVar2.m(null, bool);
            return true;
        }
        f1d f1dVar2 = this.loadErrors;
        do {
            fdiVar = (fdi) f1dVar2;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, CollectionsKt.x0((List) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        ((qa3) this._onLoadFinished).V(((fdi) this.loadErrors).getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Map map;
        Object u2gVar;
        view.getClass();
        request.getClass();
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = url.getQueryParameter("webviewType");
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            String str = (String) u2gVar;
            if (str != null && !StringsKt.R(str)) {
                ((fdi) this.webviewType).l(str);
            }
            if (Intrinsics.c(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            url2.getClass();
            return getCachedAsset.invoke(url2, (String) ((fdi) this.webviewType).getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || (map = wv8.o("reason", message)) == null) {
                map = lm5.a;
                map.getClass();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", (Double) null, map, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}
