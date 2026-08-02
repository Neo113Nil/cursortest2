package ru.ozon.app.android.analytics;

import V.e;
import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0011H\u0016R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/analytics/AnalyticsCacheImpl;", "Lru/ozon/app/android/analytics/AnalyticsCache;", "<init>", "()V", "cache", "Ljava/util/LinkedHashMap;", "", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "Lkotlin/collections/LinkedHashMap;", "locker", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "addEvent", "", "event", "Lru/ozon/app/android/analytics/Event;", "dataLayer", "getCache", "", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsCacheImpl implements AnalyticsCache {

    @NotNull
    private final LinkedHashMap<String, AnalyticsDataLayer> cache = new LinkedHashMap<>();

    @NotNull
    private final ReentrantReadWriteLock locker = new ReentrantReadWriteLock();

    @Override // ru.ozon.app.android.analytics.AnalyticsCache
    public void addEvent(@NotNull Event event, @NotNull AnalyticsDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        String format = DateFormat.getDateTimeInstance().format(new Date());
        String b11 = e.b(new Object[]{event, format}, 2, "%s %s", "format(...)");
        if (this.cache.containsKey(b11)) {
            b11 = e.b(new Object[]{event, format, 1}, 3, "%s %s [%d]", "format(...)");
            int i11 = 1;
            while (this.cache.containsKey(b11)) {
                i11++;
                b11 = e.b(new Object[]{event, format, Integer.valueOf(i11)}, 3, "%s %s [%d]", "format(...)");
            }
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.locker;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i12 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i13 = 0; i13 < readHoldCount; i13++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.cache.put(b11, dataLayer);
            Unit unit = Unit.f71690a;
        } finally {
            while (i12 < readHoldCount) {
                readLock.lock();
                i12++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.app.android.analytics.AnalyticsCache
    @NotNull
    public Map<String, AnalyticsDataLayer> getCache() {
        ReentrantReadWriteLock.ReadLock readLock = this.locker.readLock();
        readLock.lock();
        try {
            return this.cache;
        } finally {
            readLock.unlock();
        }
    }
}
