package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketItemCardErrorDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemCardErrorDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemCardErrorDto> CREATOR = new a();

    @pmi0("context")
    private final String context;

    @pmi0("message")
    private final String message;

    @pmi0("method_name")
    private final String methodName;

    /* compiled from: MarketItemCardErrorDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemCardErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemCardErrorDto createFromParcel(Parcel parcel) {
            return new MarketItemCardErrorDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemCardErrorDto[] newArray(int i) {
            return new MarketItemCardErrorDto[i];
        }
    }

    public MarketItemCardErrorDto(String str, String str2, String str3) {
        this.methodName = str;
        this.message = str2;
        this.context = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemCardErrorDto)) {
            return false;
        }
        MarketItemCardErrorDto marketItemCardErrorDto = (MarketItemCardErrorDto) obj;
        return epx.f(this.methodName, marketItemCardErrorDto.methodName) && epx.f(this.message, marketItemCardErrorDto.message) && epx.f(this.context, marketItemCardErrorDto.context);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.methodName.hashCode() * 31, 31, this.message);
        String str = this.context;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCardErrorDto(methodName=");
        sb.append(this.methodName);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", context=");
        return ho8.a(sb, this.context, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.methodName);
        parcel.writeString(this.message);
        parcel.writeString(this.context);
    }

    public /* synthetic */ MarketItemCardErrorDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
