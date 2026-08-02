package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Labels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleResponse;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.models.BackModuleModel;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import com.socure.docv.capturesdk.models.ErrorModule;
import com.socure.docv.capturesdk.models.FinishedModuleModel;
import com.socure.docv.capturesdk.models.FrontModuleModel;
import com.socure.docv.capturesdk.models.IDSelectionModel;
import com.socure.docv.capturesdk.models.LandingModuleModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.PassportModuleModel;
import com.socure.docv.capturesdk.models.SelfieModuleModel;
import com.socure.docv.capturesdk.models.TransitionModuleModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponseMapper.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B¥\u0001\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0001\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0001\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0001\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0001\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0001\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleResponseMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "selfieMapper", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "backMapper", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "frontMapper", "Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "passportMapper", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "idSelectionMapper", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "consentMapper", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "unstructuredDocMapper", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "transitionMapper", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "(Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleResponseMapper implements Mapper<ModuleDataResponse, ModuleModel> {
    private final Mapper<ModuleMapperInput, BackModuleModel> backMapper;
    private final Mapper<ModuleMapperInput, ConsentModuleModel> consentMapper;
    private final Mapper<ModuleMapperInput, FrontModuleModel> frontMapper;
    private final Mapper<ModuleMapperInput, IDSelectionModel> idSelectionMapper;
    private final Mapper<ModuleMapperInput, PassportModuleModel> passportMapper;
    private final Mapper<ModuleMapperInput, SelfieModuleModel> selfieMapper;
    private final Mapper<ModuleMapperInput, TransitionModuleModel> transitionMapper;
    private final Mapper<ModuleMapperInput, UnstructuredModuleModel> unstructuredDocMapper;

    public ModuleResponseMapper(Mapper<ModuleMapperInput, SelfieModuleModel> selfieMapper, Mapper<ModuleMapperInput, BackModuleModel> backMapper, Mapper<ModuleMapperInput, FrontModuleModel> frontMapper, Mapper<ModuleMapperInput, PassportModuleModel> passportMapper, Mapper<ModuleMapperInput, IDSelectionModel> idSelectionMapper, Mapper<ModuleMapperInput, ConsentModuleModel> consentMapper, Mapper<ModuleMapperInput, UnstructuredModuleModel> unstructuredDocMapper, Mapper<ModuleMapperInput, TransitionModuleModel> transitionMapper) {
        Intrinsics.checkNotNullParameter(selfieMapper, "selfieMapper");
        Intrinsics.checkNotNullParameter(backMapper, "backMapper");
        Intrinsics.checkNotNullParameter(frontMapper, "frontMapper");
        Intrinsics.checkNotNullParameter(passportMapper, "passportMapper");
        Intrinsics.checkNotNullParameter(idSelectionMapper, "idSelectionMapper");
        Intrinsics.checkNotNullParameter(consentMapper, "consentMapper");
        Intrinsics.checkNotNullParameter(unstructuredDocMapper, "unstructuredDocMapper");
        Intrinsics.checkNotNullParameter(transitionMapper, "transitionMapper");
        this.selfieMapper = selfieMapper;
        this.backMapper = backMapper;
        this.frontMapper = frontMapper;
        this.passportMapper = passportMapper;
        this.idSelectionMapper = idSelectionMapper;
        this.consentMapper = consentMapper;
        this.unstructuredDocMapper = unstructuredDocMapper;
        this.transitionMapper = transitionMapper;
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleDataResponse> list, Continuation<? super List<? extends ModuleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ModuleDataResponse moduleDataResponse, Continuation<? super ModuleModel> continuation) {
        Labels labels;
        Long errorCode;
        Labels labels2;
        String descriptionText;
        Labels labels3;
        String title;
        String moduleType;
        String str = null;
        ModuleResponse nextModule = moduleDataResponse != null ? moduleDataResponse.getNextModule() : null;
        String sessionToken = moduleDataResponse != null ? moduleDataResponse.getSessionToken() : null;
        if (nextModule != null && (moduleType = nextModule.getModuleType()) != null) {
            str = moduleType.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -906020504:
                    if (str.equals(ApiConstant.DOCUMENT_SELFIE)) {
                        Mapper<ModuleMapperInput, SelfieModuleModel> mapper = this.selfieMapper;
                        ModuleConfig moduleConfig = nextModule.getModuleConfig();
                        if (moduleConfig == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId);
                        Object map = mapper.map((Mapper<ModuleMapperInput, SelfieModuleModel>) new ModuleMapperInput(moduleConfig, moduleId, sessionToken), (Continuation<? super SelfieModuleModel>) continuation);
                        return map == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map : (ModuleModel) map;
                    }
                    break;
                case -673660814:
                    if (str.equals("finished")) {
                        return FinishedModuleModel.INSTANCE;
                    }
                    break;
                case -494069247:
                    if (str.equals("transitionscreen")) {
                        Mapper<ModuleMapperInput, TransitionModuleModel> mapper2 = this.transitionMapper;
                        ModuleConfig moduleConfig2 = nextModule.getModuleConfig();
                        if (moduleConfig2 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId2 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId2);
                        Object map2 = mapper2.map((Mapper<ModuleMapperInput, TransitionModuleModel>) new ModuleMapperInput(moduleConfig2, moduleId2, sessionToken), (Continuation<? super TransitionModuleModel>) continuation);
                        return map2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map2 : (ModuleModel) map2;
                    }
                    break;
                case -357057961:
                    if (str.equals("idtypeselection")) {
                        Mapper<ModuleMapperInput, IDSelectionModel> mapper3 = this.idSelectionMapper;
                        ModuleConfig moduleConfig3 = nextModule.getModuleConfig();
                        if (moduleConfig3 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId3 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId3);
                        Object map3 = mapper3.map((Mapper<ModuleMapperInput, IDSelectionModel>) new ModuleMapperInput(moduleConfig3, moduleId3, sessionToken), (Continuation<? super IDSelectionModel>) continuation);
                        return map3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map3 : (ModuleModel) map3;
                    }
                    break;
                case -52151785:
                    if (str.equals("landing")) {
                        String moduleId4 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId4);
                        return new LandingModuleModel(moduleId4, sessionToken);
                    }
                    break;
                case 3015911:
                    if (str.equals(ApiConstant.DOCUMENT_BACK)) {
                        Mapper<ModuleMapperInput, BackModuleModel> mapper4 = this.backMapper;
                        ModuleConfig moduleConfig4 = nextModule.getModuleConfig();
                        if (moduleConfig4 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId5 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId5);
                        Object map4 = mapper4.map((Mapper<ModuleMapperInput, BackModuleModel>) new ModuleMapperInput(moduleConfig4, moduleId5, sessionToken), (Continuation<? super BackModuleModel>) continuation);
                        return map4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map4 : (ModuleModel) map4;
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        String moduleId6 = nextModule.getModuleId();
                        String str2 = moduleId6 == null ? "" : moduleId6;
                        ModuleConfig moduleConfig5 = nextModule.getModuleConfig();
                        String str3 = (moduleConfig5 == null || (labels3 = moduleConfig5.getLabels()) == null || (title = labels3.getTitle()) == null) ? "" : title;
                        ModuleConfig moduleConfig6 = nextModule.getModuleConfig();
                        String str4 = (moduleConfig6 == null || (labels2 = moduleConfig6.getLabels()) == null || (descriptionText = labels2.getDescriptionText()) == null) ? "" : descriptionText;
                        ModuleConfig moduleConfig7 = nextModule.getModuleConfig();
                        return new ErrorModule(str2, sessionToken, str3, str4, (moduleConfig7 == null || (labels = moduleConfig7.getLabels()) == null || (errorCode = labels.getErrorCode()) == null) ? 0L : errorCode.longValue());
                    }
                    break;
                case 97705513:
                    if (str.equals(ApiConstant.DOCUMENT_FRONT)) {
                        Mapper<ModuleMapperInput, FrontModuleModel> mapper5 = this.frontMapper;
                        ModuleConfig moduleConfig8 = nextModule.getModuleConfig();
                        if (moduleConfig8 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId7 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId7);
                        Object map5 = mapper5.map((Mapper<ModuleMapperInput, FrontModuleModel>) new ModuleMapperInput(moduleConfig8, moduleId7, sessionToken), (Continuation<? super FrontModuleModel>) continuation);
                        return map5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map5 : (ModuleModel) map5;
                    }
                    break;
                case 951500826:
                    if (str.equals(AnalyticsConstantsKt.CONSENT_SCREEN)) {
                        Mapper<ModuleMapperInput, ConsentModuleModel> mapper6 = this.consentMapper;
                        ModuleConfig moduleConfig9 = nextModule.getModuleConfig();
                        if (moduleConfig9 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId8 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId8);
                        Object map6 = mapper6.map((Mapper<ModuleMapperInput, ConsentModuleModel>) new ModuleMapperInput(moduleConfig9, moduleId8, sessionToken), (Continuation<? super ConsentModuleModel>) continuation);
                        return map6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map6 : (ModuleModel) map6;
                    }
                    break;
                case 1216777234:
                    if (str.equals("passport")) {
                        Mapper<ModuleMapperInput, PassportModuleModel> mapper7 = this.passportMapper;
                        ModuleConfig moduleConfig10 = nextModule.getModuleConfig();
                        if (moduleConfig10 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId9 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId9);
                        Object map7 = mapper7.map((Mapper<ModuleMapperInput, PassportModuleModel>) new ModuleMapperInput(moduleConfig10, moduleId9, sessionToken), (Continuation<? super PassportModuleModel>) continuation);
                        return map7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map7 : (ModuleModel) map7;
                    }
                    break;
                case 1478218246:
                    if (str.equals("unstructureddocumentupload")) {
                        Mapper<ModuleMapperInput, UnstructuredModuleModel> mapper8 = this.unstructuredDocMapper;
                        ModuleConfig moduleConfig11 = nextModule.getModuleConfig();
                        if (moduleConfig11 == null) {
                            throw new IllegalStateException("Module config is missing");
                        }
                        String moduleId10 = nextModule.getModuleId();
                        Intrinsics.checkNotNull(moduleId10);
                        Object map8 = mapper8.map((Mapper<ModuleMapperInput, UnstructuredModuleModel>) new ModuleMapperInput(moduleConfig11, moduleId10, sessionToken), (Continuation<? super UnstructuredModuleModel>) continuation);
                        return map8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? map8 : (ModuleModel) map8;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unknown module type: " + str);
    }
}
