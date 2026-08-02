package com.vk.ecomm.onlinebooking.api.router;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingSource.kt */
/* loaded from: classes18.dex */
public final class BookingSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BookingSource[] $VALUES;
    public static final a Companion;
    public static final BookingSource RECORD;
    public static final BookingSource REPEAT_RECORD;

    /* compiled from: BookingSource.kt */
    public static final class a {
        public static BookingSource a(String str) {
            return str.equals("repeat-booking") ? BookingSource.REPEAT_RECORD : BookingSource.RECORD;
        }
    }

    static {
        BookingSource bookingSource = new BookingSource("RECORD", 0);
        RECORD = bookingSource;
        BookingSource bookingSource2 = new BookingSource("REPEAT_RECORD", 1);
        REPEAT_RECORD = bookingSource2;
        BookingSource[] bookingSourceArr = {bookingSource, bookingSource2};
        $VALUES = bookingSourceArr;
        $ENTRIES = new asp(bookingSourceArr);
        Companion = new a();
    }

    public BookingSource() {
        throw null;
    }

    public static BookingSource valueOf(String str) {
        return (BookingSource) Enum.valueOf(BookingSource.class, str);
    }

    public static BookingSource[] values() {
        return (BookingSource[]) $VALUES.clone();
    }
}
