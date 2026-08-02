package ru.ozon.app.android.barcodecache.cache;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheDTO;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheResponseDTO;
import ru.ozon.app.android.barcodecache.data.PrefetchBarcodeBarcodeResult;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/barcodecache/data/PrefetchBarcodeBarcodeResult;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/barcodecache/data/PrefetchBarcodeBarcodeResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.barcodecache.cache.BarcodeCacheRepository$getBarcodeCache$2", f = "BarcodeCacheRepository.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BarcodeCacheRepository$getBarcodeCache$2 extends j implements Function2<M, d<? super PrefetchBarcodeBarcodeResult>, Object> {
    int label;
    final /* synthetic */ BarcodeCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeCacheRepository$getBarcodeCache$2(BarcodeCacheRepository barcodeCacheRepository, d<? super BarcodeCacheRepository$getBarcodeCache$2> dVar) {
        super(2, dVar);
        this.this$0 = barcodeCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BarcodeCacheRepository$getBarcodeCache$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        PrefetchBarcodeBarcodeResult.BackendError createBackendError;
        BarcodeCacheDTO barcode;
        PrefetchBarcodeBarcodeResult.BackendError createBackendError2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(null, "prefetchBarcode", false, 5, null);
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, BarcodeCacheResponseDTO.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        BarcodeCacheResponseDTO barcodeCacheResponseDTO = (BarcodeCacheResponseDTO) ((ActionV2Response) obj).getData();
        if (barcodeCacheResponseDTO == null || (barcode = barcodeCacheResponseDTO.getBarcode()) == null) {
            createBackendError = this.this$0.createBackendError(barcodeCacheResponseDTO != null ? barcodeCacheResponseDTO.getErrorRefreshInterval() : null);
            return createBackendError;
        }
        Boolean backendIsOkay = barcodeCacheResponseDTO.getBackendIsOkay();
        if (backendIsOkay != null ? backendIsOkay.booleanValue() : false) {
            return new PrefetchBarcodeBarcodeResult.Success(barcode, barcodeCacheResponseDTO.getTeensBarcode());
        }
        createBackendError2 = this.this$0.createBackendError(barcodeCacheResponseDTO.getErrorRefreshInterval());
        return createBackendError2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super PrefetchBarcodeBarcodeResult> dVar) {
        return ((BarcodeCacheRepository$getBarcodeCache$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
