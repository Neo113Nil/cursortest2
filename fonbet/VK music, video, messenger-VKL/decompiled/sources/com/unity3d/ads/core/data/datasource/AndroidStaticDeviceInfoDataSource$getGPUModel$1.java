package com.unity3d.ads.core.data.datasource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {IronSourceError.ERROR_CODE_INIT_FAILED}, m = "getGPUModel")
/* loaded from: classes14.dex */
public final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStaticDeviceInfoDataSource$getGPUModel$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, spj<? super AndroidStaticDeviceInfoDataSource$getGPUModel$1> spjVar) {
        super(spjVar);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object gPUModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        gPUModel = this.this$0.getGPUModel(this);
        return gPUModel;
    }
}
