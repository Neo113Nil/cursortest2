package com.vk.movika.sdk.android.defaultplayer.utils;

import android.view.View;
import com.vk.movika.sdk.android.defaultplayer.control.h;
import com.vk.movika.sdk.base.model.LayoutParams;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes3.dex */
public final class b {
    public static final double a(LayoutParams layoutParams, h hVar, double d) {
        if ((layoutParams != null ? layoutParams.f : null) != LayoutParams.InnerSizesDependOn.VIDEO) {
            return d * hVar.getHeight();
        }
        Object parent = hVar.getParent();
        return ((parent instanceof View ? (View) parent : null) != null ? r0.getHeight() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * d;
    }
}
