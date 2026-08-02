package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingBookingType;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingServiceType.kt */
/* loaded from: classes18.dex */
public final class BookingServiceType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BookingServiceType[] $VALUES;
    public static final Parcelable.Creator<BookingServiceType> CREATOR;
    public static final BookingServiceType GROUP;
    public static final BookingServiceType INDIVIDUAL;

    /* compiled from: BookingServiceType.kt */
    public static final class a implements Parcelable.Creator<BookingServiceType> {
        @Override // android.os.Parcelable.Creator
        public final BookingServiceType createFromParcel(Parcel parcel) {
            return BookingServiceType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BookingServiceType[] newArray(int i) {
            return new BookingServiceType[i];
        }
    }

    /* compiled from: BookingServiceType.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingServiceType.values().length];
            try {
                iArr[BookingServiceType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingServiceType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        BookingServiceType bookingServiceType = new BookingServiceType("INDIVIDUAL", 0);
        INDIVIDUAL = bookingServiceType;
        BookingServiceType bookingServiceType2 = new BookingServiceType("GROUP", 1);
        GROUP = bookingServiceType2;
        BookingServiceType[] bookingServiceTypeArr = {bookingServiceType, bookingServiceType2};
        $VALUES = bookingServiceTypeArr;
        $ENTRIES = new asp(bookingServiceTypeArr);
        CREATOR = new a();
    }

    public BookingServiceType() {
        throw null;
    }

    public static BookingServiceType valueOf(String str) {
        return (BookingServiceType) Enum.valueOf(BookingServiceType.class, str);
    }

    public static BookingServiceType[] values() {
        return (BookingServiceType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CommonMarketStat$TypeSmbNativeBookingBookingType i() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return CommonMarketStat$TypeSmbNativeBookingBookingType.INDIVIDUAL;
        }
        if (i == 2) {
            return CommonMarketStat$TypeSmbNativeBookingBookingType.ACTIVITY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
