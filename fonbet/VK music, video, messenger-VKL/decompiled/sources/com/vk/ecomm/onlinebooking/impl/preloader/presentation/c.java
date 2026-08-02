package com.vk.ecomm.onlinebooking.impl.preloader.presentation;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: BookingPreloaderTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTaskExecutor", f = "BookingPreloaderTaskExecutor.kt", l = {129, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135}, m = "loadRebookingModel")
/* loaded from: classes18.dex */
public final class c extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.v(this.this$0, null, null, this);
    }
}
