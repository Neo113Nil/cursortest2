package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.model.MetricCaptureData;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.feature.orchestrator.data.Config;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IOrchestratorViewModel.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001=J\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&J\b\u0010!\u001a\u00020 H&J\b\u0010\"\u001a\u00020 H&J\n\u0010#\u001a\u0004\u0018\u00010$H&J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0018H&J\b\u0010(\u001a\u00020 H&J\b\u0010)\u001a\u00020 H&JA\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,2*\u0010-\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0/0.\"\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0/H&¢\u0006\u0002\u00100J\b\u00101\u001a\u00020 H&J\"\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010,H&J\u0012\u00107\u001a\u00020 2\b\u00108\u001a\u0004\u0018\u00010$H&J\b\u00109\u001a\u00020 H&J\u0010\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020<H&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R4\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019`\u001aX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006>"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;", "", "activityCaller", "Landroidx/lifecycle/LiveData;", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "getActivityCaller", "()Landroidx/lifecycle/LiveData;", "error", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "getError", "module", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModule", "onSessionStarted", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getOnSessionStarted", "statusBarHeight", "", "getStatusBarHeight", "()Ljava/lang/Integer;", "setStatusBarHeight", "(Ljava/lang/Integer;)V", "uploadImageMap", "Ljava/util/LinkedHashMap;", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "Lkotlin/collections/LinkedHashMap;", "getUploadImageMap", "()Ljava/util/LinkedHashMap;", "setUploadImageMap", "(Ljava/util/LinkedHashMap;)V", "backToCaller", "", "clearData", "closeClicked", "getConfig", "Lcom/socure/docv/capturesdk/feature/orchestrator/data/Config;", "getMetricData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "scanType", "onCameraFailed", "onSetupCaptureError", "sendEvent", "eventName", "", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)V", "startSession", "triggerDeviceFingerPrint", "publicKey", "useSocureGov", "", "deviceUrl", "updateConfig", AnalyticsConstantsKt.KEY_CONFIG, "updateKeys", "updatingMetricData", "metricCaptureData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricCaptureData;", "Error", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IOrchestratorViewModel {
    void backToCaller(SocureDocVError error);

    void clearData();

    void closeClicked();

    LiveData<SocureDocVError> getActivityCaller();

    Config getConfig();

    LiveData<Error> getError();

    MetricData getMetricData(ScanType scanType);

    LiveData<ModuleModel> getModule();

    LiveData<StartSessionModel> getOnSessionStarted();

    Integer getStatusBarHeight();

    LinkedHashMap<ScanType, UploadImage> getUploadImageMap();

    void onCameraFailed();

    void onSetupCaptureError();

    void sendEvent(String eventName, Pair<String, String>... args);

    void setStatusBarHeight(Integer num);

    void setUploadImageMap(LinkedHashMap<ScanType, UploadImage> linkedHashMap);

    void startSession();

    void triggerDeviceFingerPrint(String publicKey, boolean useSocureGov, String deviceUrl);

    void updateConfig(Config config);

    void updateKeys();

    void updatingMetricData(MetricCaptureData metricCaptureData);

    /* compiled from: IOrchestratorViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "", "()V", "ApiError", "FailedToProvideModule", "FailedToStartSession", "FailedToSubmitModule", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$ApiError;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$FailedToProvideModule;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$FailedToStartSession;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$FailedToSubmitModule;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Error {
        public static final int $stable = 0;

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }

        /* compiled from: IOrchestratorViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$ApiError;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "socureError", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;)V", "getSocureError", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ApiError extends Error {
            public static final int $stable = 0;
            private final SocureDocVError socureError;

            public static /* synthetic */ ApiError copy$default(ApiError apiError, SocureDocVError socureDocVError, int i, Object obj) {
                if ((i & 1) != 0) {
                    socureDocVError = apiError.socureError;
                }
                return apiError.copy(socureDocVError);
            }

            /* renamed from: component1, reason: from getter */
            public final SocureDocVError getSocureError() {
                return this.socureError;
            }

            public final ApiError copy(SocureDocVError socureError) {
                Intrinsics.checkNotNullParameter(socureError, "socureError");
                return new ApiError(socureError);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApiError) && this.socureError == ((ApiError) other).socureError;
            }

            public int hashCode() {
                return this.socureError.hashCode();
            }

            public String toString() {
                return "ApiError(socureError=" + this.socureError + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApiError(SocureDocVError socureError) {
                super(null);
                Intrinsics.checkNotNullParameter(socureError, "socureError");
                this.socureError = socureError;
            }

            public final SocureDocVError getSocureError() {
                return this.socureError;
            }
        }

        /* compiled from: IOrchestratorViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$FailedToSubmitModule;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToSubmitModule extends Error {
            public static final int $stable = 0;
            public static final FailedToSubmitModule INSTANCE = new FailedToSubmitModule();

            private FailedToSubmitModule() {
                super(null);
            }
        }

        /* compiled from: IOrchestratorViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$FailedToProvideModule;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToProvideModule extends Error {
            public static final int $stable = 0;
            public static final FailedToProvideModule INSTANCE = new FailedToProvideModule();

            private FailedToProvideModule() {
                super(null);
            }
        }

        /* compiled from: IOrchestratorViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error$FailedToStartSession;", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel$Error;", "()V", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToStartSession extends Error {
            public static final int $stable = 0;
            public static final FailedToStartSession INSTANCE = new FailedToStartSession();

            private FailedToStartSession() {
                super(null);
            }
        }
    }
}
