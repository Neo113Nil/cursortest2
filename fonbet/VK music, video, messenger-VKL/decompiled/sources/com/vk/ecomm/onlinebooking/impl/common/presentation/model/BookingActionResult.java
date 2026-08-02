package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vkontakte.android.R;
import xsna.alb0;
import xsna.asp;
import xsna.jvi;
import xsna.lg90;
import xsna.mqv;
import xsna.or;
import xsna.rrv0;
import xsna.s200;
import xsna.ylu0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingActionResult.kt */
/* loaded from: classes18.dex */
public final class BookingActionResult implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BookingActionResult[] $VALUES;
    public static final BookingActionResult CANCELLATION_FAILURE;
    public static final BookingActionResult CANCELLATION_SUCCESS;
    public static final Parcelable.Creator<BookingActionResult> CREATOR;

    /* compiled from: BookingActionResult.kt */
    public static final class a implements Parcelable.Creator<BookingActionResult> {
        @Override // android.os.Parcelable.Creator
        public final BookingActionResult createFromParcel(Parcel parcel) {
            return BookingActionResult.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BookingActionResult[] newArray(int i) {
            return new BookingActionResult[i];
        }
    }

    /* compiled from: BookingActionResult.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingActionResult.values().length];
            try {
                iArr[BookingActionResult.CANCELLATION_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingActionResult.CANCELLATION_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        BookingActionResult bookingActionResult = new BookingActionResult("CANCELLATION_SUCCESS", 0);
        CANCELLATION_SUCCESS = bookingActionResult;
        BookingActionResult bookingActionResult2 = new BookingActionResult("CANCELLATION_FAILURE", 1);
        CANCELLATION_FAILURE = bookingActionResult2;
        BookingActionResult[] bookingActionResultArr = {bookingActionResult, bookingActionResult2};
        $VALUES = bookingActionResultArr;
        $ENTRIES = new asp(bookingActionResultArr);
        CREATOR = new a();
    }

    public BookingActionResult() {
        throw null;
    }

    public static BookingActionResult valueOf(String str) {
        return (BookingActionResult) Enum.valueOf(BookingActionResult.class, str);
    }

    public static BookingActionResult[] values() {
        return (BookingActionResult[]) $VALUES.clone();
    }

    public final mqv a(androidx.compose.runtime.a aVar) {
        mqv z;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-244636769, 0, -1, "com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult.<get-snackbarLeftIcon> (BookingActionResult.kt:28)");
        }
        int i = b.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            aVar.K(1127269844);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(316178300, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline28> (VkSdkIcons.kt:364)");
            }
            lg90 b2 = or.b(aVar, 404637919, R.drawable.vk_icon_check_circle_outline_28, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z = s200.z(b2, ylu0Var.getIcon().l, aVar);
            aVar.j();
        } else {
            if (i != 2) {
                throw alb0.c(1127267238, aVar);
            }
            aVar.K(1127276838);
            z = jvi.g(aVar);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
