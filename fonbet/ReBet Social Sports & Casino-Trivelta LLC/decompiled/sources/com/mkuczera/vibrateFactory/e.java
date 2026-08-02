package com.mkuczera.vibrateFactory;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* loaded from: classes3.dex */
public class e implements a {
    long[] durations;

    public e(long[] jArr) {
        this.durations = jArr;
    }

    @Override // com.mkuczera.vibrateFactory.a
    public void a(Vibrator vibrator) {
        VibrationEffect createWaveform;
        try {
            if (vibrator.hasVibrator()) {
                if (Build.VERSION.SDK_INT < 26) {
                    vibrator.vibrate(this.durations, -1);
                } else {
                    createWaveform = VibrationEffect.createWaveform(this.durations, -1);
                    vibrator.vibrate(createWaveform);
                }
            }
        } catch (Exception unused) {
        }
    }
}
