package com.moloco.sdk.publisher;

import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.crash.a;
import com.moloco.sdk.internal.publisher.w;
import com.moloco.sdk.internal.publisher.x;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.services.init.n;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", i = {}, l = {149, 151, 174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class Moloco$initialize$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MolocoInitParams $initParam;
    final /* synthetic */ MolocoInitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$initialize$2(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, Continuation<? super Moloco$initialize$2> continuation) {
        super(2, continuation);
        this.$initParam = molocoInitParams;
        this.$listener = molocoInitializationListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Moloco$initialize$2(this.$initParam, this.$listener, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0133, code lost:
    
        if (r13 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009a, code lost:
    
        if (r13 == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w initializationHandler;
        Moloco$initialize$2 moloco$initialize$2;
        Set set;
        Object updateAndroidClientMetricsOnInitSuccess;
        Set set2;
        List flatten;
        boolean shouldInitializeILRD;
        List flatten2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "launched the scope to initialize sdk with thread name: " + Thread.currentThread().getName() + " and dispatcher DispatcherProvider().IO", null, false, 12, null);
            a b = a.d.a.b();
            this.label = 1;
            if (b.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                moloco$initialize$2 = this;
                Moloco moloco = Moloco.INSTANCE;
                MolocoInitParams molocoInitParams = moloco$initialize$2.$initParam;
                synchronized (moloco) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(molocoInitParams.getMediationInfo().getName());
                    linkedHashSet.addAll(moloco.getPendingInitByMediator$moloco_sdk_release().keySet());
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            shouldInitializeILRD = Moloco.INSTANCE.shouldInitializeILRD((String) it.next());
                            if (shouldInitializeILRD) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    Moloco.INSTANCE.initializeILRD();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization success", null, false, 12, null);
                Moloco moloco2 = Moloco.INSTANCE;
                synchronized (moloco2) {
                    flatten2 = CollectionsKt.flatten(moloco2.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco2.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                MolocoInitStatus b2 = w.f.b();
                MolocoInitializationListener molocoInitializationListener = moloco$initialize$2.$listener;
                if (molocoInitializationListener != null) {
                    x.a(molocoInitializationListener, b2);
                }
                Iterator it2 = flatten2.iterator();
                while (it2.hasNext()) {
                    x.a((MolocoInitializationListener) it2.next(), b2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            moloco$initialize$2 = this;
            v vVar = (v) obj;
            if (vVar instanceof v.a) {
                set2 = Moloco._failedMediations;
                set2.add(moloco$initialize$2.$initParam.getMediationInfo().getName());
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization failed", null, false, 12, null);
                Moloco moloco3 = Moloco.INSTANCE;
                synchronized (moloco3) {
                    flatten = CollectionsKt.flatten(moloco3.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco3.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                MolocoInitStatus a = w.f.a(((j) ((v.a) vVar).a()).toString());
                MolocoInitializationListener molocoInitializationListener2 = moloco$initialize$2.$listener;
                if (molocoInitializationListener2 != null) {
                    x.a(molocoInitializationListener2, a);
                }
                Iterator it3 = flatten.iterator();
                while (it3.hasNext()) {
                    x.a((MolocoInitializationListener) it3.next(), a);
                }
                return Unit.INSTANCE;
            }
            if (!(vVar instanceof v.b)) {
                throw new NoWhenBranchMatchedException();
            }
            set = Moloco._failedMediations;
            set.remove(moloco$initialize$2.$initParam.getMediationInfo().getName());
            Moloco moloco4 = Moloco.INSTANCE;
            moloco4.processInitConfigs((Init.SDKInitResponse) ((v.b) vVar).a());
            moloco$initialize$2.label = 3;
            updateAndroidClientMetricsOnInitSuccess = moloco4.updateAndroidClientMetricsOnInitSuccess(this);
        }
        Moloco moloco5 = Moloco.INSTANCE;
        moloco5.initializeAndroidClientMetrics(this.$initParam);
        initializationHandler = moloco5.getInitializationHandler();
        String appKey = this.$initParam.getAppKey();
        MediationInfo mediationInfo = this.$initParam.getMediationInfo();
        n c = a.f.a.c();
        MetricsRecorder create = MetricsRecorder.INSTANCE.create(this.$initParam.getMediationInfo().getName());
        this.label = 2;
        moloco$initialize$2 = this;
        obj = initializationHandler.a(appKey, mediationInfo, c, create, moloco$initialize$2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Moloco$initialize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
