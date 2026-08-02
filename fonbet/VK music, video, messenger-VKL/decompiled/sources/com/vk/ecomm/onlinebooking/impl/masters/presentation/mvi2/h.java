package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.BookingMastersScreenTask;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.e;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.NoWhenBranchMatchedException;
import xsna.hn50;
import xsna.jn50;
import xsna.myc0;
import xsna.mzp0;
import xsna.nn50;
import xsna.nr7;
import xsna.on50;
import xsna.tci;
import xsna.uvj;
import xsna.zq7;

/* compiled from: BookingMastersScreenTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class h extends uvj<nr7, on50, BookingMastersScreenTask, BookingMastersScreenTask, e, d> {
    public final zq7 g;
    public final mzp0 h;

    public h(nn50 nn50Var, zq7 zq7Var, mzp0 mzp0Var) {
        super(tci.c, nn50Var);
        this.g = zq7Var;
        this.h = mzp0Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        BookingMastersScreenTask bookingMastersScreenTask = (BookingMastersScreenTask) hn50Var;
        if (!(bookingMastersScreenTask instanceof BookingMastersScreenTask.OpenScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        BookingScreenParams bookingScreenParams = ((BookingMastersScreenTask.OpenScreen) bookingMastersScreenTask).b;
        mzp0 mzp0Var = this.h;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        e(e.b.a);
        return m(myc0.h(this.f, null, null, new g(this, bookingScreenParams, null), 3));
    }
}
