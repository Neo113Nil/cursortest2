package com.socure.docv.capturesdk.di.docselection;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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
import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import com.socure.docv.capturesdk.core.storage.Cache;
import com.socure.docv.capturesdk.di.fragment.FragmentComponent;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionShim;
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
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocSelectionFragmentComponentImpl.kt */
@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010%R \u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020+0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR \u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020/0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR \u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u0002030\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u001e\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002060\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010\u001cR\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010%R\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020'0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010%R \u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010=\u0012\u0004\u0012\u00020>0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010\u001cR \u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020B0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010\u001cR\u0012\u0010D\u001a\u00020EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0012\u0010H\u001a\u00020IX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001e\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020M0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010\u001cR\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010%R\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020'0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010%R\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010%R\u0018\u0010U\u001a\b\u0012\u0004\u0012\u00020'0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010%R\u001e\u0010W\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010\u001cR\u0018\u0010[\u001a\u00020\\X\u0096\u000f¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001e\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020b0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u0010\u001cR\u0012\u0010d\u001a\u00020\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010 R\u0012\u0010f\u001a\u00020gX\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010iRF\u0010j\u001a6\u0012\u0004\u0012\u00020l\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0n\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0n\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0m0kj\u0002`oX\u0096\u0005¢\u0006\u0006\u001a\u0004\bp\u0010qR \u0010r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010s\u0012\u0004\u0012\u00020t0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\bu\u0010\u001cR\u0012\u0010v\u001a\u00020wX\u0096\u0005¢\u0006\u0006\u001a\u0004\bx\u0010yR\u001e\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020{0\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b|\u0010\u001cR\u0013\u0010}\u001a\u00020~X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0012\u0005\u0012\u00030\u0082\u00010\u0018X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010nX\u0096\u0005¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R!\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020s\u0012\u0005\u0012\u00030\u0087\u00010\u0018X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u001cR$\u0010\u008c\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u0018X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u001cR!\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0012\u0005\u0012\u00030\u0091\u00010\u0018X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u001cR!\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0012\u0005\u0012\u00030\u0094\u00010\u0018X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u001cR\u0016\u0010\u0096\u0001\u001a\u00030\u0097\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponentImpl;", "Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;", "fragmentComponent", "shim", "Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionShim;", "(Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionShim;)V", "accessibilityAnnouncer", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityAnnouncer", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "backMapper", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "getBackMapper", "()Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "blurModelConfidenceProvider", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "", "getBlurModelConfidenceProvider", "()Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "blurModelProvider", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "getBlurModelProvider", "buttonMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "getButtonMapper", "buttonStyleMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "getButtonStyleMapper", "configMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "Lcom/socure/docv/capturesdk/models/ConfigModel;", "getConfigMapper", "consentMapper", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "getConsentMapper", "cornerModelConfidenceProvider", "getCornerModelConfidenceProvider", "cornerModelProvider", "getCornerModelProvider", "customizationMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "getCustomizationMapper", "errorLabelsMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "getErrorLabelsMapper", "eventManager", "Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "getEventManager", "()Lcom/socure/docv/capturesdk/common/analytics/EventManager;", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "frontMapper", "Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "getFrontMapper", "glareIntensityModelConfidenceProvider", "getGlareIntensityModelConfidenceProvider", "glareIntensityModelProvider", "getGlareIntensityModelProvider", "glareModelConfidenceProvider", "getGlareModelConfidenceProvider", "glareModelProvider", "getGlareModelProvider", "globalConfigMapper", "Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "getGlobalConfigMapper", "guidingBoxViewDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "getGuidingBoxViewDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "setGuidingBoxViewDimension", "(Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;)V", "idSelectionMapper", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "getIdSelectionMapper", "mainDispatcher", "getMainDispatcher", "metricsManager", "Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "getMetricsManager", "()Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "modelDependencies", "", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "Lkotlin/Triple;", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "Lcom/socure/docv/capturesdk/common/utils/DynamicModelDependencies;", "getModelDependencies", "()Ljava/util/Map;", "moduleResponseMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModuleResponseMapper", "modulesRepository", "Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "getModulesRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "passportMapper", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "getPassportMapper", "repoHolder", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "getRepoHolder", "()Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "selfieMapper", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "getSelfieMapper", "getShim", "()Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionShim;", "startSessionCache", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionCache", "()Lcom/socure/docv/capturesdk/core/storage/Cache;", "startSessionMapper", "getStartSessionMapper", "themeMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "getThemeMapper", "transitionMapper", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "getTransitionMapper", "unstructuredDocumentMapper", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getUnstructuredDocumentMapper", "varianceManager", "Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "getVarianceManager", "()Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class DocSelectionFragmentComponentImpl implements DocSelectionFragmentComponent, FragmentComponent {
    private final /* synthetic */ FragmentComponent $$delegate_0;
    private final DocSelectionShim shim;

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

    @Override // com.socure.docv.capturesdk.di.fragment.FragmentComponentProvisions
    public Fragment getFragment() {
        return this.$$delegate_0.getFragment();
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

    public DocSelectionFragmentComponentImpl(FragmentComponent fragmentComponent, DocSelectionShim shim) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        Intrinsics.checkNotNullParameter(shim, "shim");
        this.shim = shim;
        this.$$delegate_0 = fragmentComponent;
    }

    @Override // com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent
    public DocSelectionShim getShim() {
        return this.shim;
    }
}
