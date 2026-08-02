package ru.ozon.app.android.network.cronet;

import We.G;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricsKey;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetConfig;", "", "Lkotlin/Function1;", "LWe/G;", "", "getOkHttpRequestId", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;", "cronetMetricsKey", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getGetOkHttpRequestId", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;", "getCronetMetricsKey", "()Lru/ozon/app/android/network/cronet/metrics/CronetMetricsKey;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CronetConfig {

    @NotNull
    private final CronetMetricsKey cronetMetricsKey;

    @NotNull
    private final Function1<G, String> getOkHttpRequestId;

    /* JADX WARN: Multi-variable type inference failed */
    public CronetConfig(@NotNull Function1<? super G, String> getOkHttpRequestId, @NotNull CronetMetricsKey cronetMetricsKey) {
        Intrinsics.checkNotNullParameter(getOkHttpRequestId, "getOkHttpRequestId");
        Intrinsics.checkNotNullParameter(cronetMetricsKey, "cronetMetricsKey");
        this.getOkHttpRequestId = getOkHttpRequestId;
        this.cronetMetricsKey = cronetMetricsKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CronetConfig)) {
            return false;
        }
        CronetConfig cronetConfig = (CronetConfig) other;
        return Intrinsics.d(this.getOkHttpRequestId, cronetConfig.getOkHttpRequestId) && Intrinsics.d(this.cronetMetricsKey, cronetConfig.cronetMetricsKey);
    }

    @NotNull
    public final CronetMetricsKey getCronetMetricsKey() {
        return this.cronetMetricsKey;
    }

    @NotNull
    public final Function1<G, String> getGetOkHttpRequestId() {
        return this.getOkHttpRequestId;
    }

    public int hashCode() {
        return this.cronetMetricsKey.hashCode() + (this.getOkHttpRequestId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CronetConfig(getOkHttpRequestId=" + this.getOkHttpRequestId + ", cronetMetricsKey=" + this.cronetMetricsKey + ")";
    }
}
