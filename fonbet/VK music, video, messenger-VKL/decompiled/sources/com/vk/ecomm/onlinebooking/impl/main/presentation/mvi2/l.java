package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.i;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zu7;
import xsna.zvj;

/* compiled from: BookingStartScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTaskExecutor$cancelRecord$1", f = "BookingStartScreenTaskExecutor.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $groupId;
    final /* synthetic */ String $recordHash;
    final /* synthetic */ int $recordId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, UserId userId, int i, String str, spj<? super l> spjVar) {
        super(2, spjVar);
        this.this$0 = nVar;
        this.$groupId = userId;
        this.$recordId = i;
        this.$recordHash = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        l lVar = new l(this.this$0, this.$groupId, this.$recordId, this.$recordHash, spjVar);
        lVar.L$0 = obj;
        return lVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BookingServiceType bookingServiceType;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    zu7 zu7Var = this.this$0.i;
                    UserId userId = this.$groupId;
                    int i2 = this.$recordId;
                    String str = this.$recordHash;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    if (zu7Var.a(userId, i2, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                zvj.e(yvjVar);
                if (((k) this.this$0.b.getCurrentState()).i == null) {
                    bookingServiceType = null;
                } else {
                    BookingRecord bookingRecord = ((k) this.this$0.b.getCurrentState()).i;
                    bookingServiceType = (bookingRecord == null || bookingRecord.o != 0) ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL;
                }
                this.this$0.c(new d.a.C0970a(new Integer(this.$recordId), bookingServiceType));
                this.this$0.t(this.$groupId, new Integer(this.$recordId), BookingActionResult.CANCELLATION_SUCCESS);
            } catch (BookingError.RecordCancellationException e) {
                zvj.e(yvjVar);
                this.this$0.c(new d.b(e));
                this.this$0.c(new d.a.b(new Integer(this.$recordId)));
            }
            return s3q0.a;
        } finally {
            this.this$0.e(i.a.a);
        }
    }
}
