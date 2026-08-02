package com.unity3d.ads.core.data.datasource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {IronSourceError.ERROR_CODE_INIT_FAILED}, m = "getGPUModel")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends sq3 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStaticDeviceInfoDataSource$getGPUModel$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, rq3<? super AndroidStaticDeviceInfoDataSource$getGPUModel$1> rq3Var) {
        super(rq3Var);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object gPUModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        gPUModel = this.this$0.getGPUModel(this);
        return gPUModel;
    }
}
