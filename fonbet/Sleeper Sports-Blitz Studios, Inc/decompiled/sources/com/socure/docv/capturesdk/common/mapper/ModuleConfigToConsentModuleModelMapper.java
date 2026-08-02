package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.BodyComponent;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Labels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import com.socure.docv.capturesdk.models.BodyComponentModel;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

/* compiled from: ModuleConfigToConsentModuleModelMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleConfigToConsentModuleModelMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleConfigToConsentModuleModelMapper implements Mapper<ModuleMapperInput, ConsentModuleModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleMapperInput> list, Continuation<? super List<? extends ConsentModuleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ModuleMapperInput moduleMapperInput, Continuation<? super ConsentModuleModel> continuation) {
        ArrayList arrayList;
        ModuleConfig config = moduleMapperInput.getConfig();
        String moduleId = moduleMapperInput.getModuleId();
        String sessionToken = moduleMapperInput.getSessionToken();
        Labels labels = config.getLabels();
        List<BodyComponent> bodyComponents = config.getBodyComponents();
        if (bodyComponents != null) {
            List<BodyComponent> list = bodyComponents;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (BodyComponent bodyComponent : list) {
                String content = bodyComponent.getContent();
                if (content == null) {
                    content = "";
                }
                String type = bodyComponent.getType();
                if (type == null) {
                    type = "";
                }
                arrayList2.add(new BodyComponentModel("", Boxing.boxBoolean(false), type, content));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        List list2 = arrayList;
        String title = labels != null ? labels.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String headerText = labels != null ? labels.getHeaderText() : null;
        if (headerText == null) {
            headerText = "";
        }
        String warningMessageText = labels != null ? labels.getWarningMessageText() : null;
        if (warningMessageText == null) {
            warningMessageText = "";
        }
        String warningMessageCloseText = labels != null ? labels.getWarningMessageCloseText() : null;
        if (warningMessageCloseText == null) {
            warningMessageCloseText = "";
        }
        String agreeButtonText = labels != null ? labels.getAgreeButtonText() : null;
        if (agreeButtonText == null) {
            agreeButtonText = "";
        }
        String declineButtonText = labels != null ? labels.getDeclineButtonText() : null;
        if (declineButtonText == null) {
            declineButtonText = "";
        }
        String consentVersion = config.getConsentVersion();
        if (consentVersion == null) {
            consentVersion = "";
        }
        String consentLanguage = config.getConsentLanguage();
        if (consentLanguage == null) {
            consentLanguage = "";
        }
        Integer completedModuleCount = config.getCompletedModuleCount();
        int intValue = completedModuleCount != null ? completedModuleCount.intValue() : 0;
        String processingConsent = labels != null ? labels.getProcessingConsent() : null;
        String str = processingConsent != null ? processingConsent : "";
        Integer totalModuleCount = config.getTotalModuleCount();
        return new ConsentModuleModel(moduleId, sessionToken, title, headerText, warningMessageText, warningMessageCloseText, agreeButtonText, declineButtonText, list2, consentVersion, consentLanguage, str, intValue, totalModuleCount != null ? totalModuleCount.intValue() : 0);
    }
}
