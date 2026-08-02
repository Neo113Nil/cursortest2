package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;

/* compiled from: ExploreStylesStyleBaseButtonDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseButtonDto implements Parcelable {
    public static final Parcelable.Creator<ExploreStylesStyleBaseButtonDto> CREATOR = new a();

    @pmi0("type")
    private final ExploreStylesStyleBaseButtonTypeDto type;

    /* compiled from: ExploreStylesStyleBaseButtonDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseButtonDto createFromParcel(Parcel parcel) {
            return new ExploreStylesStyleBaseButtonDto(ExploreStylesStyleBaseButtonTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseButtonDto[] newArray(int i) {
            return new ExploreStylesStyleBaseButtonDto[i];
        }
    }

    public ExploreStylesStyleBaseButtonDto(ExploreStylesStyleBaseButtonTypeDto exploreStylesStyleBaseButtonTypeDto) {
        this.type = exploreStylesStyleBaseButtonTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExploreStylesStyleBaseButtonDto) && this.type == ((ExploreStylesStyleBaseButtonDto) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "ExploreStylesStyleBaseButtonDto(type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
    }
}
