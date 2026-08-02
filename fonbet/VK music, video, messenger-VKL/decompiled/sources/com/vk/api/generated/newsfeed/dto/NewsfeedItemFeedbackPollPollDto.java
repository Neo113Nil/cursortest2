package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: NewsfeedItemFeedbackPollPollDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemFeedbackPollPollDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemFeedbackPollPollDto> CREATOR = new a();

    @pmi0("gratitude")
    private final NewsfeedItemFeedbackPollGratitudeDto gratitude;

    @pmi0("questions")
    private final List<NewsfeedItemFeedbackPollQuestionDto> questions;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedItemFeedbackPollPollDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemFeedbackPollPollDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollPollDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            NewsfeedItemFeedbackPollGratitudeDto createFromParcel = NewsfeedItemFeedbackPollGratitudeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NewsfeedItemFeedbackPollQuestionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NewsfeedItemFeedbackPollPollDto(readString, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollPollDto[] newArray(int i) {
            return new NewsfeedItemFeedbackPollPollDto[i];
        }
    }

    public NewsfeedItemFeedbackPollPollDto(String str, NewsfeedItemFeedbackPollGratitudeDto newsfeedItemFeedbackPollGratitudeDto, List<NewsfeedItemFeedbackPollQuestionDto> list) {
        this.title = str;
        this.gratitude = newsfeedItemFeedbackPollGratitudeDto;
        this.questions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollPollDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto = (NewsfeedItemFeedbackPollPollDto) obj;
        return epx.f(this.title, newsfeedItemFeedbackPollPollDto.title) && epx.f(this.gratitude, newsfeedItemFeedbackPollPollDto.gratitude) && epx.f(this.questions, newsfeedItemFeedbackPollPollDto.questions);
    }

    public final int hashCode() {
        return this.questions.hashCode() + ((this.gratitude.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollPollDto(title=");
        sb.append(this.title);
        sb.append(", gratitude=");
        sb.append(this.gratitude);
        sb.append(", questions=");
        return ms9.a(')', sb, this.questions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.gratitude.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.questions);
        while (a2.hasNext()) {
            ((NewsfeedItemFeedbackPollQuestionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
