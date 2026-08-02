package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ChannelsInitializePaymentForMessagesPaidReactionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsInitializePaymentForMessagesPaidReactionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsInitializePaymentForMessagesPaidReactionsResponseDto> CREATOR = new a();

    @pmi0("open_method")
    private final OpenMethodDto openMethod;

    @pmi0("payment_id")
    private final String paymentId;

    @pmi0("payment_url")
    private final String paymentUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsInitializePaymentForMessagesPaidReactionsResponseDto.kt */
    public static final class OpenMethodDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpenMethodDto[] $VALUES;
        public static final Parcelable.Creator<OpenMethodDto> CREATOR;

        @pmi0("iframe")
        public static final OpenMethodDto IFRAME;

        @pmi0("navigate")
        public static final OpenMethodDto NAVIGATE;
        private final String value;

        /* compiled from: ChannelsInitializePaymentForMessagesPaidReactionsResponseDto.kt */
        public static final class a implements Parcelable.Creator<OpenMethodDto> {
            @Override // android.os.Parcelable.Creator
            public final OpenMethodDto createFromParcel(Parcel parcel) {
                return OpenMethodDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenMethodDto[] newArray(int i) {
                return new OpenMethodDto[i];
            }
        }

        static {
            OpenMethodDto openMethodDto = new OpenMethodDto("NAVIGATE", 0, "navigate");
            NAVIGATE = openMethodDto;
            OpenMethodDto openMethodDto2 = new OpenMethodDto("IFRAME", 1, "iframe");
            IFRAME = openMethodDto2;
            OpenMethodDto[] openMethodDtoArr = {openMethodDto, openMethodDto2};
            $VALUES = openMethodDtoArr;
            $ENTRIES = new asp(openMethodDtoArr);
            CREATOR = new a();
        }

        private OpenMethodDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OpenMethodDto valueOf(String str) {
            return (OpenMethodDto) Enum.valueOf(OpenMethodDto.class, str);
        }

        public static OpenMethodDto[] values() {
            return (OpenMethodDto[]) $VALUES.clone();
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

    /* compiled from: ChannelsInitializePaymentForMessagesPaidReactionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsInitializePaymentForMessagesPaidReactionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsInitializePaymentForMessagesPaidReactionsResponseDto createFromParcel(Parcel parcel) {
            return new ChannelsInitializePaymentForMessagesPaidReactionsResponseDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OpenMethodDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsInitializePaymentForMessagesPaidReactionsResponseDto[] newArray(int i) {
            return new ChannelsInitializePaymentForMessagesPaidReactionsResponseDto[i];
        }
    }

    public ChannelsInitializePaymentForMessagesPaidReactionsResponseDto(String str, String str2, OpenMethodDto openMethodDto) {
        this.paymentId = str;
        this.paymentUrl = str2;
        this.openMethod = openMethodDto;
    }

    public final String d() {
        return this.paymentUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsInitializePaymentForMessagesPaidReactionsResponseDto)) {
            return false;
        }
        ChannelsInitializePaymentForMessagesPaidReactionsResponseDto channelsInitializePaymentForMessagesPaidReactionsResponseDto = (ChannelsInitializePaymentForMessagesPaidReactionsResponseDto) obj;
        return epx.f(this.paymentId, channelsInitializePaymentForMessagesPaidReactionsResponseDto.paymentId) && epx.f(this.paymentUrl, channelsInitializePaymentForMessagesPaidReactionsResponseDto.paymentUrl) && this.openMethod == channelsInitializePaymentForMessagesPaidReactionsResponseDto.openMethod;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.paymentId.hashCode() * 31, 31, this.paymentUrl);
        OpenMethodDto openMethodDto = this.openMethod;
        return a2 + (openMethodDto == null ? 0 : openMethodDto.hashCode());
    }

    public final String toString() {
        return "ChannelsInitializePaymentForMessagesPaidReactionsResponseDto(paymentId=" + this.paymentId + ", paymentUrl=" + this.paymentUrl + ", openMethod=" + this.openMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.paymentId);
        parcel.writeString(this.paymentUrl);
        OpenMethodDto openMethodDto = this.openMethod;
        if (openMethodDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            openMethodDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ChannelsInitializePaymentForMessagesPaidReactionsResponseDto(String str, String str2, OpenMethodDto openMethodDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : openMethodDto);
    }
}
