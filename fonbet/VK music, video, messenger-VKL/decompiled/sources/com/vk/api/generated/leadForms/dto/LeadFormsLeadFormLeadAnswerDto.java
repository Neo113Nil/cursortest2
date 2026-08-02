package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LeadFormsLeadFormLeadAnswerDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsLeadFormLeadAnswerDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsLeadFormLeadAnswerDto> CREATOR = new a();

    @pmi0("answer_ids")
    private final List<String> answerIds;

    @pmi0("answer_text")
    private final String answerText;

    @pmi0("block_id")
    private final String blockId;

    /* compiled from: LeadFormsLeadFormLeadAnswerDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsLeadFormLeadAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormLeadAnswerDto createFromParcel(Parcel parcel) {
            return new LeadFormsLeadFormLeadAnswerDto(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormLeadAnswerDto[] newArray(int i) {
            return new LeadFormsLeadFormLeadAnswerDto[i];
        }
    }

    public LeadFormsLeadFormLeadAnswerDto(String str, List<String> list, String str2) {
        this.blockId = str;
        this.answerIds = list;
        this.answerText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadFormLeadAnswerDto)) {
            return false;
        }
        LeadFormsLeadFormLeadAnswerDto leadFormsLeadFormLeadAnswerDto = (LeadFormsLeadFormLeadAnswerDto) obj;
        return epx.f(this.blockId, leadFormsLeadFormLeadAnswerDto.blockId) && epx.f(this.answerIds, leadFormsLeadFormLeadAnswerDto.answerIds) && epx.f(this.answerText, leadFormsLeadFormLeadAnswerDto.answerText);
    }

    public final int hashCode() {
        int hashCode = this.blockId.hashCode() * 31;
        List<String> list = this.answerIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.answerText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsLeadFormLeadAnswerDto(blockId=");
        sb.append(this.blockId);
        sb.append(", answerIds=");
        sb.append(this.answerIds);
        sb.append(", answerText=");
        return ho8.a(sb, this.answerText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.blockId);
        parcel.writeStringList(this.answerIds);
        parcel.writeString(this.answerText);
    }

    public /* synthetic */ LeadFormsLeadFormLeadAnswerDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
