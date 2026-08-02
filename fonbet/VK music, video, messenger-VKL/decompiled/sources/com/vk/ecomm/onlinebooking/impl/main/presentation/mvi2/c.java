package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.l9;
import xsna.on50;
import xsna.qcy;
import xsna.vj50;

/* compiled from: BookingStartScreenBootstrapper.kt */
/* loaded from: classes18.dex */
public final class c implements vj50<k, on50, BookingStartScreenTask, i> {
    public final BookingScreenParams a;

    public c(BookingScreenParams bookingScreenParams, l9 l9Var) {
        this.a = bookingScreenParams;
    }

    @Override // xsna.vj50
    public final k a() {
        qcy<Object>[] qcyVarArr = BookingStartScreenFragment.S;
        BookingScreenParams bookingScreenParams = this.a;
        return new k(bookingScreenParams.b, null, false, "", null, null, EmptyList.b, null, false, false, bookingScreenParams.r);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ i b() {
        return null;
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ List<BookingStartScreenTask> c(k kVar) {
        return null;
    }
}
