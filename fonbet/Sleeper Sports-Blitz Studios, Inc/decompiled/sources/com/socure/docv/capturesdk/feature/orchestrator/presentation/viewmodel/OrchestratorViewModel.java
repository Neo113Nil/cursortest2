package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.EventManager;
import com.socure.docv.capturesdk.common.analytics.MetricsManager;
import com.socure.docv.capturesdk.common.analytics.model.EventData;
import com.socure.docv.capturesdk.common.analytics.model.MetricCaptureData;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.network.repository.RepoHolder;
import com.socure.docv.capturesdk.common.resource.ResourceManager;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.upload.EventUpdater;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.CaptureMetadata;
import com.socure.docv.capturesdk.core.processor.model.Resolution;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.data.Config;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$eventUpdater$2;
import com.socure.docv.capturesdk.feature.utils.NoReplayMutableLiveData;
import com.socure.docv.capturesdk.models.LandingModuleModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import com.socure.idplus.device.SigmaDevice;
import com.socure.idplus.device.SigmaDeviceOptions;
import com.socure.idplus.device.callback.SigmaDeviceCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: OrchestratorViewModel.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0002\r%\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0018H\u0002J\u0012\u0010S\u001a\u00020Q2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010T\u001a\u00020Q2\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010V\u001a\u00020QH\u0016J\b\u0010W\u001a\u00020QH\u0016J\n\u0010X\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010Y\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u0018H\u0002J\u0010\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020DH\u0016J\b\u0010]\u001a\u00020QH\u0016J\b\u0010^\u001a\u00020QH\u0014J\b\u0010_\u001a\u00020QH\u0016JA\u0010`\u001a\u00020Q2\u0006\u0010a\u001a\u00020\u00182*\u0010b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180d0c\"\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180dH\u0016¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020Q2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010g\u001a\u00020QH\u0016J\"\u0010h\u001a\u00020Q2\u0006\u0010i\u001a\u00020\u00182\u0006\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010m\u001a\u00020Q2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010n\u001a\u00020QH\u0016J\u0010\u0010o\u001a\u00020Q2\u0006\u0010p\u001a\u00020qH\u0016R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019`\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u000e\u0010*\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002050\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u000bR\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0004\u0018\u00010<X\u0096\u000e¢\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R6\u0010B\u001a\u001e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0Cj\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E`FX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0010\u0010K\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006r"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/OrchestratorViewModel;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/AndroidOrchestratorViewModel;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "dependencyGraph", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "(Landroid/app/Application;Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;)V", "activityCaller", "Landroidx/lifecycle/MutableLiveData;", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "getActivityCaller", "()Landroidx/lifecycle/MutableLiveData;", "componentCallback", "com/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/OrchestratorViewModel$componentCallback$1", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/OrchestratorViewModel$componentCallback$1;", "<set-?>", "Lcom/socure/docv/capturesdk/feature/orchestrator/data/Config;", AnalyticsConstantsKt.KEY_CONFIG, "getConfig$capturesdk_productionRelease", "()Lcom/socure/docv/capturesdk/feature/orchestrator/data/Config;", "consentJob", "Lkotlinx/coroutines/Job;", "durationMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "error", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "getError", "eventManager", "Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "getEventManager", "()Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "eventMgrExHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "eventUpdater", "com/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/OrchestratorViewModel$eventUpdater$2$1", "getEventUpdater", "()Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/OrchestratorViewModel$eventUpdater$2$1;", "eventUpdater$delegate", "Lkotlin/Lazy;", "exceptionHandler", "metricManager", "Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "getMetricManager", "()Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "module", "Landroidx/lifecycle/LiveData;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModule", "()Landroidx/lifecycle/LiveData;", "onSessionStarted", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getOnSessionStarted", "repoHolder", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "resourceManager", "Lcom/socure/docv/capturesdk/common/resource/ResourceManager;", "statusBarHeight", "", "getStatusBarHeight", "()Ljava/lang/Integer;", "setStatusBarHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "uploadImageMap", "Ljava/util/LinkedHashMap;", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "Lkotlin/collections/LinkedHashMap;", "getUploadImageMap", "()Ljava/util/LinkedHashMap;", "setUploadImageMap", "(Ljava/util/LinkedHashMap;)V", "uploadJob", "variancesManager", "Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "getVariancesManager", "()Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "addEventEpoch", "", "event", "backToCaller", "cancelJob", "job", "clearData", "closeClicked", "getConfig", "getElapsedTime", "getMetricData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "scanType", "onCameraFailed", "onCleared", "onSetupCaptureError", "sendEvent", "eventName", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "sendReqFailEvent", "startSession", "triggerDeviceFingerPrint", "publicKey", "isUseSocureGov", "", "deviceUrl", "updateConfig", "updateKeys", "updatingMetricData", "metricCaptureData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricCaptureData;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorViewModel extends AndroidOrchestratorViewModel {
    private final MutableLiveData<SocureDocVError> activityCaller;
    private Application application;
    private final OrchestratorViewModel$componentCallback$1 componentCallback;
    private Config config;
    private Job consentJob;
    private final OrchestratorActivityComponent dependencyGraph;
    private HashMap<String, Long> durationMap;
    private final MutableLiveData<IOrchestratorViewModel.Error> error;
    private final CoroutineExceptionHandler eventMgrExHandler;

    /* renamed from: eventUpdater$delegate, reason: from kotlin metadata */
    private final Lazy eventUpdater;
    private final CoroutineExceptionHandler exceptionHandler;
    private final LiveData<ModuleModel> module;
    private final MutableLiveData<StartSessionModel> onSessionStarted;
    private final RepoHolder repoHolder;
    private final ResourceManager resourceManager;
    private Integer statusBarHeight;
    private LinkedHashMap<ScanType, UploadImage> uploadImageMap;
    private Job uploadJob;

    /* JADX WARN: Type inference failed for: r10v15, types: [com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$componentCallback$1] */
    public OrchestratorViewModel(Application application, OrchestratorActivityComponent dependencyGraph) {
        SharedFlow shareIn$default;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dependencyGraph, "dependencyGraph");
        this.application = application;
        this.dependencyGraph = dependencyGraph;
        this.repoHolder = dependencyGraph.getRepoHolder();
        this.resourceManager = new ResourceManager();
        this.uploadImageMap = new LinkedHashMap<>();
        this.error = new NoReplayMutableLiveData();
        this.onSessionStarted = new MutableLiveData<>();
        final Flow<ModuleModel> currentModule = dependencyGraph.getOrchestratorModuleOrchestrator().getCurrentModule();
        Flow m15031catch = FlowKt.m15031catch(FlowKt.zip(new Flow<ModuleModel>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$special$$inlined$filter$1$2", f = "OrchestratorViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!(((ModuleModel) obj) instanceof LandingModuleModel)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ModuleModel> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, dependencyGraph.getOnModuleCompletedUseCase().getFlow(), new OrchestratorViewModel$module$2(null)), new OrchestratorViewModel$module$3(this, null));
        OrchestratorViewModel orchestratorViewModel = this;
        shareIn$default = FlowKt__ShareKt.shareIn$default(m15031catch, ViewModelKt.getViewModelScope(orchestratorViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.module = FlowLiveDataConversions.asLiveData$default(shareIn$default, ViewModelKt.getViewModelScope(orchestratorViewModel).getCoroutineContext(), 0L, 2, (Object) null);
        this.activityCaller = new MutableLiveData<>();
        this.eventMgrExHandler = new OrchestratorViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE);
        this.exceptionHandler = new OrchestratorViewModel$special$$inlined$CoroutineExceptionHandler$2(CoroutineExceptionHandler.INSTANCE, this);
        this.eventUpdater = LazyKt.lazy(new Function0<OrchestratorViewModel$eventUpdater$2.AnonymousClass1>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$eventUpdater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$eventUpdater$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public final AnonymousClass1 invoke() {
                final OrchestratorViewModel orchestratorViewModel2 = OrchestratorViewModel.this;
                return new EventUpdater() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$eventUpdater$2.1
                    @Override // com.socure.docv.capturesdk.common.upload.EventUpdater
                    public void triggerEvent(EventData eventData) {
                        Intrinsics.checkNotNullParameter(eventData, "eventData");
                        LoggerKt.logDetailed("SDLT_OVM", "triggerEvent called- eventDataName: " + eventData.getEventName());
                        OrchestratorViewModel orchestratorViewModel3 = OrchestratorViewModel.this;
                        String eventName = eventData.getEventName();
                        Pair[] pairArr = (Pair[]) eventData.getEventAttrList().toArray(new Pair[0]);
                        orchestratorViewModel3.sendEvent(eventName, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    }
                };
            }
        });
        this.durationMap = new HashMap<>();
        SessionManager.INSTANCE.clear();
        EventManager eventManager = getEventManager();
        Context applicationContext = this.application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
        eventManager.addLateAttrs$capturesdk_productionRelease(UtilsKt.getLateAttrs(applicationContext));
        FlowKt.launchIn(FlowKt.onEach(dependencyGraph.getOnModuleSubmissionErrorUseCase().getResult(), new AnonymousClass1(null)), ViewModelKt.getViewModelScope(orchestratorViewModel));
        this.componentCallback = new ComponentCallbacks2() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$componentCallback$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                LoggerKt.logD("SDLT_OVM", "onConfigurationChanged called - level: " + configuration);
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                LoggerKt.logD("SDLT_OVM", "onLowMemory called");
                OrchestratorViewModel.this.sendEvent("low_memory", new Pair<>("type", "low_memory"));
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
                LoggerKt.logD("SDLT_OVM", "onTrimMemory called - level: " + level);
                OrchestratorViewModel.this.sendEvent("low_memory", new Pair<>("type", AnalyticsConstantsKt.TRIM_MEMORY), new Pair<>("code", String.valueOf(level)));
            }
        };
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LinkedHashMap<ScanType, UploadImage> getUploadImageMap() {
        return this.uploadImageMap;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void setUploadImageMap(LinkedHashMap<ScanType, UploadImage> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.uploadImageMap = linkedHashMap;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public MutableLiveData<IOrchestratorViewModel.Error> getError() {
        return this.error;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public MutableLiveData<StartSessionModel> getOnSessionStarted() {
        return this.onSessionStarted;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LiveData<ModuleModel> getModule() {
        return this.module;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public MutableLiveData<SocureDocVError> getActivityCaller() {
        return this.activityCaller;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public Integer getStatusBarHeight() {
        return this.statusBarHeight;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void setStatusBarHeight(Integer num) {
        this.statusBarHeight = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MetricsManager getMetricManager() {
        return this.dependencyGraph.getMetricsManager();
    }

    private final VarianceManager getVariancesManager() {
        return this.dependencyGraph.getVarianceManager();
    }

    private final EventManager getEventManager() {
        EventManager eventManager = this.dependencyGraph.getEventManager();
        eventManager.setExceptionHandler(this.eventMgrExHandler);
        return eventManager;
    }

    private final OrchestratorViewModel$eventUpdater$2.AnonymousClass1 getEventUpdater() {
        return (OrchestratorViewModel$eventUpdater$2.AnonymousClass1) this.eventUpdater.getValue();
    }

    public final Config getConfig$capturesdk_productionRelease() {
        return this.config;
    }

    private final void addEventEpoch(String event) {
        LoggerKt.logD("SDLT_OVM", "addEventEpoch called for " + event);
        this.durationMap.put(event, Long.valueOf(System.currentTimeMillis()));
    }

    private final long getElapsedTime(String event) {
        Long l = this.durationMap.get(event);
        if (l == null) {
            l = -1L;
        }
        long longValue = l.longValue();
        if (longValue > 0) {
            return System.currentTimeMillis() - longValue;
        }
        return -1L;
    }

    /* compiled from: OrchestratorViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Result;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$1", f = "OrchestratorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends Unit>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = OrchestratorViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Result<? extends Unit> result, Continuation<? super Unit> continuation) {
            return invoke(result.getValue(), continuation);
        }

        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Result.m13469boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(((Result) this.L$0).getValue());
            if (m13473exceptionOrNullimpl instanceof SocureApiError) {
                OrchestratorViewModel.this.getError().postValue(new IOrchestratorViewModel.Error.ApiError(((SocureApiError) m13473exceptionOrNullimpl).getSocureDocVError()));
            } else {
                OrchestratorViewModel.this.getError().postValue(IOrchestratorViewModel.Error.FailedToSubmitModule.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void startSession() {
        LoggerKt.logD("SDLT_OVM", "startSession called");
        addEventEpoch(AnalyticsConstantsKt.SESSION_START_MARKER);
        ResourceManager resourceManager = this.resourceManager;
        Context applicationContext = this.application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
        resourceManager.readMemory$capturesdk_productionRelease(applicationContext);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dependencyGraph.getBackgroundDispatcher(), null, new OrchestratorViewModel$startSession$1(this, null), 2, null);
        try {
            this.application.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_OVM", "exception when registerComponentCallbacks: " + th.getLocalizedMessage(), null, 4, null);
        }
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void updateKeys() {
        LoggerKt.logD("SDLT_OVM", "updatePublicKey called");
        getEventManager().updatePublicKey(SessionManager.INSTANCE.getPublicKey());
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        LoggerKt.logDetailed("SDLT_OVM", "onCleared called");
        cancelJob(this.uploadJob);
        cancelJob(this.consentJob);
        clearData();
        try {
            this.application.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_OVM", "exception when unregisterComponentCallbacks: " + th.getLocalizedMessage(), null, 4, null);
        }
        super.onCleared();
    }

    private final void cancelJob(Job job) {
        LoggerKt.logD("SDLT_OVM", "cancelJob called for " + job);
        if (job == null || !job.isActive()) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void clearData() {
        LoggerKt.logD("SDLT_OVM", "clearData");
        getUploadImageMap().clear();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void sendEvent(String eventName, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        List mutableListOf = CollectionsKt.mutableListOf(Arrays.copyOf(args, args.length));
        mutableListOf.add(new Pair(AnalyticsConstantsKt.KEY_SESSION_DURATION, String.valueOf(getElapsedTime(AnalyticsConstantsKt.SESSION_START_MARKER))));
        EventManager eventManager = getEventManager();
        Pair[] pairArr = (Pair[]) mutableListOf.toArray(new Pair[0]);
        eventManager.sendEvent(eventName, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReqFailEvent(SocureDocVError error) {
        try {
            Result.Companion companion = Result.INSTANCE;
            OrchestratorViewModel orchestratorViewModel = this;
            sendEvent(AnalyticsConstantsKt.REQUEST_FAILURE, new Pair<>("message", error.name()));
            Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void updatingMetricData(MetricCaptureData metricCaptureData) {
        Resolution resolution;
        Resolution resolution2;
        Intrinsics.checkNotNullParameter(metricCaptureData, "metricCaptureData");
        CaptureMetadata captureMetadata = metricCaptureData.getCaptureMetadata();
        Integer num = null;
        CaptureType captureType = captureMetadata != null ? captureMetadata.getCaptureType() : null;
        CaptureMetadata captureMetadata2 = metricCaptureData.getCaptureMetadata();
        Integer valueOf = (captureMetadata2 == null || (resolution2 = captureMetadata2.getResolution()) == null) ? null : Integer.valueOf(resolution2.getWidth());
        CaptureMetadata captureMetadata3 = metricCaptureData.getCaptureMetadata();
        if (captureMetadata3 != null && (resolution = captureMetadata3.getResolution()) != null) {
            num = Integer.valueOf(resolution.getHeight());
        }
        LoggerKt.logDetailed("SDLT_OVM", "setSettingResolution called - captureType: " + captureType + " || resolution: w:" + valueOf + " h:" + num);
        getMetricManager().updatingMetricData(metricCaptureData);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public Config getConfig() {
        return this.config;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void backToCaller(SocureDocVError error) {
        getActivityCaller().postValue(error);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void closeClicked() {
        getActivityCaller().postValue(SocureDocVError.USER_CANCELED);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void onCameraFailed() {
        getActivityCaller().postValue(SocureDocVError.UNKNOWN);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void onSetupCaptureError() {
        getActivityCaller().postValue(SocureDocVError.UNKNOWN);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void updateConfig(Config config) {
        LoggerKt.logD("SDLT_OVM", "updateConfig called");
        this.config = config;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public MetricData getMetricData(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        MetricData moduleSpecificMetrics = getMetricManager().getModuleSpecificMetrics(scanType, (ArrayList) CollectionsKt.toCollection(getVariancesManager().getVariances(), new ArrayList()));
        getVariancesManager().reset();
        return moduleSpecificMetrics;
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void triggerDeviceFingerPrint(String publicKey, boolean isUseSocureGov, String deviceUrl) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        SigmaDeviceOptions sigmaDeviceOptions = new SigmaDeviceOptions(false, null, isUseSocureGov, deviceUrl, null, 19, null);
        LoggerKt.logD("SDLT_OVM", "triggerDeviceFingerPrint called - Triggering Device Fingerprint SDK");
        SigmaDevice.INSTANCE.initializeSDK(this.application, publicKey, sigmaDeviceOptions, new SigmaDeviceCallback() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorViewModel$triggerDeviceFingerPrint$1
            @Override // com.socure.idplus.device.callback.SigmaDeviceCallback
            public void onSessionCreated(String sessionToken) {
                Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
                SessionManager.INSTANCE.setDeviceSessionToken(sessionToken);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(OrchestratorViewModel.this), Dispatchers.getIO().plus(new OrchestratorViewModel$triggerDeviceFingerPrint$1$onSessionCreated$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE)), null, new OrchestratorViewModel$triggerDeviceFingerPrint$1$onSessionCreated$2(OrchestratorViewModel.this, sessionToken, null), 2, null);
            }

            @Override // com.socure.idplus.device.callback.DeviceIntelligenceCallback
            public void onError(SigmaDeviceError errorType, String errorMessage) {
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                LoggerKt.logE$default("SDLT_OVM", "Failed instantiate device risk: " + errorMessage, null, 4, null);
            }
        });
    }
}
