package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: VarianceManager.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u0006\u0010\u0016\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "", "varianceCalculator", "Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;", "timeProvider", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "", "(Lcom/socure/docv/capturesdk/common/utils/VarianceCalculator;Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;)V", "lastProcessedTime", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "variances", "", "", "calculate", "", "image1", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "image2", "(Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVariances", "", MetricTracker.Object.RESET, "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VarianceManager {
    public static final int MAX_VARIANCES = 20;
    public static final long VARIANCES_PROCESSING_INTERVAL = 500;
    private long lastProcessedTime;
    private final Mutex mutex;
    private final Provider<Long> timeProvider;
    private final VarianceCalculator varianceCalculator;
    private final List<Float> variances;
    public static final int $stable = 8;

    public VarianceManager(VarianceCalculator varianceCalculator, Provider<Long> timeProvider) {
        Intrinsics.checkNotNullParameter(varianceCalculator, "varianceCalculator");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.varianceCalculator = varianceCalculator;
        this.timeProvider = timeProvider;
        this.variances = new ArrayList();
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    public final List<Float> getVariances() {
        return CollectionsKt.toList(this.variances);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:11:0x006e, B:13:0x0078, B:15:0x008e, B:17:0x00a7, B:18:0x00ad), top: B:10:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculate(ExtractedImageData extractedImageData, ExtractedImageData extractedImageData2, Continuation<? super Unit> continuation) {
        VarianceManager$calculate$1 varianceManager$calculate$1;
        int i;
        VarianceManager varianceManager;
        ExtractedImageData extractedImageData3;
        ExtractedImageData extractedImageData4;
        Mutex mutex;
        long j;
        try {
            if (continuation instanceof VarianceManager$calculate$1) {
                varianceManager$calculate$1 = (VarianceManager$calculate$1) continuation;
                if ((varianceManager$calculate$1.label & Integer.MIN_VALUE) != 0) {
                    varianceManager$calculate$1.label -= Integer.MIN_VALUE;
                    Object obj = varianceManager$calculate$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = varianceManager$calculate$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        long longValue = this.timeProvider.get().longValue();
                        Mutex mutex2 = this.mutex;
                        varianceManager$calculate$1.L$0 = this;
                        varianceManager$calculate$1.L$1 = extractedImageData;
                        varianceManager$calculate$1.L$2 = extractedImageData2;
                        varianceManager$calculate$1.L$3 = mutex2;
                        varianceManager$calculate$1.J$0 = longValue;
                        varianceManager$calculate$1.label = 1;
                        if (mutex2.lock(null, varianceManager$calculate$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        varianceManager = this;
                        extractedImageData3 = extractedImageData;
                        extractedImageData4 = extractedImageData2;
                        mutex = mutex2;
                        j = longValue;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = varianceManager$calculate$1.J$0;
                        mutex = (Mutex) varianceManager$calculate$1.L$3;
                        extractedImageData4 = (ExtractedImageData) varianceManager$calculate$1.L$2;
                        extractedImageData3 = (ExtractedImageData) varianceManager$calculate$1.L$1;
                        varianceManager = (VarianceManager) varianceManager$calculate$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (j - varianceManager.lastProcessedTime >= 500) {
                        varianceManager.lastProcessedTime = j;
                        Float calculateMSE = varianceManager.varianceCalculator.calculateMSE(DataExtractionUtils.INSTANCE.convertToImageByteData(extractedImageData3), DataExtractionUtils.INSTANCE.convertToImageByteData(extractedImageData4));
                        if (calculateMSE != null) {
                            varianceManager.variances.add(Boxing.boxFloat(calculateMSE.floatValue()));
                            if (varianceManager.variances.size() > 20) {
                                varianceManager.variances.remove(0);
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (j - varianceManager.lastProcessedTime >= 500) {
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        varianceManager$calculate$1 = new VarianceManager$calculate$1(this, continuation);
        Object obj2 = varianceManager$calculate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = varianceManager$calculate$1.label;
        if (i != 0) {
        }
    }

    public final void reset() {
        this.lastProcessedTime = 0L;
        this.variances.clear();
    }
}
