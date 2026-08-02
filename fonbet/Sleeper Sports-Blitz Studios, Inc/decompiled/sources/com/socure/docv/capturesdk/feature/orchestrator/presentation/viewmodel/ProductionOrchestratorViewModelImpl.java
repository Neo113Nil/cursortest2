package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.model.MetricCaptureData;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.feature.orchestrator.data.Config;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductionOrchestratorViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\"\u001a\u00020#2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\t\u0010$\u001a\u00020#H\u0096\u0001J\t\u0010%\u001a\u00020#H\u0096\u0001J\u000b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0001J\u0011\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001bH\u0096\u0001J\t\u0010+\u001a\u00020#H\u0096\u0001J\t\u0010,\u001a\u00020#H\u0096\u0001JB\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/2*\u00100\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0201\"\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/02H\u0096\u0001¢\u0006\u0002\u00103J\t\u00104\u001a\u00020#H\u0096\u0001J#\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010/H\u0096\u0001J\u0013\u0010:\u001a\u00020#2\b\u0010;\u001a\u0004\u0018\u00010'H\u0096\u0001J\t\u0010<\u001a\u00020#H\u0096\u0001J\u0011\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0096\u0001R\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c`\u001dX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006@"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/ProductionOrchestratorViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;", "delegate", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;)V", "activityCaller", "Landroidx/lifecycle/LiveData;", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "getActivityCaller", "()Landroidx/lifecycle/LiveData;", "error", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "getError", "module", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModule", "onSessionStarted", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getOnSessionStarted", "statusBarHeight", "", "getStatusBarHeight", "()Ljava/lang/Integer;", "setStatusBarHeight", "(Ljava/lang/Integer;)V", "uploadImageMap", "Ljava/util/LinkedHashMap;", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "Lkotlin/collections/LinkedHashMap;", "getUploadImageMap", "()Ljava/util/LinkedHashMap;", "setUploadImageMap", "(Ljava/util/LinkedHashMap;)V", "backToCaller", "", "clearData", "closeClicked", "getConfig", "Lcom/socure/docv/capturesdk/feature/orchestrator/data/Config;", "getMetricData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "scanType", "onCameraFailed", "onSetupCaptureError", "sendEvent", "eventName", "", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "startSession", "triggerDeviceFingerPrint", "publicKey", "useSocureGov", "", "deviceUrl", "updateConfig", AnalyticsConstantsKt.KEY_CONFIG, "updateKeys", "updatingMetricData", "metricCaptureData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricCaptureData;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductionOrchestratorViewModelImpl extends ViewModel implements IOrchestratorViewModel {
    private final /* synthetic */ IOrchestratorViewModel $$delegate_0;

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void backToCaller(SocureDocVError error) {
        this.$$delegate_0.backToCaller(error);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void clearData() {
        this.$$delegate_0.clearData();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void closeClicked() {
        this.$$delegate_0.closeClicked();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LiveData<SocureDocVError> getActivityCaller() {
        return this.$$delegate_0.getActivityCaller();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public Config getConfig() {
        return this.$$delegate_0.getConfig();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LiveData<IOrchestratorViewModel.Error> getError() {
        return this.$$delegate_0.getError();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public MetricData getMetricData(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        return this.$$delegate_0.getMetricData(scanType);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LiveData<ModuleModel> getModule() {
        return this.$$delegate_0.getModule();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LiveData<StartSessionModel> getOnSessionStarted() {
        return this.$$delegate_0.getOnSessionStarted();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public Integer getStatusBarHeight() {
        return this.$$delegate_0.getStatusBarHeight();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public LinkedHashMap<ScanType, UploadImage> getUploadImageMap() {
        return this.$$delegate_0.getUploadImageMap();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void onCameraFailed() {
        this.$$delegate_0.onCameraFailed();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void onSetupCaptureError() {
        this.$$delegate_0.onSetupCaptureError();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void sendEvent(String eventName, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        this.$$delegate_0.sendEvent(eventName, args);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void setStatusBarHeight(Integer num) {
        this.$$delegate_0.setStatusBarHeight(num);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void setUploadImageMap(LinkedHashMap<ScanType, UploadImage> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
        this.$$delegate_0.setUploadImageMap(linkedHashMap);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void startSession() {
        this.$$delegate_0.startSession();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void triggerDeviceFingerPrint(String publicKey, boolean useSocureGov, String deviceUrl) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.$$delegate_0.triggerDeviceFingerPrint(publicKey, useSocureGov, deviceUrl);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void updateConfig(Config config) {
        this.$$delegate_0.updateConfig(config);
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void updateKeys() {
        this.$$delegate_0.updateKeys();
    }

    @Override // com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel
    public void updatingMetricData(MetricCaptureData metricCaptureData) {
        Intrinsics.checkNotNullParameter(metricCaptureData, "metricCaptureData");
        this.$$delegate_0.updatingMetricData(metricCaptureData);
    }

    public ProductionOrchestratorViewModelImpl(IOrchestratorViewModel delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }
}
