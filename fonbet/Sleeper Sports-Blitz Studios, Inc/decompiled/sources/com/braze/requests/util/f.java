package com.braze.requests.util;

import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f682a;
    public int b;
    public final SharedPreferences c;
    public long d;
    public double e;

    public f(int i, int i2, SharedPreferences storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f682a = i;
        this.b = i2;
        this.c = storage;
        this.d = storage.getLong("last_call_at_ms", 0L);
        this.e = storage.getFloat("current_token_count", RangesKt.coerceAtLeast(this.f682a, 1));
    }

    public final double a(long j) {
        return Math.min((((j - this.d) / RangesKt.coerceAtLeast(this.b, 1)) / 1000) + this.e, RangesKt.coerceAtLeast(this.f682a, 1));
    }

    public final long b() {
        double a2 = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.e = a2;
        this.c.edit().putFloat("current_token_count", (float) a2).apply();
        double d = this.e;
        if (d >= 1.0d) {
            return 0L;
        }
        return Math.max(0L, (long) ((1 - d) * RangesKt.coerceAtLeast(this.b, 1) * 1000));
    }

    public final String toString() {
        return "(capacity=" + RangesKt.coerceAtLeast(this.f682a, 1) + ", refillRate=" + RangesKt.coerceAtLeast(this.b, 1) + ", lastCallAt='" + DateTimeUtils.formatDateFromMillis$default(this.d, null, null, 3, null) + "', lastCallAt raw value='" + this.d + "', currentTokenCount=" + a(DateTimeUtils.nowInMillisecondsSystemClock()) + ")";
    }

    public final void a() {
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double a2 = a(nowInMillisecondsSystemClock);
        this.e = a2;
        this.c.edit().putFloat("current_token_count", (float) a2).apply();
        this.d = nowInMillisecondsSystemClock;
        this.c.edit().putLong("last_call_at_ms", nowInMillisecondsSystemClock).apply();
        double d = this.e;
        if (d < 1.0d) {
            return;
        }
        double d2 = d - 1;
        this.e = d2;
        this.c.edit().putFloat("current_token_count", (float) d2).apply();
    }

    public static final String b(int i, int i2) {
        return "TokenBucketRateLimiter updated with new capacity: " + i + " and refill rate: " + i2;
    }

    public final void a(final int i, final int i2) {
        if (i < 1 || i2 < 1) {
            return;
        }
        if (this.f682a == i && this.b == i2) {
            return;
        }
        this.f682a = i;
        this.b = i2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.requests.util.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b(i, i2);
            }
        }, 6, (Object) null);
    }
}
