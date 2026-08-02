package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ExploreWidgetsBaseFooterDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseFooterDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseFooterDto> CREATOR = new a();

    @pmi0("payload")
    private final ExploreWidgetsBaseFooterPayloadDto payload;

    @pmi0("type")
    private final ExploreWidgetsBaseFooterTypesDto type;

    /* compiled from: ExploreWidgetsBaseFooterDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseFooterDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseFooterDto createFromParcel(Parcel parcel) {
            return new ExploreWidgetsBaseFooterDto(ExploreWidgetsBaseFooterTypesDto.CREATOR.createFromParcel(parcel), (ExploreWidgetsBaseFooterPayloadDto) parcel.readParcelable(ExploreWidgetsBaseFooterDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseFooterDto[] newArray(int i) {
            return new ExploreWidgetsBaseFooterDto[i];
        }
    }

    public ExploreWidgetsBaseFooterDto(ExploreWidgetsBaseFooterTypesDto exploreWidgetsBaseFooterTypesDto, ExploreWidgetsBaseFooterPayloadDto exploreWidgetsBaseFooterPayloadDto) {
        this.type = exploreWidgetsBaseFooterTypesDto;
        this.payload = exploreWidgetsBaseFooterPayloadDto;
    }

    public final ExploreWidgetsBaseFooterPayloadDto d() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ExploreWidgetsBaseFooterTypesDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseFooterDto)) {
            return false;
        }
        ExploreWidgetsBaseFooterDto exploreWidgetsBaseFooterDto = (ExploreWidgetsBaseFooterDto) obj;
        return this.type == exploreWidgetsBaseFooterDto.type && epx.f(this.payload, exploreWidgetsBaseFooterDto.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "ExploreWidgetsBaseFooterDto(type=" + this.type + ", payload=" + this.payload + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.payload, i);
    }
}
