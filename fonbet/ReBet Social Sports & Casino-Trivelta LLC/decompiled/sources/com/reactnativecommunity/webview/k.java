package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.twilio.voice.EventKeys;
import com.twilio.voice.VoiceURLConnection;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import zendesk.core.Constants;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: C, reason: collision with root package name */
    public static final a f41343C = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41346a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41349d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41350e;

    /* renamed from: f, reason: collision with root package name */
    public String f41351f;

    /* renamed from: g, reason: collision with root package name */
    public String f41352g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41353h;

    /* renamed from: i, reason: collision with root package name */
    public ReadableMap f41354i;

    /* renamed from: j, reason: collision with root package name */
    public String f41355j;

    /* renamed from: k, reason: collision with root package name */
    public String f41356k;

    /* renamed from: b, reason: collision with root package name */
    public final String f41347b = "RNCWebViewManagerImpl";

    /* renamed from: c, reason: collision with root package name */
    public h f41348c = new h() { // from class: com.reactnativecommunity.webview.i
        @Override // com.reactnativecommunity.webview.h
        public final void a(WebView webView) {
            k.k(webView);
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final String f41357l = "UTF-8";

    /* renamed from: m, reason: collision with root package name */
    public final String f41358m = "text/html";

    /* renamed from: n, reason: collision with root package name */
    public final String f41359n = VoiceURLConnection.METHOD_TYPE_POST;

    /* renamed from: o, reason: collision with root package name */
    public final String f41360o = "about:blank";

    /* renamed from: p, reason: collision with root package name */
    public final String f41361p = "Downloading";

    /* renamed from: q, reason: collision with root package name */
    public final String f41362q = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";

    /* renamed from: r, reason: collision with root package name */
    public final int f41363r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final int f41364s = 2;

    /* renamed from: t, reason: collision with root package name */
    public final int f41365t = 3;

    /* renamed from: u, reason: collision with root package name */
    public final int f41366u = 4;

    /* renamed from: v, reason: collision with root package name */
    public final int f41367v = 5;

    /* renamed from: w, reason: collision with root package name */
    public final int f41368w = 6;

    /* renamed from: x, reason: collision with root package name */
    public final int f41369x = 7;

    /* renamed from: y, reason: collision with root package name */
    public final int f41370y = 8;

    /* renamed from: z, reason: collision with root package name */
    public final int f41371z = 1000;

    /* renamed from: A, reason: collision with root package name */
    public final int f41344A = 1001;

    /* renamed from: B, reason: collision with root package name */
    public final int f41345B = RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends com.reactnativecommunity.webview.c {
        public b(d dVar) {
            super(dVar);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class c extends com.reactnativecommunity.webview.c {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Activity f41372o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f41373p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, Activity activity, int i10) {
            super(dVar);
            this.f41372o = activity;
            this.f41373p = i10;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f41288b == null) {
                return;
            }
            ViewGroup c10 = c();
            if (c10.getRootView() != this.f41287a.getRootView()) {
                this.f41287a.getRootView().setVisibility(0);
            } else {
                this.f41287a.setVisibility(0);
            }
            this.f41372o.getWindow().clearFlags(512);
            c10.removeView(this.f41288b);
            this.f41289c.onCustomViewHidden();
            this.f41288b = null;
            this.f41289c = null;
            this.f41372o.setRequestedOrientation(this.f41373p);
            this.f41287a.getThemedReactContext().removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.f41288b != null) {
                callback.onCustomViewHidden();
                return;
            }
            this.f41288b = view;
            this.f41289c = callback;
            this.f41372o.setRequestedOrientation(-1);
            this.f41288b.setSystemUiVisibility(7942);
            this.f41372o.getWindow().setFlags(512, 512);
            this.f41288b.setBackgroundColor(-16777216);
            ViewGroup c10 = c();
            c10.addView(this.f41288b, com.reactnativecommunity.webview.c.f41286n);
            if (c10.getRootView() != this.f41287a.getRootView()) {
                this.f41287a.getRootView().setVisibility(8);
            } else {
                this.f41287a.setVisibility(8);
            }
            this.f41287a.getThemedReactContext().addLifecycleEventListener(this);
        }
    }

    public k(boolean z10) {
        this.f41346a = z10;
    }

    public static final void f(d dVar, k kVar, String str, String str2, String str3, String str4, long j10) {
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) dVar.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
        if (rNCWebViewModule == null) {
            return;
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String a10 = q.a(str, str3, str4);
            Intrinsics.checkNotNull(a10);
            String replace = l.a().replace(a10, "_");
            String str5 = "Downloading " + replace;
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e10) {
                Log.w(kVar.f41347b, "Error getting cookie for DownloadManager", e10);
            }
            request.addRequestHeader(Constants.USER_AGENT_HEADER_KEY, str2);
            request.setTitle(replace);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, replace);
            rNCWebViewModule.setDownloadRequest(request);
            if (rNCWebViewModule.grantFileDownloaderPermissions(kVar.h(), kVar.i())) {
                rNCWebViewModule.downloadFile(kVar.h());
            }
        } catch (IllegalArgumentException e11) {
            Log.w(kVar.f41347b, "Unsupported URI, aborting download", e11);
        }
    }

    public static final void k(WebView webView) {
    }

    public final void A(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setGeolocationEnabled(z10);
    }

    public final void B(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.f41353h = z10;
        i0(webView);
    }

    public final void C(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHasScrollEvent(z10);
    }

    public final void D(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (z10) {
            CookieManager.getInstance().removeAllCookies(null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    public final void E(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f41302a = str;
    }

    public final void F(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f41303b = str;
    }

    public final void G(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f41307f = z10;
    }

    public final void H(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f41306e = z10;
    }

    public final void I(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setInjectedJavaScriptObject(str);
    }

    public final void J(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
    }

    public final void K(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setJavaScriptEnabled(z10);
    }

    public final void L(String str) {
        this.f41352g = str;
    }

    public final void M(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z10);
    }

    public final void N(p viewWrapper, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems(null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    public final void O(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setMessagingEnabled(z10);
    }

    public final void P(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f41309h = str;
    }

    public final void Q(p viewWrapper, int i10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setMinimumFontSize(i10);
    }

    public final void R(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (str == null || Intrinsics.areEqual(ReactScrollViewHelper.OVER_SCROLL_NEVER, str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (Intrinsics.areEqual(ReactScrollViewHelper.OVER_SCROLL_ALWAYS, str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if (Intrinsics.areEqual("compatibility", str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    public final void S(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().f41315n = z10;
    }

    public final void T(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        int i10 = 0;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -1414557169) {
                str.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS);
            } else if (hashCode != 104712844) {
                if (hashCode == 951530617 && str.equals("content")) {
                    i10 = 1;
                }
            } else if (str.equals(ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
                i10 = 2;
            }
        }
        webView.setOverScrollMode(i10);
    }

    public final void U(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (O2.g.a("PAYMENT_REQUEST")) {
            O2.d.e(webView.getSettings(), z10);
        }
    }

    public final void V(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSaveFormData(!z10);
    }

    public final void W(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z10);
        webView.getSettings().setUseWideViewPort(z10);
    }

    public final void X(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setBuiltInZoomControls(z10);
    }

    public final void Y(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDisplayZoomControls(z10);
    }

    public final void Z(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setSupportMultipleWindows(z10);
    }

    public final void a0(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setHorizontalScrollBarEnabled(z10);
    }

    public final void b0(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setVerticalScrollBarEnabled(z10);
    }

    public final d c(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new d(context);
    }

    public final void c0(p viewWrapper, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        this.f41354i = readableMap;
    }

    public final p d(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return e(context, c(context));
    }

    public final void d0(p viewWrapper, int i10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setTextZoom(i10);
    }

    public final p e(ThemedReactContext context, final d webView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        i0(webView);
        context.addLifecycleEventListener(webView);
        this.f41348c.a(webView);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (ReactBuildConfig.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.setDownloadListener(new DownloadListener() { // from class: com.reactnativecommunity.webview.j
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                k.f(d.this, this, str, str2, str3, str4, j10);
            }
        });
        return new p(context, webView);
    }

    public final void e0(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(viewWrapper.getWebView(), z10);
    }

    public final void f0(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        this.f41355j = str;
        g0(viewWrapper);
    }

    public final Map g() {
        return MapBuilder.builder().put("goBack", Integer.valueOf(this.f41363r)).put("goForward", Integer.valueOf(this.f41364s)).put("reload", Integer.valueOf(this.f41365t)).put("stopLoading", Integer.valueOf(this.f41366u)).put("postMessage", Integer.valueOf(this.f41367v)).put("injectJavaScript", Integer.valueOf(this.f41368w)).put("loadUrl", Integer.valueOf(this.f41369x)).put("requestFocus", Integer.valueOf(this.f41370y)).put("clearFormData", Integer.valueOf(this.f41371z)).put("clearCache", Integer.valueOf(this.f41344A)).put("clearHistory", Integer.valueOf(this.f41345B)).build();
    }

    public final void g0(p pVar) {
        d webView = pVar.getWebView();
        if (this.f41355j != null) {
            webView.getSettings().setUserAgentString(this.f41355j);
        } else if (this.f41356k != null) {
            webView.getSettings().setUserAgentString(this.f41356k);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public final String h() {
        String str = this.f41351f;
        return str == null ? this.f41361p : str;
    }

    public final void h0(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(z10);
    }

    public final String i() {
        String str = this.f41352g;
        return str == null ? this.f41362q : str;
    }

    public final void i0(d dVar) {
        Activity currentActivity = dVar.getThemedReactContext().getCurrentActivity();
        if (this.f41349d && currentActivity != null) {
            c cVar = new c(dVar, currentActivity, currentActivity.getRequestedOrientation());
            cVar.f(this.f41350e);
            cVar.g(this.f41353h);
            dVar.setWebChromeClient(cVar);
            return;
        }
        com.reactnativecommunity.webview.c cVar2 = (com.reactnativecommunity.webview.c) dVar.getWebChromeClient();
        if (cVar2 != null) {
            cVar2.onHideCustomView();
        }
        b bVar = new b(dVar);
        bVar.f(this.f41350e);
        bVar.g(this.f41353h);
        dVar.setWebChromeClient(bVar);
    }

    public final void j(p pVar, ReadableMap readableMap) {
        byte[] bArr;
        d webView = pVar.getWebView();
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                String string2 = readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "";
                Intrinsics.checkNotNull(string);
                webView.loadDataWithBaseURL(string2, string, this.f41358m, this.f41357l, null);
                return;
            }
            if (readableMap.hasKey("uri")) {
                String string3 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !Intrinsics.areEqual(url, string3)) {
                    if (readableMap.hasKey("method") && StringsKt.equals(readableMap.getString("method"), this.f41359n, true)) {
                        if (readableMap.hasKey("body")) {
                            String string4 = readableMap.getString("body");
                            try {
                                Intrinsics.checkNotNull(string4);
                                Charset forName = Charset.forName("UTF-8");
                                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                                bArr = string4.getBytes(forName);
                                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
                            } catch (UnsupportedEncodingException unused) {
                                Intrinsics.checkNotNull(string4);
                                bArr = string4.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
                            }
                        } else {
                            bArr = null;
                        }
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        Intrinsics.checkNotNull(string3);
                        webView.postUrl(string3, bArr);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        if (this.f41346a) {
                            ReadableArray array = readableMap.getArray("headers");
                            Intrinsics.checkNotNull(array);
                            Iterator<Object> it = array.toArrayList().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                            while (it.hasNext()) {
                                Object next = it.next();
                                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                                HashMap hashMap2 = (HashMap) next;
                                String str = (String) hashMap2.get("name");
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = (String) hashMap2.get(EventKeys.VALUE_KEY);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Locale ENGLISH = Locale.ENGLISH;
                                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                                String lowerCase = str.toLowerCase(ENGLISH);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (Intrinsics.areEqual("user-agent", lowerCase)) {
                                    webView.getSettings().setUserAgentString(str2);
                                } else {
                                    hashMap.put(str, str2);
                                }
                            }
                        } else {
                            ReadableMap map = readableMap.getMap("headers");
                            Intrinsics.checkNotNull(map);
                            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                            while (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                Locale ENGLISH2 = Locale.ENGLISH;
                                Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
                                String lowerCase2 = nextKey.toLowerCase(ENGLISH2);
                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                if (Intrinsics.areEqual("user-agent", lowerCase2)) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                } else {
                                    hashMap.put(nextKey, map.getString(nextKey));
                                }
                            }
                        }
                    }
                    Intrinsics.checkNotNull(string3);
                    webView.loadUrl(string3, hashMap);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(this.f41360o);
    }

    public final void l(p viewWrapper) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        ReadableMap readableMap = this.f41354i;
        if (readableMap != null) {
            j(viewWrapper, readableMap);
        }
        this.f41354i = null;
    }

    public final void m(p viewWrapper) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.c();
        webView.f41318q = null;
    }

    public final void n(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccess(z10);
    }

    public final void o(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowFileAccessFromFileURLs(z10);
    }

    public final void p(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z10);
    }

    public final void q(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.f41349d = z10;
        i0(webView);
    }

    public final void r(p viewWrapper, boolean z10) {
        WebChromeClient webChromeClient;
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        this.f41350e = z10;
        if (Build.VERSION.SDK_INT < 26 || (webChromeClient = webView.getWebChromeClient()) == null || !(webChromeClient instanceof com.reactnativecommunity.webview.c)) {
            return;
        }
        ((com.reactnativecommunity.webview.c) webChromeClient).f(z10);
    }

    public final void s(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setLayerType(Intrinsics.areEqual(str, "hardware") ? 2 : Intrinsics.areEqual(str, "software") ? 1 : 0, null);
    }

    public final void t(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        if (str != null) {
            this.f41356k = WebSettings.getDefaultUserAgent(viewWrapper.getWebView().getContext()) + " " + str;
        } else {
            this.f41356k = null;
        }
        g0(viewWrapper);
    }

    public final void u(p viewWrapper, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().setBasicAuthCredential((readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) ? new com.reactnativecommunity.webview.a(readableMap.getString("username"), readableMap.getString("password")) : null);
    }

    public final void v(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setCacheMode(z10 ? -1 : 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void w(p viewWrapper, String str) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        WebSettings settings = viewWrapper.getWebView().getSettings();
        int i10 = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i10 = 2;
                        break;
                    }
                    break;
                case -1215135800:
                    str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i10 = 3;
                        break;
                    }
                    break;
            }
        }
        settings.setCacheMode(i10);
    }

    public final void x(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        viewWrapper.getWebView().getSettings().setDomStorageEnabled(z10);
    }

    public final void y(String str) {
        this.f41351f = str;
    }

    public final void z(p viewWrapper, boolean z10) {
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        d webView = viewWrapper.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (O2.g.a("FORCE_DARK")) {
                O2.d.c(webView.getSettings(), z10 ? 2 : 0);
            }
            if (z10 && O2.g.a("FORCE_DARK_STRATEGY")) {
                O2.d.d(webView.getSettings(), 2);
            }
        }
    }
}
