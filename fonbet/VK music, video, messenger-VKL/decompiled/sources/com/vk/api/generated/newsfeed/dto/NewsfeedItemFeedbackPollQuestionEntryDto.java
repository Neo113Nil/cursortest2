package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemFeedbackPollQuestionEntryDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemFeedbackPollQuestionEntryDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemFeedbackPollQuestionEntryDto> CREATOR = new a();

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final NewsfeedNewsfeedItemDto item;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedItemFeedbackPollQuestionEntryDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemFeedbackPollQuestionEntryDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollQuestionEntryDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemFeedbackPollQuestionEntryDto((NewsfeedNewsfeedItemDto) parcel.readParcelable(NewsfeedItemFeedbackPollQuestionEntryDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollQuestionEntryDto[] newArray(int i) {
            return new NewsfeedItemFeedbackPollQuestionEntryDto[i];
        }
    }

    public NewsfeedItemFeedbackPollQuestionEntryDto(NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, String str) {
        this.item = newsfeedNewsfeedItemDto;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionEntryDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionEntryDto newsfeedItemFeedbackPollQuestionEntryDto = (NewsfeedItemFeedbackPollQuestionEntryDto) obj;
        return epx.f(this.item, newsfeedItemFeedbackPollQuestionEntryDto.item) && epx.f(this.title, newsfeedItemFeedbackPollQuestionEntryDto.title);
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollQuestionEntryDto(item=");
        sb.append(this.item);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.item, i);
        parcel.writeString(this.title);
    }

    public /* synthetic */ NewsfeedItemFeedbackPollQuestionEntryDto(NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, String str, int i, zcl zclVar) {
        this(newsfeedNewsfeedItemDto, (i & 2) != 0 ? null : str);
    }
}
