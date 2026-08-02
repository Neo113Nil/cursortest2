package com.socure.docv.capturesdk.core.provider;

import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import com.socure.docv.capturesdk.core.storage.Cache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicModelConfidenceProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/core/provider/DynamicModelConfidenceProvider;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "", "cache", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "default", "(Lcom/socure/docv/capturesdk/core/storage/Cache;F)V", "get", "()Ljava/lang/Float;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DynamicModelConfidenceProvider implements Provider<Float> {
    public static final int $stable = 8;
    private final Cache<Float> cache;
    private final float default;

    public DynamicModelConfidenceProvider(Cache<Float> cache, float f) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.cache = cache;
        this.default = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
    public Float get() {
        Float f = this.cache.get();
        return Float.valueOf(f != null ? f.floatValue() : this.default);
    }
}
