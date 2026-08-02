package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Config;
import com.socure.docv.capturesdk.models.ConfigModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ConfigMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "Lcom/socure/docv/capturesdk/models/ConfigModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConfigMapper implements Mapper<Config, ConfigModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends Config> list, Continuation<? super List<? extends ConfigModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(Config config, Continuation<? super ConfigModel> continuation) {
        Boolean removeIdCheckLogo;
        String imageThemeColor = config != null ? config.getImageThemeColor() : null;
        if (imageThemeColor == null) {
            imageThemeColor = "";
        }
        boolean z = false;
        boolean areEqual = config != null ? Intrinsics.areEqual(config.getProgressBar(), Boxing.boxBoolean(true)) : false;
        if (config != null && (removeIdCheckLogo = config.getRemoveIdCheckLogo()) != null) {
            z = removeIdCheckLogo.booleanValue();
        }
        return new ConfigModel(imageThemeColor, areEqual, z);
    }
}
