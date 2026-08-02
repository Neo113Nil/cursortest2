package com.vk.movika.sdk.android.defaultplayer.layout;

import android.content.Context;
import android.view.View;
import com.vk.movika.sdk.android.defaultplayer.view.b;
import com.vk.movika.sdk.base.model.LayoutParams;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes3.dex */
public final class b {
    public final com.vk.movika.sdk.android.defaultplayer.view.b a;

    public b(Context context) {
        com.vk.movika.sdk.android.defaultplayer.view.b bVar = new com.vk.movika.sdk.android.defaultplayer.view.b(context);
        bVar.setWillNotDraw(false);
        this.a = bVar;
    }

    public final void a(com.vk.movika.sdk.android.defaultplayer.control.a aVar, LayoutParams layoutParams) {
        View view = aVar.getView();
        com.vk.movika.sdk.android.defaultplayer.view.b bVar = this.a;
        if (layoutParams == null) {
            bVar.addView(view);
            return;
        }
        Double d = layoutParams.a;
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double doubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d3 = layoutParams.b;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        Double d4 = layoutParams.c;
        double doubleValue2 = d4 != null ? d4.doubleValue() : 1.0d;
        Double d5 = layoutParams.d;
        b.a aVar2 = new b.a(doubleValue, d2, doubleValue2, d5 != null ? d5.doubleValue() : 1.0d);
        Double d6 = layoutParams.e;
        if (d6 != null) {
            view.setRotation(-((float) Math.toDegrees(d6.doubleValue())));
        }
        bVar.addView(view, aVar2);
    }
}
