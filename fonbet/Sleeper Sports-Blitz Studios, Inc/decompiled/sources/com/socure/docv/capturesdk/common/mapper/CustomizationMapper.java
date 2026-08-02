package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Config;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Customization;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Theme;
import com.socure.docv.capturesdk.models.ConfigModel;
import com.socure.docv.capturesdk.models.CustomizationModel;
import com.socure.docv.capturesdk.models.ThemeModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomizationMapper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/CustomizationMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "themeMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "configMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "Lcom/socure/docv/capturesdk/models/ConfigModel;", "(Lcom/socure/docv/capturesdk/common/mapper/Mapper;Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CustomizationMapper implements Mapper<Customization, CustomizationModel> {
    private final Mapper<Config, ConfigModel> configMapper;
    private final Mapper<Theme, ThemeModel> themeMapper;

    public CustomizationMapper(Mapper<Theme, ThemeModel> themeMapper, Mapper<Config, ConfigModel> configMapper) {
        Intrinsics.checkNotNullParameter(themeMapper, "themeMapper");
        Intrinsics.checkNotNullParameter(configMapper, "configMapper");
        this.themeMapper = themeMapper;
        this.configMapper = configMapper;
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends Customization> list, Continuation<? super List<? extends CustomizationModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(Customization customization, Continuation<? super CustomizationModel> continuation) {
        CustomizationMapper$map$1 customizationMapper$map$1;
        Object coroutine_suspended;
        int i;
        CustomizationMapper customizationMapper;
        String logo;
        Object map;
        ThemeModel themeModel;
        String str;
        int i2;
        if (continuation instanceof CustomizationMapper$map$1) {
            customizationMapper$map$1 = (CustomizationMapper$map$1) continuation;
            if ((customizationMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                customizationMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = customizationMapper$map$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customizationMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Mapper<Theme, ThemeModel> mapper = this.themeMapper;
                    Theme theme = customization != null ? customization.getTheme() : null;
                    customizationMapper$map$1.L$0 = this;
                    customizationMapper$map$1.L$1 = customization;
                    customizationMapper$map$1.label = 1;
                    obj = mapper.map((Mapper<Theme, ThemeModel>) theme, (Continuation<? super ThemeModel>) customizationMapper$map$1);
                    if (obj != coroutine_suspended) {
                        customizationMapper = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = customizationMapper$map$1.I$0;
                    str = (String) customizationMapper$map$1.L$1;
                    themeModel = (ThemeModel) customizationMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new CustomizationModel(themeModel, str, i2 != 0, (ConfigModel) obj);
                }
                customization = (Customization) customizationMapper$map$1.L$1;
                customizationMapper = (CustomizationMapper) customizationMapper$map$1.L$0;
                ResultKt.throwOnFailure(obj);
                ThemeModel themeModel2 = (ThemeModel) obj;
                logo = customization == null ? customization.getLogo() : null;
                if (logo == null) {
                    logo = "";
                }
                int areEqual = customization == null ? Intrinsics.areEqual(customization.isLogoCustomized(), Boxing.boxBoolean(true)) : 0;
                Mapper<Config, ConfigModel> mapper2 = customizationMapper.configMapper;
                Config config = customization != null ? customization.getConfig() : null;
                customizationMapper$map$1.L$0 = themeModel2;
                customizationMapper$map$1.L$1 = logo;
                customizationMapper$map$1.I$0 = areEqual;
                customizationMapper$map$1.label = 2;
                map = mapper2.map((Mapper<Config, ConfigModel>) config, (Continuation<? super ConfigModel>) customizationMapper$map$1);
                if (map != coroutine_suspended) {
                    themeModel = themeModel2;
                    str = logo;
                    obj = map;
                    i2 = areEqual;
                    return new CustomizationModel(themeModel, str, i2 != 0, (ConfigModel) obj);
                }
                return coroutine_suspended;
            }
        }
        customizationMapper$map$1 = new CustomizationMapper$map$1(this, continuation);
        Object obj2 = customizationMapper$map$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customizationMapper$map$1.label;
        if (i != 0) {
        }
        ThemeModel themeModel22 = (ThemeModel) obj2;
        if (customization == null) {
        }
        if (logo == null) {
        }
        if (customization == null) {
        }
        Mapper<Config, ConfigModel> mapper22 = customizationMapper.configMapper;
        if (customization != null) {
        }
        customizationMapper$map$1.L$0 = themeModel22;
        customizationMapper$map$1.L$1 = logo;
        customizationMapper$map$1.I$0 = areEqual;
        customizationMapper$map$1.label = 2;
        map = mapper22.map((Mapper<Config, ConfigModel>) config, (Continuation<? super ConfigModel>) customizationMapper$map$1);
        if (map != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
