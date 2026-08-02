package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetAssistantGreetingDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetAssistantGreetingDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetAssistantGreetingDto> CREATOR = new a();

    @pmi0("from")
    private final Integer from;

    @pmi0("text")
    private final String text;

    @pmi0("to")
    private final Integer to;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppWidgetAssistantGreetingDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("primary")
        public static final TypeDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final TypeDto SECONDARY;
        private final String value;

        /* compiled from: SuperAppWidgetAssistantGreetingDto.kt */
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
            TypeDto typeDto = new TypeDto("PRIMARY", 0, "primary");
            PRIMARY = typeDto;
            TypeDto typeDto2 = new TypeDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: SuperAppWidgetAssistantGreetingDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetAssistantGreetingDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetAssistantGreetingDto createFromParcel(Parcel parcel) {
            return new SuperAppWidgetAssistantGreetingDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetAssistantGreetingDto[] newArray(int i) {
            return new SuperAppWidgetAssistantGreetingDto[i];
        }
    }

    public SuperAppWidgetAssistantGreetingDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetAssistantGreetingDto)) {
            return false;
        }
        SuperAppWidgetAssistantGreetingDto superAppWidgetAssistantGreetingDto = (SuperAppWidgetAssistantGreetingDto) obj;
        return epx.f(this.from, superAppWidgetAssistantGreetingDto.from) && epx.f(this.to, superAppWidgetAssistantGreetingDto.to) && this.type == superAppWidgetAssistantGreetingDto.type && epx.f(this.text, superAppWidgetAssistantGreetingDto.text);
    }

    public final int hashCode() {
        Integer num = this.from;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.to;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode3 = (hashCode2 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str = this.text;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetAssistantGreetingDto(from=");
        sb.append(this.from);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.from;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.to;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.text);
    }

    public SuperAppWidgetAssistantGreetingDto(Integer num, Integer num2, TypeDto typeDto, String str) {
        this.from = num;
        this.to = num2;
        this.type = typeDto;
        this.text = str;
    }

    public /* synthetic */ SuperAppWidgetAssistantGreetingDto(Integer num, Integer num2, TypeDto typeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : typeDto, (i & 8) != 0 ? null : str);
    }
}
