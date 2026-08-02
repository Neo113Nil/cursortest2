package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", "key", "", "detect", "", "window", "", "limitPerWindow", "", "updateParameters", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "storage", "<init>", "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f11743a;

    /* renamed from: b, reason: collision with root package name */
    private int f11744b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f11745c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f11746d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j, int i5, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.f11743a = j;
        this.f11744b = i5;
        this.f11745c = eventFrequencyStorage;
    }

    public final boolean detect(@NotNull String key) {
        long longValue;
        long uptimeMillis = this.f11746d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f11745c;
        Long windowStart = eventFrequencyStorage.getWindowStart(key);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(key, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j = uptimeMillis - longValue;
        if (j < 0 || j > this.f11743a) {
            this.f11745c.putWindowStart(key, uptimeMillis);
            this.f11745c.putWindowOccurrencesCount(key, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f11745c.getWindowOccurrencesCount(key);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f11745c.putWindowOccurrencesCount(key, intValue);
        return intValue > this.f11744b;
    }

    public final synchronized void updateParameters(long window, int limitPerWindow) {
        this.f11743a = window;
        this.f11744b = limitPerWindow;
    }
}
