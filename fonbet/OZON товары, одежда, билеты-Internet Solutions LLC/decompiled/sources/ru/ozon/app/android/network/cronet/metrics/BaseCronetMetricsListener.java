package ru.ozon.app.android.network.cronet.metrics;

import Ma.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/cronet/metrics/BaseCronetMetricsListener;", "LMa/c;", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;", "key", "<init>", "(Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;)V", "cronetMetricsKey", "", "canHandle", "(Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;)Z", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCronetMetricsListener implements c {

    @NotNull
    private final CronetMetricsKey key;

    public BaseCronetMetricsListener(@NotNull CronetMetricsKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public final boolean canHandle(@NotNull CronetMetricsKey cronetMetricsKey) {
        Intrinsics.checkNotNullParameter(cronetMetricsKey, "cronetMetricsKey");
        return Intrinsics.d(cronetMetricsKey, this.key);
    }
}
