package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "<init>", "()V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "<set-?>", "Landroidx/compose/material/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "showSnackbar", "Landroidx/compose/material/SnackbarResult;", "message", "", "actionLabel", "duration", "Landroidx/compose/material/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: currentSnackbarData$delegate, reason: from kotlin metadata */
    private final MutableState currentSnackbarData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r11.lock(null, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #2 {all -> 0x00bf, blocks: (B:26:0x007b, B:28:0x00ad), top: B:25:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showSnackbar(String str, String str2, SnackbarDuration snackbarDuration, Continuation<? super SnackbarResult> continuation) {
        SnackbarHostState$showSnackbar$1 snackbarHostState$showSnackbar$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        String str3;
        Object result;
        Mutex mutex2;
        try {
            try {
                if (continuation instanceof SnackbarHostState$showSnackbar$1) {
                    snackbarHostState$showSnackbar$1 = (SnackbarHostState$showSnackbar$1) continuation;
                    if ((snackbarHostState$showSnackbar$1.label & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$1.label -= Integer.MIN_VALUE;
                        Object obj = snackbarHostState$showSnackbar$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = snackbarHostState$showSnackbar$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            mutex = this.mutex;
                            snackbarHostState$showSnackbar$1.L$0 = str;
                            snackbarHostState$showSnackbar$1.L$1 = str2;
                            snackbarHostState$showSnackbar$1.L$2 = snackbarDuration;
                            snackbarHostState$showSnackbar$1.L$3 = mutex;
                            snackbarHostState$showSnackbar$1.label = 1;
                            str3 = str;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex2 = (Mutex) snackbarHostState$showSnackbar$1.L$3;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    setCurrentSnackbarData(null);
                                    mutex2.unlock(null);
                                    return obj;
                                } catch (Throwable th) {
                                    th = th;
                                    setCurrentSnackbarData(null);
                                    throw th;
                                }
                            }
                            Mutex mutex3 = (Mutex) snackbarHostState$showSnackbar$1.L$3;
                            snackbarDuration = (SnackbarDuration) snackbarHostState$showSnackbar$1.L$2;
                            str2 = (String) snackbarHostState$showSnackbar$1.L$1;
                            String str4 = (String) snackbarHostState$showSnackbar$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutex = mutex3;
                            str3 = str4;
                        }
                        snackbarHostState$showSnackbar$1.L$0 = str3;
                        snackbarHostState$showSnackbar$1.L$1 = str2;
                        snackbarHostState$showSnackbar$1.L$2 = snackbarDuration;
                        snackbarHostState$showSnackbar$1.L$3 = mutex;
                        snackbarHostState$showSnackbar$1.L$4 = snackbarHostState$showSnackbar$1;
                        snackbarHostState$showSnackbar$1.label = 2;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        setCurrentSnackbarData(new SnackbarDataImpl(str3, str2, snackbarDuration, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$1);
                        }
                        if (result != coroutine_suspended) {
                            Mutex mutex4 = mutex;
                            obj = result;
                            mutex2 = mutex4;
                            setCurrentSnackbarData(null);
                            mutex2.unlock(null);
                            return obj;
                        }
                        return coroutine_suspended;
                    }
                }
                snackbarHostState$showSnackbar$1.L$0 = str3;
                snackbarHostState$showSnackbar$1.L$1 = str2;
                snackbarHostState$showSnackbar$1.L$2 = snackbarDuration;
                snackbarHostState$showSnackbar$1.L$3 = mutex;
                snackbarHostState$showSnackbar$1.L$4 = snackbarHostState$showSnackbar$1;
                snackbarHostState$showSnackbar$1.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                cancellableContinuationImpl2.initCancellability();
                setCurrentSnackbarData(new SnackbarDataImpl(str3, str2, snackbarDuration, cancellableContinuationImpl2));
                result = cancellableContinuationImpl2.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (result != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                setCurrentSnackbarData(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            str.unlock(null);
            throw th3;
        }
        snackbarHostState$showSnackbar$1 = new SnackbarHostState$showSnackbar$1(this, continuation);
        Object obj2 = snackbarHostState$showSnackbar$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snackbarHostState$showSnackbar$1.label;
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, continuation);
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "message", "", "actionLabel", "duration", "Landroidx/compose/material/SnackbarDuration;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material/SnackbarResult;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/CancellableContinuation;)V", "getMessage", "()Ljava/lang/String;", "getActionLabel", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "performAction", "", ActionType.DISMISS, "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SnackbarDataImpl implements SnackbarData {
        private final String actionLabel;
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarDuration duration;
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(String str, String str2, SnackbarDuration snackbarDuration, CancellableContinuation<? super SnackbarResult> cancellableContinuation) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = snackbarDuration;
            this.continuation = cancellableContinuation;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                CancellableContinuation<SnackbarResult> cancellableContinuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m13470constructorimpl(SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                CancellableContinuation<SnackbarResult> cancellableContinuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m13470constructorimpl(SnackbarResult.Dismissed));
            }
        }
    }
}
