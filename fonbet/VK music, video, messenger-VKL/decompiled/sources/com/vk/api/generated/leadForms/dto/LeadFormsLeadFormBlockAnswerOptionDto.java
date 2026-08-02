package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LeadFormsLeadFormBlockAnswerOptionDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsLeadFormBlockAnswerOptionDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsLeadFormBlockAnswerOptionDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("text")
    private final String text;

    /* compiled from: LeadFormsLeadFormBlockAnswerOptionDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsLeadFormBlockAnswerOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormBlockAnswerOptionDto createFromParcel(Parcel parcel) {
            return new LeadFormsLeadFormBlockAnswerOptionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormBlockAnswerOptionDto[] newArray(int i) {
            return new LeadFormsLeadFormBlockAnswerOptionDto[i];
        }
    }

    public LeadFormsLeadFormBlockAnswerOptionDto(String str, String str2) {
        this.id = str;
        this.text = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadFormBlockAnswerOptionDto)) {
            return false;
        }
        LeadFormsLeadFormBlockAnswerOptionDto leadFormsLeadFormBlockAnswerOptionDto = (LeadFormsLeadFormBlockAnswerOptionDto) obj;
        return epx.f(this.id, leadFormsLeadFormBlockAnswerOptionDto.id) && epx.f(this.text, leadFormsLeadFormBlockAnswerOptionDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsLeadFormBlockAnswerOptionDto(id=");
        sb.append(this.id);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
    }
}
