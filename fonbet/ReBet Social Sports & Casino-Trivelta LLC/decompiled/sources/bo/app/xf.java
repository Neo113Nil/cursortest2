package bo.app;

import bo.app.xf;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class xf {

    /* renamed from: a, reason: collision with root package name */
    public int f26285a;

    /* renamed from: b, reason: collision with root package name */
    public int f26286b;

    /* renamed from: c, reason: collision with root package name */
    public final vf f26287c;

    /* renamed from: d, reason: collision with root package name */
    public long f26288d;

    /* renamed from: e, reason: collision with root package name */
    public double f26289e;

    public xf(int i10, int i11, vf storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f26285a = i10;
        this.f26286b = i11;
        this.f26287c = storage;
        Long readLong = storage.readLong(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, 0L);
        this.f26288d = readLong != null ? readLong.longValue() : 0L;
        this.f26289e = storage.readFloat(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf(RangesKt.coerceAtLeast(this.f26285a, 1))) != null ? r4.floatValue() : RangesKt.coerceAtLeast(this.f26285a, 1);
    }

    public static final String b(int i10, int i11) {
        return "TokenBucketRateLimiter updated with new capacity: " + i10 + " and refill rate: " + i11;
    }

    public final double a(long j10) {
        return Math.min((((j10 - this.f26288d) / RangesKt.coerceAtLeast(this.f26286b, 1)) / 1000) + this.f26289e, RangesKt.coerceAtLeast(this.f26285a, 1));
    }

    public final String toString() {
        return "(capacity=" + RangesKt.coerceAtLeast(this.f26285a, 1) + ", refillRate=" + RangesKt.coerceAtLeast(this.f26286b, 1) + ", lastCallAt='" + DateTimeUtils.formatDateFromMillis$default(this.f26288d, null, null, 3, null) + "', lastCallAt raw value='" + this.f26288d + "', currentTokenCount=" + a(DateTimeUtils.nowInMillisecondsSystemClock()) + ")";
    }

    public final long a() {
        double a10 = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.f26289e = a10;
        this.f26287c.writeData(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf((float) a10));
        double d10 = this.f26289e;
        if (d10 >= 1.0d) {
            return 0L;
        }
        return Math.max(0L, (long) ((1 - d10) * RangesKt.coerceAtLeast(this.f26286b, 1) * 1000));
    }

    public final void a(final int i10, final int i11) {
        if (i10 < 1 || i11 < 1) {
            return;
        }
        if (this.f26285a == i10 && this.f26286b == i11) {
            return;
        }
        this.f26285a = i10;
        this.f26286b = i11;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Ac
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xf.b(i10, i11);
            }
        }, 6, (Object) null);
    }
}
