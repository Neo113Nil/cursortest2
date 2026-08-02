package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.edit.p;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.izs;
import xsna.wow;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class l extends FunctionReferenceImpl implements izs<BookingEditScreenState, wow<BookingEditScreenState.g>> {
    public static final l b = new l(1, p.class, "composeServices", "composeServices(Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState;)Ljava/util/List;", 1);

    @Override // xsna.izs
    public final wow<BookingEditScreenState.g> invoke(BookingEditScreenState bookingEditScreenState) {
        BookingEditModel bookingEditModel = bookingEditScreenState.c;
        int i = p.a.$EnumSwitchMapping$0[bookingEditModel.a.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        List<BookingServiceModel> list = bookingEditModel.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new BookingEditScreenState.g(false, (BookingServiceModel) it.next()));
        }
        return new wow<>(arrayList);
    }
}
