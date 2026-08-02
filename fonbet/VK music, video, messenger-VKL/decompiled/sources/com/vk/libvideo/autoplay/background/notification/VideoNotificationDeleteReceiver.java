package com.vk.libvideo.autoplay.background.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.core.apps.BuildInfo;
import com.vk.libvideo.autoplay.background.controller.h;
import xsna.epx;
import xsna.fo8;
import xsna.yg5;

/* compiled from: VideoNotificationDeleteReceiver.kt */
/* loaded from: classes2.dex */
public final class VideoNotificationDeleteReceiver extends BroadcastReceiver {
    public static final String c;
    public final h.b a;
    public yg5 b;

    static {
        c = fo8.a((BuildInfo.q() ? "vkvideo_" : "").concat("VideoNotificationDeleteReceiver"), ":intent_action");
    }

    public VideoNotificationDeleteReceiver(h.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        yg5 yg5Var;
        if (epx.f(intent.getAction(), c) && (yg5Var = this.b) != null) {
            this.a.a(yg5Var);
        }
    }
}
