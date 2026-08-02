package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedFeedPreloadingConfigDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedFeedPreloadingConfigDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedFeedPreloadingConfigDto> CREATOR = new a();

    @pmi0("on_app_start")
    private final NewsfeedFeedPreloadingTypeConfigDto onAppStart;

    @pmi0("on_neighbour_tab")
    private final NewsfeedFeedPreloadingTypeConfigDto onNeighbourTab;

    /* compiled from: NewsfeedFeedPreloadingConfigDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedFeedPreloadingConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedFeedPreloadingConfigDto createFromParcel(Parcel parcel) {
            return new NewsfeedFeedPreloadingConfigDto(parcel.readInt() == 0 ? null : NewsfeedFeedPreloadingTypeConfigDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NewsfeedFeedPreloadingTypeConfigDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedFeedPreloadingConfigDto[] newArray(int i) {
            return new NewsfeedFeedPreloadingConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedFeedPreloadingConfigDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedFeedPreloadingConfigDto)) {
            return false;
        }
        NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto = (NewsfeedFeedPreloadingConfigDto) obj;
        return epx.f(this.onAppStart, newsfeedFeedPreloadingConfigDto.onAppStart) && epx.f(this.onNeighbourTab, newsfeedFeedPreloadingConfigDto.onNeighbourTab);
    }

    public final int hashCode() {
        NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto = this.onAppStart;
        int hashCode = (newsfeedFeedPreloadingTypeConfigDto == null ? 0 : newsfeedFeedPreloadingTypeConfigDto.hashCode()) * 31;
        NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto2 = this.onNeighbourTab;
        return hashCode + (newsfeedFeedPreloadingTypeConfigDto2 != null ? newsfeedFeedPreloadingTypeConfigDto2.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedFeedPreloadingConfigDto(onAppStart=" + this.onAppStart + ", onNeighbourTab=" + this.onNeighbourTab + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto = this.onAppStart;
        if (newsfeedFeedPreloadingTypeConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedFeedPreloadingTypeConfigDto.writeToParcel(parcel, i);
        }
        NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto2 = this.onNeighbourTab;
        if (newsfeedFeedPreloadingTypeConfigDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedFeedPreloadingTypeConfigDto2.writeToParcel(parcel, i);
        }
    }

    public NewsfeedFeedPreloadingConfigDto(NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto, NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto2) {
        this.onAppStart = newsfeedFeedPreloadingTypeConfigDto;
        this.onNeighbourTab = newsfeedFeedPreloadingTypeConfigDto2;
    }

    public /* synthetic */ NewsfeedFeedPreloadingConfigDto(NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto, NewsfeedFeedPreloadingTypeConfigDto newsfeedFeedPreloadingTypeConfigDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedFeedPreloadingTypeConfigDto, (i & 2) != 0 ? null : newsfeedFeedPreloadingTypeConfigDto2);
    }
}
