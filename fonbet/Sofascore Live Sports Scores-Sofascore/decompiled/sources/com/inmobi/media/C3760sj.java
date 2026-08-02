package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C4018c8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.joa;
import defpackage.lnb;
import defpackage.me4;
import defpackage.tub;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3760sj {
    public final Jo a;
    public final InterfaceC3880x9 b;

    public C3760sj(Jo jo, InterfaceC3880x9 interfaceC3880x9) {
        jo.getClass();
        this.a = jo;
        this.b = interfaceC3880x9;
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Fi fi) {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("sj", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        Context containerContext = a != null ? a.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).b("sj", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC3880x9 interfaceC3880x93 = this.b;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).b("sj", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC3889xi, fi.getRoute().b, "loadWebView");
            return;
        }
        fi.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC3880x9 interfaceC3880x94 = this.b;
        if (interfaceC3880x94 != null) {
            ((C3906y9) interfaceC3880x94).a("sj", "target View's Viewable ad - " + fi.getViewableAd());
        }
        View c = fi.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        context.getClass();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((c != null ? c.getParent() : null) != null) {
            ViewParent parent = c.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c);
            }
        }
        relativeLayout.addView(c, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        fi.a(relativeLayout);
        InterfaceC3880x9 interfaceC3880x95 = this.b;
        if (interfaceC3880x95 != null) {
            ((C3906y9) interfaceC3880x95).a("sj", "Target View added - the inflatedView is - " + c);
        }
    }

    public final void b(String str, String str2) {
        Object obj;
        Integer a;
        str.getClass();
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("sj", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC3889xi a2 = a(str);
        if (a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a3 = a(str2);
        if (a3 == null) {
            joa joaVar = Oi.a;
            JSONObject a4 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            a2.a("showWebView", a4);
            return;
        }
        if (str2.equals(BuildConfig.FLAVOR)) {
            a(a2, str2, "showWebView");
            return;
        }
        if (!(a3 instanceof Fi)) {
            joa joaVar2 = Oi.a;
            JSONObject a5 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a2.a("showWebView", a5);
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a6 = a();
        if (a6 != null && !a6.isAttachedToWindow()) {
            joa joaVar3 = Oi.a;
            JSONObject a7 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a7.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            a2.a("showWebView", a7);
            return;
        }
        Integer a8 = a3.getWvStateMachine().a(5);
        if (a8 != null) {
            int intValue = a8.intValue();
            joa joaVar4 = Oi.a;
            JSONObject a9 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a9.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue);
            a2.a("showWebView", a9);
            return;
        }
        Iterator it = tub.p(this.a.b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) obj;
            if (gestureDetectorOnGestureListenerC3889xi.getWvStateMachine().b == 105 && !gestureDetectorOnGestureListenerC3889xi.equals(a3) && !Intrinsics.c(gestureDetectorOnGestureListenerC3889xi.getRoute().b, BuildConfig.FLAVOR)) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = (GestureDetectorOnGestureListenerC3889xi) obj;
        if (gestureDetectorOnGestureListenerC3889xi2 != null && (a = gestureDetectorOnGestureListenerC3889xi2.getWvStateMachine().a(7)) != null) {
            int intValue2 = a.intValue();
            joa joaVar5 = Oi.a;
            JSONObject a10 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a10.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue2);
            a2.a("showWebView", a10);
        }
        Fi fi = (Fi) a3;
        if (fi.isAttachedToWindow()) {
            a(a3, a2, str2);
            return;
        }
        a(a2, fi);
        a(a3);
        AbstractC3429fo viewableAd = fi.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = a3.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC3889xi a() {
        GestureDetectorOnGestureListenerC3889xi a = a(BuildConfig.FLAVOR);
        if (a != null) {
            return a;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 == null) {
            return null;
        }
        ((C3906y9) interfaceC3880x9).b("sj", "AdRenderView is null, cannot initialize webview.");
        return null;
    }

    public final GestureDetectorOnGestureListenerC3889xi a(String str) {
        Jo jo = this.a;
        jo.getClass();
        str.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) jo.b.get(str);
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            return gestureDetectorOnGestureListenerC3889xi;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 == null) {
            return null;
        }
        ((C3906y9) interfaceC3880x9).b("sj", lnb.o("View with ID: ", str, " not found."));
        return null;
    }

    public final void a(String str, String str2, String str3) {
        Context context;
        GestureDetectorOnGestureListenerC3889xi a;
        me4.p(str, str2, str3);
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("sj", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC3889xi a2 = a();
        Context containerContext = a2 != null ? a2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).b("sj", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (a = a(str)) == null) {
            return;
        }
        if (Intrinsics.c(str2, BuildConfig.FLAVOR)) {
            a(a, str2, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a3 = a();
        if (a3 == null) {
            a.a("loadWebView", Oi.a(str2, Sdk.SDKError.Reason.AD_EXPIRED_VALUE));
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a4 = a(str2);
        if (a4 != null) {
            int i = a4.getWvStateMachine().b;
            joa joaVar = Oi.a;
            JSONObject a5 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            a.a("loadWebView", a5);
            return;
        }
        Fi a6 = a(a3, str2, this, a, context, SystemClock.elapsedRealtime());
        if (a6 != null) {
            a6.i(str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup] */
    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        AbstractC3429fo viewableAd;
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("sj", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3889xi.getParent();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (gestureDetectorOnGestureListenerC3889xi2 != null) {
            gestureDetectorOnGestureListenerC3889xi = gestureDetectorOnGestureListenerC3889xi2;
        }
        GestureDetectorOnGestureListenerC3889xi a = a();
        if (a == null || (viewableAd = a.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC3889xi, FriendlyObstructionPurpose.OTHER);
    }

    public static final Fi a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, C3760sj c3760sj, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2, Context context, long j) {
        String str2;
        C3638o0 c3638o0;
        C3638o0 c3638o02;
        Bi bi;
        C3638o0 adMetaData = gestureDetectorOnGestureListenerC3889xi.getAdMetaData();
        if (adMetaData != null) {
            Bi bi2 = gestureDetectorOnGestureListenerC3889xi.getAdMetaData().s;
            if (bi2 != null) {
                C3845w0 c3845w0 = bi2.a;
                String str3 = bi2.b;
                String str4 = bi2.c;
                String str5 = bi2.d;
                int i = bi2.e;
                String str6 = bi2.f;
                String str7 = bi2.g;
                boolean z = bi2.h;
                int i2 = bi2.i;
                C3716r1 c3716r1 = bi2.j;
                Gi gi = bi2.k;
                InlineParams inlineParams = bi2.m;
                c3845w0.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                str6.getClass();
                str7.getClass();
                c3638o02 = adMetaData;
                str2 = str;
                bi = new Bi(c3845w0, str3, str4, str5, i, str6, str7, z, i2, c3716r1, gi, str2, inlineParams);
            } else {
                str2 = str;
                c3638o02 = adMetaData;
                bi = null;
            }
            c3638o0 = C3638o0.a(c3638o02, bi, 3665663);
        } else {
            str2 = str;
            c3638o0 = null;
        }
        if (c3638o0 == null) {
            InterfaceC3880x9 interfaceC3880x9 = c3760sj.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("sj", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC3889xi a = c3760sj.a.a(new Yi(gestureDetectorOnGestureListenerC3889xi2.getRoute().b, str2), context, (short) 1, c3638o0, gestureDetectorOnGestureListenerC3889xi.getAdConfig());
        Fi fi = a instanceof Fi ? (Fi) a : null;
        if (fi == null) {
            InterfaceC3880x9 interfaceC3880x92 = c3760sj.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).b("sj", dmi.q("Failed to create Sibling WebView with ID: ", str2));
            }
            gestureDetectorOnGestureListenerC3889xi2.a("loadWebView", Oi.a(str2, Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE));
            return null;
        }
        Integer a2 = fi.getWvStateMachine().a(1);
        if (a2 != null) {
            gestureDetectorOnGestureListenerC3889xi2.a("loadWebView", Oi.a(str2, a2.intValue()));
        }
        fi.Z();
        Hi renderViewTelemetry = fi.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.b = j;
        }
        return fi;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        GestureDetectorOnGestureListenerC3889xi a = a(str);
        if (a == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a2 = a(str2);
        if (a2 == null) {
            joa joaVar = Oi.a;
            JSONObject a3 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            a.a("destroyWebView", a3);
            return;
        }
        if (Intrinsics.c(str2, BuildConfig.FLAVOR)) {
            a(a, str2, "destroyWebView");
            return;
        }
        Integer a4 = a2.getWvStateMachine().a(8);
        if (a4 != null) {
            int intValue = a4.intValue();
            joa joaVar2 = Oi.a;
            JSONObject a5 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, intValue);
            a.a("destroyWebView", a5);
            return;
        }
        a2.b();
        a.a(a, str2);
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("sj", lnb.o("WebView with ID: ", str2, " removed from parent."));
        }
    }

    public final void b(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        GestureDetectorOnGestureListenerC3889xi a = a(str);
        if (a == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi a2 = a(str2);
        if (a2 == null) {
            joa joaVar = Oi.a;
            JSONObject a3 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            a.a(C4018c8.j, a3);
            return;
        }
        int i = a2.getWvStateMachine().b;
        if (!Intrinsics.c(a2.getRoute().b, BuildConfig.FLAVOR) && kotlin.collections.b.j(101, 104, 107).contains(Integer.valueOf(i))) {
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("sj", dmi.q("WebView is not in state to receive messages: ", str2));
            }
            int i2 = a2.getWvStateMachine().b;
            joa joaVar2 = Oi.a;
            JSONObject a4 = AbstractC3734rj.a(str2, "targetViewId", "id", str2);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            a.a(C4018c8.j, a4);
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.b;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("sj", dmi.q("Sending message to WebView ID: ", str2));
        }
        a2.h(str3);
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("sj", dmi.q("Cannot perform operations on default WebView with ID: ", str));
        }
        gestureDetectorOnGestureListenerC3889xi.a(str2, Oi.a(str, 303));
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2, String str) {
        ViewParent parent = gestureDetectorOnGestureListenerC3889xi.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC3889xi;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC3889xi2.a("showWebView", Oi.a(str, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("sj", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC3889xi);
            }
        } else {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).b("sj", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC3889xi);
            }
        }
        gestureDetectorOnGestureListenerC3889xi2.c(gestureDetectorOnGestureListenerC3889xi2, str);
    }
}
