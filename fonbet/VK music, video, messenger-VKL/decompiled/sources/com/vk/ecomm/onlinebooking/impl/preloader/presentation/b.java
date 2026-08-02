package com.vk.ecomm.onlinebooking.impl.preloader.presentation;

import com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTask;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: BookingPreloaderTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTaskExecutor$execute$1", f = "BookingPreloaderTaskExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BookingPreloaderTask $task;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, BookingPreloaderTask bookingPreloaderTask, spj<? super b> spjVar) {
        super(2, spjVar);
        this.this$0 = eVar;
        this.$task = bookingPreloaderTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.w(((BookingPreloaderTask.Reload) this.$task).b);
        return s3q0.a;
    }
}
