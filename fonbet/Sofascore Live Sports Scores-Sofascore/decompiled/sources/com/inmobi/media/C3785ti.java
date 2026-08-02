package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3785ti implements InterfaceC3731rg {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3785ti(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public final void a(String str, int i, String str2, long j, int i2) {
        str.getClass();
        GestureDetectorOnGestureListenerC3889xi.i1.getClass();
        JSONObject a = AbstractC3759si.a("code", i);
        if (str2 != null) {
            a.put(NotificationCompat.CATEGORY_MESSAGE, str2);
        }
        a.put("retryCount", i2);
        String jSONObject = a.toString();
        jSONObject.getClass();
        this.a.h("window.imraidview.broadcastEvent('onPingComplete', '" + str + "', " + j + ", '" + jSONObject + "');");
    }
}
