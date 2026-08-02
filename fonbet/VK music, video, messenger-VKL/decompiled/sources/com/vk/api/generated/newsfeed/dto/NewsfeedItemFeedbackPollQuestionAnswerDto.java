package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: NewsfeedItemFeedbackPollQuestionAnswerDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemFeedbackPollQuestionAnswerDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemFeedbackPollQuestionAnswerDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedItemFeedbackPollQuestionAnswerDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemFeedbackPollQuestionAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollQuestionAnswerDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemFeedbackPollQuestionAnswerDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollQuestionAnswerDto[] newArray(int i) {
            return new NewsfeedItemFeedbackPollQuestionAnswerDto[i];
        }
    }

    public NewsfeedItemFeedbackPollQuestionAnswerDto(String str, String str2) {
        this.title = str;
        this.id = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionAnswerDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionAnswerDto newsfeedItemFeedbackPollQuestionAnswerDto = (NewsfeedItemFeedbackPollQuestionAnswerDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollQuestionAnswerDto.title) && epx.f(this.id, newsfeedItemFeedbackPollQuestionAnswerDto.id);
    }

    public final int hashCode() {
        return this.id.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollQuestionAnswerDto(title=");
        sb.append(this.title);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.id);
    }
}
