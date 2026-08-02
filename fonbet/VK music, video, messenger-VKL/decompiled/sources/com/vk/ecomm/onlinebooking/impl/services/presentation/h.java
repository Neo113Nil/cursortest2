package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.c;
import com.vk.ecomm.onlinebooking.impl.services.presentation.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.dmv;
import xsna.j5g;
import xsna.myc0;
import xsna.mzp0;
import xsna.py7;
import xsna.qy7;
import xsna.s3q0;
import xsna.spj;
import xsna.vhn0;
import xsna.vw7;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: BookingServicesScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$performDataLoad$1", f = "BookingServicesScreenTaskExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a.c $action;
    final /* synthetic */ BookingScreenParams $params;
    int label;
    final /* synthetic */ j this$0;

    /* compiled from: BookingServicesScreenTaskExecutor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$performDataLoad$1$1", f = "BookingServicesScreenTaskExecutor.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ a.c $action;
        final /* synthetic */ BookingScreenParams $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, BookingScreenParams bookingScreenParams, a.c cVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = jVar;
            this.$params = bookingScreenParams;
            this.$action = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, this.$params, this.$action, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    j jVar = this.this$0;
                    dmv dmvVar = jVar.h;
                    vhn0 vhn0Var = jVar.j;
                    BookingScreenParams bookingScreenParams = this.$params;
                    UserId userId = bookingScreenParams.b;
                    BookingMaster bookingMaster = bookingScreenParams.f;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    obj = dmvVar.a(vhn0Var, userId, bookingMaster, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                vw7 vw7Var = (vw7) obj;
                zvj.e(yvjVar);
                mzp0 mzp0Var = this.this$0.g;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                this.this$0.e(new py7(vw7Var.a, j5g.S0(vw7Var.c), vw7Var.b));
                if (vw7Var.a.isEmpty()) {
                    j jVar2 = this.this$0;
                    BookingScreenParams bookingScreenParams2 = this.$params;
                    jVar2.c(new c.a.C0980a(bookingScreenParams2.b, new Integer(bookingScreenParams2.l)));
                } else {
                    j jVar3 = this.this$0;
                    BookingScreenParams bookingScreenParams3 = this.$params;
                    jVar3.c(new c.a.C0981c(bookingScreenParams3.b, new Integer(bookingScreenParams3.l)));
                }
            } catch (Exception e) {
                this.this$0.e(new e.c(e, this.$action));
                j jVar4 = this.this$0;
                BookingScreenParams bookingScreenParams4 = this.$params;
                jVar4.c(new c.a.C0980a(bookingScreenParams4.b, new Integer(bookingScreenParams4.l)));
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, BookingScreenParams bookingScreenParams, a.c cVar, spj<? super h> spjVar) {
        super(2, spjVar);
        this.this$0 = jVar;
        this.$params = bookingScreenParams;
        this.$action = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h(this.this$0, this.$params, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        mzp0 mzp0Var = this.this$0.g;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        this.this$0.e(new qy7());
        j jVar = this.this$0;
        myc0.h(jVar.f, null, null, new a(jVar, this.$params, this.$action, null), 3);
        return s3q0.a;
    }
}
