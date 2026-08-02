package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.ecomm.onlinebooking.impl.edit.f;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.b6l;
import xsna.cmv;
import xsna.dmv;
import xsna.f4z;
import xsna.g76;
import xsna.mm7;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.yy7;
import xsna.zrl;
import xsna.zvj;

/* compiled from: BookingEditScreenFeature.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenFeature$init$1", f = "BookingEditScreenFeature.kt", l = {239, 242, 243}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BookingScreenParams $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ com.vk.ecomm.onlinebooking.impl.edit.b this$0;

    /* compiled from: BookingEditScreenFeature.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenFeature$init$1$phoneInfoDefer$1", f = "BookingEditScreenFeature.kt", l = {229}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super BookingEditModel.c>, Object> {
        int label;
        final /* synthetic */ com.vk.ecomm.onlinebooking.impl.edit.b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.vk.ecomm.onlinebooking.impl.edit.b bVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super BookingEditModel.c> spjVar) {
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
            g76 g76Var = this.this$0.h;
            this.label = 1;
            g76Var.getClass();
            Object c = g76.c(g76Var, this);
            return c == coroutineSingletons ? coroutineSingletons : c;
        }
    }

    /* compiled from: BookingEditScreenFeature.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenFeature$init$1$servicesDefer$1", f = "BookingEditScreenFeature.kt", l = {232}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super List<? extends BookingServiceModel>>, Object> {
        final /* synthetic */ BookingScreenParams $params;
        int label;
        final /* synthetic */ com.vk.ecomm.onlinebooking.impl.edit.b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.vk.ecomm.onlinebooking.impl.edit.b bVar, BookingScreenParams bookingScreenParams, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = bVar;
            this.$params = bookingScreenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$params, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super List<? extends BookingServiceModel>> spjVar) {
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
            dmv dmvVar = this.this$0.j;
            BookingScreenParams bookingScreenParams = this.$params;
            UserId userId = bookingScreenParams.b;
            BookingMaster bookingMaster = bookingScreenParams.f;
            List<BookingServiceModel> list = bookingScreenParams.e;
            this.label = 1;
            Object b = dmvVar.b(userId, bookingMaster, list, this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* compiled from: BookingEditScreenFeature.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenFeature$init$1$settingsInfoDefer$1", f = "BookingEditScreenFeature.kt", l = {230}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super BookingSettings>, Object> {
        final /* synthetic */ BookingScreenParams $params;
        int label;
        final /* synthetic */ com.vk.ecomm.onlinebooking.impl.edit.b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.vk.ecomm.onlinebooking.impl.edit.b bVar, BookingScreenParams bookingScreenParams, spj<? super c> spjVar) {
            super(2, spjVar);
            this.this$0 = bVar;
            this.$params = bookingScreenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.this$0, this.$params, spjVar);
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
            yy7 yy7Var = this.this$0.i;
            UserId userId = this.$params.b;
            this.label = 1;
            Object a = yy7Var.a(userId, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.vk.ecomm.onlinebooking.impl.edit.b bVar, BookingScreenParams bookingScreenParams, spj<? super d> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
        this.$params = bookingScreenParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        d dVar = new d(this.this$0, this.$params, spjVar);
        dVar.L$0 = obj;
        return dVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zrl b2;
        zrl zrlVar;
        cmv.b bVar;
        cmv cmvVar;
        com.vk.ecomm.onlinebooking.impl.edit.b bVar2;
        BookingEditModel bookingEditModel;
        zrl zrlVar2;
        Object H;
        com.vk.ecomm.onlinebooking.impl.edit.b bVar3;
        BookingEditModel bookingEditModel2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            this.this$0.T(new f.e(e, a.g.b.b));
            f4z f4zVar = this.this$0.n;
            BookingScreenParams bookingScreenParams = this.$params;
            f4zVar.b(new mm7.b.C3352b(bookingScreenParams.b, new Integer(bookingScreenParams.l), this.$params.q));
        }
        if (i == 0) {
            kotlin.a.a(obj);
            com.vk.ecomm.onlinebooking.impl.edit.b bVar4 = this.this$0;
            asl b3 = myc0.b(yvjVar, bVar4.o, null, new a(bVar4, null), 2);
            com.vk.ecomm.onlinebooking.impl.edit.b bVar5 = this.this$0;
            b2 = myc0.b(yvjVar, bVar5.o, null, new c(bVar5, this.$params, null), 2);
            com.vk.ecomm.onlinebooking.impl.edit.b bVar6 = this.this$0;
            asl b4 = myc0.b(yvjVar, bVar6.o, null, new b(bVar6, this.$params, null), 2);
            com.vk.ecomm.onlinebooking.impl.edit.b bVar7 = this.this$0;
            g76 g76Var = bVar7.h;
            cmv.b bVar8 = bVar7.g;
            this.L$0 = yvjVar;
            this.L$1 = null;
            this.L$2 = b2;
            this.L$3 = b4;
            this.L$4 = g76Var;
            this.L$5 = bVar8;
            this.label = 1;
            obj = b3.J(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            zrlVar = b4;
            bVar = bVar8;
            cmvVar = g76Var;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bookingEditModel2 = (BookingEditModel) this.L$6;
                    com.vk.ecomm.onlinebooking.impl.edit.b bVar9 = (com.vk.ecomm.onlinebooking.impl.edit.b) this.L$5;
                    kotlin.a.a(obj);
                    bVar3 = bVar9;
                    bVar3.T(new f.j(BookingEditModel.a(bookingEditModel2, null, (List) obj, null, 0, 503)));
                    f4z f4zVar2 = this.this$0.n;
                    BookingScreenParams bookingScreenParams2 = this.$params;
                    f4zVar2.b(new mm7.b.g(bookingScreenParams2.b, new Integer(bookingScreenParams2.l), this.$params.q, false));
                    return s3q0.a;
                }
                bVar2 = (com.vk.ecomm.onlinebooking.impl.edit.b) this.L$5;
                bookingEditModel = (BookingEditModel) this.L$4;
                zrlVar2 = (zrl) this.L$3;
                kotlin.a.a(obj);
                bVar2.T(new f.n((BookingSettings) obj));
                com.vk.ecomm.onlinebooking.impl.edit.b bVar10 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = bVar10;
                this.L$6 = bookingEditModel;
                this.label = 3;
                H = zrlVar2.H(this);
                if (H != coroutineSingletons) {
                    bVar3 = bVar10;
                    obj = H;
                    bookingEditModel2 = bookingEditModel;
                    bVar3.T(new f.j(BookingEditModel.a(bookingEditModel2, null, (List) obj, null, 0, 503)));
                    f4z f4zVar22 = this.this$0.n;
                    BookingScreenParams bookingScreenParams22 = this.$params;
                    f4zVar22.b(new mm7.b.g(bookingScreenParams22.b, new Integer(bookingScreenParams22.l), this.$params.q, false));
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
            bVar = (cmv.b) this.L$5;
            cmvVar = (cmv) this.L$4;
            zrlVar = (zrl) this.L$3;
            b2 = (zrl) this.L$2;
            kotlin.a.a(obj);
        }
        BookingEditModel a2 = cmvVar.a(bVar, (BookingEditModel.c) obj, this.$params.d);
        zvj.e(yvjVar);
        this.this$0.T(new f.j(a2));
        bVar2 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = zrlVar;
        this.L$4 = a2;
        this.L$5 = bVar2;
        this.label = 2;
        Object H2 = b2.H(this);
        if (H2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        bookingEditModel = a2;
        obj = H2;
        zrlVar2 = zrlVar;
        bVar2.T(new f.n((BookingSettings) obj));
        com.vk.ecomm.onlinebooking.impl.edit.b bVar102 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = bVar102;
        this.L$6 = bookingEditModel;
        this.label = 3;
        H = zrlVar2.H(this);
        if (H != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
