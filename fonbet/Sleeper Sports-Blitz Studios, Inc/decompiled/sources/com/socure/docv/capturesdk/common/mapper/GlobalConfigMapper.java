package com.socure.docv.capturesdk.common.mapper;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.CommonLabels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Customization;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Environment;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ErrorLabels;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.GlobalConfig;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.NativeLabels;
import com.socure.docv.capturesdk.models.CommonLabelsModel;
import com.socure.docv.capturesdk.models.CustomizationModel;
import com.socure.docv.capturesdk.models.EnvironmentModel;
import com.socure.docv.capturesdk.models.ErrorLabelsModel;
import com.socure.docv.capturesdk.models.GlobalConfigModel;
import com.socure.docv.capturesdk.models.NativeLabelsModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlobalConfigMapper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB1\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "customizationMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "errorLabelsMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "(Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "map", "inputs", "(Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GlobalConfigMapperInput", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GlobalConfigMapper implements Mapper<GlobalConfigMapperInput, GlobalConfigModel> {
    private final Mapper<Customization, CustomizationModel> customizationMapper;
    private final Mapper<ErrorLabels, ErrorLabelsModel> errorLabelsMapper;

    public GlobalConfigMapper(Mapper<Customization, CustomizationModel> customizationMapper, Mapper<ErrorLabels, ErrorLabelsModel> errorLabelsMapper) {
        Intrinsics.checkNotNullParameter(customizationMapper, "customizationMapper");
        Intrinsics.checkNotNullParameter(errorLabelsMapper, "errorLabelsMapper");
        this.customizationMapper = customizationMapper;
        this.errorLabelsMapper = errorLabelsMapper;
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends GlobalConfigMapperInput> list, Continuation<? super List<? extends GlobalConfigModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(GlobalConfigMapperInput globalConfigMapperInput, Continuation<? super GlobalConfigModel> continuation) {
        GlobalConfigMapper$map$1 globalConfigMapper$map$1;
        Object coroutine_suspended;
        int i;
        GlobalConfig globalConfig;
        String str;
        Integer num;
        GlobalConfigMapper globalConfigMapper;
        Object map;
        CustomizationModel customizationModel;
        String str2;
        GlobalConfig globalConfig2;
        String pleaseWait;
        String poweredBy;
        String orientationCheck;
        String orientationCheckV2;
        String backPressWarning;
        Environment environment;
        Environment environment2;
        CommonLabels commonLabels;
        CommonLabels commonLabels2;
        CommonLabels commonLabels3;
        CommonLabels commonLabels4;
        NativeLabels nativeLabels;
        NativeLabels nativeLabels2;
        NativeLabels nativeLabels3;
        NativeLabels nativeLabels4;
        NativeLabels nativeLabels5;
        NativeLabels nativeLabels6;
        NativeLabels nativeLabels7;
        NativeLabels nativeLabels8;
        if (continuation instanceof GlobalConfigMapper$map$1) {
            globalConfigMapper$map$1 = (GlobalConfigMapper$map$1) continuation;
            if ((globalConfigMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                globalConfigMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = globalConfigMapper$map$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = globalConfigMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GlobalConfig config = globalConfigMapperInput.getConfig();
                    String eventId = globalConfigMapperInput.getEventId();
                    Integer accountId = config != null ? config.getAccountId() : null;
                    Mapper<Customization, CustomizationModel> mapper = this.customizationMapper;
                    Customization customization = config != null ? config.getCustomization() : null;
                    globalConfigMapper$map$1.L$0 = this;
                    globalConfigMapper$map$1.L$1 = config;
                    globalConfigMapper$map$1.L$2 = eventId;
                    globalConfigMapper$map$1.L$3 = accountId;
                    globalConfigMapper$map$1.label = 1;
                    Object map2 = mapper.map((Mapper<Customization, CustomizationModel>) customization, (Continuation<? super CustomizationModel>) globalConfigMapper$map$1);
                    if (map2 != coroutine_suspended) {
                        Integer num2 = accountId;
                        globalConfig = config;
                        obj = map2;
                        str = eventId;
                        num = num2;
                        globalConfigMapper = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CustomizationModel customizationModel2 = (CustomizationModel) globalConfigMapper$map$1.L$3;
                    num = (Integer) globalConfigMapper$map$1.L$2;
                    str2 = (String) globalConfigMapper$map$1.L$1;
                    globalConfig2 = (GlobalConfig) globalConfigMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    customizationModel = customizationModel2;
                    Integer num3 = num;
                    ErrorLabelsModel errorLabelsModel = (ErrorLabelsModel) obj;
                    pleaseWait = (globalConfig2 != null || (nativeLabels8 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels8.getPleaseWait();
                    if (pleaseWait == null) {
                        pleaseWait = "";
                    }
                    String initialisingSDK = (globalConfig2 != null || (nativeLabels7 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels7.getInitialisingSDK();
                    String str3 = initialisingSDK != null ? "" : initialisingSDK;
                    String selectCheckBox = (globalConfig2 != null || (nativeLabels6 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels6.getSelectCheckBox();
                    String str4 = selectCheckBox != null ? "" : selectCheckBox;
                    String unselectCheckBox = (globalConfig2 != null || (nativeLabels5 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels5.getUnselectCheckBox();
                    String str5 = unselectCheckBox != null ? "" : unselectCheckBox;
                    String backButtonContinueDescription = (globalConfig2 != null || (nativeLabels4 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels4.getBackButtonContinueDescription();
                    String str6 = backButtonContinueDescription != null ? "" : backButtonContinueDescription;
                    String closeButtonContinueDescription = (globalConfig2 != null || (nativeLabels3 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels3.getCloseButtonContinueDescription();
                    String str7 = closeButtonContinueDescription != null ? "" : closeButtonContinueDescription;
                    String helpButtonContinueDescription = (globalConfig2 != null || (nativeLabels2 = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels2.getHelpButtonContinueDescription();
                    String str8 = helpButtonContinueDescription != null ? "" : helpButtonContinueDescription;
                    String manualButtonContinueDescription = (globalConfig2 != null || (nativeLabels = globalConfig2.getNativeLabels()) == null) ? null : nativeLabels.getManualButtonContinueDescription();
                    NativeLabelsModel nativeLabelsModel = new NativeLabelsModel(pleaseWait, str3, str4, str5, str6, str7, str8, manualButtonContinueDescription != null ? "" : manualButtonContinueDescription);
                    poweredBy = (globalConfig2 != null || (commonLabels4 = globalConfig2.getCommonLabels()) == null) ? null : commonLabels4.getPoweredBy();
                    if (poweredBy == null) {
                        poweredBy = "";
                    }
                    orientationCheck = (globalConfig2 != null || (commonLabels3 = globalConfig2.getCommonLabels()) == null) ? null : commonLabels3.getOrientationCheck();
                    if (orientationCheck == null) {
                        orientationCheck = "";
                    }
                    orientationCheckV2 = (globalConfig2 != null || (commonLabels2 = globalConfig2.getCommonLabels()) == null) ? null : commonLabels2.getOrientationCheckV2();
                    if (orientationCheckV2 == null) {
                        orientationCheckV2 = "";
                    }
                    backPressWarning = (globalConfig2 != null || (commonLabels = globalConfig2.getCommonLabels()) == null) ? null : commonLabels.getBackPressWarning();
                    if (backPressWarning == null) {
                        backPressWarning = "";
                    }
                    return new GlobalConfigModel(num3, customizationModel, errorLabelsModel, new CommonLabelsModel(poweredBy, orientationCheck, orientationCheckV2, backPressWarning), nativeLabelsModel, str2 != null ? "" : str2, new EnvironmentModel((globalConfig2 != null || (environment2 = globalConfig2.getEnvironment()) == null) ? null : Boxing.boxInt(environment2.getId()), (globalConfig2 != null || (environment = globalConfig2.getEnvironment()) == null) ? null : environment.getName()), globalConfig2 != null ? globalConfig2.getLanguage() : null);
                }
                num = (Integer) globalConfigMapper$map$1.L$3;
                str = (String) globalConfigMapper$map$1.L$2;
                globalConfig = (GlobalConfig) globalConfigMapper$map$1.L$1;
                globalConfigMapper = (GlobalConfigMapper) globalConfigMapper$map$1.L$0;
                ResultKt.throwOnFailure(obj);
                CustomizationModel customizationModel3 = (CustomizationModel) obj;
                Mapper<ErrorLabels, ErrorLabelsModel> mapper2 = globalConfigMapper.errorLabelsMapper;
                ErrorLabels errorLabels = globalConfig == null ? globalConfig.getErrorLabels() : null;
                globalConfigMapper$map$1.L$0 = globalConfig;
                globalConfigMapper$map$1.L$1 = str;
                globalConfigMapper$map$1.L$2 = num;
                globalConfigMapper$map$1.L$3 = customizationModel3;
                globalConfigMapper$map$1.label = 2;
                map = mapper2.map((Mapper<ErrorLabels, ErrorLabelsModel>) errorLabels, (Continuation<? super ErrorLabelsModel>) globalConfigMapper$map$1);
                if (map != coroutine_suspended) {
                    customizationModel = customizationModel3;
                    obj = map;
                    str2 = str;
                    globalConfig2 = globalConfig;
                    Integer num32 = num;
                    ErrorLabelsModel errorLabelsModel2 = (ErrorLabelsModel) obj;
                    if (globalConfig2 != null) {
                    }
                    if (pleaseWait == null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (initialisingSDK != null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (selectCheckBox != null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (unselectCheckBox != null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (backButtonContinueDescription != null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (closeButtonContinueDescription != null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (helpButtonContinueDescription != null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    NativeLabelsModel nativeLabelsModel2 = new NativeLabelsModel(pleaseWait, str3, str4, str5, str6, str7, str8, manualButtonContinueDescription != null ? "" : manualButtonContinueDescription);
                    if (globalConfig2 != null) {
                    }
                    if (poweredBy == null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (orientationCheck == null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (orientationCheckV2 == null) {
                    }
                    if (globalConfig2 != null) {
                    }
                    if (backPressWarning == null) {
                    }
                    return new GlobalConfigModel(num32, customizationModel, errorLabelsModel2, new CommonLabelsModel(poweredBy, orientationCheck, orientationCheckV2, backPressWarning), nativeLabelsModel2, str2 != null ? "" : str2, new EnvironmentModel((globalConfig2 != null || (environment2 = globalConfig2.getEnvironment()) == null) ? null : Boxing.boxInt(environment2.getId()), (globalConfig2 != null || (environment = globalConfig2.getEnvironment()) == null) ? null : environment.getName()), globalConfig2 != null ? globalConfig2.getLanguage() : null);
                }
                return coroutine_suspended;
            }
        }
        globalConfigMapper$map$1 = new GlobalConfigMapper$map$1(this, continuation);
        Object obj2 = globalConfigMapper$map$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = globalConfigMapper$map$1.label;
        if (i != 0) {
        }
        CustomizationModel customizationModel32 = (CustomizationModel) obj2;
        Mapper<ErrorLabels, ErrorLabelsModel> mapper22 = globalConfigMapper.errorLabelsMapper;
        if (globalConfig == null) {
        }
        globalConfigMapper$map$1.L$0 = globalConfig;
        globalConfigMapper$map$1.L$1 = str;
        globalConfigMapper$map$1.L$2 = num;
        globalConfigMapper$map$1.L$3 = customizationModel32;
        globalConfigMapper$map$1.label = 2;
        map = mapper22.map((Mapper<ErrorLabels, ErrorLabelsModel>) errorLabels, (Continuation<? super ErrorLabelsModel>) globalConfigMapper$map$1);
        if (map != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* compiled from: GlobalConfigMapper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "eventId", "", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;Ljava/lang/String;)V", "getConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "getEventId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class GlobalConfigMapperInput {
        public static final int $stable = 0;
        private final GlobalConfig config;
        private final String eventId;

        public static /* synthetic */ GlobalConfigMapperInput copy$default(GlobalConfigMapperInput globalConfigMapperInput, GlobalConfig globalConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                globalConfig = globalConfigMapperInput.config;
            }
            if ((i & 2) != 0) {
                str = globalConfigMapperInput.eventId;
            }
            return globalConfigMapperInput.copy(globalConfig, str);
        }

        /* renamed from: component1, reason: from getter */
        public final GlobalConfig getConfig() {
            return this.config;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        public final GlobalConfigMapperInput copy(GlobalConfig config, String eventId) {
            return new GlobalConfigMapperInput(config, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GlobalConfigMapperInput)) {
                return false;
            }
            GlobalConfigMapperInput globalConfigMapperInput = (GlobalConfigMapperInput) other;
            return Intrinsics.areEqual(this.config, globalConfigMapperInput.config) && Intrinsics.areEqual(this.eventId, globalConfigMapperInput.eventId);
        }

        public int hashCode() {
            GlobalConfig globalConfig = this.config;
            int hashCode = (globalConfig == null ? 0 : globalConfig.hashCode()) * 31;
            String str = this.eventId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "GlobalConfigMapperInput(config=" + this.config + ", eventId=" + this.eventId + ")";
        }

        public GlobalConfigMapperInput(GlobalConfig globalConfig, String str) {
            this.config = globalConfig;
            this.eventId = str;
        }

        public final GlobalConfig getConfig() {
            return this.config;
        }

        public final String getEventId() {
            return this.eventId;
        }
    }
}
