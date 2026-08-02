package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import defpackage.dmi;
import defpackage.sub;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wo implements Ro {
    public static final WeakHashMap g = new WeakHashMap();
    public final To a;
    public final InterfaceC3880x9 b;
    public View c;
    public final ConcurrentHashMap d;
    public final WeakReference e;
    public Tf f;

    public Wo(Activity activity, To to, InterfaceC3880x9 interfaceC3880x9) {
        Window window;
        to.getClass();
        this.a = to;
        this.b = interfaceC3880x9;
        this.d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.e = weakReference;
        F5.a.getClass();
        if (!F5.w()) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.c = decorView;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = g;
            Object obj = weakHashMap.get(decorView);
            if (obj == null) {
                obj = new So(decorView);
                weakHashMap.put(decorView, obj);
            }
            ((So) obj).a.add(this);
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    public final void a(Uo uo, int i) {
        Tf a = Uf.a(R5.g());
        Vo vo = (Vo) this.d.get(Integer.valueOf(i));
        if (vo == null) {
            vo = new Vo();
            this.d.put(Integer.valueOf(i), vo);
        }
        a.getClass();
        Uo uo2 = (Uo) vo.a.get(a);
        if (uo2 == null || !Intrinsics.c(uo, uo2)) {
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            a.getClass();
            uo.getClass();
            vo.a.put(a, uo);
            ConcurrentHashMap concurrentHashMap = this.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((Vo) entry.getValue()).a());
            }
            R5.a(linkedHashMap);
        } else {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        }
        if (this.f != a) {
            this.f = a;
            To to = this.a;
            Object obj = this.d.get(Integer.valueOf(i));
            obj.getClass();
            to.a(a, (Vo) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Wo(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, To to, InterfaceC3880x9 interfaceC3880x9) {
        this((Activity) null, to, interfaceC3880x9);
        gestureDetectorOnGestureListenerC3889xi.getClass();
        to.getClass();
        F5.a.getClass();
        if (!F5.w()) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.c = gestureDetectorOnGestureListenerC3889xi;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = g;
        Object obj = weakHashMap.get(gestureDetectorOnGestureListenerC3889xi);
        if (obj == null) {
            obj = new So(gestureDetectorOnGestureListenerC3889xi);
            weakHashMap.put(gestureDetectorOnGestureListenerC3889xi, obj);
        }
        ((So) obj).a.add(this);
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a(WindowInsets windowInsets) {
        Uo a;
        try {
            Activity activity = (Activity) this.e.get();
            if (!this.a.a()) {
                InterfaceC3880x9 interfaceC3880x9 = this.b;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC3880x9 interfaceC3880x92 = this.b;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            if (N3.a(activity)) {
                a = Oi.b(windowInsets);
            } else {
                a = Oi.a(windowInsets);
            }
            Integer f = R5.f();
            int intValue = f != null ? f.intValue() : R5.a(windowInsets);
            R5.a(Integer.valueOf(intValue));
            a(a, intValue);
        } catch (Error e) {
            InterfaceC3880x9 interfaceC3880x93 = this.b;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).b("WindowInsetsHandler", dmi.q("Error in getting safeArea ", e.getMessage()));
            }
        } catch (Exception e2) {
            InterfaceC3880x9 interfaceC3880x94 = this.b;
            if (interfaceC3880x94 != null) {
                ((C3906y9) interfaceC3880x94).a("WindowInsetsHandler", "Exception in getting safeArea", e2);
            }
        }
    }

    public final void a() {
        View view = this.c;
        if (view != null) {
            WeakHashMap weakHashMap = g;
            So so = (So) weakHashMap.get(view);
            if (so != null) {
                so.a.remove(this);
                if (so.a.isEmpty()) {
                    so.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.c = null;
        this.d.clear();
    }
}
