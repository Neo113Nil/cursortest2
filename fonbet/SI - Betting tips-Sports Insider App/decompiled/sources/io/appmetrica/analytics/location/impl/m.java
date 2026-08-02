package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f15042d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f15043e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final l f15045a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f15040b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f15041c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f15044f = Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        l lVar = new l(f15041c);
        long j = f15040b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(@NonNull Location location) {
        if (f15044f.contains(location.getProvider())) {
            return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f15045a.f15039a, 200L);
        }
        return false;
    }

    public m(l lVar, long j, long j6) {
        super(j, j6, "location");
        this.f15045a = lVar;
    }

    public static boolean a(Location location, Location location2, long j, long j6) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z5 = time > j;
        boolean z7 = time < (-j);
        boolean z10 = time > 0;
        if (z5) {
            return true;
        }
        if (z7) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z11 = accuracy > 0;
        boolean z12 = accuracy < 0;
        boolean z13 = ((long) accuracy) > j6;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z12) {
            return true;
        }
        if (!z10 || z11) {
            return z10 && !z13 && equals;
        }
        return true;
    }
}
