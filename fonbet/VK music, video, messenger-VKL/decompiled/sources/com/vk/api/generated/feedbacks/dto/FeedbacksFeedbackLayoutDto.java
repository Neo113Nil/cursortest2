package com.vk.api.generated.feedbacks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FeedbacksFeedbackLayoutDto.kt */
/* loaded from: classes14.dex */
public final class FeedbacksFeedbackLayoutDto implements Parcelable {
    public static final Parcelable.Creator<FeedbacksFeedbackLayoutDto> CREATOR = new a();

    @pmi0("completion_text")
    private final String completionText;

    @pmi0("completion_title")
    private final String completionTitle;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: FeedbacksFeedbackLayoutDto.kt */
    public static final class a implements Parcelable.Creator<FeedbacksFeedbackLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackLayoutDto createFromParcel(Parcel parcel) {
            return new FeedbacksFeedbackLayoutDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackLayoutDto[] newArray(int i) {
            return new FeedbacksFeedbackLayoutDto[i];
        }
    }

    public FeedbacksFeedbackLayoutDto() {
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
        if (!(obj instanceof FeedbacksFeedbackLayoutDto)) {
            return false;
        }
        FeedbacksFeedbackLayoutDto feedbacksFeedbackLayoutDto = (FeedbacksFeedbackLayoutDto) obj;
        return epx.f(this.title, feedbacksFeedbackLayoutDto.title) && epx.f(this.text, feedbacksFeedbackLayoutDto.text) && epx.f(this.completionTitle, feedbacksFeedbackLayoutDto.completionTitle) && epx.f(this.completionText, feedbacksFeedbackLayoutDto.completionText);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.completionTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.completionText;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbacksFeedbackLayoutDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", completionTitle=");
        sb.append(this.completionTitle);
        sb.append(", completionText=");
        return ho8.a(sb, this.completionText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.completionTitle);
        parcel.writeString(this.completionText);
    }

    public FeedbacksFeedbackLayoutDto(String str, String str2, String str3, String str4) {
        this.title = str;
        this.text = str2;
        this.completionTitle = str3;
        this.completionText = str4;
    }

    public /* synthetic */ FeedbacksFeedbackLayoutDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
