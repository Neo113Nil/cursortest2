package com.vk.api.generated.feedbacks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FeedbacksFeedbackDto.kt */
/* loaded from: classes14.dex */
public final class FeedbacksFeedbackDto implements Parcelable {
    public static final Parcelable.Creator<FeedbacksFeedbackDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final FeedbacksFeedbackLayoutDto layout;

    @pmi0("questions")
    private final List<FeedbacksFeedbackQuestionDto> questions;

    @pmi0("start_question_code")
    private final String startQuestionCode;

    /* compiled from: FeedbacksFeedbackDto.kt */
    public static final class a implements Parcelable.Creator<FeedbacksFeedbackDto> {
        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(FeedbacksFeedbackDto.class, parcel, arrayList, i, 1);
            }
            return new FeedbacksFeedbackDto(readString, readString2, arrayList, parcel.readInt() == 0 ? null : FeedbacksFeedbackLayoutDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackDto[] newArray(int i) {
            return new FeedbacksFeedbackDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbacksFeedbackDto(String str, String str2, List<? extends FeedbacksFeedbackQuestionDto> list, FeedbacksFeedbackLayoutDto feedbacksFeedbackLayoutDto) {
        this.id = str;
        this.startQuestionCode = str2;
        this.questions = list;
        this.layout = feedbacksFeedbackLayoutDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbacksFeedbackDto)) {
            return false;
        }
        FeedbacksFeedbackDto feedbacksFeedbackDto = (FeedbacksFeedbackDto) obj;
        return epx.f(this.id, feedbacksFeedbackDto.id) && epx.f(this.startQuestionCode, feedbacksFeedbackDto.startQuestionCode) && epx.f(this.questions, feedbacksFeedbackDto.questions) && epx.f(this.layout, feedbacksFeedbackDto.layout);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.id.hashCode() * 31, 31, this.startQuestionCode), 31, this.questions);
        FeedbacksFeedbackLayoutDto feedbacksFeedbackLayoutDto = this.layout;
        return a2 + (feedbacksFeedbackLayoutDto == null ? 0 : feedbacksFeedbackLayoutDto.hashCode());
    }

    public final String toString() {
        return "FeedbacksFeedbackDto(id=" + this.id + ", startQuestionCode=" + this.startQuestionCode + ", questions=" + this.questions + ", layout=" + this.layout + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.startQuestionCode);
        Iterator a2 = ao.a(parcel, this.questions);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        FeedbacksFeedbackLayoutDto feedbacksFeedbackLayoutDto = this.layout;
        if (feedbacksFeedbackLayoutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbacksFeedbackLayoutDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FeedbacksFeedbackDto(String str, String str2, List list, FeedbacksFeedbackLayoutDto feedbacksFeedbackLayoutDto, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : feedbacksFeedbackLayoutDto);
    }
}
