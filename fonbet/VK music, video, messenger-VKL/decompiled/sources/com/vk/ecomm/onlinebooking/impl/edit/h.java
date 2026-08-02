package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class h extends FunctionReferenceImpl implements izs<BookingEditScreenState, BookingEditScreenState.b> {
    public static final h b = new h(1, p.class, "composeConsentPersonalData", "composeConsentPersonalData(Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState;)Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState$ConsentPersonalDataBlock;", 1);

    @Override // xsna.izs
    public final BookingEditScreenState.b invoke(BookingEditScreenState bookingEditScreenState) {
        BookingEditScreenState bookingEditScreenState2 = bookingEditScreenState;
        BookingEditScreenState.b bVar = bookingEditScreenState2.j;
        if (bVar == null) {
            return null;
        }
        BookingSettings bookingSettings = bookingEditScreenState2.b.d;
        String str = bookingSettings.g;
        if (str == null) {
            str = "";
        }
        String str2 = bookingSettings.j;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = bookingSettings.h;
        return BookingEditScreenState.b.a(bVar, false, str, str2, str3 == null ? "" : str3, 1);
    }
}
