package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Labels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import com.socure.docv.capturesdk.models.TransitionModuleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ModuleConfigToTransitionModuleConfigMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleConfigToTransitionModuleConfigMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleConfigToTransitionModuleConfigMapper implements Mapper<ModuleMapperInput, TransitionModuleModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleMapperInput> list, Continuation<? super List<? extends TransitionModuleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ModuleMapperInput moduleMapperInput, Continuation<? super TransitionModuleModel> continuation) {
        ModuleConfig config = moduleMapperInput.getConfig();
        String moduleId = moduleMapperInput.getModuleId();
        String sessionToken = moduleMapperInput.getSessionToken();
        Labels labels = config.getLabels();
        Integer completedModuleCount = config.getCompletedModuleCount();
        int intValue = completedModuleCount != null ? completedModuleCount.intValue() : 0;
        Integer totalModuleCount = config.getTotalModuleCount();
        return new TransitionModuleModel(moduleId, sessionToken, intValue, totalModuleCount != null ? totalModuleCount.intValue() : 0, config.getInfoModalText(), config.getErrorMessage(), new TransitionModuleModel.LabelsTransitionConfig(labels != null ? labels.getTitle() : null, labels != null ? labels.getDocumentName() : null, labels != null ? labels.getHeaderText() : null, labels != null ? labels.getInstructionsPrimaryText() : null, labels != null ? labels.getInstructionsSecondaryText() : null, labels != null ? labels.getContinueButton() : null), config.getUseCaseType(), config.getDocumentType(), config.getCurrentVerificationCount(), config.getTotalVerificationCount());
    }
}
