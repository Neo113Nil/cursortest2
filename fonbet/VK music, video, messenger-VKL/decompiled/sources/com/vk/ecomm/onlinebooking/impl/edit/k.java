package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.edit.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class k extends FunctionReferenceImpl implements izs<BookingEditScreenState, BookingEditScreenState.c> {
    public static final k b = new k(1, p.class, "composeDate", "composeDate(Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState;)Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState$Date;", 1);

    @Override // xsna.izs
    public final BookingEditScreenState.c invoke(BookingEditScreenState bookingEditScreenState) {
        BookingEditModel bookingEditModel = bookingEditScreenState.c;
        int i = p.a.$EnumSwitchMapping$0[bookingEditModel.a.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        boolean z2 = z;
        BookingEditModel.a aVar = bookingEditModel.c;
        return new BookingEditScreenState.c(z2, aVar.a, aVar.b, aVar.c, aVar.d);
    }
}
