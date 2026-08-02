package com.mkuczera.vibrateFactory;

import android.os.Vibrator;

/* loaded from: classes3.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f39057a;

    public f(int i10) {
        this.f39057a = i10;
    }

    @Override // com.mkuczera.vibrateFactory.a
    public void a(Vibrator vibrator) {
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(this.f39057a);
            }
        } catch (Exception unused) {
        }
    }
}
