package com.vk.ecomm.design.compose.booking;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingCard.kt */
/* loaded from: classes18.dex */
public final class BookingCard$BookingCardType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BookingCard$BookingCardType[] $VALUES;
    public static final BookingCard$BookingCardType COMMON;
    public static final BookingCard$BookingCardType GROUP;
    public static final BookingCard$BookingCardType INDIVIDUAL;

    /* compiled from: BookingCard.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingCard$BookingCardType.values().length];
            try {
                iArr[BookingCard$BookingCardType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingCard$BookingCardType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingCard$BookingCardType.COMMON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        BookingCard$BookingCardType bookingCard$BookingCardType = new BookingCard$BookingCardType("INDIVIDUAL", 0);
        INDIVIDUAL = bookingCard$BookingCardType;
        BookingCard$BookingCardType bookingCard$BookingCardType2 = new BookingCard$BookingCardType("GROUP", 1);
        GROUP = bookingCard$BookingCardType2;
        BookingCard$BookingCardType bookingCard$BookingCardType3 = new BookingCard$BookingCardType("COMMON", 2);
        COMMON = bookingCard$BookingCardType3;
        BookingCard$BookingCardType[] bookingCard$BookingCardTypeArr = {bookingCard$BookingCardType, bookingCard$BookingCardType2, bookingCard$BookingCardType3};
        $VALUES = bookingCard$BookingCardTypeArr;
        $ENTRIES = new asp(bookingCard$BookingCardTypeArr);
    }

    public BookingCard$BookingCardType() {
        throw null;
    }

    public static BookingCard$BookingCardType valueOf(String str) {
        return (BookingCard$BookingCardType) Enum.valueOf(BookingCard$BookingCardType.class, str);
    }

    public static BookingCard$BookingCardType[] values() {
        return (BookingCard$BookingCardType[]) $VALUES.clone();
    }
}
