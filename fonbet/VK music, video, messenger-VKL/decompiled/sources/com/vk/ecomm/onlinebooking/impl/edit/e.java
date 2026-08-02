package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.edit.f;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.as7;
import xsna.b6l;
import xsna.cmv;
import xsna.f4z;
import xsna.g76;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: BookingEditScreenFeature.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenFeature$rescheduleBooking$1", f = "BookingEditScreenFeature.kt", l = {327}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BookingEditScreenState $state;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, BookingEditScreenState bookingEditScreenState, spj<? super e> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
        this.$state = bookingEditScreenState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    this.this$0.T(f.o.b);
                    b bVar = this.this$0;
                    g76 g76Var = bVar.h;
                    cmv.b bVar2 = bVar.g;
                    String str = this.$state.c.e.e;
                    this.label = 1;
                    g76Var.getClass();
                    obj = g76.e(g76Var, bVar2, str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                BookingRecord bookingRecord = (BookingRecord) obj;
                f4z f4zVar = this.this$0.l;
                BookingEditScreenState bookingEditScreenState = this.$state;
                f4zVar.b(new as7.j(BookingScreenParams.a(bookingEditScreenState.b, 0, null, bookingEditScreenState.c.d, null, null, bookingRecord.b, null, 0, bookingRecord, 121847)));
            } catch (Exception e) {
                this.this$0.m.b(e);
            }
            this.this$0.T(f.d.b);
            return s3q0.a;
        } catch (Throwable th) {
            this.this$0.T(f.d.b);
            throw th;
        }
    }
}
