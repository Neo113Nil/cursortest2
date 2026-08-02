package com.mkuczera;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.mkuczera.vibrateFactory.Vibrate;
import com.mkuczera.vibrateFactory.VibrateFactory;

/* loaded from: classes8.dex */
public class RNReactNativeHapticFeedbackModuleImpl {
    public static final String NAME = "RNHapticFeedback";

    public static boolean isVibrationEnabled(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        return (vibrator != null && vibrator.hasVibrator()) && ((audioManager.getRingerMode() != 0) || (audioManager.getRingerMode() == 1));
    }

    public static void trigger(ReactApplicationContext reactApplicationContext, String str, ReadableMap readableMap) {
        boolean z = readableMap.getBoolean("ignoreAndroidSystemSettings");
        boolean isVibrationEnabled = isVibrationEnabled(reactApplicationContext);
        if (z || isVibrationEnabled) {
            Vibrator vibrator = (Vibrator) reactApplicationContext.getSystemService("vibrator");
            Vibrate vibration = VibrateFactory.getVibration(str);
            if (vibrator == null || vibration == null) {
                return;
            }
            vibration.apply(vibrator);
        }
    }
}
