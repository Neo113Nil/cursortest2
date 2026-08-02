package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MasksMaskDisabledReasonDto.kt */
/* loaded from: classes15.dex */
public final class MasksMaskDisabledReasonDto implements Parcelable {
    public static final Parcelable.Creator<MasksMaskDisabledReasonDto> CREATOR = new a();

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MasksMaskDisabledReasonDto.kt */
    public static final class a implements Parcelable.Creator<MasksMaskDisabledReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksMaskDisabledReasonDto createFromParcel(Parcel parcel) {
            return new MasksMaskDisabledReasonDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksMaskDisabledReasonDto[] newArray(int i) {
            return new MasksMaskDisabledReasonDto[i];
        }
    }

    public MasksMaskDisabledReasonDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksMaskDisabledReasonDto)) {
            return false;
        }
        MasksMaskDisabledReasonDto masksMaskDisabledReasonDto = (MasksMaskDisabledReasonDto) obj;
        return epx.f(this.title, masksMaskDisabledReasonDto.title) && epx.f(this.subtitle, masksMaskDisabledReasonDto.subtitle) && epx.f(this.url, masksMaskDisabledReasonDto.url);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksMaskDisabledReasonDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.url);
    }

    public MasksMaskDisabledReasonDto(String str, String str2, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
    }

    public /* synthetic */ MasksMaskDisabledReasonDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
