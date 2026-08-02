package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.iol;
import defpackage.lqj;
import defpackage.ndk;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3360d6 extends D2 implements Eh {
    public long b;
    public final String c;
    public final String d;
    public final String e;
    public final Function1 f;
    public final InterfaceC3880x9 g;
    public C3334c6 h;
    public final String i;
    public C3571lb j;
    public boolean k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3360d6(Context context, long j, String str, String str2, String str3, Function1 function1, InterfaceC3880x9 interfaceC3880x9) {
        super(context);
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        function1.getClass();
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = function1;
        this.g = interfaceC3880x9;
        this.i = "d6";
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final Unit a(C3360d6 c3360d6, String str, Map map) {
        str.getClass();
        map.getClass();
        ViewParent parent = c3360d6.getParent();
        Y5 y5 = parent instanceof Y5 ? (Y5) parent : null;
        if (y5 != null) {
            str.getClass();
            map.getClass();
            InterfaceC3308b6 interfaceC3308b6 = y5.d;
            if (interfaceC3308b6 != null) {
                str.getClass();
                map.getClass();
                C c = ((U8) interfaceC3308b6).a.b;
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c instanceof GestureDetectorOnGestureListenerC3889xi ? (GestureDetectorOnGestureListenerC3889xi) c : null;
                if (gestureDetectorOnGestureListenerC3889xi != null) {
                    gestureDetectorOnGestureListenerC3889xi.b(str, map);
                }
            }
        }
        return Unit.a;
    }

    private final AdConfig getAdConfig() {
        return (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        return ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getRendering();
    }

    @Override // com.inmobi.media.Eh
    public final boolean c() {
        this.i.getClass();
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.D2
    public final C3468hb d() {
        C3494ib c3494ib = new C3494ib(true, null, getAdConfig().getCctEnabled(), 18);
        Context context = getContext();
        context.getClass();
        return new C3468hb(context, c3494ib, null, this, null, this.g, 140);
    }

    public final void e() {
        C3334c6 c3334c6 = new C3334c6("IN_CUSTOM_EXPAND", new ndk(this, 17), new iol(this, 4), new lqj(this, 27), this.g, null, 0L);
        setWebViewClient(c3334c6);
        this.h = c3334c6;
    }

    @Nullable
    public final C3571lb getLandingPageTelemetryControlInfo() {
        return this.j;
    }

    @Override // com.inmobi.media.Eh
    public long getViewTouchTimestamp() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        str.getClass();
        super.loadData(str, str2, str3);
        C3334c6 c3334c6 = this.h;
        if (c3334c6 != null) {
            c3334c6.d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        str.getClass();
        super.loadUrl(str);
        C3334c6 c3334c6 = this.h;
        if (c3334c6 != null) {
            c3334c6.d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.l) {
            this.l = true;
            Function1 function1 = this.f;
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            function1.invoke(C3372di.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.k) {
            this.k = true;
            Function1 function1 = this.f;
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            function1.invoke(C3372di.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(@Nullable C3571lb c3571lb) {
        this.j = c3571lb;
        C3334c6 c3334c6 = this.h;
        if (c3334c6 != null) {
            c3334c6.k = c3571lb;
            c3334c6.l = new C3519jb(c3571lb, c3334c6);
        }
    }

    public void setViewTouchTimestamp(long j) {
        this.b = j;
    }

    public static final Unit a(C3360d6 c3360d6, JSONObject jSONObject) {
        jSONObject.getClass();
        c3360d6.f.invoke(jSONObject);
        return Unit.a;
    }

    public static final Unit a(C3360d6 c3360d6) {
        InterfaceC3308b6 interfaceC3308b6;
        ViewParent parent = c3360d6.getParent();
        Y5 y5 = parent instanceof Y5 ? (Y5) parent : null;
        if (y5 != null && (interfaceC3308b6 = y5.d) != null) {
            C c = ((U8) interfaceC3308b6).a.b;
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = c instanceof GestureDetectorOnGestureListenerC3889xi ? (GestureDetectorOnGestureListenerC3889xi) c : null;
            if (gestureDetectorOnGestureListenerC3889xi != null) {
                gestureDetectorOnGestureListenerC3889xi.D();
            }
        }
        return Unit.a;
    }

    @Override // com.inmobi.media.Eh
    public final boolean a() {
        this.i.getClass();
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.Eh
    public final void a(String str) {
        str.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.e);
        hashMap.put("trigger", str);
        hashMap.put("impressionId", this.d);
        hashMap.put("adType", this.c);
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("BlockAutoRedirection", hashMap, EnumC3943zk.SDK);
    }
}
