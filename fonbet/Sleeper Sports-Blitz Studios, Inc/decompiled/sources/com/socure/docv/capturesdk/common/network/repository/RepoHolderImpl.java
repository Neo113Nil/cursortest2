package com.socure.docv.capturesdk.common.network.repository;

import com.google.gson.Gson;
import com.socure.docv.capturesdk.common.network.transport.ApiClient;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RepoHolderImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\t\u0010\n*\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016*\u0004\b\u0014\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u0018\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e*\u0004\b\u001c\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/RepoHolderImpl;", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "apiClient", "Lcom/socure/docv/capturesdk/common/network/transport/ApiClient;", "getApiClient$delegate", "(Lcom/socure/docv/capturesdk/common/network/repository/RepoHolderImpl;)Ljava/lang/Object;", "getApiClient", "()Lcom/socure/docv/capturesdk/common/network/transport/ApiClient;", "lazyApiClient", "Lkotlin/Lazy;", "lazyMixPanelRepository", "Lcom/socure/docv/capturesdk/common/network/repository/MixPanelRepository;", "lazyStepUpRepository", "Lcom/socure/docv/capturesdk/common/network/repository/StepUpRepository;", "lazyUploadRepository", "Lcom/socure/docv/capturesdk/common/network/repository/UploadRepository;", "mixPanelRepository", "getMixPanelRepository$delegate", "getMixPanelRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/MixPanelRepository;", "stepUpRepository", "getStepUpRepository$delegate", "getStepUpRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/StepUpRepository;", "uploadRepository", "getUploadRepository$delegate", "getUploadRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/UploadRepository;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class RepoHolderImpl implements RepoHolder {
    public static final int $stable = 8;
    private final Lazy<ApiClient> lazyApiClient;
    private final Lazy<MixPanelRepository> lazyMixPanelRepository;
    private final Lazy<StepUpRepository> lazyStepUpRepository;
    private final Lazy<UploadRepository> lazyUploadRepository;

    public RepoHolderImpl(final Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.lazyApiClient = LazyKt.lazy(new Function0<ApiClient>() { // from class: com.socure.docv.capturesdk.common.network.repository.RepoHolderImpl$lazyApiClient$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiClient invoke() {
                return new ApiClient();
            }
        });
        this.lazyUploadRepository = LazyKt.lazy(new Function0<UploadRepository>() { // from class: com.socure.docv.capturesdk.common.network.repository.RepoHolderImpl$lazyUploadRepository$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final UploadRepository invoke() {
                ApiClient apiClient;
                apiClient = RepoHolderImpl.this.getApiClient();
                return new UploadRepository(apiClient.getUploadService());
            }
        });
        this.lazyStepUpRepository = LazyKt.lazy(new Function0<StepUpRepository>() { // from class: com.socure.docv.capturesdk.common.network.repository.RepoHolderImpl$lazyStepUpRepository$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final StepUpRepository invoke() {
                ApiClient apiClient;
                apiClient = RepoHolderImpl.this.getApiClient();
                return new StepUpRepository(apiClient.getStepUpService(), gson);
            }
        });
        this.lazyMixPanelRepository = LazyKt.lazy(new Function0<MixPanelRepository>() { // from class: com.socure.docv.capturesdk.common.network.repository.RepoHolderImpl$lazyMixPanelRepository$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MixPanelRepository invoke() {
                ApiClient apiClient;
                apiClient = RepoHolderImpl.this.getApiClient();
                return new MixPanelRepository(apiClient.getMixPanelApiService());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiClient getApiClient() {
        return this.lazyApiClient.getValue();
    }

    @Override // com.socure.docv.capturesdk.common.network.repository.RepoHolder
    public UploadRepository getUploadRepository() {
        return this.lazyUploadRepository.getValue();
    }

    @Override // com.socure.docv.capturesdk.common.network.repository.RepoHolder
    public StepUpRepository getStepUpRepository() {
        return this.lazyStepUpRepository.getValue();
    }

    @Override // com.socure.docv.capturesdk.common.network.repository.RepoHolder
    public MixPanelRepository getMixPanelRepository() {
        return this.lazyMixPanelRepository.getValue();
    }
}
