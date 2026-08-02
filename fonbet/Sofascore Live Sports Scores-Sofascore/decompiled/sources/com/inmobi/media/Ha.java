package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.Ha;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.c31;
import defpackage.dmi;
import defpackage.dsf;
import defpackage.fsf;
import defpackage.joa;
import defpackage.kx0;
import defpackage.ljg;
import defpackage.me4;
import defpackage.mz1;
import defpackage.pn0;
import defpackage.u59;
import defpackage.uf8;
import defpackage.v59;
import defpackage.w59;
import defpackage.x59;
import defpackage.xw3;
import defpackage.yx7;
import defpackage.zu4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ha {
    public final GestureDetectorOnGestureListenerC3889xi a;
    public final int b;
    public InterfaceC3880x9 c;

    public Ha(int i, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = i;
    }

    public static final void a(Ha ha, C3571lb c3571lb, fsf fsfVar, int i, String str, float f, boolean z) {
        String str2;
        try {
            InterfaceC3282a6 embeddedBrowserJsCallbacks = ha.a.getEmbeddedBrowserJsCallbacks();
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (embeddedBrowserJsCallbacks == null) {
                if (interfaceC3880x9 != null) {
                    String str3 = Ia.a;
                    str3.getClass();
                    ((C3906y9) interfaceC3880x9).b(str3, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                ha.a.getLandingPageHandler().a(Za.LPStartFailed, c3571lb, (Integer) 8002);
                return;
            }
            if (interfaceC3880x9 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x9).a(str4, "Custom expand called. Url: " + fsfVar.a);
            }
            Z5 z5 = Z5.values()[i];
            Z5 z52 = Z5.URL;
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = ha.a;
            try {
                if (z5 != z52) {
                    InterfaceC3282a6 embeddedBrowserJsCallbacks2 = gestureDetectorOnGestureListenerC3889xi.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks2 != null) {
                        ((T8) embeddedBrowserJsCallbacks2).a((String) fsfVar.a, z5, f, z, ha.a.getViewTouchTimestamp(), c3571lb);
                    }
                    ha.a.getLandingPageHandler().a(Za.LPStartSuccess, c3571lb, (Integer) null);
                    Ya ya = ha.a.getLandingPageHandler().d;
                    if (ya != null) {
                        ya.b("customExpand", str, (String) fsfVar.a);
                        return;
                    }
                    return;
                }
                try {
                    int a = gestureDetectorOnGestureListenerC3889xi.getLandingPageHandler().a("customExpand", str, (String) fsfVar.a, c3571lb, (U2) null);
                    InterfaceC3880x9 interfaceC3880x92 = ha.c;
                    if (interfaceC3880x92 != null) {
                        String str5 = Ia.a;
                        str5.getClass();
                        ((C3906y9) interfaceC3880x92).a(str5, "processCustomExpandRequest: " + a);
                    }
                    GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = ha.a;
                    if (a != 3) {
                        InterfaceC3282a6 embeddedBrowserJsCallbacks3 = gestureDetectorOnGestureListenerC3889xi2.getEmbeddedBrowserJsCallbacks();
                        if (embeddedBrowserJsCallbacks3 != null) {
                            V8.a(((T8) embeddedBrowserJsCallbacks3).a);
                            return;
                        }
                        return;
                    }
                    InterfaceC3282a6 embeddedBrowserJsCallbacks4 = gestureDetectorOnGestureListenerC3889xi2.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks4 != null) {
                        ((T8) embeddedBrowserJsCallbacks4).a((String) fsfVar.a, z5, f, z, ha.a.getViewTouchTimestamp(), c3571lb);
                    }
                    ha.a.getLandingPageHandler().a(Za.LPStartSuccess, c3571lb, (Integer) null);
                    Ya ya2 = ha.a.getLandingPageHandler().d;
                    if (ya2 != null) {
                        ya2.b("customExpand", str, (String) fsfVar.a);
                    }
                } catch (Exception e) {
                    e = e;
                    str2 = str;
                    ha.a.a(str2, "Unexpected error", "customExpand");
                    ha.a.getLandingPageHandler().a(Za.LPStartFailed, c3571lb, (Integer) 9);
                    Xb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
                    InterfaceC3880x9 interfaceC3880x93 = ha.c;
                    if (interfaceC3880x93 != null) {
                        String str6 = Ia.a;
                        str6.getClass();
                        ((C3906y9) interfaceC3880x93).b(str6, dmi.q("SDK encountered unexpected error in handling customExpand() request; ", e.getMessage()));
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str;
        }
    }

    public static final void b(Ha ha, String str) {
        Vf orientationProperties = ha.a.getOrientationProperties();
        str.getClass();
        orientationProperties.getClass();
        Vf vf = new Vf();
        vf.d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("forceOrientation", orientationProperties.b);
            optString.getClass();
            vf.b = optString;
            vf.a = jSONObject.optBoolean("allowOrientationChange", orientationProperties.a);
            String optString2 = jSONObject.optString("direction", orientationProperties.c);
            optString2.getClass();
            vf.c = optString2;
            if (!Intrinsics.c(vf.b, U3.i.D) && !Intrinsics.c(vf.b, U3.i.C)) {
                vf.b = "none";
            }
            if (!Intrinsics.c(vf.c, "left") && !Intrinsics.c(vf.c, "right")) {
                vf.c = "right";
            }
        } catch (JSONException unused) {
            vf = null;
        }
        if (vf != null) {
            ha.a.getWebViewFactory().a(new uf8(2, ha, vf));
        }
    }

    public static final void c(Ha ha, String str, String str2) {
        C3571lb c3571lb;
        try {
            C3597mb c3597mb = ha.a.getLandingPageHandler().f;
            if (c3597mb != null) {
                String a = AbstractC3339cb.a(str2);
                C3468hb landingPageHandler = ha.a.getLandingPageHandler();
                int i = landingPageHandler.i + 1;
                landingPageHandler.i = i;
                c3571lb = new C3571lb(c3597mb, a, i, SystemClock.elapsedRealtime());
            } else {
                c3571lb = null;
            }
            if (c3571lb != null) {
                c3571lb.f = "IN_NATIVE";
            }
            ha.a.getLandingPageHandler().d("openEmbedded", str, str2, c3571lb);
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "openEmbedded");
            Xb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).b(str3, dmi.q("SDK encountered unexpected error in handling openEmbedded() request from creative; ", e.getMessage()));
            }
        }
    }

    public static final void d(Ha ha, String str, String str2) {
        C3468hb.a(ha.a.getLandingPageHandler(), "openWithoutTracker", str, str2, (C3571lb) null, 8);
    }

    public static final void e(Ha ha, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = ha.a;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.d(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            gestureDetectorOnGestureListenerC3889xi.b(str, str2.subSequence(i, length + 1).toString());
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "playVideo");
            Xb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).b(str3, dmi.q("SDK encountered unexpected error in handling playVideo() request from creative; ", e.getMessage()));
            }
        }
    }

    public static final void f(Ha ha, String str, String str2) {
        try {
            ha.a.getSiblingWebviewManager().b(ha.a.getRoute().b, str, str2);
        } catch (Exception e) {
            ha.a.a(C4018c8.j, Oi.a(str, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).b(str3, dmi.q("SDK encountered unexpected error in handling sendMessage() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void asyncPing(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "asyncPing called: ".concat(str2));
        }
        if (!URLUtil.isValidUrl(str2)) {
            this.a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            zu4 a = ((F9) Ve.c.getValue()).a(new Xe(str2, null, null, null, null, false, 62));
            yx7 yx7Var = new yx7(this, 17);
            a.getClass();
            xw3.L(L9.c, null, null, new I3(a, yx7Var, null), 3);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, dmi.q("SDK encountered internal error in handling asyncPing() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "cancelSaveContent called. mediaId:", str2));
        }
    }

    @JavascriptInterface
    public final void close(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "close called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!a.P0) {
            ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
            defpackage.p3 p3Var = new defpackage.p3(24, a, this, str);
            executorC3520jc.getClass();
            executorC3520jc.a.post(p3Var);
            return;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.c;
        if (interfaceC3880x93 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x93).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            a.h();
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "closeCustomExpand called.");
        }
        if (this.b != 1) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, ljg.j(this.b, "closeCustomExpand called in incorrect Ad type: "));
                return;
            }
            return;
        }
        if (this.a != null) {
            new Handler(this.a.getContainerContext().getMainLooper()).post(new u59(this, 2));
            return;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.c;
        if (interfaceC3880x93 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x93).b(str4, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void createVideoPlayer(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "createVideoPlayer is called with config - ", str2));
        }
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3907ya.a(new JSONObject(str2), HtmlVideoPlayerRequest.class, null, null));
                if (htmlVideoPlayerRequest != null) {
                    obj = xw3.L(L9.f, null, null, new Ba(this, htmlVideoPlayerRequest, null), 3);
                } else {
                    EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = Unit.a;
                }
            } catch (JSONException e) {
                EnumC3879x8 enumC3879x82 = EnumC3879x8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3880x9 interfaceC3880x92 = this.c;
                if (interfaceC3880x92 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x92).a(str4, "Error while creating config Json.", e);
                    obj = Unit.a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3879x8 enumC3879x83 = EnumC3879x8.VIDEO_READY;
        a(str, jSONObject);
        Unit unit = Unit.a;
    }

    @JavascriptInterface
    public final void customExpand(@Nullable String str, @Nullable String str2, int i, float f, boolean z, boolean z2) {
        C3571lb c3571lb;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "customExpand called");
        }
        if (this.a.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x93).b(str5, ljg.j(this.b, "customExpand called in incorrect Ad type: "));
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                boolean z4 = Intrinsics.d(str2.charAt(!z3 ? i2 : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() != 0) {
                if (i < 0 || i >= Z5.values().length) {
                    this.a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
                    this.a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                C3597mb c3597mb = this.a.getLandingPageHandler().f;
                if (c3597mb != null) {
                    String a = AbstractC3339cb.a(str2);
                    C3468hb landingPageHandler = this.a.getLandingPageHandler();
                    int i3 = landingPageHandler.i + 1;
                    landingPageHandler.i = i3;
                    c3571lb = new C3571lb(c3597mb, a, i3, SystemClock.elapsedRealtime());
                } else {
                    c3571lb = null;
                }
                if (c3571lb != null) {
                    c3571lb.f = "IN_CUSTOM";
                }
                this.a.getLandingPageHandler().a(Za.LPClickStart, c3571lb, (Integer) 8008);
                a(str, str2, i, f, z2, c3571lb);
                return;
            }
        }
        this.a.a(str, "Invalid " + i, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(@Nullable final String str, @NotNull final String str2, final float f, final boolean z) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b == 1) {
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
                gestureDetectorOnGestureListenerC3889xi.a(str, "Invalid screenPercentage", "customExpandInNative");
                return;
            } else {
                AbstractC3632nk.a(new Runnable() { // from class: y59
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ha.a(Ha.this, str, str2, f, z);
                    }
                });
                return;
            }
        }
        InterfaceC3880x9 interfaceC3880x93 = this.c;
        if (interfaceC3880x93 != null) {
            String str5 = Ia.a;
            str5.getClass();
            ((C3906y9) interfaceC3880x93).b(str5, ljg.j(this.b, "customExpandInNative called in incorrect Ad type: "));
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(@Nullable String str) {
        xw3.L(L9.f, null, null, new Ca(this, null), 3);
    }

    @JavascriptInterface
    public final void destroyWebView(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null && a.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            joa joaVar = Oi.a;
            JSONObject a2 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3889xi.a("destroyWebView", a2);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
            v59 v59Var = new v59(this, str2, 2);
            executorC3520jc.getClass();
            executorC3520jc.a.post(v59Var);
            return;
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        joa joaVar2 = Oi.a;
        JSONObject a3 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
        a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        gestureDetectorOnGestureListenerC3889xi2.a("destroyWebView", a3);
    }

    @JavascriptInterface
    public final void disableBackButton(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "disableBackButton called");
        }
        this.a.getWebViewFactory().a(new c31(z, 7));
    }

    @JavascriptInterface
    public final void disableCloseRegion(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "disableCloseRegion called");
        }
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        x59 x59Var = new x59(this, z, str, 0);
        executorC3520jc.getClass();
        executorC3520jc.a.post(x59Var);
    }

    @JavascriptInterface
    public final void enableNativeGestures(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "enableNativeGestures called with enabled: " + z);
        }
        this.a.setEnableNativeGestures(z);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "enableTouchBeginCallback called with enabled: " + z);
        }
        this.a.setEnableTouchBeginCallback(z);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "enableTouchEndCallback called with enabled: " + z);
        }
        this.a.setEnableTouchEndCallback(z);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x9).a(str4, "executeVideoPlayerActions is called with action - " + str2 + ", " + str3);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", str2);
        jSONObject.put("config", str3);
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            EnumC3661on a = a(str2);
            if (a != null) {
                xw3.L(L9.f, null, null, new Da(this, a, jSONObject, null), 3);
                return;
            }
            EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_READY;
            a(str, jSONObject2);
            Unit unit = Unit.a;
        } catch (JSONException e) {
            EnumC3879x8 enumC3879x82 = EnumC3879x8.VIDEO_READY;
            a(str, jSONObject2);
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x92).a(str5, "Error while creating action Json.", e);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        try {
            InterfaceC3880x9 interfaceC3880x9 = this.c;
            if (interfaceC3880x9 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).a(str3, "fireAdFailed called with ec " + str2 + ".");
            }
            if (StringsKt.R(str2)) {
                str2 = "3100";
            }
            this.a.d(b(str2));
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, dmi.q("SDK encountered unexpected error in handling fireAdFailed() signal from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(@Nullable String str) {
        try {
            InterfaceC3880x9 interfaceC3880x9 = this.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).a(str2, "fireAdReady called.");
            }
            this.a.q();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, dmi.q("SDK encountered unexpected error in handling fireAdReady() signal from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.i();
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9;
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, "fireSkip is called");
        }
        if (this.a == null && (interfaceC3880x9 = this.c) != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).b(str3, "Found a null instance of render view!");
        }
        this.a.P();
    }

    @JavascriptInterface
    @Nullable
    public final String getAdContext(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            InterfaceC3871x0 adPodHandler = a.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC3587m1) adPodHandler).v();
            }
            return null;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(@Nullable String str, @Nullable String str2) {
        J2 j2;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x93 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x93 != null) {
            String str5 = GestureDetectorOnGestureListenerC3889xi.i1;
            str5.getClass();
            ((C3906y9) interfaceC3880x93).a(str5, "getBlob");
        }
        if (str == null || str2 == null || (j2 = gestureDetectorOnGestureListenerC3889xi.k0) == null) {
            return;
        }
        ((AbstractC3587m1) j2).a(str, str2, gestureDetectorOnGestureListenerC3889xi, gestureDetectorOnGestureListenerC3889xi.getImpressionId());
    }

    @JavascriptInterface
    @NotNull
    public final String getCurrentPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
        if (gestureDetectorOnGestureListenerC3889xi2 == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 == null) {
                return "";
            }
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC3889xi2.getCurrentPositionMonitor()) {
            this.a.G = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new u59(this, 0));
            while (true) {
                gestureDetectorOnGestureListenerC3889xi = this.a;
                if (gestureDetectorOnGestureListenerC3889xi.G) {
                    try {
                        gestureDetectorOnGestureListenerC3889xi.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3889xi.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            return a.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 == null) {
            return 0;
        }
        String str3 = Ia.a;
        str3.getClass();
        ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    @NotNull
    public final String getDefaultPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.a.getDefaultPositionMonitor()) {
            this.a.F = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new u59(this, 1));
            while (true) {
                gestureDetectorOnGestureListenerC3889xi = this.a;
                if (gestureDetectorOnGestureListenerC3889xi.F) {
                    try {
                        gestureDetectorOnGestureListenerC3889xi.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3889xi.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            Jc mediaProcessor = gestureDetectorOnGestureListenerC3889xi.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x93).b(str4, dmi.q("SDK encountered unexpected error in handling getDeviceVolume() request from creative; ", e.getMessage()));
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            F5 f5 = F5.a;
            f5.getClass();
            return ((Number) F5.f.getValue(f5, F5.b[0])).intValue();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, dmi.q("SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; ", e.getMessage()));
            }
            return 0;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getMaxSize(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.a.getContainerContext();
                containerContext2.getClass();
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            dsf dsfVar = new dsf();
            dsfVar.a = N3.b(frameLayout.getWidth() / R5.b());
            dsf dsfVar2 = new dsf();
            dsfVar2.a = N3.b(frameLayout.getHeight() / R5.b());
            if (this.a.getFullScreenActivity() != null && (dsfVar.a == 0 || dsfVar2.a == 0)) {
                Aa aa = new Aa(frameLayout, this.c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(aa);
                xw3.L(L9.c, null, null, new Ea(aa, dsfVar, dsfVar2, null), 3);
            }
            try {
                jSONObject.put("width", dsfVar.a);
                jSONObject.put("height", dsfVar2.a);
            } catch (JSONException e) {
                InterfaceC3880x9 interfaceC3880x92 = this.c;
                if (interfaceC3880x92 != null) {
                    String str3 = Ia.a;
                    str3.getClass();
                    ((C3906y9) interfaceC3880x92).a(str3, "Error while creating max size Json.", e);
                }
            }
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x93).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e2) {
            this.a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3880x9 interfaceC3880x94 = this.c;
            if (interfaceC3880x94 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x94).b(str5, dmi.q("SDK encountered unexpected error in handling getMaxSize() request from creative; ", e2.getMessage()));
            }
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientation(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getOrientation called");
        }
        byte g = R5.g();
        return g == 1 ? "0" : g == 3 ? "90" : g == 2 ? "180" : g == 4 ? "270" : com.ironsource.Y1.f;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientationProperties(@Nullable String str) {
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null) {
            a = this.a;
        }
        String str2 = a.getOrientationProperties().d;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "getOrientationProperties called: ", str2));
        }
        str2.getClass();
        return str2;
    }

    @JavascriptInterface
    @NotNull
    public final String getPlacementType(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getPlacementType called");
        }
        return 1 == this.b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatform(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 == null) {
            return "android";
        }
        String str2 = Ia.a;
        str2.getClass();
        ((C3906y9) interfaceC3880x9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatformVersion(@Nullable String str) {
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str2, com.appsflyer.internal.i.h(str2, "getPlatformVersion. Version:", valueOf));
        }
        return valueOf;
    }

    @JavascriptInterface
    @Nullable
    public final String getPlaybackState(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        fsf fsfVar = new fsf();
        xw3.L(L9.f, null, null, new Fa(this, fsfVar, countDownLatch, null), 3);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC3880x9 = this.c) != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) fsfVar.a;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getRenderableAdIndexes(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
            }
            String jSONArray = new JSONArray().toString();
            jSONArray.getClass();
            return jSONArray;
        }
        JSONArray renderableAdIndexes = a.getRenderableAdIndexes();
        InterfaceC3880x9 interfaceC3880x93 = this.c;
        if (interfaceC3880x93 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x93).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String jSONArray2 = renderableAdIndexes.toString();
        jSONArray2.getClass();
        return jSONArray2;
    }

    @JavascriptInterface
    @Nullable
    public final String getSafeArea(@Nullable String str) {
        JSONObject safeArea = this.a.getSafeArea();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getScreenSize(@Nullable String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", R5.h().a);
            jSONObject.put("height", R5.h().b);
            InterfaceC3880x9 interfaceC3880x9 = this.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).c(str2, "Message:Width x Height : " + R5.h().a + "x" + R5.h().b);
            }
        } catch (JSONException unused) {
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, dmi.q("SDK encountered unexpected error while getting screen dimensions; ", e.getMessage()));
            }
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        InterfaceC3880x9 interfaceC3880x93 = this.c;
        if (interfaceC3880x93 != null) {
            String str4 = Ia.a;
            ((C3906y9) interfaceC3880x93).a(str4, com.appsflyer.internal.i.h(str4, "getScreenSize called:", jSONObject2));
        }
        return jSONObject2;
    }

    @JavascriptInterface
    @NotNull
    public final String getSdkVersion(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 == null) {
            return "11.3.0";
        }
        String str2 = Ia.a;
        str2.getClass();
        ((C3906y9) interfaceC3880x9).a(str2, "getSdkVersion called. Version:11.3.0");
        return "11.3.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 == null) {
                return 0L;
            }
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = a.getShowTimeStamp();
        InterfaceC3880x9 interfaceC3880x93 = this.c;
        if (interfaceC3880x93 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x93).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    @NotNull
    public final String getState(@Nullable String str) {
        String viewState = this.a.getViewState();
        Locale locale = Locale.ENGLISH;
        String k = com.appsflyer.internal.i.k(locale, viewState, locale);
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            ((C3906y9) interfaceC3880x9).c(str2, com.appsflyer.internal.i.h(str2, "getState called:", k));
        }
        return k;
    }

    @JavascriptInterface
    @NotNull
    public final String getVersion(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 == null) {
            return "2.0";
        }
        String str2 = Ia.a;
        str2.getClass();
        ((C3906y9) interfaceC3880x9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "impressionFired is called");
        }
        this.a.C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [kotlin.Unit] */
    @JavascriptInterface
    public final void incentCompleted(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "incentCompleted called. IncentData:", str2));
        }
        if (str2 == null) {
            try {
                this.a.getListener().b(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3880x9 interfaceC3880x92 = this.c;
                if (interfaceC3880x92 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x92).b(str4, dmi.q("SDK encountered unexpected error in handling onUserInteraction() signal from creative; ", e.getMessage()));
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    next.getClass();
                    String str5 = next;
                    hashMap.put(str5, jSONObject.get(str5));
                }
                try {
                    this.a.getListener().b(hashMap);
                    this = Unit.a;
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC3880x9 interfaceC3880x93 = this.c;
                    if (interfaceC3880x93 != null) {
                        String str6 = Ia.a;
                        str6.getClass();
                        ((C3906y9) interfaceC3880x93).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit = Unit.a;
                    }
                }
            } catch (JSONException unused) {
                this.a.getListener().b(new HashMap());
                Unit unit2 = Unit.a;
            }
        } catch (Exception e3) {
            this.a.a(str, "Unexpected error", "incentCompleted");
            InterfaceC3880x9 interfaceC3880x94 = this.c;
            if (interfaceC3880x94 != null) {
                String str7 = Ia.a;
                str7.getClass();
                ((C3906y9) interfaceC3880x94).b(str7, dmi.q("SDK encountered unexpected error in handling onUserInteraction() signal from creative; ", e3.getMessage()));
                Unit unit3 = Unit.a;
            }
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null) {
            a = this.a;
        }
        return a.L;
    }

    @JavascriptInterface
    @NotNull
    public final String isDeviceMuted(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "isDeviceMuted called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            if (interfaceC3880x92 == null) {
                return "false";
            }
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z = false;
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            mediaProcessor.getClass();
            InterfaceC3880x9 interfaceC3880x93 = mediaProcessor.b;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = AbstractC3424fj.a;
            if (context != null) {
                AudioManager audioManager = null;
                try {
                    Object systemService = context.getSystemService("audio");
                    if (!(systemService instanceof AudioManager)) {
                        systemService = null;
                    }
                    audioManager = (AudioManager) systemService;
                } catch (Throwable unused) {
                }
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z = true;
                    }
                }
            }
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x94 = this.c;
            if (interfaceC3880x94 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x94).b(str5, dmi.q("SDK encountered unexpected error in checking if device is muted; ", e.getMessage()));
            }
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    @NotNull
    public final String isHeadphonePlugged(@Nullable String str) {
        boolean z;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "isHeadphonePlugged called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            if (interfaceC3880x92 == null) {
                return "false";
            }
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            mediaProcessor.getClass();
            mediaProcessor.getClass();
            z = Jc.b();
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x93).b(str5, dmi.q("SDK encountered unexpected error in checking if headphones are plugged-in; ", e.getMessage()));
            }
            z = false;
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public final boolean isViewable(@Nullable String str) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            return gestureDetectorOnGestureListenerC3889xi.J == EnumC3481ho.VISIBLE;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(@Nullable String str, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "loadAd is called with index - " + i);
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            a.b(i);
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str4 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str4, com.appsflyer.internal.i.h(str4, "loadWebView called with html: ", str3));
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null && a.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x92).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            joa joaVar = Oi.a;
            JSONObject a2 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3889xi.a("loadWebView", a2);
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a3 = a();
        if (a3 == null || a3.getPlacementType() != 1) {
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str6 = Ia.a;
                str6.getClass();
                ((C3906y9) interfaceC3880x93).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            joa joaVar2 = Oi.a;
            JSONObject a4 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC3889xi2.a("loadWebView", a4);
            return;
        }
        if (str2 == null || StringsKt.R(str2)) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi3 = this.a;
            joa joaVar3 = Oi.a;
            JSONObject a5 = AbstractC3734rj.a("", "targetViewId", "id", "");
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            gestureDetectorOnGestureListenerC3889xi3.a("loadWebView", a5);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.a.a("loadWebView", Oi.a(str2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        w59 w59Var = new w59(this, str2, str3, 0);
        executorC3520jc.getClass();
        executorC3520jc.a.post(w59Var);
    }

    @JavascriptInterface
    public final void log(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).c(str3, com.appsflyer.internal.i.h(str3, "Log called. Message:", str2));
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3372di c3372di = GestureDetectorOnGestureListenerC3889xi.g1;
        c3372di.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC3889xi.j1.getValue(c3372di, C3372di.a[0])).booleanValue() || str2 == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3889xi.getListener().a(str2);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (str2 == null) {
            if (interfaceC3880x9 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x9).b(str4, "eventType is null");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            String str5 = Ia.a;
            str5.getClass();
            ((C3906y9) interfaceC3880x9).a(str5, "logTelemetryEvent is called: ".concat(str2));
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        Hi hi = gestureDetectorOnGestureListenerC3889xi.e0;
        if (hi != null) {
            hi.a(str2, str3);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(@Nullable String str, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "onAudioStateChanged is called: " + i);
        }
        Z1.b.getClass();
        Z1 z1 = (Z1) Z1.c.get(i);
        if (z1 == null) {
            z1 = Z1.d;
        }
        if (z1 != Z1.d) {
            this.a.getListener().a(z1);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "onAudioMuteInteraction is called: " + z);
        }
        this.a.getListener().a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [kotlin.Unit] */
    @JavascriptInterface
    public final void onUserInteraction(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi != null && !gestureDetectorOnGestureListenerC3889xi.a()) {
            this.a.a("onUserInteraction");
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            ((C3906y9) interfaceC3880x92).a(str4, com.appsflyer.internal.i.h(str4, "onUserInteraction called. Params:", str2));
        }
        if (str2 == null) {
            try {
                this.a.a(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3880x9 interfaceC3880x93 = this.c;
                if (interfaceC3880x93 != null) {
                    String str5 = Ia.a;
                    str5.getClass();
                    ((C3906y9) interfaceC3880x93).b(str5, dmi.q("SDK encountered unexpected error in handling onUserInteraction() signal from creative; ", e.getMessage()));
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    next.getClass();
                    String str6 = next;
                    hashMap.put(str6, jSONObject.get(str6));
                }
                try {
                    this.a.a(hashMap);
                    this = Unit.a;
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC3880x9 interfaceC3880x94 = this.c;
                    if (interfaceC3880x94 != null) {
                        String str7 = Ia.a;
                        str7.getClass();
                        ((C3906y9) interfaceC3880x94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit = Unit.a;
                    }
                }
            } catch (Exception e3) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3880x9 interfaceC3880x95 = this.c;
                if (interfaceC3880x95 != null) {
                    String str8 = Ia.a;
                    str8.getClass();
                    ((C3906y9) interfaceC3880x95).b(str8, dmi.q("SDK encountered unexpected error in handling onUserInteraction() signal from creative; ", e3.getMessage()));
                    Unit unit2 = Unit.a;
                }
            }
        } catch (JSONException unused) {
            this.a.a(new HashMap());
            Unit unit3 = Unit.a;
        }
    }

    @JavascriptInterface
    public final void open(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "open called");
        }
        boolean a = this.a.a();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (!a) {
            gestureDetectorOnGestureListenerC3889xi.a("open");
            return;
        }
        if (!gestureDetectorOnGestureListenerC3889xi.P0) {
            gestureDetectorOnGestureListenerC3889xi.s();
            AbstractC3632nk.a(new w59(this, str, str2, 2));
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "openEmbedded called");
        }
        boolean a = this.a.a();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (!a) {
            gestureDetectorOnGestureListenerC3889xi.a("openEmbedded");
            return;
        }
        if (!gestureDetectorOnGestureListenerC3889xi.P0) {
            gestureDetectorOnGestureListenerC3889xi.s();
            AbstractC3632nk.a(new w59(this, str, str2, 5));
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        C3571lb c3571lb;
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x9).a(str4, "open External");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x92).b(str5, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC3889xi.P0) {
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str6 = Ia.a;
                str6.getClass();
                ((C3906y9) interfaceC3880x93).b(str6, "open called on unloaded ad");
                return;
            }
            return;
        }
        boolean a = gestureDetectorOnGestureListenerC3889xi.a();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
        if (!a) {
            gestureDetectorOnGestureListenerC3889xi2.a("openExternal");
            return;
        }
        gestureDetectorOnGestureListenerC3889xi2.s();
        InterfaceC3880x9 interfaceC3880x94 = this.c;
        if (interfaceC3880x94 != null) {
            String str7 = Ia.a;
            str7.getClass();
            StringBuilder s = mz1.s("openExternal called with url: ", str2, " , schema: ", AbstractC3339cb.a(str2), ", fallback - ");
            s.append(str3);
            ((C3906y9) interfaceC3880x94).a(str7, s.toString());
        }
        C3597mb c3597mb = this.a.getLandingPageHandler().f;
        if (c3597mb != null) {
            String a2 = AbstractC3339cb.a(str2);
            C3468hb landingPageHandler = this.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c3571lb = new C3571lb(c3597mb, a2, i, SystemClock.elapsedRealtime());
        } else {
            c3571lb = null;
        }
        if (c3571lb != null) {
            c3571lb.f = "EX_NATIVE";
        }
        this.a.getLandingPageHandler().a(Za.LPClickStart, c3571lb, (Integer) null);
        C3468hb landingPageHandler2 = this.a.getLandingPageHandler();
        landingPageHandler2.getClass();
        if (str2 != null) {
            landingPageHandler2.f(str, str2, str3, c3571lb);
            return;
        }
        if (str3 != null) {
            landingPageHandler2.f(str, str3, null, c3571lb);
            return;
        }
        landingPageHandler2.a(Za.LPStartFailed, c3571lb, (Integer) 2);
        Ya ya = landingPageHandler2.d;
        if (ya != null) {
            ya.a(str, "Empty url and fallback url", "openExternal");
        }
        InterfaceC3880x9 interfaceC3880x95 = landingPageHandler2.g;
        if (interfaceC3880x95 != null) {
            ((C3906y9) interfaceC3880x95).b(CampaignEx.JSON_KEY_HB, "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public final void openInlineInstaller(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x9).a(str4, "openInlineInstaller called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x92).b(str5, "openInlineInstaller called on unloaded ad");
                return;
            }
            return;
        }
        if (!z && !gestureDetectorOnGestureListenerC3889xi.a()) {
            this.a.a("openInlineInstaller");
        } else {
            this.a.s();
            AbstractC3632nk.a(new kx0(this, str, str3, str2, 3));
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "openWithoutTracker called");
        }
        boolean a = this.a.a();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (!a) {
            gestureDetectorOnGestureListenerC3889xi.a("openWithoutTracker");
            return;
        }
        if (!gestureDetectorOnGestureListenerC3889xi.P0) {
            AbstractC3632nk.a(new w59(this, str, str2, 3));
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(@Nullable String str, @Nullable String str2, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "ping called");
        }
        if (this.a == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.d(str2.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3880x9 interfaceC3880x93 = this.c;
                if (interfaceC3880x93 != null) {
                    String str5 = Ia.a;
                    str5.getClass();
                    ((C3906y9) interfaceC3880x93).a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    E3 e3 = E3.a;
                    E3.a(str2, z, this.c);
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "ping");
                    Xb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3880x9 interfaceC3880x94 = this.c;
                    if (interfaceC3880x94 != null) {
                        String str6 = Ia.a;
                        str6.getClass();
                        ((C3906y9) interfaceC3880x94).b(str6, dmi.q("SDK encountered unexpected error in handling ping() request from creative; ", e.getMessage()));
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(@Nullable String str, @Nullable String str2, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "openInWebView called");
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.d(str2.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3880x9 interfaceC3880x92 = this.c;
                if (interfaceC3880x92 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x92).a(str4, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    E3 e3 = E3.a;
                    Ug.a(Rg.REGULAR, new C3874x3(str2, z, this.c, null));
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "pingInWebView");
                    Xb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3880x9 interfaceC3880x93 = this.c;
                    if (interfaceC3880x93 != null) {
                        String str5 = Ia.a;
                        str5.getClass();
                        ((C3906y9) interfaceC3880x93).b(str5, dmi.q("SDK encountered unexpected error in handling pingInWebView() request from creative; ", e.getMessage()));
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "pingV2 called with JSON: >>> " + str2 + " <<<");
        }
        try {
            this.a.g(str2);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "ping");
            this.a.a(e);
            Xb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, dmi.q("SDK encountered unexpected error in handling ping() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(@Nullable String str, @Nullable String str2) {
        if (this.a == null) {
            InterfaceC3880x9 interfaceC3880x9 = this.c;
            if (interfaceC3880x9 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.d(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && kotlin.text.c.v(str2, "http", false) && (kotlin.text.c.n(str2, "mp4", false) || kotlin.text.c.n(str2, "avi", false) || kotlin.text.c.n(str2, "m4v", false))) {
                InterfaceC3880x9 interfaceC3880x92 = this.c;
                if (interfaceC3880x92 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x92).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.a.getContainerContext().getMainLooper()).post(new w59(this, str, str2, 1));
                return;
            }
        }
        this.a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3889xi.l(str);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x93).b(str4, dmi.q("SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                Jc mediaProcessor = gestureDetectorOnGestureListenerC3889xi.getMediaProcessor();
                if (mediaProcessor == null || mediaProcessor.d != null) {
                    return;
                }
                C3624nc c3624nc = new C3624nc(new Fc(mediaProcessor, str));
                mediaProcessor.d = c3624nc;
                c3624nc.b();
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3880x9 interfaceC3880x93 = this.c;
                if (interfaceC3880x93 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x93).b(str4, dmi.q("SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; ", e.getMessage()));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(@Nullable String str) {
        Context context;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                Jc mediaProcessor = gestureDetectorOnGestureListenerC3889xi.getMediaProcessor();
                if (mediaProcessor == null || (context = AbstractC3424fj.a) == null || mediaProcessor.e != null) {
                    return;
                }
                C3624nc c3624nc = new C3624nc(new Hc(mediaProcessor, str, context, new Handler(Looper.getMainLooper())));
                mediaProcessor.e = c3624nc;
                c3624nc.b();
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3880x9 interfaceC3880x93 = this.c;
                if (interfaceC3880x93 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x93).b(str4, dmi.q("SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; ", e.getMessage()));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                Jc mediaProcessor = gestureDetectorOnGestureListenerC3889xi.getMediaProcessor();
                if (mediaProcessor == null || mediaProcessor.f != null) {
                    return;
                }
                C3624nc c3624nc = new C3624nc(new Ec(mediaProcessor, str));
                mediaProcessor.f = c3624nc;
                c3624nc.b();
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3880x9 interfaceC3880x93 = this.c;
                if (interfaceC3880x93 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x93).b(str4, dmi.q("SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; ", e.getMessage()));
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(@Nullable String str, @Nullable String str2) {
        J2 j2;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x93 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x93 != null) {
            String str5 = GestureDetectorOnGestureListenerC3889xi.i1;
            str5.getClass();
            ((C3906y9) interfaceC3880x93).a(str5, "saveBlob");
        }
        if (str2 == null || (j2 = gestureDetectorOnGestureListenerC3889xi.k0) == null) {
            return;
        }
        ((AbstractC3587m1) j2).a(str2, gestureDetectorOnGestureListenerC3889xi.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str4 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str4, com.appsflyer.internal.i.h(str4, "sendMessage called with message: ", str3));
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null && a.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x92).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            joa joaVar = Oi.a;
            JSONObject a2 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3889xi.a(C4018c8.j, a2);
            return;
        }
        if (str2 == null || StringsKt.R(str2)) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            joa joaVar2 = Oi.a;
            JSONObject a3 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            gestureDetectorOnGestureListenerC3889xi2.a(C4018c8.j, a3);
            return;
        }
        if (str3 == null || StringsKt.R(str3)) {
            this.a.a(C4018c8.j, Oi.a(str2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        w59 w59Var = new w59(this, str2, str3, 4);
        executorC3520jc.getClass();
        executorC3520jc.a.post(w59Var);
    }

    @JavascriptInterface
    public final void setAdContext(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "setAdContext is called ", str2));
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            InterfaceC3871x0 adPodHandler = a.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC3587m1) adPodHandler).c(str2);
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).b(str4, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "setOrientationProperties called: ".concat(str2));
        }
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        v59 v59Var = new v59(this, str2, 1);
        executorC3520jc.getClass();
        executorC3520jc.a.post(v59Var);
    }

    @JavascriptInterface
    public final void showAd(@Nullable String str, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "showAd is called with index " + i);
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            a.c(i);
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "showAlert: ", str2));
        }
    }

    @JavascriptInterface
    public final void showWebView(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null && a.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
            if (str2 == null) {
                str2 = "";
            }
            joa joaVar = Oi.a;
            JSONObject a2 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3889xi.a("showWebView", a2);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
            v59 v59Var = new v59(this, str2, 0);
            executorC3520jc.getClass();
            executorC3520jc.a.post(v59Var);
            return;
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        joa joaVar2 = Oi.a;
        JSONObject a3 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
        a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        gestureDetectorOnGestureListenerC3889xi2.a("showWebView", a3);
    }

    @JavascriptInterface
    public final void storePicture(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        me4.p(str2, str3, str4);
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str5 = Ia.a;
            str5.getClass();
            ((C3906y9) interfaceC3880x9).a(str5, "submitAdReport called");
        }
        this.a.a(str2, str4, Intrinsics.c(str3, "1"));
    }

    @JavascriptInterface
    @NotNull
    public final String supports(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "Checking support for: ", str2));
        }
        String valueOf = String.valueOf(this.a.n(str2));
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).c(str4, "Message:" + str2 + " support: " + valueOf);
        }
        return valueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a != null) {
            return a.V();
        }
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (interfaceC3880x92 == null) {
            return 0L;
        }
        String str3 = Ia.a;
        str3.getClass();
        ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null) {
            a = this.a;
        }
        try {
            a.E();
        } catch (Exception e) {
            a.a(str, "Unexpected error", "unload");
            Xb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, dmi.q("SDK encountered an expected error in handling the unload() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.c;
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3889xi.X();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str4 = Ia.a;
                str4.getClass();
                ((C3906y9) interfaceC3880x93).b(str4, dmi.q("SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).a(str4, "Unregister device mute event listener ...");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3624nc c3624nc = mediaProcessor.d;
                if (c3624nc != null) {
                    c3624nc.a();
                }
                mediaProcessor.d = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x93).b(str5, dmi.q("SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).a(str4, "Unregister device volume change listener ...");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3624nc c3624nc = mediaProcessor.e;
                if (c3624nc != null) {
                    c3624nc.a();
                }
                mediaProcessor.e = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x93).b(str5, dmi.q("SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(@Nullable String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        InterfaceC3880x9 interfaceC3880x92 = this.c;
        if (gestureDetectorOnGestureListenerC3889xi == null) {
            if (interfaceC3880x92 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (interfaceC3880x92 != null) {
            String str4 = Ia.a;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            Jc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3624nc c3624nc = mediaProcessor.f;
                if (c3624nc != null) {
                    c3624nc.a();
                }
                mediaProcessor.f = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3880x9 interfaceC3880x93 = this.c;
            if (interfaceC3880x93 != null) {
                String str5 = Ia.a;
                str5.getClass();
                ((C3906y9) interfaceC3880x93).b(str5, dmi.q("SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; ", e.getMessage()));
            }
        }
    }

    @JavascriptInterface
    public final void updateVideoPosition(@Nullable String str, @Nullable String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str3, com.appsflyer.internal.i.h(str3, "updateVideoPosition is called with position - ", str2));
        }
        EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                VideoViewPosition videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3907ya.a(new JSONObject(str2), VideoViewPosition.class, null, null));
                if (videoViewPosition != null) {
                    obj = xw3.L(L9.f, null, null, new Ga(this, videoViewPosition, str2, null), 3);
                } else {
                    EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = Unit.a;
                }
            } catch (JSONException e) {
                EnumC3879x8 enumC3879x82 = EnumC3879x8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3880x9 interfaceC3880x92 = this.c;
                if (interfaceC3880x92 != null) {
                    String str4 = Ia.a;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x92).a(str4, "Error while creating position Json.", e);
                    obj = Unit.a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3879x8 enumC3879x83 = EnumC3879x8.VIDEO_READY;
        a(str, jSONObject);
        Unit unit = Unit.a;
    }

    @JavascriptInterface
    public final void useCustomClose(@Nullable String str, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "useCustomClose called:" + z);
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new x59(this, z, str, 1));
    }

    @JavascriptInterface
    public final void zoom(@NotNull String str, int i) {
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "zoom is called " + str + " " + i);
        }
        AbstractC3632nk.a(new pn0(this, i, 9));
    }

    @JavascriptInterface
    public final void fireAdFailed(@Nullable String str) {
        fireAdFailed(str, "");
    }

    public static final void c(Ha ha) {
        try {
            ha.a.I();
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str = Ia.a;
                str.getClass();
                ((C3906y9) interfaceC3880x9).b(str, dmi.q("SDK encountered unexpected error in getting/setting default position; ", e.getMessage()));
            }
        }
    }

    public static final void c(Ha ha, String str) {
        try {
            ha.a.getSiblingWebviewManager().b(ha.a.getRoute().b, str);
        } catch (Exception e) {
            ha.a.a("showWebView", Oi.a(str, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).b(str2, dmi.q("SDK encountered unexpected error in handling showEndCard() request from creative; ", e.getMessage()));
            }
        }
    }

    public static String b(String str) {
        return dmi.q("TEMPLATE_", str);
    }

    public static final void b(Ha ha) {
        try {
            ha.a.H();
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str = Ia.a;
                str.getClass();
                ((C3906y9) interfaceC3880x9).b(str, dmi.q("SDK encountered unexpected error in getting/setting current position; ", e.getMessage()));
            }
        }
    }

    public static final void b(Ha ha, String str, String str2) {
        C3468hb.a(ha.a.getLandingPageHandler(), "open", str, str2, (C3571lb) null, 24);
    }

    public static final void b(Ha ha, boolean z, String str) {
        try {
            ha.a.f(z);
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).b(str2, dmi.q("SDK encountered internal error in handling useCustomClose() request from creative; ", e.getMessage()));
            }
        }
    }

    public final GestureDetectorOnGestureListenerC3889xi a() {
        boolean c = Intrinsics.c(this.a.getRoute().b, BuildConfig.FLAVOR);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (c) {
            return gestureDetectorOnGestureListenerC3889xi;
        }
        Jo webViewFactory = gestureDetectorOnGestureListenerC3889xi.getWebViewFactory();
        webViewFactory.getClass();
        return (GestureDetectorOnGestureListenerC3889xi) webViewFactory.b.get(BuildConfig.FLAVOR);
    }

    public static final void a(Ha ha, String str, String str2, String str3) {
        C3571lb c3571lb;
        C3597mb c3597mb = ha.a.getLandingPageHandler().f;
        if (c3597mb != null) {
            String a = AbstractC3339cb.a(str2);
            C3468hb landingPageHandler = ha.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c3571lb = new C3571lb(c3597mb, a, i, SystemClock.elapsedRealtime());
        } else {
            c3571lb = null;
        }
        ha.a.getLandingPageHandler().a(Za.LPClickStart, c3571lb, (Integer) null);
        ha.a.getLandingPageHandler().a("openInlineInstaller", str, str2, str3, c3571lb);
    }

    public static final void a(Ha ha, String str, String str2, float f, boolean z) {
        C3571lb c3571lb;
        C3597mb c3597mb = ha.a.getLandingPageHandler().f;
        if (c3597mb != null) {
            String a = AbstractC3339cb.a(str2);
            C3468hb landingPageHandler = ha.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            c3571lb = new C3571lb(c3597mb, a, i, SystemClock.elapsedRealtime());
        } else {
            c3571lb = null;
        }
        C3571lb c3571lb2 = c3571lb;
        if (c3571lb2 != null) {
            c3571lb2.f = "IN_NATIVE";
        }
        ha.a.getLandingPageHandler().a(Za.LPClickStart, c3571lb2, (Integer) 8010);
        int a2 = ha.a.getLandingPageHandler().a("customExpandInNative", str, str2, c3571lb2, new U2(f, z));
        InterfaceC3880x9 interfaceC3880x9 = ha.c;
        if (interfaceC3880x9 != null) {
            String str3 = Ia.a;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "customExpandInNativeRequest: " + a2);
        }
        if (a2 == 3) {
            Z5 z5 = Z5.URL;
            ha.a(str, str2, 0, f, !z, c3571lb2);
        }
    }

    public final void a(final String str, String str2, final int i, final float f, final boolean z, final C3571lb c3571lb) {
        final fsf fsfVar = new fsf();
        fsfVar.a = str2;
        if (c3571lb != null) {
            c3571lb.f = "IN_CUSTOM";
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: z59
            @Override // java.lang.Runnable
            public final void run() {
                Ha.a(Ha.this, c3571lb, fsfVar, i, str, f, z);
            }
        });
    }

    public final EnumC3661on a(String str) {
        try {
            for (Object obj : EnumC3661on.c) {
                if (Intrinsics.c(((EnumC3661on) obj).a, str)) {
                    return (EnumC3661on) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC3880x9 interfaceC3880x9 = this.c;
            if (interfaceC3880x9 == null) {
                return null;
            }
            String str2 = Ia.a;
            ((C3906y9) interfaceC3880x9).a(str2, com.appsflyer.internal.i.h(str2, "No matching action found for - ", str));
            return null;
        }
    }

    public static final void a(Ha ha) {
        if (ha.a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str = Ia.a;
                str.getClass();
                ((C3906y9) interfaceC3880x9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        InterfaceC3282a6 embeddedBrowserJsCallbacks = ha.a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            V8.a(((T8) embeddedBrowserJsCallbacks).a);
        }
    }

    public static final Unit a(Ha ha, Vf vf, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        if (gestureDetectorOnGestureListenerC3889xi.P0) {
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str = Ia.a;
                str.getClass();
                ((C3906y9) interfaceC3880x9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return Unit.a;
        }
        gestureDetectorOnGestureListenerC3889xi.a(vf);
        return Unit.a;
    }

    public static final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Ha ha, String str) {
        try {
            gestureDetectorOnGestureListenerC3889xi.n();
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            Xb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).b(str2, dmi.q("SDK encountered an expected error in handling the close() request from creative; ", e.getMessage()));
            }
        }
    }

    public static final Unit a(Ha ha, InterfaceC3317bf interfaceC3317bf) {
        interfaceC3317bf.getClass();
        if (Fl.a(interfaceC3317bf)) {
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str = Ia.a;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC3880x9 interfaceC3880x92 = ha.c;
            if (interfaceC3880x92 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, "asyncPing Failed");
            }
        }
        return Unit.a;
    }

    public static final void a(Ha ha, boolean z, String str) {
        try {
            ha.a.e(z);
        } catch (Exception e) {
            ha.a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).b(str2, dmi.q("SDK encountered unexpected error in handling disableCloseRegion() request from creative; ", e.getMessage()));
            }
        }
    }

    public static final Unit a(boolean z, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        gestureDetectorOnGestureListenerC3889xi.setDisableBackButton(z);
        return Unit.a;
    }

    public static final void a(Ha ha, int i) {
        ha.a.setInitialScale(i);
    }

    public static final void a(Ha ha, String str, String str2) {
        try {
            ha.a.getSiblingWebviewManager().a(ha.a.getRoute().b, str, str2);
        } catch (Exception e) {
            ha.a.a("loadWebView", Oi.a(str, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE));
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str3 = Ia.a;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).b(str3, dmi.q("SDK encountered unexpected error in handling loadWebView() request from creative; ", e.getMessage()));
            }
        }
    }

    public static final void a(Ha ha, String str) {
        try {
            ha.a.getSiblingWebviewManager().a(ha.a.getRoute().b, str);
        } catch (Exception e) {
            ha.a.a("destroyWebView", Oi.a(str, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            InterfaceC3880x9 interfaceC3880x9 = ha.c;
            if (interfaceC3880x9 != null) {
                String str2 = Ia.a;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).b(str2, dmi.q("SDK encountered unexpected error in handling destroyWebView() request from creative; ", e.getMessage()));
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        if (interfaceC3880x9 != null) {
            String str2 = Ia.a;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
