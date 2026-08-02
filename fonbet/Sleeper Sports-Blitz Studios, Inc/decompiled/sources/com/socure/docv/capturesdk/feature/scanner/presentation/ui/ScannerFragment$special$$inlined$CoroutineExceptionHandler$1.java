package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.util.Log;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerFragment$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ ScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerFragment$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Companion companion, ScannerFragment scannerFragment) {
        super(companion);
        this.this$0 = scannerFragment;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        IOrchestratorViewModel orchestratorViewModel;
        SocureDocVError socureDocVError;
        LoggerKt.logE$default("SDLT_SF", "exceptionHandler called msg: " + Log.getStackTraceString(exception), null, 4, null);
        if (exception instanceof CancellationException) {
            LoggerKt.logD("SDLT_SF", "CancellationException: cause - " + ((CancellationException) exception).getLocalizedMessage());
            return;
        }
        ScannerFragment scannerFragment = this.this$0;
        Pair[] pairArr = (Pair[]) CollectionsKt.listOf((Object[]) new Pair[]{new Pair("type", "unknown"), new Pair("message", Log.getStackTraceString(exception))}).toArray(new Pair[0]);
        scannerFragment.sendEvent("error", (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        orchestratorViewModel = this.this$0.getOrchestratorViewModel();
        SocureApiError socureApiError = exception instanceof SocureApiError ? (SocureApiError) exception : null;
        if (socureApiError == null || (socureDocVError = socureApiError.getSocureDocVError()) == null) {
            socureDocVError = SocureDocVError.UNKNOWN;
        }
        orchestratorViewModel.backToCaller(socureDocVError);
    }
}
