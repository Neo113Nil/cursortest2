package com.vk.api.generated.uxpolls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxpollsAnswerDto.kt */
/* loaded from: classes15.dex */
public final class UxpollsAnswerDto implements Parcelable {
    public static final Parcelable.Creator<UxpollsAnswerDto> CREATOR = new a();

    @pmi0("numeric")
    private final List<Integer> numeric;

    @pmi0("question_id")
    private final int questionId;

    @pmi0("text")
    private final String text;

    /* compiled from: UxpollsAnswerDto.kt */
    public static final class a implements Parcelable.Creator<UxpollsAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final UxpollsAnswerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UxpollsAnswerDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UxpollsAnswerDto[] newArray(int i) {
            return new UxpollsAnswerDto[i];
        }
    }

    public UxpollsAnswerDto(int i, List<Integer> list, String str) {
        this.questionId = i;
        this.numeric = list;
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxpollsAnswerDto)) {
            return false;
        }
        UxpollsAnswerDto uxpollsAnswerDto = (UxpollsAnswerDto) obj;
        return this.questionId == uxpollsAnswerDto.questionId && epx.f(this.numeric, uxpollsAnswerDto.numeric) && epx.f(this.text, uxpollsAnswerDto.text);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.questionId) * 31;
        List<Integer> list = this.numeric;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.text;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxpollsAnswerDto(questionId=");
        sb.append(this.questionId);
        sb.append(", numeric=");
        sb.append(this.numeric);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.questionId);
        List<Integer> list = this.numeric;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.text);
    }

    public /* synthetic */ UxpollsAnswerDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : str);
    }
}
