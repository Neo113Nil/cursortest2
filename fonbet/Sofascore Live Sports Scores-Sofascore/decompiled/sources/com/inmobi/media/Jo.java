package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import defpackage.a70;
import defpackage.dmi;
import defpackage.ljg;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jo {
    public final InterfaceC3880x9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public Jo(InterfaceC3880x9 interfaceC3880x9) {
        this.a = interfaceC3880x9;
    }

    public final GestureDetectorOnGestureListenerC3889xi a(Yi yi, Context context, short s, C3638o0 c3638o0, AdConfig adConfig) {
        GestureDetectorOnGestureListenerC3889xi fi;
        yi.getClass();
        context.getClass();
        c3638o0.getClass();
        adConfig.getClass();
        if (s == 0) {
            InterfaceC3880x9 interfaceC3880x9 = this.a;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("SiblingWebViewManager", dmi.q("Creating standard WebView with ID: ", yi.b));
            }
            fi = new GestureDetectorOnGestureListenerC3889xi(context, c3638o0.o, c3638o0.p, c3638o0.q, c3638o0.r, 0L, c3638o0.s, c3638o0.t, yi, this, c3638o0, adConfig, 80);
        } else {
            InterfaceC3880x9 interfaceC3880x92 = this.a;
            if (s != 1) {
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).b("SiblingWebViewManager", ljg.j(s, "Unsupported WebView type: "));
                }
                a70.p(ljg.j(s, "Unsupported WebView type: "));
                return null;
            }
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("SiblingWebViewManager", dmi.q("Creating Sibling WebView with ID: ", yi.b));
            }
            fi = new Fi(context, c3638o0.o, c3638o0.t, C3638o0.a(c3638o0, null, 4194047), this, yi, adConfig);
        }
        a(fi, yi.b);
        return fi;
    }

    public final void b(Function1 function1) {
        function1.getClass();
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC3889xi) entry.getValue()) instanceof Fi) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) ((Map.Entry) it.next()).getValue();
            gestureDetectorOnGestureListenerC3889xi.getClass();
            function1.invoke((Fi) gestureDetectorOnGestureListenerC3889xi);
        }
    }

    public final void a(String str) {
        str.getClass();
        this.b.remove(str);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("SiblingWebViewManager", dmi.q("Unregistered bridge for WebView ID: ", str));
        }
    }

    public final void a(Function1 function1) {
        function1.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) this.b.get(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            function1.invoke(gestureDetectorOnGestureListenerC3889xi);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!Intrinsics.c(entry.getKey(), BuildConfig.FLAVOR)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            function1.invoke((GestureDetectorOnGestureListenerC3889xi) ((Map.Entry) it.next()).getValue());
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        this.b.put(str, gestureDetectorOnGestureListenerC3889xi);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("SiblingWebViewManager", dmi.q("Registered bridge for WebView ID: ", str));
        }
    }
}
