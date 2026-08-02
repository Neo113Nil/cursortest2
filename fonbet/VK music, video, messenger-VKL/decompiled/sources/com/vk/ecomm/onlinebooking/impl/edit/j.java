package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class j extends FunctionReferenceImpl implements izs<BookingEditScreenState, BookingEditScreenState.e> {
    public static final j b = new j(1, p.class, "composeMaster", "composeMaster(Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState;)Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState$Master;", 1);

    @Override // xsna.izs
    public final BookingEditScreenState.e invoke(BookingEditScreenState bookingEditScreenState) {
        BookingEditScreenState bookingEditScreenState2 = bookingEditScreenState;
        BookingScreenParams bookingScreenParams = bookingEditScreenState2.b;
        return new BookingEditScreenState.e(!bookingScreenParams.g && bookingEditScreenState2.c.a == BookingEditModel.EditMode.Edit, bookingScreenParams.f);
    }
}
