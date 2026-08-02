package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;
import defpackage.d10;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3713qn {
    public static final boolean a(Context context, boolean z) {
        context.getClass();
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z || !keyguardManager.isKeyguardLocked());
    }

    public static final MediaPlayer a(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return d10.a(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, U1 u1) {
        mediaPlayer.getClass();
        u1.getClass();
        mediaPlayer.setAudioAttributes(u1.d);
    }
}
