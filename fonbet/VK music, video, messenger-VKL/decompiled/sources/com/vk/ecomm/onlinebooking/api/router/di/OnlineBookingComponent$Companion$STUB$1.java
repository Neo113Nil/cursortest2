package com.vk.ecomm.onlinebooking.api.router.di;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.api.router.BookingSource;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.cp80;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.ku70;
import xsna.qcy;
import xsna.to80;
import xsna.uz;

/* compiled from: OnlineBookingComponent.kt */
/* loaded from: classes18.dex */
public final class OnlineBookingComponent$Companion$STUB$1 implements OnlineBookingComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(OnlineBookingComponent$Companion$STUB$1.class, "onlineBookingRouter", "getOnlineBookingRouter()Lcom/vk/ecomm/onlinebooking/api/router/OnlineBookingRouter;", 0), fp.c(0, OnlineBookingComponent$Companion$STUB$1.class, "analytics", "getAnalytics()Lcom/vk/ecomm/onlinebooking/api/router/OnlineBookingAnalytics;", fpf0.a)};
    public final ewy a = new ewy(new uz(20));
    public final ewy b = new ewy(new ku70(3));

    @Override // com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent
    public final cp80 M4() {
        qcy<Object> qcyVar = c[0];
        return (cp80) this.a.c();
    }

    @Override // com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent
    public final to80 d() {
        qcy<Object> qcyVar = c[1];
        return (to80) this.b.c();
    }

    /* compiled from: OnlineBookingComponent.kt */
    public static final class a implements to80 {
        @Override // xsna.to80
        public final void a(UserId userId) {
        }
    }

    /* compiled from: OnlineBookingComponent.kt */
    public static final class b implements cp80 {
        @Override // xsna.cp80
        public final void b(Context context, UserId userId) {
        }

        @Override // xsna.cp80
        public final void a(Context context, UserId userId, String str, String str2, BookingSource bookingSource) {
        }
    }
}
