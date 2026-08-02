package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class w {
    public final AudioManager a;

    public w(Context context) {
        AudioManager audioManager;
        try {
            audioManager = (AudioManager) context.getApplicationContext().getSystemService(AudioManager.class);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e, false, 8, null);
            audioManager = null;
        }
        this.a = audioManager;
    }
}
