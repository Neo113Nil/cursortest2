package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: NewsfeedDzenTopStoriesBlockHeaderInfoDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenTopStoriesBlockHeaderInfoDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenTopStoriesBlockHeaderInfoDto> CREATOR = new a();

    @pmi0("popup")
    private final NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto popup;

    /* compiled from: NewsfeedDzenTopStoriesBlockHeaderInfoDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenTopStoriesBlockHeaderInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTopStoriesBlockHeaderInfoDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenTopStoriesBlockHeaderInfoDto(NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTopStoriesBlockHeaderInfoDto[] newArray(int i) {
            return new NewsfeedDzenTopStoriesBlockHeaderInfoDto[i];
        }
    }

    public NewsfeedDzenTopStoriesBlockHeaderInfoDto(NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto newsfeedDzenTopStoriesBlockHeaderInfoPopupDto) {
        this.popup = newsfeedDzenTopStoriesBlockHeaderInfoPopupDto;
    }

    public final NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto d() {
        return this.popup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedDzenTopStoriesBlockHeaderInfoDto) && epx.f(this.popup, ((NewsfeedDzenTopStoriesBlockHeaderInfoDto) obj).popup);
    }

    public final int hashCode() {
        return this.popup.hashCode();
    }

    public final String toString() {
        return "NewsfeedDzenTopStoriesBlockHeaderInfoDto(popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.popup.writeToParcel(parcel, i);
    }
}
