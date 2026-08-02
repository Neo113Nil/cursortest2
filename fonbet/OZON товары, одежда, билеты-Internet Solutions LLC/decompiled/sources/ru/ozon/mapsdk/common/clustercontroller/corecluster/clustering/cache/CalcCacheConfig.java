package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/CalcCacheConfig;", "", "isSequentialCalculation", "", "<init>", "(Z)V", "()Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalcCacheConfig {
    private final boolean isSequentialCalculation;

    public CalcCacheConfig() {
        this(false, 1, null);
    }

    /* renamed from: isSequentialCalculation, reason: from getter */
    public final boolean getIsSequentialCalculation() {
        return this.isSequentialCalculation;
    }

    public CalcCacheConfig(boolean z11) {
        this.isSequentialCalculation = z11;
    }

    public /* synthetic */ CalcCacheConfig(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
