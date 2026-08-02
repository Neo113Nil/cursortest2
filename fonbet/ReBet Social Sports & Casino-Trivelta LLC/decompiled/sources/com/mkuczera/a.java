package com.mkuczera;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public abstract class a {
    public static boolean a(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return (vibrator != null && vibrator.hasVibrator()) && ((audioManager.getRingerMode() != 0) || (audioManager.getRingerMode() == 1));
    }

    public static void b(ReactApplicationContext reactApplicationContext, String str, ReadableMap readableMap) {
        boolean z10 = readableMap.getBoolean("ignoreAndroidSystemSettings");
        boolean a10 = a(reactApplicationContext);
        if (z10 || a10) {
            Vibrator vibrator = (Vibrator) reactApplicationContext.getSystemService("vibrator");
            com.mkuczera.vibrateFactory.a a11 = com.mkuczera.vibrateFactory.b.a(str);
            if (vibrator == null || a11 == null) {
                return;
            }
            a11.a(vibrator);
        }
    }
}
