package com.inmobi.media;

import defpackage.k13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ki, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3552ki implements N {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3552ki(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a(M6 m6) {
        m6.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        float f = m6.a;
        N6 n6 = m6.b;
        Object obj = "null";
        String a = n6 != null ? O6.a(n6) : "null";
        ArrayList arrayList = m6.c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(O6.a((N6) it.next()));
            }
            obj = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC3889xi.h("window.mraidview.broadcastEvent('exposureChange', " + f + ", " + a + ", " + obj + ");");
    }
}
