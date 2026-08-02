package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsGroupTagDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupTagDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupTagDto> CREATOR = new a();

    @pmi0("bit")
    private final Integer bit;

    @pmi0("color")
    private final ColorDto color;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("uses")
    private final Integer uses;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsGroupTagDto.kt */
    public static final class ColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorDto[] $VALUES;

        @pmi0("a162de")
        public static final ColorDto A162DE;

        @pmi0("aaaeb3")
        public static final ColorDto AAAEB3;

        @pmi0("bbaa84")
        public static final ColorDto BBAA84;
        public static final Parcelable.Creator<ColorDto> CREATOR;

        @pmi0("e64646")
        public static final ColorDto E64646;

        @pmi0("ff5c5c")
        public static final ColorDto FF5C5C;

        @pmi0("ffa000")
        public static final ColorDto FFA000;

        @pmi0("ffc107")
        public static final ColorDto FFC107;

        @pmi0("454647")
        public static final ColorDto TYPE_454647;

        @pmi0("45678f")
        public static final ColorDto TYPE_45678F;

        @pmi0("4bb34b")
        public static final ColorDto TYPE_4BB34B;

        @pmi0("5181b8")
        public static final ColorDto TYPE_5181B8;

        @pmi0("539b9c")
        public static final ColorDto TYPE_539B9C;

        @pmi0("5c9ce6")
        public static final ColorDto TYPE_5C9CE6;

        @pmi0("63b9ba")
        public static final ColorDto TYPE_63B9BA;

        @pmi0("6bc76b")
        public static final ColorDto TYPE_6BC76B;

        @pmi0("76787a")
        public static final ColorDto TYPE_76787A;

        @pmi0("792ec0")
        public static final ColorDto TYPE_792EC0;

        @pmi0("7a6c4f")
        public static final ColorDto TYPE_7A6C4F;

        @pmi0("7ececf")
        public static final ColorDto TYPE_7ECECF;

        @pmi0("9e8d6b")
        public static final ColorDto TYPE_9E8D6B;
        private final String value;

        /* compiled from: GroupsGroupTagDto.kt */
        public static final class a implements Parcelable.Creator<ColorDto> {
            @Override // android.os.Parcelable.Creator
            public final ColorDto createFromParcel(Parcel parcel) {
                return ColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ColorDto[] newArray(int i) {
                return new ColorDto[i];
            }
        }

        static {
            ColorDto colorDto = new ColorDto("TYPE_454647", 0, "454647");
            TYPE_454647 = colorDto;
            ColorDto colorDto2 = new ColorDto("TYPE_45678F", 1, "45678f");
            TYPE_45678F = colorDto2;
            ColorDto colorDto3 = new ColorDto("TYPE_4BB34B", 2, "4bb34b");
            TYPE_4BB34B = colorDto3;
            ColorDto colorDto4 = new ColorDto("TYPE_5181B8", 3, "5181b8");
            TYPE_5181B8 = colorDto4;
            ColorDto colorDto5 = new ColorDto("TYPE_539B9C", 4, "539b9c");
            TYPE_539B9C = colorDto5;
            ColorDto colorDto6 = new ColorDto("TYPE_5C9CE6", 5, "5c9ce6");
            TYPE_5C9CE6 = colorDto6;
            ColorDto colorDto7 = new ColorDto("TYPE_63B9BA", 6, "63b9ba");
            TYPE_63B9BA = colorDto7;
            ColorDto colorDto8 = new ColorDto("TYPE_6BC76B", 7, "6bc76b");
            TYPE_6BC76B = colorDto8;
            ColorDto colorDto9 = new ColorDto("TYPE_76787A", 8, "76787a");
            TYPE_76787A = colorDto9;
            ColorDto colorDto10 = new ColorDto("TYPE_792EC0", 9, "792ec0");
            TYPE_792EC0 = colorDto10;
            ColorDto colorDto11 = new ColorDto("TYPE_7A6C4F", 10, "7a6c4f");
            TYPE_7A6C4F = colorDto11;
            ColorDto colorDto12 = new ColorDto("TYPE_7ECECF", 11, "7ececf");
            TYPE_7ECECF = colorDto12;
            ColorDto colorDto13 = new ColorDto("TYPE_9E8D6B", 12, "9e8d6b");
            TYPE_9E8D6B = colorDto13;
            ColorDto colorDto14 = new ColorDto("A162DE", 13, "a162de");
            A162DE = colorDto14;
            ColorDto colorDto15 = new ColorDto("AAAEB3", 14, "aaaeb3");
            AAAEB3 = colorDto15;
            ColorDto colorDto16 = new ColorDto("BBAA84", 15, "bbaa84");
            BBAA84 = colorDto16;
            ColorDto colorDto17 = new ColorDto("E64646", 16, "e64646");
            E64646 = colorDto17;
            ColorDto colorDto18 = new ColorDto("FF5C5C", 17, "ff5c5c");
            FF5C5C = colorDto18;
            ColorDto colorDto19 = new ColorDto("FFA000", 18, "ffa000");
            FFA000 = colorDto19;
            ColorDto colorDto20 = new ColorDto("FFC107", 19, "ffc107");
            FFC107 = colorDto20;
            ColorDto[] colorDtoArr = {colorDto, colorDto2, colorDto3, colorDto4, colorDto5, colorDto6, colorDto7, colorDto8, colorDto9, colorDto10, colorDto11, colorDto12, colorDto13, colorDto14, colorDto15, colorDto16, colorDto17, colorDto18, colorDto19, colorDto20};
            $VALUES = colorDtoArr;
            $ENTRIES = new asp(colorDtoArr);
            CREATOR = new a();
        }

        private ColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ColorDto valueOf(String str) {
            return (ColorDto) Enum.valueOf(ColorDto.class, str);
        }

        public static ColorDto[] values() {
            return (ColorDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: GroupsGroupTagDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupTagDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupTagDto createFromParcel(Parcel parcel) {
            return new GroupsGroupTagDto(parcel.readInt(), parcel.readString(), ColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupTagDto[] newArray(int i) {
            return new GroupsGroupTagDto[i];
        }
    }

    public GroupsGroupTagDto(int i, String str, ColorDto colorDto, Integer num, Integer num2) {
        this.id = i;
        this.name = str;
        this.color = colorDto;
        this.bit = num;
        this.uses = num2;
    }

    public final ColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupTagDto)) {
            return false;
        }
        GroupsGroupTagDto groupsGroupTagDto = (GroupsGroupTagDto) obj;
        return this.id == groupsGroupTagDto.id && epx.f(this.name, groupsGroupTagDto.name) && this.color == groupsGroupTagDto.color && epx.f(this.bit, groupsGroupTagDto.bit) && epx.f(this.uses, groupsGroupTagDto.uses);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.color.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name)) * 31;
        Integer num = this.bit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.uses;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupTagDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", bit=");
        sb.append(this.bit);
        sb.append(", uses=");
        return uqi.b(sb, this.uses, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        this.color.writeToParcel(parcel, i);
        Integer num = this.bit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.uses;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ GroupsGroupTagDto(int i, String str, ColorDto colorDto, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, str, colorDto, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }
}
