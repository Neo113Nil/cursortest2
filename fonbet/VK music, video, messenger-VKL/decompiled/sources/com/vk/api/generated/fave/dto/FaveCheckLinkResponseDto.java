package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: FaveCheckLinkResponseDto.kt */
/* loaded from: classes14.dex */
public final class FaveCheckLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<FaveCheckLinkResponseDto> CREATOR = new a();

    @pmi0("is_favorite")
    private final boolean isFavorite;

    /* compiled from: FaveCheckLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<FaveCheckLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveCheckLinkResponseDto createFromParcel(Parcel parcel) {
            return new FaveCheckLinkResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveCheckLinkResponseDto[] newArray(int i) {
            return new FaveCheckLinkResponseDto[i];
        }
    }

    public FaveCheckLinkResponseDto(boolean z) {
        this.isFavorite = z;
    }

    public final boolean d() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FaveCheckLinkResponseDto) && this.isFavorite == ((FaveCheckLinkResponseDto) obj).isFavorite;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isFavorite);
    }

    public final String toString() {
        return q0.a(new StringBuilder("FaveCheckLinkResponseDto(isFavorite="), this.isFavorite, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFavorite ? 1 : 0);
    }
}
