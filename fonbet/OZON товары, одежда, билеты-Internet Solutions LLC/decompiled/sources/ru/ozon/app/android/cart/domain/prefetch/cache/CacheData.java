package ru.ozon.app.android.cart.domain.prefetch.cache;

import android.os.SystemClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/cache/CacheData;", "", "maxAge", "", "cachingTime", "", "requestId", "", "<init>", "(IJLjava/lang/String;)V", "getMaxAge", "()I", "getRequestId", "()Ljava/lang/String;", "_finished", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isExpired", "()Z", "", "cacheLifeTime", "getCacheLifeTime", "()D", "endCache", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CacheData {
    private boolean _finished;
    private double cacheLifeTime;
    private final long cachingTime;
    private boolean isExpired;
    private final int maxAge;
    private final String requestId;

    public CacheData(int i11, long j11, String str) {
        this.maxAge = i11;
        this.cachingTime = j11;
        this.requestId = str;
    }

    public final void endCache() {
        if (this._finished) {
            return;
        }
        this._finished = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.cachingTime;
        this.isExpired = ((long) (this.maxAge * 1000)) < elapsedRealtime;
        this.cacheLifeTime = elapsedRealtime / 1000.0d;
    }

    public final double getCacheLifeTime() {
        return this.cacheLifeTime;
    }

    public final int getMaxAge() {
        return this.maxAge;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: isExpired, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }
}
