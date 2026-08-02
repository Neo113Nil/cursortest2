package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.f;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.List;
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
@b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenFeature$confirmBooking$1", f = "BookingEditScreenFeature.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BookingEditScreenState $state;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, BookingEditScreenState bookingEditScreenState, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
        this.$state = bookingEditScreenState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        NotificationVariants notificationVariants;
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
                    BookingEditScreenState bookingEditScreenState = this.$state;
                    BookingEditModel bookingEditModel = bookingEditScreenState.c;
                    String str = bookingEditScreenState.h.f;
                    BookingEditScreenState.b bVar3 = bookingEditScreenState.j;
                    Boolean valueOf = bVar3 != null ? Boolean.valueOf(bVar3.a) : null;
                    this.label = 1;
                    b = g76Var.b(bVar2, bookingEditModel, str, valueOf, this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    b = obj;
                }
                cmv.a aVar = (cmv.a) b;
                int i2 = aVar.a;
                String str2 = aVar.b;
                f4z f4zVar = this.this$0.l;
                BookingEditScreenState bookingEditScreenState2 = this.$state;
                BookingScreenParams bookingScreenParams = bookingEditScreenState2.b;
                List<BookingServiceModel> list = bookingEditScreenState2.c.d;
                BookingEditScreenState.f fVar = bookingEditScreenState2.i;
                f4zVar.b(new as7.j(BookingScreenParams.a(bookingScreenParams, 0, null, list, null, null, i2, str2, (fVar == null || (notificationVariants = fVar.a) == null) ? bookingScreenParams.n : notificationVariants.j(), null, 123895)));
            } catch (Exception e) {
                if ((e instanceof VKApiExecutionException) && ((VKApiExecutionException) e).s() == 14106) {
                    this.this$0.T(f.l.d.b);
                } else {
                    this.this$0.m.b(e);
                }
            }
            return s3q0.a;
        } finally {
            this.this$0.T(f.d.b);
        }
    }
}
