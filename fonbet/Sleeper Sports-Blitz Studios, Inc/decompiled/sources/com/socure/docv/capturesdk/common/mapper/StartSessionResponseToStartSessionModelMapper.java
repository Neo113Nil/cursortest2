package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.GlobalConfigMapper;
import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.models.GlobalConfigModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionResponseToStartSessionModelMapper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/StartSessionResponseToStartSessionModelMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "moduleConfigToModuleModelMapper", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "globalConfigMapper", "Lcom/socure/docv/capturesdk/common/mapper/GlobalConfigMapper$GlobalConfigMapperInput;", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "(Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StartSessionResponseToStartSessionModelMapper implements Mapper<ModuleDataResponse, StartSessionModel> {
    private final Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> globalConfigMapper;
    private final Mapper<ModuleDataResponse, ModuleModel> moduleConfigToModuleModelMapper;

    public StartSessionResponseToStartSessionModelMapper(Mapper<ModuleDataResponse, ModuleModel> moduleConfigToModuleModelMapper, Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> globalConfigMapper) {
        Intrinsics.checkNotNullParameter(moduleConfigToModuleModelMapper, "moduleConfigToModuleModelMapper");
        Intrinsics.checkNotNullParameter(globalConfigMapper, "globalConfigMapper");
        this.moduleConfigToModuleModelMapper = moduleConfigToModuleModelMapper;
        this.globalConfigMapper = globalConfigMapper;
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ModuleDataResponse> list, Continuation<? super List<? extends StartSessionModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(ModuleDataResponse moduleDataResponse, Continuation<? super StartSessionModel> continuation) {
        StartSessionResponseToStartSessionModelMapper$map$1 startSessionResponseToStartSessionModelMapper$map$1;
        Object coroutine_suspended;
        int i;
        String str;
        StartSessionResponseToStartSessionModelMapper startSessionResponseToStartSessionModelMapper;
        Object map;
        ModuleModel moduleModel;
        String str2;
        if (continuation instanceof StartSessionResponseToStartSessionModelMapper$map$1) {
            startSessionResponseToStartSessionModelMapper$map$1 = (StartSessionResponseToStartSessionModelMapper$map$1) continuation;
            if ((startSessionResponseToStartSessionModelMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                startSessionResponseToStartSessionModelMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = startSessionResponseToStartSessionModelMapper$map$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startSessionResponseToStartSessionModelMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String sessionToken = moduleDataResponse.getSessionToken();
                    if (sessionToken == null) {
                        sessionToken = "";
                    }
                    Mapper<ModuleDataResponse, ModuleModel> mapper = this.moduleConfigToModuleModelMapper;
                    startSessionResponseToStartSessionModelMapper$map$1.L$0 = this;
                    startSessionResponseToStartSessionModelMapper$map$1.L$1 = moduleDataResponse;
                    startSessionResponseToStartSessionModelMapper$map$1.L$2 = sessionToken;
                    startSessionResponseToStartSessionModelMapper$map$1.label = 1;
                    Object map2 = mapper.map((Mapper<ModuleDataResponse, ModuleModel>) moduleDataResponse, (Continuation<? super ModuleModel>) startSessionResponseToStartSessionModelMapper$map$1);
                    if (map2 != coroutine_suspended) {
                        str = sessionToken;
                        obj = map2;
                        startSessionResponseToStartSessionModelMapper = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    moduleModel = (ModuleModel) startSessionResponseToStartSessionModelMapper$map$1.L$1;
                    str2 = (String) startSessionResponseToStartSessionModelMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new StartSessionModel(str2, moduleModel, (GlobalConfigModel) obj);
                }
                String str3 = (String) startSessionResponseToStartSessionModelMapper$map$1.L$2;
                ModuleDataResponse moduleDataResponse2 = (ModuleDataResponse) startSessionResponseToStartSessionModelMapper$map$1.L$1;
                startSessionResponseToStartSessionModelMapper = (StartSessionResponseToStartSessionModelMapper) startSessionResponseToStartSessionModelMapper$map$1.L$0;
                ResultKt.throwOnFailure(obj);
                str = str3;
                moduleDataResponse = moduleDataResponse2;
                ModuleModel moduleModel2 = (ModuleModel) obj;
                Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> mapper2 = startSessionResponseToStartSessionModelMapper.globalConfigMapper;
                GlobalConfigMapper.GlobalConfigMapperInput globalConfigMapperInput = new GlobalConfigMapper.GlobalConfigMapperInput(moduleDataResponse.getGlobalConfig(), moduleDataResponse.getEventId());
                startSessionResponseToStartSessionModelMapper$map$1.L$0 = str;
                startSessionResponseToStartSessionModelMapper$map$1.L$1 = moduleModel2;
                startSessionResponseToStartSessionModelMapper$map$1.L$2 = null;
                startSessionResponseToStartSessionModelMapper$map$1.label = 2;
                map = mapper2.map((Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel>) globalConfigMapperInput, (Continuation<? super GlobalConfigModel>) startSessionResponseToStartSessionModelMapper$map$1);
                if (map != coroutine_suspended) {
                    obj = map;
                    moduleModel = moduleModel2;
                    str2 = str;
                    return new StartSessionModel(str2, moduleModel, (GlobalConfigModel) obj);
                }
                return coroutine_suspended;
            }
        }
        startSessionResponseToStartSessionModelMapper$map$1 = new StartSessionResponseToStartSessionModelMapper$map$1(this, continuation);
        Object obj2 = startSessionResponseToStartSessionModelMapper$map$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startSessionResponseToStartSessionModelMapper$map$1.label;
        if (i != 0) {
        }
        ModuleModel moduleModel22 = (ModuleModel) obj2;
        Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel> mapper22 = startSessionResponseToStartSessionModelMapper.globalConfigMapper;
        GlobalConfigMapper.GlobalConfigMapperInput globalConfigMapperInput2 = new GlobalConfigMapper.GlobalConfigMapperInput(moduleDataResponse.getGlobalConfig(), moduleDataResponse.getEventId());
        startSessionResponseToStartSessionModelMapper$map$1.L$0 = str;
        startSessionResponseToStartSessionModelMapper$map$1.L$1 = moduleModel22;
        startSessionResponseToStartSessionModelMapper$map$1.L$2 = null;
        startSessionResponseToStartSessionModelMapper$map$1.label = 2;
        map = mapper22.map((Mapper<GlobalConfigMapper.GlobalConfigMapperInput, GlobalConfigModel>) globalConfigMapperInput2, (Continuation<? super GlobalConfigModel>) startSessionResponseToStartSessionModelMapper$map$1);
        if (map != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
