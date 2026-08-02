package com.inmobi.media;

import android.app.Activity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class T8 implements InterfaceC3282a6 {
    public final /* synthetic */ V8 a;

    public T8(V8 v8) {
        this.a = v8;
    }

    public final void a(String str, Z5 z5, float f, boolean z, long j, C3571lb c3571lb) {
        String str2;
        String creativeId;
        String impressionId;
        str.getClass();
        z5.getClass();
        V8 v8 = this.a;
        Activity activity = (Activity) v8.a.get();
        if (activity == null) {
            return;
        }
        Y5 y5 = v8.e;
        if (y5 == null) {
            y5 = new Y5(activity);
            InterfaceC3880x9 interfaceC3880x9 = v8.h;
            if (interfaceC3880x9 != null) {
                y5.setLogger(interfaceC3880x9);
            }
            y5.setId(65518);
            y5.setEmbeddedBrowserUpdateListener(v8.i);
            v8.e = y5;
        }
        C c = v8.b;
        if ((c instanceof GestureDetectorOnGestureListenerC3889xi) && y5 != null) {
            y5.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3889xi) c).getListener());
        }
        Y5 y52 = v8.e;
        if (y52 != null) {
            C c2 = v8.b;
            if (c2 == null || (str2 = ((GestureDetectorOnGestureListenerC3889xi) c2).getAdType()) == null) {
                str2 = "banner";
            }
            String str3 = str2;
            C c3 = v8.b;
            String str4 = (c3 == null || (impressionId = ((GestureDetectorOnGestureListenerC3889xi) c3).getImpressionId()) == null) ? "" : impressionId;
            C c4 = v8.b;
            y52.a(str, z5, z, j, str3, str4, (c4 == null || (creativeId = ((GestureDetectorOnGestureListenerC3889xi) c4).getCreativeId()) == null) ? "" : creativeId, c3571lb);
        }
        float f2 = 1.0f - f;
        v8.g = f2;
        C3930z7 c3930z7 = v8.c;
        if (c3930z7 != null) {
            c3930z7.c = f2;
            c3930z7.c();
        }
        v8.b();
    }
}
