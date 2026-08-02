package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedFeedPreloadingDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedFeedPreloadingDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedFeedPreloadingDto> CREATOR = new a();

    @pmi0("breaking_news")
    private final NewsfeedFeedPreloadingConfigDto breakingNews;

    @pmi0("media_discover")
    private final NewsfeedFeedPreloadingConfigDto mediaDiscover;

    /* compiled from: NewsfeedFeedPreloadingDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedFeedPreloadingDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedFeedPreloadingDto createFromParcel(Parcel parcel) {
            return new NewsfeedFeedPreloadingDto(parcel.readInt() == 0 ? null : NewsfeedFeedPreloadingConfigDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NewsfeedFeedPreloadingConfigDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedFeedPreloadingDto[] newArray(int i) {
            return new NewsfeedFeedPreloadingDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedFeedPreloadingDto() {
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
        if (!(obj instanceof NewsfeedFeedPreloadingDto)) {
            return false;
        }
        NewsfeedFeedPreloadingDto newsfeedFeedPreloadingDto = (NewsfeedFeedPreloadingDto) obj;
        return epx.f(this.mediaDiscover, newsfeedFeedPreloadingDto.mediaDiscover) && epx.f(this.breakingNews, newsfeedFeedPreloadingDto.breakingNews);
    }

    public final int hashCode() {
        NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto = this.mediaDiscover;
        int hashCode = (newsfeedFeedPreloadingConfigDto == null ? 0 : newsfeedFeedPreloadingConfigDto.hashCode()) * 31;
        NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto2 = this.breakingNews;
        return hashCode + (newsfeedFeedPreloadingConfigDto2 != null ? newsfeedFeedPreloadingConfigDto2.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedFeedPreloadingDto(mediaDiscover=" + this.mediaDiscover + ", breakingNews=" + this.breakingNews + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto = this.mediaDiscover;
        if (newsfeedFeedPreloadingConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedFeedPreloadingConfigDto.writeToParcel(parcel, i);
        }
        NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto2 = this.breakingNews;
        if (newsfeedFeedPreloadingConfigDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedFeedPreloadingConfigDto2.writeToParcel(parcel, i);
        }
    }

    public NewsfeedFeedPreloadingDto(NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto, NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto2) {
        this.mediaDiscover = newsfeedFeedPreloadingConfigDto;
        this.breakingNews = newsfeedFeedPreloadingConfigDto2;
    }

    public /* synthetic */ NewsfeedFeedPreloadingDto(NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto, NewsfeedFeedPreloadingConfigDto newsfeedFeedPreloadingConfigDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedFeedPreloadingConfigDto, (i & 2) != 0 ? null : newsfeedFeedPreloadingConfigDto2);
    }
}
