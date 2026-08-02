package com.socure.docv.capturesdk.di.orchestrator;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import com.socure.docv.capturesdk.common.analytics.EventManager;
import com.socure.docv.capturesdk.common.analytics.MetricsManager;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.common.config.model.ModelConfig;
import com.socure.docv.capturesdk.common.mapper.GlobalConfigMapper;
import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.mapper.ModuleMapperInput;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ButtonStyle;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Config;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Customization;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ErrorLabels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Theme;
import com.socure.docv.capturesdk.common.network.repository.ModulesRepository;
import com.socure.docv.capturesdk.common.network.repository.RepoHolder;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import com.socure.docv.capturesdk.core.storage.Cache;
import com.socure.docv.capturesdk.di.activity.ActivityComponent;
import com.socure.docv.capturesdk.di.consent.ConsentFragmentComponent;
import com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent;
import com.socure.docv.capturesdk.di.fragment.FragmentComponent;
import com.socure.docv.capturesdk.di.scanner.ScannerFragmentComponent;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleCompletedUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OrchestratorViewModelProvider;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityBackIdScannerShim;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityDocSelectionShim;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityFrontIdScannerShim;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivityPassportScannerShim;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorActivitySelfieScannerShim;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.impl.OrchestratorConsentShim;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.OrchestratorVMFactory;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.ProductionOrchestratorVMFactory;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import com.socure.docv.capturesdk.models.BackModuleModel;
import com.socure.docv.capturesdk.models.ButtonModel;
import com.socure.docv.capturesdk.models.ButtonStyleModel;
import com.socure.docv.capturesdk.models.ConfigModel;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import com.socure.docv.capturesdk.models.CustomizationModel;
import com.socure.docv.capturesdk.models.ErrorLabelsModel;
import com.socure.docv.capturesdk.models.FrontModuleModel;
import com.socure.docv.capturesdk.models.GlobalConfigModel;
import com.socure.docv.capturesdk.models.IDSelectionModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.PassportModuleModel;
import com.socure.docv.capturesdk.models.SelfieModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import com.socure.docv.capturesdk.models.ThemeModel;
import com.socure.docv.capturesdk.models.TransitionModuleModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrchestratorActivityComponentImpl.kt */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0014\u0010¨\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0016J\u0014\u0010¬\u0001\u001a\u00030\u00ad\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0016J\u0014\u0010®\u0001\u001a\u00030¯\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0016J\u0014\u0010°\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0016J\u0014\u0010±\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0016J\u0014\u0010²\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030«\u0001H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010#R \u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020)0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR \u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020-0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR \u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u0002010\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u0010\u001aR\u001e\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002040\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010\u001aR\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020%0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010#R\u0014\u0010:\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0014R \u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010=\u0012\u0004\u0012\u00020>0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010\u001aR \u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020B0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010\u001aR\u0012\u0010D\u001a\u00020EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001e\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020I0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010\u001aR\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010#R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020%0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010#R\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010#R\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020%0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010#R\u001e\u0010S\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010\u001aR\u0018\u0010W\u001a\u00020XX\u0096\u000f¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020^0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010\u001aR\u0012\u0010`\u001a\u00020\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010\u001eR\u0012\u0010b\u001a\u00020cX\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010eRF\u0010f\u001a6\u0012\u0004\u0012\u00020h\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0j\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0j\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0i0gj\u0002`kX\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010mR \u0010n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010o\u0012\u0004\u0012\u00020p0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bq\u0010\u001aR\u0012\u0010r\u001a\u00020sX\u0096\u0005¢\u0006\u0006\u001a\u0004\bt\u0010uR\u001b\u0010v\u001a\u00020w8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bx\u0010yR\u001c\u0010|\u001a\u00020}8VX\u0096\u0084\u0002¢\u0006\r\n\u0005\b\u0080\u0001\u0010{\u001a\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u0085\u0001\u001a\u00030\u0086\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010{\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R!\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u008b\u00010\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u001aR\u0016\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u0091\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u0092\u00010\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u001aR\u001c\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010jX\u0096\u0005¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0005\u0012\u00030\u0095\u00010\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u001aR$\u0010\u009a\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u009b\u0001\u0012\u0005\u0012\u00030\u009c\u00010\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u001aR!\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u009f\u00010\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u001aR!\u0010¡\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030¢\u00010\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\u001aR\u0016\u0010¤\u0001\u001a\u00030¥\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001¨\u0006³\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponentImpl;", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", "activityComponent", "(Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;)V", "accessibilityAnnouncer", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityAnnouncer", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "backMapper", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "getBackMapper", "()Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "blurModelConfidenceProvider", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "", "getBlurModelConfidenceProvider", "()Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "blurModelProvider", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "getBlurModelProvider", "buttonMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "getButtonMapper", "buttonStyleMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "getButtonStyleMapper", "configMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "Lcom/socure/docv/capturesdk/models/ConfigModel;", "getConfigMapper", "consentMapper", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "getConsentMapper", "cornerModelConfidenceProvider", "getCornerModelConfidenceProvider", "cornerModelProvider", "getCornerModelProvider", "coroutineScope", "getCoroutineScope", "customizationMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "getCustomizationMapper", "errorLabelsMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "getErrorLabelsMapper", "eventManager", "Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "getEventManager", "()Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "frontMapper", "Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "getFrontMapper", "glareIntensityModelConfidenceProvider", "getGlareIntensityModelConfidenceProvider", "glareIntensityModelProvider", "getGlareIntensityModelProvider", "glareModelConfidenceProvider", "getGlareModelConfidenceProvider", "glareModelProvider", "getGlareModelProvider", "globalConfigMapper", "Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "getGlobalConfigMapper", "guidingBoxViewDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "getGuidingBoxViewDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "setGuidingBoxViewDimension", "(Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;)V", "idSelectionMapper", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "getIdSelectionMapper", "mainDispatcher", "getMainDispatcher", "metricsManager", "Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "getMetricsManager", "()Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "modelDependencies", "", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "Lkotlin/Triple;", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "Lcom/socure/docv/capturesdk/common/utils/DynamicModelDependencies;", "getModelDependencies", "()Ljava/util/Map;", "moduleResponseMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModuleResponseMapper", "modulesRepository", "Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "getModulesRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "onModuleCompletedUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "getOnModuleCompletedUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleCompletedUseCase;", "onModuleCompletedUseCase$delegate", "Lkotlin/Lazy;", "onModuleSubmissionErrorUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "getOnModuleSubmissionErrorUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OnModuleSubmissionErrorUseCase;", "onModuleSubmissionErrorUseCase$delegate", "orchestratorVMFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getOrchestratorVMFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "orchestratorVMProvider", "Lcom/socure/docv/capturesdk/feature/orchestrator/OrchestratorViewModelProvider;", "getOrchestratorVMProvider", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OrchestratorViewModelProvider;", "orchestratorVMProvider$delegate", "passportMapper", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "getPassportMapper", "repoHolder", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "getRepoHolder", "()Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "selfieMapper", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "getSelfieMapper", "startSessionCache", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionCache", "()Lcom/socure/docv/capturesdk/core/storage/Cache;", "startSessionMapper", "getStartSessionMapper", "themeMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "getThemeMapper", "transitionMapper", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "getTransitionMapper", "unstructuredDocumentMapper", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getUnstructuredDocumentMapper", "varianceManager", "Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "getVarianceManager", "()Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "backIDScannerFragmentSubComponent", "Lcom/socure/docv/capturesdk/di/scanner/ScannerFragmentComponent;", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "consentFragmentSubComponent", "Lcom/socure/docv/capturesdk/di/consent/ConsentFragmentComponent;", "docSelectionFragmentSubComponent", "Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "frontIDScannerFragmentSubComponent", "passportScannerFragmentSubComponent", "selfieScannerFragmentSubComponent", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class OrchestratorActivityComponentImpl implements OrchestratorActivityComponent, ActivityComponent {
    private final /* synthetic */ ActivityComponent $$delegate_0;

    /* renamed from: onModuleCompletedUseCase$delegate, reason: from kotlin metadata */
    private final Lazy onModuleCompletedUseCase;

    /* renamed from: onModuleSubmissionErrorUseCase$delegate, reason: from kotlin metadata */
    private final Lazy onModuleSubmissionErrorUseCase;

    /* renamed from: orchestratorVMProvider$delegate, reason: from kotlin metadata */
    private final Lazy orchestratorVMProvider;

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public AnnounceAccessibilityMessageUseCase getAccessibilityAnnouncer() {
        return this.$$delegate_0.getAccessibilityAnnouncer();
    }

    @Override // com.socure.docv.capturesdk.di.activity.ActivityComponentProvisions
    public AppCompatActivity getActivity() {
        return this.$$delegate_0.getActivity();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Application getApplication() {
        return this.$$delegate_0.getApplication();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public CoroutineScope getApplicationScope() {
        return this.$$delegate_0.getApplicationScope();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, BackModuleModel> getBackMapper() {
        return this.$$delegate_0.getBackMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public CoroutineDispatcher getBackgroundDispatcher() {
        return this.$$delegate_0.getBackgroundDispatcher();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getBlurModelConfidenceProvider() {
        return this.$$delegate_0.getBlurModelConfidenceProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getBlurModelProvider() {
        return this.$$delegate_0.getBlurModelProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Button, ButtonModel> getButtonMapper() {
        return this.$$delegate_0.getButtonMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ButtonStyle, ButtonStyleModel> getButtonStyleMapper() {
        return this.$$delegate_0.getButtonStyleMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Config, ConfigModel> getConfigMapper() {
        return this.$$delegate_0.getConfigMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, ConsentModuleModel> getConsentMapper() {
        return this.$$delegate_0.getConsentMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getCornerModelConfidenceProvider() {
        return this.$$delegate_0.getCornerModelConfidenceProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getCornerModelProvider() {
        return this.$$delegate_0.getCornerModelProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Customization, CustomizationModel> getCustomizationMapper() {
        return this.$$delegate_0.getCustomizationMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ErrorLabels, ErrorLabelsModel> getErrorLabelsMapper() {
        return this.$$delegate_0.getErrorLabelsMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public EventManager getEventManager() {
        return this.$$delegate_0.getEventManager();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, FrontModuleModel> getFrontMapper() {
        return this.$$delegate_0.getFrontMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getGlareIntensityModelConfidenceProvider() {
        return this.$$delegate_0.getGlareIntensityModelConfidenceProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getGlareIntensityModelProvider() {
        return this.$$delegate_0.getGlareIntensityModelProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getGlareModelConfidenceProvider() {
        return this.$$delegate_0.getGlareModelConfidenceProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getGlareModelProvider() {
        return this.$$delegate_0.getGlareModelProvider();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> getGlobalConfigMapper() {
        return this.$$delegate_0.getGlobalConfigMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public ViewDimensions getGuidingBoxViewDimension() {
        return this.$$delegate_0.getGuidingBoxViewDimension();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, IDSelectionModel> getIdSelectionMapper() {
        return this.$$delegate_0.getIdSelectionMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public CoroutineDispatcher getMainDispatcher() {
        return this.$$delegate_0.getMainDispatcher();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public MetricsManager getMetricsManager() {
        return this.$$delegate_0.getMetricsManager();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Map<ModelConfig.Type, Triple<Cache<Model>, Cache<Float>, Provider<Float>>> getModelDependencies() {
        return this.$$delegate_0.getModelDependencies();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleDataResponse, ModuleModel> getModuleResponseMapper() {
        return this.$$delegate_0.getModuleResponseMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public ModulesRepository getModulesRepository() {
        return this.$$delegate_0.getModulesRepository();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, PassportModuleModel> getPassportMapper() {
        return this.$$delegate_0.getPassportMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public RepoHolder getRepoHolder() {
        return this.$$delegate_0.getRepoHolder();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, SelfieModuleModel> getSelfieMapper() {
        return this.$$delegate_0.getSelfieMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Cache<StartSessionModel> getStartSessionCache() {
        return this.$$delegate_0.getStartSessionCache();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleDataResponse, StartSessionModel> getStartSessionMapper() {
        return this.$$delegate_0.getStartSessionMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Theme, ThemeModel> getThemeMapper() {
        return this.$$delegate_0.getThemeMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, TransitionModuleModel> getTransitionMapper() {
        return this.$$delegate_0.getTransitionMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, UnstructuredModuleModel> getUnstructuredDocumentMapper() {
        return this.$$delegate_0.getUnstructuredDocumentMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public VarianceManager getVarianceManager() {
        return this.$$delegate_0.getVarianceManager();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public void setGuidingBoxViewDimension(ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(viewDimensions, "<set-?>");
        this.$$delegate_0.setGuidingBoxViewDimension(viewDimensions);
    }

    public OrchestratorActivityComponentImpl(ActivityComponent activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.$$delegate_0 = activityComponent;
        this.orchestratorVMProvider = LazyKt.lazy(new Function0<OrchestratorViewModelProvider>() { // from class: com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentImpl$orchestratorVMProvider$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OrchestratorViewModelProvider invoke() {
                return new OrchestratorViewModelProvider(OrchestratorActivityComponentImpl.this.getOrchestratorVMFactory());
            }
        });
        this.onModuleCompletedUseCase = LazyKt.lazy(new Function0<OnModuleCompletedUseCase>() { // from class: com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentImpl$onModuleCompletedUseCase$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OnModuleCompletedUseCase invoke() {
                return new OnModuleCompletedUseCase();
            }
        });
        this.onModuleSubmissionErrorUseCase = LazyKt.lazy(new Function0<OnModuleSubmissionErrorUseCase>() { // from class: com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentImpl$onModuleSubmissionErrorUseCase$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OnModuleSubmissionErrorUseCase invoke() {
                return new OnModuleSubmissionErrorUseCase();
            }
        });
    }

    private final CoroutineScope getCoroutineScope() {
        return LifecycleOwnerKt.getLifecycleScope(getActivity());
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public OrchestratorViewModelProvider getOrchestratorVMProvider() {
        return (OrchestratorViewModelProvider) this.orchestratorVMProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ViewModelProvider.Factory getOrchestratorVMFactory() {
        Application application = getActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        return new ProductionOrchestratorVMFactory(new OrchestratorVMFactory(application, this));
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public OnModuleCompletedUseCase getOnModuleCompletedUseCase() {
        return (OnModuleCompletedUseCase) this.onModuleCompletedUseCase.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public OnModuleSubmissionErrorUseCase getOnModuleSubmissionErrorUseCase() {
        return (OnModuleSubmissionErrorUseCase) this.onModuleSubmissionErrorUseCase.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ScannerFragmentComponent frontIDScannerFragmentSubComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return ScannerFragmentComponent.INSTANCE.build(FragmentComponent.INSTANCE.build(fragment, this), new OrchestratorActivityFrontIdScannerShim(getCoroutineScope(), getOnModuleCompletedUseCase(), getOrchestratorModuleOrchestrator(), getBackgroundDispatcher(), getOnModuleSubmissionErrorUseCase(), getMetricsManager()), ScanType.LICENSE_FRONT);
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ScannerFragmentComponent backIDScannerFragmentSubComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return ScannerFragmentComponent.INSTANCE.build(FragmentComponent.INSTANCE.build(fragment, this), new OrchestratorActivityBackIdScannerShim(getCoroutineScope(), getOnModuleCompletedUseCase(), getOrchestratorModuleOrchestrator(), getBackgroundDispatcher(), getOnModuleSubmissionErrorUseCase(), getMetricsManager()), ScanType.LICENSE_BACK);
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ScannerFragmentComponent selfieScannerFragmentSubComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return ScannerFragmentComponent.INSTANCE.build(FragmentComponent.INSTANCE.build(fragment, this), new OrchestratorActivitySelfieScannerShim(getCoroutineScope(), getOnModuleCompletedUseCase(), getOrchestratorModuleOrchestrator(), getBackgroundDispatcher(), getOnModuleSubmissionErrorUseCase(), getMetricsManager()), ScanType.SELFIE);
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ScannerFragmentComponent passportScannerFragmentSubComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return ScannerFragmentComponent.INSTANCE.build(FragmentComponent.INSTANCE.build(fragment, this), new OrchestratorActivityPassportScannerShim(getCoroutineScope(), getOnModuleCompletedUseCase(), getOrchestratorModuleOrchestrator(), getBackgroundDispatcher(), getOnModuleSubmissionErrorUseCase(), getMetricsManager()), ScanType.PASSPORT);
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public DocSelectionFragmentComponent docSelectionFragmentSubComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return DocSelectionFragmentComponent.INSTANCE.build(FragmentComponent.INSTANCE.build(fragment, this), new OrchestratorActivityDocSelectionShim(LifecycleOwnerKt.getLifecycleScope(getActivity()), getOrchestratorModuleOrchestrator(), getOnModuleCompletedUseCase(), getOnModuleSubmissionErrorUseCase()));
    }

    @Override // com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponentProvisions
    public ConsentFragmentComponent consentFragmentSubComponent(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return ConsentFragmentComponent.INSTANCE.build(FragmentComponent.INSTANCE.build(fragment, this), new OrchestratorConsentShim(LifecycleOwnerKt.getLifecycleScope(getActivity()), getOrchestratorModuleOrchestrator(), getOnModuleCompletedUseCase(), getOnModuleSubmissionErrorUseCase()));
    }
}
