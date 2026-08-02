package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.c;
import com.vk.ecomm.onlinebooking.impl.services.presentation.e;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.b6l;
import xsna.dmv;
import xsna.iyx;
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
import xsna.yy7;
import xsna.zrl;

/* compiled from: BookingServicesScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$performDataLoadWithSettings$1", f = "BookingServicesScreenTaskExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a.c $action;
    final /* synthetic */ BookingScreenParams $params;
    int label;
    final /* synthetic */ j this$0;

    /* compiled from: BookingServicesScreenTaskExecutor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$performDataLoadWithSettings$1$1", f = "BookingServicesScreenTaskExecutor.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ a.c $action;
        final /* synthetic */ BookingScreenParams $params;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ j this$0;

        /* compiled from: BookingServicesScreenTaskExecutor.kt */
        @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$performDataLoadWithSettings$1$1$servicesResponse$1", f = "BookingServicesScreenTaskExecutor.kt", l = {123}, m = "invokeSuspend")
        /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.i$a$a, reason: collision with other inner class name */
        public static final class C0985a extends SuspendLambda implements wzs<yvj, spj<? super vw7>, Object> {
            final /* synthetic */ BookingScreenParams $params;
            int label;
            final /* synthetic */ j this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0985a(j jVar, BookingScreenParams bookingScreenParams, spj<? super C0985a> spjVar) {
                super(2, spjVar);
                this.this$0 = jVar;
                this.$params = bookingScreenParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C0985a(this.this$0, this.$params, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super vw7> spjVar) {
                return ((C0985a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                j jVar = this.this$0;
                dmv dmvVar = jVar.h;
                vhn0 vhn0Var = jVar.j;
                BookingScreenParams bookingScreenParams = this.$params;
                UserId userId = bookingScreenParams.b;
                BookingMaster bookingMaster = bookingScreenParams.f;
                this.label = 1;
                Object a = dmvVar.a(vhn0Var, userId, bookingMaster, this);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }

        /* compiled from: BookingServicesScreenTaskExecutor.kt */
        @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$performDataLoadWithSettings$1$1$settings$1", f = "BookingServicesScreenTaskExecutor.kt", l = {120}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super BookingSettings>, Object> {
            final /* synthetic */ BookingScreenParams $params;
            int label;
            final /* synthetic */ j this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, BookingScreenParams bookingScreenParams, spj<? super b> spjVar) {
                super(2, spjVar);
                this.this$0 = jVar;
                this.$params = bookingScreenParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.this$0, this.$params, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super BookingSettings> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                yy7 yy7Var = this.this$0.i;
                UserId userId = this.$params.b;
                this.label = 1;
                Object a = yy7Var.a(userId, this);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }

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

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
        
            if (r0 == r2) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v7, types: [xsna.zrl] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object J;
            j jVar;
            asl aslVar;
            BookingScreenParams bookingScreenParams;
            int i;
            Object H;
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
            } catch (Exception e) {
                this.this$0.e(new e.d(this.$params));
                this.this$0.e(new e.c(e, this.$action));
                j jVar2 = this.this$0;
                BookingScreenParams bookingScreenParams2 = this.$params;
                jVar2.c(new c.a.C0980a(bookingScreenParams2.b, new Integer(bookingScreenParams2.l)));
            }
            if (i2 == 0) {
                kotlin.a.a(obj);
                j jVar3 = this.this$0;
                asl b2 = myc0.b(yvjVar, jVar3.j, null, new b(jVar3, this.$params, null), 2);
                j jVar4 = this.this$0;
                asl b3 = myc0.b(yvjVar, jVar4.j, null, new C0985a(jVar4, this.$params, null), 2);
                iyx.e(yvjVar.getCoroutineContext());
                j jVar5 = this.this$0;
                BookingScreenParams bookingScreenParams3 = this.$params;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = b3;
                this.L$3 = jVar5;
                this.L$4 = bookingScreenParams3;
                this.I$0 = 0;
                this.label = 1;
                J = b2.J(this);
                if (J == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jVar = jVar5;
                aslVar = b3;
                bookingScreenParams = bookingScreenParams3;
                i = 0;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    H = obj;
                    vw7 vw7Var = (vw7) H;
                    mzp0 mzp0Var = this.this$0.g;
                    if (mzp0Var != null) {
                        mzp0Var.c(false);
                    }
                    this.this$0.e(new py7(vw7Var.a, j5g.S0(vw7Var.c), vw7Var.b));
                    j.t(this.this$0, this.$params, vw7Var);
                    if (vw7Var.a.isEmpty()) {
                        j jVar6 = this.this$0;
                        BookingScreenParams bookingScreenParams4 = this.$params;
                        jVar6.c(new c.a.C0980a(bookingScreenParams4.b, new Integer(bookingScreenParams4.l)));
                    } else {
                        j jVar7 = this.this$0;
                        BookingScreenParams bookingScreenParams5 = this.$params;
                        jVar7.c(new c.a.C0981c(bookingScreenParams5.b, new Integer(bookingScreenParams5.l)));
                    }
                    return s3q0.a;
                }
                int i3 = this.I$0;
                BookingScreenParams bookingScreenParams6 = (BookingScreenParams) this.L$4;
                jVar = (j) this.L$3;
                ?? r8 = (zrl) this.L$2;
                kotlin.a.a(obj);
                i = i3;
                aslVar = r8;
                bookingScreenParams = bookingScreenParams6;
                J = obj;
            }
            jVar.e(new e.d(BookingScreenParams.a(bookingScreenParams, i, (BookingSettings) J, null, null, null, 0, null, 0, null, 131067)));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            H = aslVar.H(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, BookingScreenParams bookingScreenParams, a.c cVar, spj<? super i> spjVar) {
        super(2, spjVar);
        this.this$0 = jVar;
        this.$params = bookingScreenParams;
        this.$action = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i(this.this$0, this.$params, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
