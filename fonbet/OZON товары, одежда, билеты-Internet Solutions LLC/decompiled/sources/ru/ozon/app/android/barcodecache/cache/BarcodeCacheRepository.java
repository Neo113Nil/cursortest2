package ru.ozon.app.android.barcodecache.cache;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.barcodecache.data.PrefetchBarcodeBarcodeResult;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/barcodecache/cache/BarcodeCacheRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "errorRefreshInterval", "Lru/ozon/app/android/barcodecache/data/PrefetchBarcodeBarcodeResult$BackendError;", "createBackendError", "(Ljava/lang/Integer;)Lru/ozon/app/android/barcodecache/data/PrefetchBarcodeBarcodeResult$BackendError;", "Lru/ozon/app/android/barcodecache/data/PrefetchBarcodeBarcodeResult;", "getBarcodeCache", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeCacheRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    public BarcodeCacheRepository(@NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.actionV2Repository = actionV2Repository;
        this.dispatcherProvider = dispatcherProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PrefetchBarcodeBarcodeResult.BackendError createBackendError(Integer errorRefreshInterval) {
        return new PrefetchBarcodeBarcodeResult.BackendError(errorRefreshInterval != null ? errorRefreshInterval.intValue() : 3600);
    }

    public final Object getBarcodeCache(@NotNull d<? super PrefetchBarcodeBarcodeResult> dVar) {
        return C10727i.f(this.dispatcherProvider.getIO(), new BarcodeCacheRepository$getBarcodeCache$2(this, null), dVar);
    }
}
