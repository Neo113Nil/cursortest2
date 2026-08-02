package com.bumptech.glide.util;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final double f30147a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j10) {
        return (b() - j10) * f30147a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
