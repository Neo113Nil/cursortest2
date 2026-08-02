package com.vk.api.generated.feedbacks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FeedbacksFeedbackQuestionStarsLayoutDto.kt */
/* loaded from: classes14.dex */
public final class FeedbacksFeedbackQuestionStarsLayoutDto implements Parcelable {
    public static final Parcelable.Creator<FeedbacksFeedbackQuestionStarsLayoutDto> CREATOR = new a();

    @pmi0("dislike")
    private final String dislike;

    @pmi0("like")
    private final String like;

    @pmi0("text")
    private final String text;

    /* compiled from: FeedbacksFeedbackQuestionStarsLayoutDto.kt */
    public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionStarsLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionStarsLayoutDto createFromParcel(Parcel parcel) {
            return new FeedbacksFeedbackQuestionStarsLayoutDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionStarsLayoutDto[] newArray(int i) {
            return new FeedbacksFeedbackQuestionStarsLayoutDto[i];
        }
    }

    public FeedbacksFeedbackQuestionStarsLayoutDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbacksFeedbackQuestionStarsLayoutDto)) {
            return false;
        }
        FeedbacksFeedbackQuestionStarsLayoutDto feedbacksFeedbackQuestionStarsLayoutDto = (FeedbacksFeedbackQuestionStarsLayoutDto) obj;
        return epx.f(this.text, feedbacksFeedbackQuestionStarsLayoutDto.text) && epx.f(this.like, feedbacksFeedbackQuestionStarsLayoutDto.like) && epx.f(this.dislike, feedbacksFeedbackQuestionStarsLayoutDto.dislike);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.like;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dislike;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionStarsLayoutDto(text=");
        sb.append(this.text);
        sb.append(", like=");
        sb.append(this.like);
        sb.append(", dislike=");
        return ho8.a(sb, this.dislike, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.like);
        parcel.writeString(this.dislike);
    }

    public FeedbacksFeedbackQuestionStarsLayoutDto(String str, String str2, String str3) {
        this.text = str;
        this.like = str2;
        this.dislike = str3;
    }

    public /* synthetic */ FeedbacksFeedbackQuestionStarsLayoutDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
