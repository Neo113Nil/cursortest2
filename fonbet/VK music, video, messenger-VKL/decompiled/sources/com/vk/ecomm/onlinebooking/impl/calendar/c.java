package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.onlinebooking.impl.calendar.e;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bmv;
import xsna.f4z;
import xsna.mm7;
import xsna.s3q0;
import xsna.spj;
import xsna.vm7;
import xsna.wzs;
import xsna.ym7;
import xsna.yvj;
import xsna.zvj;

/* compiled from: BookingCalendarScreenFeature.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenFeature$selectDay$1", f = "BookingCalendarScreenFeature.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a.e $action;
    final /* synthetic */ BookingCalendarScreenState $state;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, a.e eVar, BookingCalendarScreenState bookingCalendarScreenState, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$action = eVar;
        this.$state = bookingCalendarScreenState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        c cVar = new c(this.this$0, this.$action, this.$state, spjVar);
        cVar.L$0 = obj;
        return cVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.T(new e.a(this.$action.b));
                this.this$0.T(e.f.b);
                boolean z = this.$state.f.b;
                d dVar = this.this$0;
                vm7 vm7Var = dVar.g;
                bmv.a aVar = dVar.h;
                ym7.b bVar = this.$action.b;
                this.L$0 = yvjVar;
                this.Z$0 = z;
                this.label = 1;
                obj = vm7Var.a(aVar, bVar, z, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            ym7.e eVar = (ym7.e) obj;
            zvj.e(yvjVar);
            BookingScreenParams bookingScreenParams = this.$state.e;
            if (bookingScreenParams != null) {
                d dVar2 = this.this$0;
                boolean a = eVar.a();
                UserId userId = bookingScreenParams.b;
                Integer num = new Integer(bookingScreenParams.l);
                BookingServiceType bookingServiceType = bookingScreenParams.q;
                f4z f4zVar = dVar2.k;
                if (a) {
                    f4zVar.b(new mm7.b.c(userId, num, bookingServiceType));
                } else {
                    f4zVar.b(new mm7.b.h(userId, num, bookingServiceType));
                }
            }
            this.this$0.T(new e.d(eVar));
        } catch (CancellationException unused) {
        } catch (Exception e) {
            this.this$0.T(new e.h(e, this.$action, false));
        }
        return s3q0.a;
    }
}
