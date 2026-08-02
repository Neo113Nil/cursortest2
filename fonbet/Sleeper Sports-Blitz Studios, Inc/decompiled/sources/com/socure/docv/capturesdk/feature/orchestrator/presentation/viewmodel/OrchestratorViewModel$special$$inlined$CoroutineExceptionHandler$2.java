package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import android.util.Log;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorViewModel$special$$inlined$CoroutineExceptionHandler$2 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ OrchestratorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrchestratorViewModel$special$$inlined$CoroutineExceptionHandler$2(CoroutineExceptionHandler.Companion companion, OrchestratorViewModel orchestratorViewModel) {
        super(companion);
        this.this$0 = orchestratorViewModel;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        LoggerKt.logE$default("SDLT_OVM", "Exception handled: " + exception.getLocalizedMessage(), null, 4, null);
        OrchestratorViewModel orchestratorViewModel = this.this$0;
        Pair[] pairArr = (Pair[]) CollectionsKt.listOf((Object[]) new Pair[]{new Pair("type", "unknown"), new Pair("message", "exceptionHandler: " + Log.getStackTraceString(exception))}).toArray(new Pair[0]);
        orchestratorViewModel.sendEvent("error", (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        this.this$0.backToCaller(SocureDocVError.UNKNOWN);
    }
}
