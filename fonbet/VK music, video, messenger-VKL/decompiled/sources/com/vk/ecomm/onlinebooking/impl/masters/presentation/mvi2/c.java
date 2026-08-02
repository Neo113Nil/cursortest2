package com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.BookingMastersScreenTask;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.Collections;
import java.util.List;
import xsna.nh;
import xsna.nr7;
import xsna.on50;
import xsna.qcy;
import xsna.vj50;

/* compiled from: BookingMastersScreenBootstrapper.kt */
/* loaded from: classes18.dex */
public final class c implements vj50<nr7, on50, BookingMastersScreenTask, e> {
    public final BookingScreenParams a;

    public c(BookingScreenParams bookingScreenParams, nh nhVar) {
        this.a = bookingScreenParams;
    }

    @Override // xsna.vj50
    public final nr7 a() {
        qcy<Object>[] qcyVarArr = BookingMastersScreenFragmentMvi2.S;
        return new nr7(this.a, 14);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ e b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<BookingMastersScreenTask> c(nr7 nr7Var) {
        return Collections.singletonList(new BookingMastersScreenTask.OpenScreen(this.a));
    }
}
