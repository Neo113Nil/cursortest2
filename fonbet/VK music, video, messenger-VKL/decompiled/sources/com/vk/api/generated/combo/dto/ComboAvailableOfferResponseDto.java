package com.vk.api.generated.combo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ComboAvailableOfferResponseDto.kt */
/* loaded from: classes14.dex */
public final class ComboAvailableOfferResponseDto implements Parcelable {
    public static final Parcelable.Creator<ComboAvailableOfferResponseDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("url")
    private final String url;

    /* compiled from: ComboAvailableOfferResponseDto.kt */
    public static final class a implements Parcelable.Creator<ComboAvailableOfferResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ComboAvailableOfferResponseDto createFromParcel(Parcel parcel) {
            return new ComboAvailableOfferResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComboAvailableOfferResponseDto[] newArray(int i) {
            return new ComboAvailableOfferResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComboAvailableOfferResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboAvailableOfferResponseDto)) {
            return false;
        }
        ComboAvailableOfferResponseDto comboAvailableOfferResponseDto = (ComboAvailableOfferResponseDto) obj;
        return epx.f(this.text, comboAvailableOfferResponseDto.text) && epx.f(this.url, comboAvailableOfferResponseDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComboAvailableOfferResponseDto(text=");
        sb.append(this.text);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.url);
    }

    public ComboAvailableOfferResponseDto(String str, String str2) {
        this.text = str;
        this.url = str2;
    }

    public /* synthetic */ ComboAvailableOfferResponseDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
