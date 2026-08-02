package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedExpertCardWidgetDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedExpertCardWidgetDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedExpertCardWidgetDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final NewsfeedExpertCardWidgetRatingDto rating;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedExpertCardWidgetDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedExpertCardWidgetDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedExpertCardWidgetDto createFromParcel(Parcel parcel) {
            return new NewsfeedExpertCardWidgetDto(parcel.readInt() == 0 ? null : NewsfeedExpertCardWidgetRatingDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(NewsfeedExpertCardWidgetDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedExpertCardWidgetDto[] newArray(int i) {
            return new NewsfeedExpertCardWidgetDto[i];
        }
    }

    public NewsfeedExpertCardWidgetDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedExpertCardWidgetDto)) {
            return false;
        }
        NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto = (NewsfeedExpertCardWidgetDto) obj;
        return epx.f(this.rating, newsfeedExpertCardWidgetDto.rating) && epx.f(this.title, newsfeedExpertCardWidgetDto.title) && epx.f(this.subtitle, newsfeedExpertCardWidgetDto.subtitle) && epx.f(this.action, newsfeedExpertCardWidgetDto.action);
    }

    public final int hashCode() {
        NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto = this.rating;
        int hashCode = (newsfeedExpertCardWidgetRatingDto == null ? 0 : newsfeedExpertCardWidgetRatingDto.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        return hashCode3 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedExpertCardWidgetDto(rating=" + this.rating + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto = this.rating;
        if (newsfeedExpertCardWidgetRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedExpertCardWidgetRatingDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.action, i);
    }

    public NewsfeedExpertCardWidgetDto(NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto, String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.rating = newsfeedExpertCardWidgetRatingDto;
        this.title = str;
        this.subtitle = str2;
        this.action = baseLinkButtonActionDto;
    }

    public /* synthetic */ NewsfeedExpertCardWidgetDto(NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto, String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedExpertCardWidgetRatingDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseLinkButtonActionDto);
    }
}
