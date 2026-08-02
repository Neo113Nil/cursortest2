package com.mkuczera.vibrateFactory;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f39056a;

    public d(int i10) {
        this.f39056a = i10;
    }

    @Override // com.mkuczera.vibrateFactory.a
    public void a(Vibrator vibrator) {
        VibrationEffect createPredefined;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            if (vibrator.hasVibrator()) {
                createPredefined = VibrationEffect.createPredefined(this.f39056a);
                vibrator.vibrate(createPredefined);
            }
        } catch (Exception unused) {
        }
    }
}
