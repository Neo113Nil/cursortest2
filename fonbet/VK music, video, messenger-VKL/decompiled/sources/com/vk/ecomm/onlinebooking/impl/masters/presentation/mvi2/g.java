package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.e;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.c5g;
import xsna.mzp0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zq7;
import xsna.zvj;

/* compiled from: BookingMastersScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.BookingMastersScreenTaskExecutor$loadInitialData$1", f = "BookingMastersScreenTaskExecutor.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BookingScreenParams $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, BookingScreenParams bookingScreenParams, spj<? super g> spjVar) {
        super(2, spjVar);
        this.this$0 = hVar;
        this.$params = bookingScreenParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        g gVar = new g(this.this$0, this.$params, spjVar);
        gVar.L$0 = obj;
        return gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BookingMaster bookingMaster;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                zq7 zq7Var = this.this$0.g;
                BookingScreenParams bookingScreenParams = this.$params;
                UserId userId = bookingScreenParams.b;
                BookingScreenParams.DateTime dateTime = bookingScreenParams.h;
                String str = dateTime != null ? dateTime.b : null;
                List<BookingServiceModel> list = bookingScreenParams.e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((BookingServiceModel) it.next()).b));
                }
                this.L$0 = yvjVar;
                this.label = 1;
                obj = zq7Var.b(userId, str, arrayList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            List list2 = (List) obj;
            zvj.e(yvjVar);
            mzp0 mzp0Var = this.this$0.h;
            if (mzp0Var != null) {
                mzp0Var.c(false);
            }
            this.this$0.e(new e.c(list2));
            if (list2.isEmpty()) {
                this.this$0.c(d.a.C0974a.a);
            } else {
                this.this$0.c(d.a.b.a);
            }
            h hVar = this.this$0;
            BookingScreenParams bookingScreenParams2 = this.$params;
            hVar.getClass();
            if (com.vk.ecomm.onlinebooking.impl.navhostfragment.c.a(bookingScreenParams2) && (bookingMaster = bookingScreenParams2.f) != null && !bookingMaster.d) {
                hVar.c(new d.c(new BookingError.MasterIsNotAvailable(bookingMaster.c)));
                hVar.c(d.a.c.a);
            }
        } catch (Exception e) {
            zvj.e(yvjVar);
            this.this$0.e(new e.a(e, new a.c(this.$params)));
            this.this$0.c(d.a.C0974a.a);
        }
        return s3q0.a;
    }
}
