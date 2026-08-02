package com.vk.story.viewer.impl.presentation.stories.util.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import xsna.epx;
import xsna.oa5;

/* compiled from: RingerStateListener.kt */
/* loaded from: classes6.dex */
public final class RingerStateListener extends BroadcastReceiver {
    public final oa5 a;
    public final IntentFilter b = new IntentFilter("android.media.RINGER_MODE_CHANGED");
    public volatile int c = 2;

    public RingerStateListener(oa5 oa5Var) {
        this.a = oa5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra;
        if (context == null || intent == null || !epx.f(intent.getAction(), "android.media.RINGER_MODE_CHANGED") || this.c == (intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1))) {
            return;
        }
        this.c = intExtra;
        this.a.invoke(context, Boolean.valueOf(intExtra == 2));
    }
}
