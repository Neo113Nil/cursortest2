package com.vk.story.viewer.impl.presentation.stories.util.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.epx;
import xsna.m360;

/* compiled from: VolumeChangeListener.kt */
/* loaded from: classes6.dex */
public final class VolumeChangeListener extends BroadcastReceiver {
    public final m360 a;
    public final IntentFilter b = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");

    public VolumeChangeListener(m360 m360Var) {
        this.a = m360Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && epx.f(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Received volume change event"});
            }
            this.a.invoke(context);
        }
    }
}
