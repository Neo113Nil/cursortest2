package com.socure.docv.capturesdk.di.app;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.gson.Gson;
import com.socure.docv.capturesdk.common.analytics.EventManager;
import com.socure.docv.capturesdk.common.analytics.MetricsManager;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.common.config.model.ModelConfig;
import com.socure.docv.capturesdk.common.mapper.ButtonMapper;
import com.socure.docv.capturesdk.common.mapper.ButtonStyleMapper;
import com.socure.docv.capturesdk.common.mapper.ConfigMapper;
import com.socure.docv.capturesdk.common.mapper.CustomizationMapper;
import com.socure.docv.capturesdk.common.mapper.ErrorLabelsMapper;
import com.socure.docv.capturesdk.common.mapper.GlobalConfigMapper;
import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToBackModuleModelMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToConsentModuleModelMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToFrontModuleModelMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToIDSelectionConfigMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToPassportModuleModelMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToSelfieModuleConfigMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleConfigToTransitionModuleConfigMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleMapperInput;
import com.socure.docv.capturesdk.common.mapper.ModuleResponseMapper;
import com.socure.docv.capturesdk.common.mapper.ModuleUnstructuredDocumentMapper;
import com.socure.docv.capturesdk.common.mapper.StartSessionResponseToStartSessionModelMapper;
import com.socure.docv.capturesdk.common.mapper.ThemeMapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ButtonStyle;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Config;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Customization;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ErrorLabels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Theme;
import com.socure.docv.capturesdk.common.network.repository.RepoHolder;
import com.socure.docv.capturesdk.common.network.repository.RepoHolderImpl;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.VarianceCalculator;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.core.provider.DefaultModelProvider;
import com.socure.docv.capturesdk.core.provider.interfaces.Provider;
import com.socure.docv.capturesdk.core.storage.Cache;
import com.socure.docv.capturesdk.core.storage.SessionCache;
import com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$repoHolder$2;
import com.socure.docv.capturesdk.feature.scanner.data.Container;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ProductionApplicationComponentImpl.kt */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010 R\"\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020(0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\"\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\"\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u0002000\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0017R!\u00105\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b6\u0010 R!\u00108\u001a\b\u0012\u0004\u0012\u00020#0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b9\u0010 R\"\u0010;\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0004\u0012\u00020=0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0017R\"\u0010?\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010@\u0012\u0004\u0012\u00020A0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0017R\u001b\u0010C\u001a\u00020D8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020I0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0017R!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010 R!\u0010N\u001a\b\u0012\u0004\u0012\u00020#0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\n\u001a\u0004\bO\u0010 R!\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bR\u0010 R!\u0010T\u001a\b\u0012\u0004\u0012\u00020#0\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\n\u001a\u0004\bU\u0010 R \u0010W\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0017R\u001a\u0010[\u001a\u00020\\X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020b0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0017R\u0014\u0010d\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u001bR\u001b\u0010f\u001a\u00020g8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bj\u0010\n\u001a\u0004\bh\u0010iRH\u0010k\u001a6\u0012\u0004\u0012\u00020m\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0o\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0o\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0n0lj\u0002`pX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\"\u0010s\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010t\u0012\u0004\u0012\u00020u0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0017R \u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020x0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0017R\u001b\u0010z\u001a\u00020{8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b~\u0010\n\u001a\u0004\b|\u0010}R\"\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030\u0080\u00010\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0017R&\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010o8VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010\n\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020t\u0012\u0005\u0012\u00030\u0083\u00010\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0017R&\u0010\u0089\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u008a\u0001\u0012\u0005\u0012\u00030\u008b\u00010\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0017R#\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030\u008e\u00010\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u0017R#\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030\u0091\u00010\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u0017R \u0010\u0093\u0001\u001a\u00030\u0094\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0097\u0001\u0010\n\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/di/app/ProductionApplicationComponentImpl;", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "accessibilityAnnouncer", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityAnnouncer", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "accessibilityAnnouncer$delegate", "Lkotlin/Lazy;", "getApplication", "()Landroid/app/Application;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "applicationScope$delegate", "backMapper", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "getBackMapper", "()Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "blurModelConfidenceProvider", "Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "", "getBlurModelConfidenceProvider", "()Lcom/socure/docv/capturesdk/core/provider/interfaces/Provider;", "blurModelConfidenceProvider$delegate", "blurModelProvider", "Lcom/socure/docv/capturesdk/common/config/model/Model;", "getBlurModelProvider", "blurModelProvider$delegate", "buttonMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "getButtonMapper", "buttonStyleMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "getButtonStyleMapper", "configMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "Lcom/socure/docv/capturesdk/models/ConfigModel;", "getConfigMapper", "consentMapper", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "getConsentMapper", "cornerModelConfidenceProvider", "getCornerModelConfidenceProvider", "cornerModelConfidenceProvider$delegate", "cornerModelProvider", "getCornerModelProvider", "cornerModelProvider$delegate", "customizationMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "getCustomizationMapper", "errorLabelsMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "getErrorLabelsMapper", "eventManager", "Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "getEventManager", "()Lcom/socure/docv/capturesdk/common/analytics/EventManager;", "eventManager$delegate", "frontMapper", "Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "getFrontMapper", "glareIntensityModelConfidenceProvider", "getGlareIntensityModelConfidenceProvider", "glareIntensityModelConfidenceProvider$delegate", "glareIntensityModelProvider", "getGlareIntensityModelProvider", "glareIntensityModelProvider$delegate", "glareModelConfidenceProvider", "getGlareModelConfidenceProvider", "glareModelConfidenceProvider$delegate", "glareModelProvider", "getGlareModelProvider", "glareModelProvider$delegate", "globalConfigMapper", "Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "getGlobalConfigMapper", "guidingBoxViewDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "getGuidingBoxViewDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "setGuidingBoxViewDimension", "(Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;)V", "idSelectionMapper", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "getIdSelectionMapper", "mainDispatcher", "getMainDispatcher", "metricsManager", "Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "getMetricsManager", "()Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "metricsManager$delegate", "modelDependencies", "", "Lcom/socure/docv/capturesdk/common/config/model/ModelConfig$Type;", "Lkotlin/Triple;", "Lcom/socure/docv/capturesdk/core/storage/Cache;", "Lcom/socure/docv/capturesdk/common/utils/DynamicModelDependencies;", "getModelDependencies", "()Ljava/util/Map;", "moduleResponseMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "getModuleResponseMapper", "passportMapper", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "getPassportMapper", "repoHolder", "Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "getRepoHolder", "()Lcom/socure/docv/capturesdk/common/network/repository/RepoHolder;", "repoHolder$delegate", "selfieMapper", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "getSelfieMapper", "startSessionCache", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionCache", "()Lcom/socure/docv/capturesdk/core/storage/Cache;", "startSessionCache$delegate", "startSessionMapper", "getStartSessionMapper", "themeMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "getThemeMapper", "transitionMapper", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "getTransitionMapper", "unstructuredDocumentMapper", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getUnstructuredDocumentMapper", "varianceManager", "Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "getVarianceManager", "()Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "varianceManager$delegate", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ProductionApplicationComponentImpl implements ApplicationComponent {

    /* renamed from: accessibilityAnnouncer$delegate, reason: from kotlin metadata */
    private final Lazy accessibilityAnnouncer;
    private final Application application;

    /* renamed from: applicationScope$delegate, reason: from kotlin metadata */
    private final Lazy applicationScope;

    /* renamed from: blurModelConfidenceProvider$delegate, reason: from kotlin metadata */
    private final Lazy blurModelConfidenceProvider;

    /* renamed from: blurModelProvider$delegate, reason: from kotlin metadata */
    private final Lazy blurModelProvider;

    /* renamed from: cornerModelConfidenceProvider$delegate, reason: from kotlin metadata */
    private final Lazy cornerModelConfidenceProvider;

    /* renamed from: cornerModelProvider$delegate, reason: from kotlin metadata */
    private final Lazy cornerModelProvider;

    /* renamed from: eventManager$delegate, reason: from kotlin metadata */
    private final Lazy eventManager;

    /* renamed from: glareIntensityModelConfidenceProvider$delegate, reason: from kotlin metadata */
    private final Lazy glareIntensityModelConfidenceProvider;

    /* renamed from: glareIntensityModelProvider$delegate, reason: from kotlin metadata */
    private final Lazy glareIntensityModelProvider;

    /* renamed from: glareModelConfidenceProvider$delegate, reason: from kotlin metadata */
    private final Lazy glareModelConfidenceProvider;

    /* renamed from: glareModelProvider$delegate, reason: from kotlin metadata */
    private final Lazy glareModelProvider;
    private ViewDimensions guidingBoxViewDimension;

    /* renamed from: metricsManager$delegate, reason: from kotlin metadata */
    private final Lazy metricsManager;
    private final Map<ModelConfig.Type, Triple<Cache<Model>, Cache<Float>, Provider<Float>>> modelDependencies;

    /* renamed from: repoHolder$delegate, reason: from kotlin metadata */
    private final Lazy repoHolder;

    /* renamed from: startSessionCache$delegate, reason: from kotlin metadata */
    private final Lazy startSessionCache;

    /* renamed from: varianceManager$delegate, reason: from kotlin metadata */
    private final Lazy varianceManager;

    public ProductionApplicationComponentImpl(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.cornerModelConfidenceProvider = LazyKt.lazy(new Function0<Provider<Float>>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$cornerModelConfidenceProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Provider<Float> invoke() {
                return new Provider<Float>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$cornerModelConfidenceProvider$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
                    public final Float get() {
                        return Float.valueOf(0.5f);
                    }
                };
            }
        });
        this.cornerModelProvider = LazyKt.lazy(new Function0<DefaultModelProvider>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$cornerModelProvider$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DefaultModelProvider invoke() {
                return new DefaultModelProvider(ProductionApplicationComponentImpl.this.getApplication(), ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, ProductionApplicationComponentImpl.this.getCornerModelConfidenceProvider(), 2);
            }
        });
        this.blurModelConfidenceProvider = LazyKt.lazy(new Function0<Provider<Float>>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$blurModelConfidenceProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Provider<Float> invoke() {
                return new Provider<Float>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$blurModelConfidenceProvider$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
                    public final Float get() {
                        return Float.valueOf(0.45f);
                    }
                };
            }
        });
        this.blurModelProvider = LazyKt.lazy(new Function0<DefaultModelProvider>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$blurModelProvider$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DefaultModelProvider invoke() {
                return new DefaultModelProvider(ProductionApplicationComponentImpl.this.getApplication(), ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, ProductionApplicationComponentImpl.this.getBlurModelConfidenceProvider(), 1);
            }
        });
        this.glareModelConfidenceProvider = LazyKt.lazy(new Function0<Provider<Float>>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$glareModelConfidenceProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Provider<Float> invoke() {
                return new Provider<Float>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$glareModelConfidenceProvider$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
                    public final Float get() {
                        return Float.valueOf(0.5f);
                    }
                };
            }
        });
        this.glareModelProvider = LazyKt.lazy(new Function0<DefaultModelProvider>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$glareModelProvider$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DefaultModelProvider invoke() {
                return new DefaultModelProvider(ProductionApplicationComponentImpl.this.getApplication(), ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, ProductionApplicationComponentImpl.this.getGlareModelConfidenceProvider(), 2);
            }
        });
        this.glareIntensityModelProvider = LazyKt.lazy(new Function0<DefaultModelProvider>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$glareIntensityModelProvider$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DefaultModelProvider invoke() {
                return new DefaultModelProvider(ProductionApplicationComponentImpl.this.getApplication(), ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, ProductionApplicationComponentImpl.this.getGlareIntensityModelConfidenceProvider(), 1);
            }
        });
        this.glareIntensityModelConfidenceProvider = LazyKt.lazy(new Function0<Provider<Float>>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$glareIntensityModelConfidenceProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Provider<Float> invoke() {
                return new Provider<Float>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$glareIntensityModelConfidenceProvider$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
                    public final Float get() {
                        return Float.valueOf(0.0f);
                    }
                };
            }
        });
        this.modelDependencies = MapsKt.emptyMap();
        this.repoHolder = LazyKt.lazy(new Function0<ProductionApplicationComponentImpl$repoHolder$2.AnonymousClass1>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$repoHolder$2
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$repoHolder$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public final AnonymousClass1 invoke() {
                return new RepoHolderImpl(new Gson()) { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$repoHolder$2.1
                };
            }
        });
        this.guidingBoxViewDimension = new ViewDimensions(new Container(1, 1), new GuidingBox(1, 1, 0, 0, new Dimension(1.0d, 1.0d)), true);
        this.startSessionCache = LazyKt.lazy(new Function0<SessionCache<StartSessionModel>>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$startSessionCache$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SessionCache<StartSessionModel> invoke() {
                return new SessionCache<>(null, 1, null);
            }
        });
        this.metricsManager = LazyKt.lazy(new Function0<MetricsManager>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$metricsManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MetricsManager invoke() {
                return new MetricsManager(ProductionApplicationComponentImpl.this.getApplication());
            }
        });
        this.eventManager = LazyKt.lazy(new Function0<EventManager>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$eventManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final EventManager invoke() {
                return new EventManager(ProductionApplicationComponentImpl.this.getRepoHolder(), null, 2, null);
            }
        });
        this.varianceManager = LazyKt.lazy(new Function0<VarianceManager>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$varianceManager$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final VarianceManager invoke() {
                return new VarianceManager(new VarianceCalculator(), new Provider<Long>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$varianceManager$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.Provider
                    public final Long get() {
                        return Long.valueOf(System.currentTimeMillis());
                    }
                });
            }
        });
        this.accessibilityAnnouncer = LazyKt.lazy(new Function0<AnnounceAccessibilityMessageUseCase>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$accessibilityAnnouncer$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnnounceAccessibilityMessageUseCase invoke() {
                return new AnnounceAccessibilityMessageUseCase();
            }
        });
        this.applicationScope = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl$applicationScope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return CoroutineScopeKt.CoroutineScope(ProductionApplicationComponentImpl.this.getMainDispatcher());
            }
        });
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Application getApplication() {
        return this.application;
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getCornerModelConfidenceProvider() {
        return (Provider) this.cornerModelConfidenceProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getCornerModelProvider() {
        return (Provider) this.cornerModelProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getBlurModelConfidenceProvider() {
        return (Provider) this.blurModelConfidenceProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getBlurModelProvider() {
        return (Provider) this.blurModelProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getGlareModelConfidenceProvider() {
        return (Provider) this.glareModelConfidenceProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getGlareModelProvider() {
        return (Provider) this.glareModelProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Model> getGlareIntensityModelProvider() {
        return (Provider) this.glareIntensityModelProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Provider<Float> getGlareIntensityModelConfidenceProvider() {
        return (Provider) this.glareIntensityModelConfidenceProvider.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Map<ModelConfig.Type, Triple<Cache<Model>, Cache<Float>, Provider<Float>>> getModelDependencies() {
        return this.modelDependencies;
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public RepoHolder getRepoHolder() {
        return (RepoHolder) this.repoHolder.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public ViewDimensions getGuidingBoxViewDimension() {
        return this.guidingBoxViewDimension;
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public void setGuidingBoxViewDimension(ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(viewDimensions, "<set-?>");
        this.guidingBoxViewDimension = viewDimensions;
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public CoroutineDispatcher getMainDispatcher() {
        return Dispatchers.getMain();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public CoroutineDispatcher getBackgroundDispatcher() {
        return Dispatchers.getIO();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, IDSelectionModel> getIdSelectionMapper() {
        return new ModuleConfigToIDSelectionConfigMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, PassportModuleModel> getPassportMapper() {
        return new ModuleConfigToPassportModuleModelMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, FrontModuleModel> getFrontMapper() {
        return new ModuleConfigToFrontModuleModelMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, BackModuleModel> getBackMapper() {
        return new ModuleConfigToBackModuleModelMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, SelfieModuleModel> getSelfieMapper() {
        return new ModuleConfigToSelfieModuleConfigMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, ConsentModuleModel> getConsentMapper() {
        return new ModuleConfigToConsentModuleModelMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, TransitionModuleModel> getTransitionMapper() {
        return new ModuleConfigToTransitionModuleConfigMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleMapperInput, UnstructuredModuleModel> getUnstructuredDocumentMapper() {
        return new ModuleUnstructuredDocumentMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleDataResponse, ModuleModel> getModuleResponseMapper() {
        return new ModuleResponseMapper(getSelfieMapper(), getBackMapper(), getFrontMapper(), getPassportMapper(), getIdSelectionMapper(), getConsentMapper(), getUnstructuredDocumentMapper(), getTransitionMapper());
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ButtonStyle, ButtonStyleModel> getButtonStyleMapper() {
        return new ButtonStyleMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Button, ButtonModel> getButtonMapper() {
        return new ButtonMapper(getButtonStyleMapper());
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Config, ConfigModel> getConfigMapper() {
        return new ConfigMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Theme, ThemeModel> getThemeMapper() {
        return new ThemeMapper(getButtonMapper());
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<Customization, CustomizationModel> getCustomizationMapper() {
        return new CustomizationMapper(getThemeMapper(), getConfigMapper());
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ErrorLabels, ErrorLabelsModel> getErrorLabelsMapper() {
        return new ErrorLabelsMapper();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> getGlobalConfigMapper() {
        return new GlobalConfigMapper(getCustomizationMapper(), getErrorLabelsMapper());
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Mapper<ModuleDataResponse, StartSessionModel> getStartSessionMapper() {
        return new StartSessionResponseToStartSessionModelMapper(getModuleResponseMapper(), getGlobalConfigMapper());
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Cache<StartSessionModel> getStartSessionCache() {
        return (Cache) this.startSessionCache.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public MetricsManager getMetricsManager() {
        return (MetricsManager) this.metricsManager.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public EventManager getEventManager() {
        return (EventManager) this.eventManager.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public VarianceManager getVarianceManager() {
        return (VarianceManager) this.varianceManager.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public AnnounceAccessibilityMessageUseCase getAccessibilityAnnouncer() {
        return (AnnounceAccessibilityMessageUseCase) this.accessibilityAnnouncer.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public CoroutineScope getApplicationScope() {
        return (CoroutineScope) this.applicationScope.getValue();
    }
}
