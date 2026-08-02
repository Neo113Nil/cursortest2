package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.onlinebooking.impl.calendar.e;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bmv;
import xsna.f4z;
import xsna.mm7;
import xsna.mzp0;
import xsna.s3q0;
import xsna.spj;
import xsna.vm7;
import xsna.wzs;
import xsna.ym7;
import xsna.yvj;
import xsna.zvj;

/* compiled from: BookingCalendarScreenFeature.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenFeature$loadInitialData$1", f = "BookingCalendarScreenFeature.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a.c $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, a.c cVar, spj<? super b> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$action = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        b bVar = new b(this.this$0, this.$action, spjVar);
        bVar.L$0 = obj;
        return bVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    mzp0 mzp0Var = this.this$0.i;
                    if (mzp0Var != null) {
                        mzp0Var.a();
                    }
                    d dVar = this.this$0;
                    vm7 vm7Var = dVar.g;
                    bmv.a aVar = dVar.h;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    vm7Var.getClass();
                    obj = vm7.b(vm7Var, aVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ym7 ym7Var = (ym7) obj;
                zvj.e(yvjVar);
                this.this$0.T(new e.c(ym7Var));
                f4z f4zVar = this.this$0.k;
                BookingScreenParams bookingScreenParams = this.$action.b;
                f4zVar.b(new mm7.b.g(bookingScreenParams.b, new Integer(bookingScreenParams.l), this.$action.b.q, false));
                d dVar2 = this.this$0;
                boolean a = ym7Var.f.a();
                BookingScreenParams bookingScreenParams2 = this.$action.b;
                UserId userId = bookingScreenParams2.b;
                Integer num = new Integer(bookingScreenParams2.l);
                BookingServiceType bookingServiceType = this.$action.b.q;
                f4z f4zVar2 = dVar2.k;
                if (a) {
                    f4zVar2.b(new mm7.b.c(userId, num, bookingServiceType));
                } else {
                    f4zVar2.b(new mm7.b.h(userId, num, bookingServiceType));
                }
                mzp0 mzp0Var2 = this.this$0.i;
                if (mzp0Var2 != null) {
                    mzp0Var2.c(false);
                }
            } catch (Exception e) {
                this.this$0.T(new e.h(e, this.$action, true));
                f4z f4zVar3 = this.this$0.k;
                BookingScreenParams bookingScreenParams3 = this.$action.b;
                f4zVar3.b(new mm7.b.C3352b(bookingScreenParams3.b, new Integer(bookingScreenParams3.l), this.$action.b.q));
            }
            return s3q0.a;
        } finally {
            this.this$0.T(e.g.b);
        }
    }
}
