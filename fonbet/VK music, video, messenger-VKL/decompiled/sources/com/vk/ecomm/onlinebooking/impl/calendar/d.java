package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.onlinebooking.impl.calendar.e;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.as7;
import xsna.b6l;
import xsna.bmv;
import xsna.f4z;
import xsna.myc0;
import xsna.mzp0;
import xsna.s3q0;
import xsna.spj;
import xsna.tn7;
import xsna.vm7;
import xsna.wk50;
import xsna.wzs;
import xsna.ym7;
import xsna.yok0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: BookingCalendarScreenFeature.kt */
/* loaded from: classes18.dex */
public final class d extends wk50<tn7, BookingCalendarScreenState, com.vk.ecomm.onlinebooking.impl.calendar.a, e> {
    public final androidx.lifecycle.j f;
    public final vm7 g;
    public final bmv.a h;
    public final mzp0 i;
    public final f4z j;
    public final f4z k;
    public yok0 l;
    public yok0 m;

    /* compiled from: BookingCalendarScreenFeature.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenFeature$selectMasterFilter$1", f = "BookingCalendarScreenFeature.kt", l = {149}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ a.h $action;
        final /* synthetic */ boolean $allMasters;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, a.h hVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$allMasters = z;
            this.$action = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = d.this.new a(this.$allMasters, this.$action, spjVar);
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
                    d dVar = d.this;
                    vm7 vm7Var = dVar.g;
                    bmv.a aVar = dVar.h;
                    boolean z = this.$allMasters;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    obj = vm7Var.c(aVar, z, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                zvj.e(yvjVar);
                d.this.T(new e.b(this.$allMasters, (List) obj));
                d.this.C(a.d.b);
            } catch (CancellationException unused) {
            } catch (Exception e) {
                d.this.T(new e.h(e, this.$action, false));
            }
            return s3q0.a;
        }
    }

    public d(a.c cVar, androidx.lifecycle.j jVar, vm7 vm7Var, bmv.a aVar, mzp0 mzp0Var) {
        super(cVar, new h(new BookingCalendarScreenState(0)));
        this.f = jVar;
        this.g = vm7Var;
        this.h = aVar;
        this.i = mzp0Var;
        this.j = new f4z();
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(BookingCalendarScreenState bookingCalendarScreenState, com.vk.ecomm.onlinebooking.impl.calendar.a aVar) {
        BookingCalendarScreenState bookingCalendarScreenState2 = bookingCalendarScreenState;
        com.vk.ecomm.onlinebooking.impl.calendar.a aVar2 = aVar;
        ym7 ym7Var = bookingCalendarScreenState2.f;
        BookingScreenParams bookingScreenParams = bookingCalendarScreenState2.e;
        boolean equals = aVar2.equals(a.b.b);
        f4z f4zVar = this.j;
        if (equals) {
            f4zVar.b(as7.b.a);
            return;
        }
        if (aVar2.equals(a.C0953a.b)) {
            f4zVar.b(new as7.a(bookingScreenParams != null ? bookingScreenParams.q : null));
            return;
        }
        boolean z = aVar2 instanceof a.c;
        androidx.lifecycle.j jVar = this.f;
        if (z) {
            a.c cVar = (a.c) aVar2;
            T(new e.i(cVar.b));
            T(e.j.b);
            myc0.h(jVar, null, null, new b(this, cVar, null), 3);
            return;
        }
        if (aVar2 instanceof a.h) {
            W(bookingCalendarScreenState2, (a.h) aVar2);
            return;
        }
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            yok0 yok0Var = this.l;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.l = myc0.h(jVar, null, null, new c(this, eVar, bookingCalendarScreenState2, null), 3);
            return;
        }
        if (aVar2.equals(a.d.b)) {
            a.e eVar2 = new a.e(ym7Var.a);
            yok0 yok0Var2 = this.l;
            if (yok0Var2 != null) {
                yok0Var2.b(null);
            }
            this.l = myc0.h(jVar, null, null, new c(this, eVar2, bookingCalendarScreenState2, null), 3);
            return;
        }
        if (aVar2.equals(a.f.b)) {
            f4zVar.b(new as7.c(new b.j(0)));
            return;
        }
        if (aVar2.equals(a.g.b)) {
            W(bookingCalendarScreenState2, new a.h(true));
            return;
        }
        if (!(aVar2 instanceof a.i)) {
            throw new NoWhenBranchMatchedException();
        }
        if (bookingScreenParams == null) {
            return;
        }
        ym7.d dVar = ((a.i) aVar2).b;
        f4zVar.b(new as7.j(BookingScreenParams.a(bookingScreenParams, 0, null, null, ym7Var.b ? null : bookingScreenParams.f, new BookingScreenParams.DateTime(dVar.b, dVar.a, dVar.c, dVar.d, dVar.e, dVar.f), 0, null, 0, null, 130991)));
    }

    public final f4z U() {
        return this.k;
    }

    public final f4z V() {
        return this.j;
    }

    public final void W(BookingCalendarScreenState bookingCalendarScreenState, a.h hVar) {
        yok0 yok0Var = this.l;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        yok0 yok0Var2 = this.m;
        if (yok0Var2 != null) {
            yok0Var2.b(null);
        }
        boolean z = hVar.b;
        T(new e.b(z, bookingCalendarScreenState.f.g));
        this.m = myc0.h(this.f, null, null, new a(z, hVar, null), 3);
    }
}
