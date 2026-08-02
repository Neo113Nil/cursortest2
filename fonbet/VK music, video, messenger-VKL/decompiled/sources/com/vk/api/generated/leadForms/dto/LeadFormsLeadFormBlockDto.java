package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: LeadFormsLeadFormBlockDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsLeadFormBlockDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsLeadFormBlockDto> CREATOR = new a();

    @pmi0("answers")
    private final List<LeadFormsLeadFormBlockAnswerOptionDto> answers;

    @pmi0("id")
    private final String id;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeadFormsLeadFormBlockDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("multiple_answers")
        public static final TypeDto MULTIPLE_ANSWERS;

        @pmi0("one_answer")
        public static final TypeDto ONE_ANSWER;

        @pmi0("text_answer")
        public static final TypeDto TEXT_ANSWER;
        private final String value;

        /* compiled from: LeadFormsLeadFormBlockDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("ONE_ANSWER", 0, "one_answer");
            ONE_ANSWER = typeDto;
            TypeDto typeDto2 = new TypeDto("MULTIPLE_ANSWERS", 1, "multiple_answers");
            MULTIPLE_ANSWERS = typeDto2;
            TypeDto typeDto3 = new TypeDto("TEXT_ANSWER", 2, "text_answer");
            TEXT_ANSWER = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: LeadFormsLeadFormBlockDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsLeadFormBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(LeadFormsLeadFormBlockAnswerOptionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new LeadFormsLeadFormBlockDto(readString, readString2, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormBlockDto[] newArray(int i) {
            return new LeadFormsLeadFormBlockDto[i];
        }
    }

    public LeadFormsLeadFormBlockDto(String str, String str2, TypeDto typeDto, List<LeadFormsLeadFormBlockAnswerOptionDto> list) {
        this.id = str;
        this.text = str2;
        this.type = typeDto;
        this.answers = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadFormBlockDto)) {
            return false;
        }
        LeadFormsLeadFormBlockDto leadFormsLeadFormBlockDto = (LeadFormsLeadFormBlockDto) obj;
        return epx.f(this.id, leadFormsLeadFormBlockDto.id) && epx.f(this.text, leadFormsLeadFormBlockDto.text) && this.type == leadFormsLeadFormBlockDto.type && epx.f(this.answers, leadFormsLeadFormBlockDto.answers);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.text)) * 31;
        List<LeadFormsLeadFormBlockAnswerOptionDto> list = this.answers;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsLeadFormBlockDto(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", answers=");
        return ms9.a(')', sb, this.answers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        this.type.writeToParcel(parcel, i);
        List<LeadFormsLeadFormBlockAnswerOptionDto> list = this.answers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((LeadFormsLeadFormBlockAnswerOptionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ LeadFormsLeadFormBlockDto(String str, String str2, TypeDto typeDto, List list, int i, zcl zclVar) {
        this(str, str2, typeDto, (i & 8) != 0 ? null : list);
    }
}
