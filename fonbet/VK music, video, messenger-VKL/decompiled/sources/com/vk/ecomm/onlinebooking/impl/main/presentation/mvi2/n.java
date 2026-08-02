package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.BookingStartScreenTask;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwj;
import xsna.hn50;
import xsna.jn50;
import xsna.myc0;
import xsna.mzp0;
import xsna.nn50;
import xsna.on50;
import xsna.tci;
import xsna.uvj;
import xsna.vhn0;
import xsna.whn0;
import xsna.xz7;
import xsna.yy7;
import xsna.zq7;
import xsna.zu7;

/* compiled from: BookingStartScreenTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class n extends uvj<k, on50, BookingStartScreenTask, BookingStartScreenTask, i, d> {
    public final yy7 g;
    public final zq7 h;
    public final zu7 i;
    public final mzp0 j;
    public final vhn0 k;

    public n() {
        throw null;
    }

    public n(nn50 nn50Var, yy7 yy7Var, zq7 zq7Var, zu7 zu7Var, mzp0 mzp0Var) {
        super(tci.c, nn50Var);
        this.g = yy7Var;
        this.h = zq7Var;
        this.i = zu7Var;
        this.j = mzp0Var;
        this.k = whn0.a();
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        BookingStartScreenTask bookingStartScreenTask = (BookingStartScreenTask) hn50Var;
        if (bookingStartScreenTask instanceof BookingStartScreenTask.RetryLoad) {
            BookingStartScreenTask.RetryLoad retryLoad = (BookingStartScreenTask.RetryLoad) bookingStartScreenTask;
            return t(retryLoad.b, retryLoad.c, null);
        }
        if (!(bookingStartScreenTask instanceof BookingStartScreenTask.CancelRecord)) {
            throw new NoWhenBranchMatchedException();
        }
        BookingStartScreenTask.CancelRecord cancelRecord = (BookingStartScreenTask.CancelRecord) bookingStartScreenTask;
        return m(myc0.h(this.f, null, null, new l(this, cancelRecord.b, cancelRecord.c, cancelRecord.d, null), 3));
    }

    @Override // xsna.dl50, xsna.mn50
    public final void init() {
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        UserId userId = ((k) nn50Var.getCurrentState()).b;
        BookingRecord bookingRecord = ((k) nn50Var.getCurrentState()).i;
        t(userId, bookingRecord != null ? Integer.valueOf(bookingRecord.b) : null, ((k) nn50Var.getCurrentState()).l);
    }

    public final cwj t(UserId userId, Integer num, BookingActionResult bookingActionResult) {
        e(xz7.a);
        mzp0 mzp0Var = this.j;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        return m(myc0.h(this.f, null, null, new m(this, bookingActionResult, num, userId, null), 3));
    }
}
