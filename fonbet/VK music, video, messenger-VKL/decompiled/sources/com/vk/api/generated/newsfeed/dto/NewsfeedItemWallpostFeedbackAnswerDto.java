package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: NewsfeedItemWallpostFeedbackAnswerDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemWallpostFeedbackAnswerDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemWallpostFeedbackAnswerDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedItemWallpostFeedbackAnswerDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemWallpostFeedbackAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostFeedbackAnswerDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemWallpostFeedbackAnswerDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostFeedbackAnswerDto[] newArray(int i) {
            return new NewsfeedItemWallpostFeedbackAnswerDto[i];
        }
    }

    public NewsfeedItemWallpostFeedbackAnswerDto(String str, String str2) {
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
        if (!(obj instanceof NewsfeedItemWallpostFeedbackAnswerDto)) {
            return false;
        }
        NewsfeedItemWallpostFeedbackAnswerDto newsfeedItemWallpostFeedbackAnswerDto = (NewsfeedItemWallpostFeedbackAnswerDto) obj;
        return epx.f(this.title, newsfeedItemWallpostFeedbackAnswerDto.title) && epx.f(this.id, newsfeedItemWallpostFeedbackAnswerDto.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.id.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemWallpostFeedbackAnswerDto(title=");
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
