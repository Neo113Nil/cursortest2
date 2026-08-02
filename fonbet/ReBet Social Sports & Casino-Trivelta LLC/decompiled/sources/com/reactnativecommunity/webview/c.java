package com.reactnativecommunity.webview;

import android.R;
import android.content.ComponentCallbacks2;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.reactnativecommunity.webview.d;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.AbstractC5338c;

/* loaded from: classes4.dex */
public abstract class c extends WebChromeClient implements LifecycleEventListener {

    /* renamed from: n, reason: collision with root package name */
    public static final FrameLayout.LayoutParams f41286n = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: a, reason: collision with root package name */
    public d f41287a;

    /* renamed from: b, reason: collision with root package name */
    public View f41288b;

    /* renamed from: c, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f41289c;

    /* renamed from: d, reason: collision with root package name */
    public PermissionRequest f41290d;

    /* renamed from: e, reason: collision with root package name */
    public List f41291e;

    /* renamed from: f, reason: collision with root package name */
    public GeolocationPermissions.Callback f41292f;

    /* renamed from: g, reason: collision with root package name */
    public String f41293g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41294h = false;

    /* renamed from: i, reason: collision with root package name */
    public List f41295i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public d.C0592d f41296j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41297k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41298l = false;

    /* renamed from: m, reason: collision with root package name */
    public PermissionListener f41299m = new PermissionListener() { // from class: com.reactnativecommunity.webview.b
        @Override // com.facebook.react.modules.core.PermissionListener
        public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            boolean d10;
            d10 = c.this.d(i10, strArr, iArr);
            return d10;
        }
    };

    public class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f41300a;

        public a(WebView webView) {
            this.f41300a = webView;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("targetUrl", str);
            WebView webView2 = this.f41300a;
            ((d) webView2).g(webView2, new pc.i(p.a(this.f41300a), createMap));
            return true;
        }
    }

    public c(d dVar) {
        this.f41287a = dVar;
    }

    public final PermissionAwareActivity b() {
        ComponentCallbacks2 currentActivity = this.f41287a.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    public ViewGroup c() {
        return (ViewGroup) this.f41287a.getThemedReactContext().getCurrentActivity().findViewById(R.id.content);
    }

    public final /* synthetic */ boolean d(int i10, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        List list;
        List list2;
        List list3;
        List list4;
        GeolocationPermissions.Callback callback;
        String str;
        this.f41294h = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            boolean z11 = iArr[i11] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.f41292f) != null && (str = this.f41293g) != null) {
                if (z11) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                this.f41292f = null;
                this.f41293g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z11 && (list4 = this.f41291e) != null) {
                    list4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z10 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z11 && (list3 = this.f41291e) != null) {
                    list3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z10 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z11 && (list2 = this.f41291e) != null) {
                    list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z10 = true;
            }
        }
        if (z10 && (permissionRequest = this.f41290d) != null && (list = this.f41291e) != null) {
            permissionRequest.grant((String[]) list.toArray(new String[0]));
            this.f41290d = null;
            this.f41291e = null;
        }
        if (this.f41295i.isEmpty()) {
            return true;
        }
        e(this.f41295i);
        return false;
    }

    public final synchronized void e(List list) {
        if (this.f41294h) {
            this.f41295i.addAll(list);
            return;
        }
        PermissionAwareActivity b10 = b();
        this.f41294h = true;
        b10.requestPermissions((String[]) list.toArray(new String[0]), 3, this.f41299m);
        this.f41295i.clear();
    }

    public void f(boolean z10) {
        this.f41297k = z10;
    }

    public void g(boolean z10) {
        this.f41298l = z10;
    }

    public void h(d.C0592d c0592d) {
        this.f41296j = c0592d;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (ReactBuildConfig.DEBUG) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f41298l) {
            webView2.setWebViewClient(new a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (AbstractC5338c.checkSelfPermission(this.f41287a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            callback.invoke(str, true, false);
            return;
        }
        this.f41292f = callback;
        this.f41293g = str;
        e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        View view = this.f41288b;
        if (view == null || view.getSystemUiVisibility() == 7942) {
            return;
        }
        this.f41288b.setSystemUiVisibility(7942);
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f41291e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i10 = 0;
        while (true) {
            String str = null;
            if (i10 >= length) {
                break;
            }
            String str2 = resources[i10];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.f41297k) {
                    this.f41291e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (AbstractC5338c.checkSelfPermission(this.f41287a.getThemedReactContext(), str) == 0) {
                    this.f41291e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f41291e.toArray(new String[0]));
            this.f41291e = null;
        } else {
            this.f41290d = permissionRequest;
            e(arrayList);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        String url = webView.getUrl();
        if (this.f41296j.a()) {
            return;
        }
        int a10 = p.a(webView);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("target", a10);
        createMap.putString("title", webView.getTitle());
        createMap.putString(EventKeys.URL, url);
        createMap.putBoolean("canGoBack", webView.canGoBack());
        createMap.putBoolean("canGoForward", webView.canGoForward());
        createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, i10 / 100.0f);
        UIManagerHelper.getEventDispatcherForReactTag(this.f41287a.getThemedReactContext(), a10).dispatchEvent(new pc.f(a10, createMap));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((RNCWebViewModule) this.f41287a.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }
}
