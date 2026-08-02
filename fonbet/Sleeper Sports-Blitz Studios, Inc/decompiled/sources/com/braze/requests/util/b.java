package com.braze.requests.util;

import android.os.SystemClock;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* loaded from: classes6.dex */
public final class b implements c {
    public static final int g = (int) TimeUnit.SECONDS.toMillis(45);

    /* renamed from: a, reason: collision with root package name */
    public final int f680a;
    public final int b;
    public final int c;
    public final int d;
    public final Random e = RandomKt.Random(SystemClock.uptimeMillis());
    public int f;

    public b(int i, int i2, int i3, int i4) {
        this.f680a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(final int i) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.util.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.a(b.this);
            }
        }, 7, (Object) null);
        Random random = this.e;
        int i2 = this.f * this.d;
        Intrinsics.checkNotNullParameter(random, "random");
        final int min = Math.min(i, i2) + random.nextInt(Math.abs(i - i2) + 1);
        this.f = Math.max(this.c, Math.min(this.f680a, min));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.util.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.a(b.this, i, min);
            }
        }, 7, (Object) null);
        return this.f;
    }

    public final String toString() {
        int i = this.f680a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        Random random = this.e;
        int i5 = this.f;
        return "ExponentialBackoffStateProvider(maxSleepDurationMs=" + i + ", defaultNormalFlushIntervalMs=" + i2 + ", minSleepDurationMs=" + i3 + ", scaleFactor=" + i4 + ", randomSleepDurationGenerator=" + random + ", lastSleepDurationMs=" + i5 + ", isBackingOff=" + (i5 != 0) + ")";
    }

    public static final String a(b bVar) {
        return "Computing new sleep delay. Previous sleep delay: " + bVar.f;
    }

    public static final String a(b bVar, int i, int i2) {
        return "New sleep duration: " + bVar.f + " ms. Default sleep duration: " + i + " ms. Max sleep: " + bVar.f680a + " ms. Min sleep: " + bVar.c + " ms. Scale factor: " + bVar.d + " randomValueBetweenSleepIntervals: " + i2;
    }
}
