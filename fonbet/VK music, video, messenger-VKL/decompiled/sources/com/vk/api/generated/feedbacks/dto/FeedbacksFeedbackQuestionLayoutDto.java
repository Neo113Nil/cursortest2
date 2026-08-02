package com.vk.api.generated.feedbacks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FeedbacksFeedbackQuestionLayoutDto.kt */
/* loaded from: classes14.dex */
public final class FeedbacksFeedbackQuestionLayoutDto implements Parcelable {
    public static final Parcelable.Creator<FeedbacksFeedbackQuestionLayoutDto> CREATOR = new a();

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("text")
    private final String text;

    /* compiled from: FeedbacksFeedbackQuestionLayoutDto.kt */
    public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionLayoutDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FeedbacksFeedbackQuestionLayoutDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FeedbacksFeedbackQuestionLayoutDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbacksFeedbackQuestionLayoutDto[] newArray(int i) {
            return new FeedbacksFeedbackQuestionLayoutDto[i];
        }
    }

    public FeedbacksFeedbackQuestionLayoutDto(String str, List<BaseImageDto> list) {
        this.text = str;
        this.image = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbacksFeedbackQuestionLayoutDto)) {
            return false;
        }
        FeedbacksFeedbackQuestionLayoutDto feedbacksFeedbackQuestionLayoutDto = (FeedbacksFeedbackQuestionLayoutDto) obj;
        return epx.f(this.text, feedbacksFeedbackQuestionLayoutDto.text) && epx.f(this.image, feedbacksFeedbackQuestionLayoutDto.image);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List<BaseImageDto> list = this.image;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionLayoutDto(text=");
        sb.append(this.text);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ FeedbacksFeedbackQuestionLayoutDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
