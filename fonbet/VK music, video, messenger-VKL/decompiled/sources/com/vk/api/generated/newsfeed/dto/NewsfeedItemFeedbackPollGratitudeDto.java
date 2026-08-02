package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: NewsfeedItemFeedbackPollGratitudeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemFeedbackPollGratitudeDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemFeedbackPollGratitudeDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedItemFeedbackPollGratitudeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemFeedbackPollGratitudeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollGratitudeDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemFeedbackPollGratitudeDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollGratitudeDto[] newArray(int i) {
            return new NewsfeedItemFeedbackPollGratitudeDto[i];
        }
    }

    public NewsfeedItemFeedbackPollGratitudeDto(String str, String str2, String str3) {
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollGratitudeDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollGratitudeDto newsfeedItemFeedbackPollGratitudeDto = (NewsfeedItemFeedbackPollGratitudeDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollGratitudeDto.title) && epx.f(this.subtitle, newsfeedItemFeedbackPollGratitudeDto.subtitle) && epx.f(this.buttonText, newsfeedItemFeedbackPollGratitudeDto.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollGratitudeDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.buttonText);
    }
}
