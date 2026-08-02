package com.vk.api.generated.questions.dto;

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
import xsna.zcl;

/* compiled from: QuestionsGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class QuestionsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<QuestionsGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<QuestionsQuestionDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: QuestionsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<QuestionsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final QuestionsGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(QuestionsQuestionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new QuestionsGetResponseDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionsGetResponseDto[] newArray(int i) {
            return new QuestionsGetResponseDto[i];
        }
    }

    public QuestionsGetResponseDto(int i, List<QuestionsQuestionDto> list, String str) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionsGetResponseDto)) {
            return false;
        }
        QuestionsGetResponseDto questionsGetResponseDto = (QuestionsGetResponseDto) obj;
        return this.count == questionsGetResponseDto.count && epx.f(this.items, questionsGetResponseDto.items) && epx.f(this.nextFrom, questionsGetResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionsGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((QuestionsQuestionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ QuestionsGetResponseDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
