package com.vk.ecomm.onlinebooking.impl.preloader.presentation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: BookingPreloaderTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTaskExecutor", f = "BookingPreloaderTaskExecutor.kt", l = {148}, m = "tryFillArgsFromRecord")
/* loaded from: classes18.dex */
public final class d extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.x(null, null, this);
    }
}
