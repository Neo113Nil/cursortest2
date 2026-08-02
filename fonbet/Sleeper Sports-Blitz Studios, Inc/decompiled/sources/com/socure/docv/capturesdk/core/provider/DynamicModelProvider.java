package com.socure.docv.capturesdk.core.provider;

import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import com.socure.docv.capturesdk.core.storage.Cache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicModelProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/core/provider/DynamicModelProvider;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "defaultModelProvider", "cache", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "(Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;Lcom/socure/docv/capturesdk/core/storage/Cache;)V", "get", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DynamicModelProvider implements Provider<Model> {
    public static final int $stable = 0;
    private final Cache<Model> cache;
    private final Provider<Model> defaultModelProvider;

    public DynamicModelProvider(Provider<Model> defaultModelProvider, Cache<Model> cache) {
        Intrinsics.checkNotNullParameter(defaultModelProvider, "defaultModelProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.defaultModelProvider = defaultModelProvider;
        this.cache = cache;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
    public Model get() {
        Model model = this.cache.get();
        return model == null ? this.defaultModelProvider.get() : model;
    }
}
