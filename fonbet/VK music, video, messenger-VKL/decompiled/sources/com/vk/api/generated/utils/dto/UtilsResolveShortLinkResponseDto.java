package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: UtilsResolveShortLinkResponseDto.kt */
/* loaded from: classes15.dex */
public final class UtilsResolveShortLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<UtilsResolveShortLinkResponseDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    /* compiled from: UtilsResolveShortLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<UtilsResolveShortLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsResolveShortLinkResponseDto createFromParcel(Parcel parcel) {
            return new UtilsResolveShortLinkResponseDto((BaseLinkButtonActionDto) parcel.readParcelable(UtilsResolveShortLinkResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsResolveShortLinkResponseDto[] newArray(int i) {
            return new UtilsResolveShortLinkResponseDto[i];
        }
    }

    public UtilsResolveShortLinkResponseDto(BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.action = baseLinkButtonActionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UtilsResolveShortLinkResponseDto) && epx.f(this.action, ((UtilsResolveShortLinkResponseDto) obj).action);
    }

    public final int hashCode() {
        return this.action.hashCode();
    }

    public final String toString() {
        return "UtilsResolveShortLinkResponseDto(action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
    }
}
