package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedItemFeedbackPollQuestionDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemFeedbackPollQuestionDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemFeedbackPollQuestionDto> CREATOR = new a();

    @pmi0("answers")
    private final List<NewsfeedItemFeedbackPollQuestionAnswerDto> answers;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("entries")
    private final List<NewsfeedItemFeedbackPollQuestionEntryDto> entries;

    @pmi0("next_button_text")
    private final String nextButtonText;

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedItemFeedbackPollQuestionDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemFeedbackPollQuestionDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollQuestionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NewsfeedItemFeedbackPollQuestionAnswerDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i2 != readInt2) {
                i2 = en.a(NewsfeedItemFeedbackPollQuestionEntryDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new NewsfeedItemFeedbackPollQuestionDto(readString, readString2, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFeedbackPollQuestionDto[] newArray(int i) {
            return new NewsfeedItemFeedbackPollQuestionDto[i];
        }
    }

    public NewsfeedItemFeedbackPollQuestionDto(String str, String str2, List<NewsfeedItemFeedbackPollQuestionAnswerDto> list, List<NewsfeedItemFeedbackPollQuestionEntryDto> list2, String str3) {
        this.text = str;
        this.nextButtonText = str2;
        this.answers = list;
        this.entries = list2;
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
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionDto)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionDto newsfeedItemFeedbackPollQuestionDto = (NewsfeedItemFeedbackPollQuestionDto) obj;
        return epx.f(this.text, newsfeedItemFeedbackPollQuestionDto.text) && epx.f(this.nextButtonText, newsfeedItemFeedbackPollQuestionDto.nextButtonText) && epx.f(this.answers, newsfeedItemFeedbackPollQuestionDto.answers) && epx.f(this.entries, newsfeedItemFeedbackPollQuestionDto.entries) && epx.f(this.buttonText, newsfeedItemFeedbackPollQuestionDto.buttonText);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(urd0.a(this.text.hashCode() * 31, 31, this.nextButtonText), 31, this.answers), 31, this.entries);
        String str = this.buttonText;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollQuestionDto(text=");
        sb.append(this.text);
        sb.append(", nextButtonText=");
        sb.append(this.nextButtonText);
        sb.append(", answers=");
        sb.append(this.answers);
        sb.append(", entries=");
        sb.append(this.entries);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.nextButtonText);
        Iterator a2 = ao.a(parcel, this.answers);
        while (a2.hasNext()) {
            ((NewsfeedItemFeedbackPollQuestionAnswerDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.entries);
        while (a3.hasNext()) {
            ((NewsfeedItemFeedbackPollQuestionEntryDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.buttonText);
    }

    public /* synthetic */ NewsfeedItemFeedbackPollQuestionDto(String str, String str2, List list, List list2, String str3, int i, zcl zclVar) {
        this(str, str2, list, list2, (i & 16) != 0 ? null : str3);
    }
}
