package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkRunUserSeasonExtraDataDto.kt */
/* loaded from: classes15.dex */
public final class VkRunUserSeasonExtraDataDto implements Parcelable {
    public static final Parcelable.Creator<VkRunUserSeasonExtraDataDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: VkRunUserSeasonExtraDataDto.kt */
    public static final class a implements Parcelable.Creator<VkRunUserSeasonExtraDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonExtraDataDto createFromParcel(Parcel parcel) {
            return new VkRunUserSeasonExtraDataDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonExtraDataDto[] newArray(int i) {
            return new VkRunUserSeasonExtraDataDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkRunUserSeasonExtraDataDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VkRunUserSeasonExtraDataDto) && epx.f(this.url, ((VkRunUserSeasonExtraDataDto) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkRunUserSeasonExtraDataDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public VkRunUserSeasonExtraDataDto(String str) {
        this.url = str;
    }

    public /* synthetic */ VkRunUserSeasonExtraDataDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
