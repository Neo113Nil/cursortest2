package com.socure.docv.capturesdk.di.app;

import android.app.Application;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ApplicationComponentProvisions.kt */
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R \u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R \u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0013R\u001e\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020-0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0013R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR \u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u0002050\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0013R \u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0004\u0012\u0002090\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0013R\u0012\u0010;\u001a\u00020<X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001e\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020@0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0013R\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u001cR\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001cR\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u001cR\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u001cR\u001e\u0010J\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0013R\u0018\u0010N\u001a\u00020OX¦\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020U0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0013R\u0012\u0010W\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0017R\u0012\u0010Y\u001a\u00020ZX¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\RF\u0010]\u001a6\u0012\u0004\u0012\u00020_\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190`0^j\u0002`bX¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR \u0010e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010f\u0012\u0004\u0012\u00020g0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0013R\u0012\u0010i\u001a\u00020jX¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001e\u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020n0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0013R\u0012\u0010p\u001a\u00020qX¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001e\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020u0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0013R\u0018\u0010w\u001a\b\u0012\u0004\u0012\u00020x0aX¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u001e\u0010{\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020x0\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010\u0013R!\u0010}\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010~\u0012\u0004\u0012\u00020\u007f0\u000fX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0013R!\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0005\u0012\u00030\u0082\u00010\u000fX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0013R!\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0005\u0012\u00030\u0085\u00010\u000fX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0013R\u0016\u0010\u0087\u0001\u001a\u00030\u0088\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/di/app/ApplicationComponentProvisions;", "", "accessibilityAnnouncer", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityAnnouncer", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "backMapper", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "getBackMapper", "()Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "blurModelConfidenceProvider", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "", "getBlurModelConfidenceProvider", "()Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "blurModelProvider", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "getBlurModelProvider", "buttonMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "getButtonMapper", "buttonStyleMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "getButtonStyleMapper", "configMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "Lcom/socure/docv/capturesdk/models/ConfigModel;", "getConfigMapper", "consentMapper", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "getConsentMapper", "cornerModelConfidenceProvider", "getCornerModelConfidenceProvider", "cornerModelProvider", "getCornerModelProvider", "customizationMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "getCustomizationMapper", "errorLabelsMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "getErrorLabelsMapper", "eventManager", "Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "getEventManager", "()Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "frontMapper", "Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "getFrontMapper", "glareIntensityModelConfidenceProvider", "getGlareIntensityModelConfidenceProvider", "glareIntensityModelProvider", "getGlareIntensityModelProvider", "glareModelConfidenceProvider", "getGlareModelConfidenceProvider", "glareModelProvider", "getGlareModelProvider", "globalConfigMapper", "Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "getGlobalConfigMapper", "guidingBoxViewDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "getGuidingBoxViewDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "setGuidingBoxViewDimension", "(Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;)V", "idSelectionMapper", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "getIdSelectionMapper", "mainDispatcher", "getMainDispatcher", "metricsManager", "Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "getMetricsManager", "()Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "modelDependencies", "", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "Lkotlin/Triple;", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "Lcom/socure/docv/capturesdk/common/utils/DynamicModelDependencies;", "getModelDependencies", "()Ljava/util/Map;", "moduleResponseMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModuleResponseMapper", "modulesRepository", "Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "getModulesRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "passportMapper", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "getPassportMapper", "repoHolder", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "getRepoHolder", "()Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "selfieMapper", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "getSelfieMapper", "startSessionCache", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionCache", "()Lcom/socure/docv/capturesdk/core/storage/Cache;", "startSessionMapper", "getStartSessionMapper", "themeMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "getThemeMapper", "transitionMapper", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "getTransitionMapper", "unstructuredDocumentMapper", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getUnstructuredDocumentMapper", "varianceManager", "Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "getVarianceManager", "()Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ApplicationComponentProvisions {
    AnnounceAccessibilityMessageUseCase getAccessibilityAnnouncer();

    Application getApplication();

    CoroutineScope getApplicationScope();

    Mapper<ModuleMapperInput, BackModuleModel> getBackMapper();

    CoroutineDispatcher getBackgroundDispatcher();

    Provider<Float> getBlurModelConfidenceProvider();

    Provider<Model> getBlurModelProvider();

    Mapper<Button, ButtonModel> getButtonMapper();

    Mapper<ButtonStyle, ButtonStyleModel> getButtonStyleMapper();

    Mapper<Config, ConfigModel> getConfigMapper();

    Mapper<ModuleMapperInput, ConsentModuleModel> getConsentMapper();

    Provider<Float> getCornerModelConfidenceProvider();

    Provider<Model> getCornerModelProvider();

    Mapper<Customization, CustomizationModel> getCustomizationMapper();

    Mapper<ErrorLabels, ErrorLabelsModel> getErrorLabelsMapper();

    EventManager getEventManager();

    Mapper<ModuleMapperInput, FrontModuleModel> getFrontMapper();

    Provider<Float> getGlareIntensityModelConfidenceProvider();

    Provider<Model> getGlareIntensityModelProvider();

    Provider<Float> getGlareModelConfidenceProvider();

    Provider<Model> getGlareModelProvider();

    Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> getGlobalConfigMapper();

    ViewDimensions getGuidingBoxViewDimension();

    Mapper<ModuleMapperInput, IDSelectionModel> getIdSelectionMapper();

    CoroutineDispatcher getMainDispatcher();

    MetricsManager getMetricsManager();

    Map<ModelConfig.Type, Triple<Cache<Model>, Cache<Float>, Provider<Float>>> getModelDependencies();

    Mapper<ModuleDataResponse, ModuleModel> getModuleResponseMapper();

    ModulesRepository getModulesRepository();

    Mapper<ModuleMapperInput, PassportModuleModel> getPassportMapper();

    RepoHolder getRepoHolder();

    Mapper<ModuleMapperInput, SelfieModuleModel> getSelfieMapper();

    Cache<StartSessionModel> getStartSessionCache();

    Mapper<ModuleDataResponse, StartSessionModel> getStartSessionMapper();

    Mapper<Theme, ThemeModel> getThemeMapper();

    Mapper<ModuleMapperInput, TransitionModuleModel> getTransitionMapper();

    Mapper<ModuleMapperInput, UnstructuredModuleModel> getUnstructuredDocumentMapper();

    VarianceManager getVarianceManager();

    void setGuidingBoxViewDimension(ViewDimensions viewDimensions);
}
