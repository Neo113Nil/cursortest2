package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.i;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.b6l;
import xsna.cv7;
import xsna.j5g;
import xsna.myc0;
import xsna.mzp0;
import xsna.s3q0;
import xsna.spj;
import xsna.wq7;
import xsna.wz7;
import xsna.wzs;
import xsna.yvj;
import xsna.yy7;
import xsna.zq7;
import xsna.zrl;
import xsna.zu7;
import xsna.zvj;

/* compiled from: BookingStartScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTaskExecutor$loadData$1", f = "BookingStartScreenTaskExecutor.kt", l = {72, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $groupId;
    final /* synthetic */ Integer $recordId;
    final /* synthetic */ BookingActionResult $result;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ n this$0;

    /* compiled from: BookingStartScreenTaskExecutor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTaskExecutor$loadData$1$masters$1", f = "BookingStartScreenTaskExecutor.kt", l = {65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super wq7>, Object> {
        final /* synthetic */ UserId $groupId;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, UserId userId, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = nVar;
            this.$groupId = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$groupId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super wq7> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            zq7 zq7Var = this.this$0.h;
            UserId userId = this.$groupId;
            this.label = 1;
            Object a = zq7Var.a(userId, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* compiled from: BookingStartScreenTaskExecutor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTaskExecutor$loadData$1$records$1", f = "BookingStartScreenTaskExecutor.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super cv7>, Object> {
        final /* synthetic */ UserId $groupId;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, UserId userId, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = nVar;
            this.$groupId = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$groupId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super cv7> spjVar) {
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
            zu7 zu7Var = this.this$0.i;
            UserId userId = this.$groupId;
            this.label = 1;
            Object d = zu7.d(zu7Var, userId, 0, this, 6);
            return d == coroutineSingletons ? coroutineSingletons : d;
        }
    }

    /* compiled from: BookingStartScreenTaskExecutor.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTaskExecutor$loadData$1$settings$1", f = "BookingStartScreenTaskExecutor.kt", l = {62}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super BookingSettings>, Object> {
        final /* synthetic */ UserId $groupId;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar, UserId userId, spj<? super c> spjVar) {
            super(2, spjVar);
            this.this$0 = nVar;
            this.$groupId = userId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.this$0, this.$groupId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super BookingSettings> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
            yy7 yy7Var = this.this$0.g;
            UserId userId = this.$groupId;
            this.label = 1;
            Object a = yy7Var.a(userId, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, BookingActionResult bookingActionResult, Integer num, UserId userId, spj<? super m> spjVar) {
        super(2, spjVar);
        this.this$0 = nVar;
        this.$result = bookingActionResult;
        this.$recordId = num;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        m mVar = new m(this.this$0, this.$result, this.$recordId, this.$groupId, spjVar);
        mVar.L$0 = obj;
        return mVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrl b2;
        zrl zrlVar;
        cv7 cv7Var;
        zrl zrlVar2;
        n nVar;
        Object H;
        BookingSettings bookingSettings;
        cv7 cv7Var2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            zvj.e(yvjVar);
            this.this$0.e(new i.d(e, new a.h(this.$groupId)));
            this.this$0.c(new d.a.b(this.$recordId));
        }
        if (i == 0) {
            kotlin.a.a(obj);
            n nVar2 = this.this$0;
            b2 = myc0.b(yvjVar, nVar2.k, null, new c(nVar2, this.$groupId, null), 2);
            n nVar3 = this.this$0;
            asl b3 = myc0.b(yvjVar, nVar3.k, null, new a(nVar3, this.$groupId, null), 2);
            n nVar4 = this.this$0;
            asl b4 = myc0.b(yvjVar, nVar4.k, null, new b(nVar4, this.$groupId, null), 2);
            this.L$0 = yvjVar;
            this.L$1 = b2;
            this.L$2 = b3;
            this.L$3 = null;
            this.label = 1;
            Object J = b4.J(this);
            if (J == coroutineSingletons) {
                return coroutineSingletons;
            }
            zrlVar = b3;
            obj = J;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    BookingSettings bookingSettings2 = (BookingSettings) this.L$6;
                    nVar = (n) this.L$5;
                    cv7Var2 = (cv7) this.L$4;
                    kotlin.a.a(obj);
                    bookingSettings = bookingSettings2;
                    nVar.e(new wz7(bookingSettings, ((wq7) obj).a, (BookingRecord) j5g.a0(cv7Var2.b), cv7Var2.b.size() <= 1, this.$result));
                    this.this$0.c(new d.a.c(this.$recordId));
                    return s3q0.a;
                }
                nVar = (n) this.L$5;
                cv7Var = (cv7) this.L$4;
                zrlVar2 = (zrl) this.L$2;
                kotlin.a.a(obj);
                BookingSettings bookingSettings3 = (BookingSettings) obj;
                this.L$0 = yvjVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = cv7Var;
                this.L$5 = nVar;
                this.L$6 = bookingSettings3;
                this.label = 3;
                H = zrlVar2.H(this);
                if (H != coroutineSingletons) {
                    bookingSettings = bookingSettings3;
                    obj = H;
                    cv7Var2 = cv7Var;
                    nVar.e(new wz7(bookingSettings, ((wq7) obj).a, (BookingRecord) j5g.a0(cv7Var2.b), cv7Var2.b.size() <= 1, this.$result));
                    this.this$0.c(new d.a.c(this.$recordId));
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
            zrlVar = (zrl) this.L$2;
            b2 = (zrl) this.L$1;
            kotlin.a.a(obj);
        }
        cv7 cv7Var3 = (cv7) obj;
        zvj.e(yvjVar);
        mzp0 mzp0Var = this.this$0.j;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        n nVar5 = this.this$0;
        this.L$0 = yvjVar;
        this.L$1 = null;
        this.L$2 = zrlVar;
        this.L$3 = null;
        this.L$4 = cv7Var3;
        this.L$5 = nVar5;
        this.label = 2;
        Object H2 = b2.H(this);
        if (H2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cv7Var = cv7Var3;
        obj = H2;
        zrlVar2 = zrlVar;
        nVar = nVar5;
        BookingSettings bookingSettings32 = (BookingSettings) obj;
        this.L$0 = yvjVar;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = cv7Var;
        this.L$5 = nVar;
        this.L$6 = bookingSettings32;
        this.label = 3;
        H = zrlVar2.H(this);
        if (H != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
