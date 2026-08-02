package com.vk.music.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.PauseReason;
import xsna.cy4;
import xsna.dy4;
import xsna.epx;
import xsna.j6i;
import xsna.m7m;

/* compiled from: BecomingNoisyReceiver.kt */
/* loaded from: classes.dex */
public class BecomingNoisyReceiver extends BroadcastReceiver {
    public a a;

    /* compiled from: BecomingNoisyReceiver.kt */
    public interface a {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a aVar;
        if (!epx.f(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY") || (aVar = this.a) == null) {
            return;
        }
        ((AudioModelsComponent) j6i.b(m7m.f((dy4) aVar), AudioModelsComponent.class)).r().t1(16, PauseReason.HEADSET_EJECT, new cy4(0));
    }
}
