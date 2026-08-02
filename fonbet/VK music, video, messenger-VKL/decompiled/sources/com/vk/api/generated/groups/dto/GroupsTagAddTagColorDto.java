package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsTagAddTagColorDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTagAddTagColorDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsTagAddTagColorDto[] $VALUES;

    @pmi0("a162de")
    public static final GroupsTagAddTagColorDto A162DE;

    @pmi0("aaaeb3")
    public static final GroupsTagAddTagColorDto AAAEB3;

    @pmi0("bbaa84")
    public static final GroupsTagAddTagColorDto BBAA84;
    public static final Parcelable.Creator<GroupsTagAddTagColorDto> CREATOR;

    @pmi0("e64646")
    public static final GroupsTagAddTagColorDto E64646;

    @pmi0("ff5c5c")
    public static final GroupsTagAddTagColorDto FF5C5C;

    @pmi0("ffa000")
    public static final GroupsTagAddTagColorDto FFA000;

    @pmi0("ffc107")
    public static final GroupsTagAddTagColorDto FFC107;

    @pmi0("454647")
    public static final GroupsTagAddTagColorDto TYPE_454647;

    @pmi0("45678f")
    public static final GroupsTagAddTagColorDto TYPE_45678F;

    @pmi0("4bb34b")
    public static final GroupsTagAddTagColorDto TYPE_4BB34B;

    @pmi0("5181b8")
    public static final GroupsTagAddTagColorDto TYPE_5181B8;

    @pmi0("539b9c")
    public static final GroupsTagAddTagColorDto TYPE_539B9C;

    @pmi0("5c9ce6")
    public static final GroupsTagAddTagColorDto TYPE_5C9CE6;

    @pmi0("63b9ba")
    public static final GroupsTagAddTagColorDto TYPE_63B9BA;

    @pmi0("6bc76b")
    public static final GroupsTagAddTagColorDto TYPE_6BC76B;

    @pmi0("76787a")
    public static final GroupsTagAddTagColorDto TYPE_76787A;

    @pmi0("792ec0")
    public static final GroupsTagAddTagColorDto TYPE_792EC0;

    @pmi0("7a6c4f")
    public static final GroupsTagAddTagColorDto TYPE_7A6C4F;

    @pmi0("7ececf")
    public static final GroupsTagAddTagColorDto TYPE_7ECECF;

    @pmi0("9e8d6b")
    public static final GroupsTagAddTagColorDto TYPE_9E8D6B;
    private final String value;

    /* compiled from: GroupsTagAddTagColorDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTagAddTagColorDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTagAddTagColorDto createFromParcel(Parcel parcel) {
            return GroupsTagAddTagColorDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTagAddTagColorDto[] newArray(int i) {
            return new GroupsTagAddTagColorDto[i];
        }
    }

    static {
        GroupsTagAddTagColorDto groupsTagAddTagColorDto = new GroupsTagAddTagColorDto("TYPE_454647", 0, "454647");
        TYPE_454647 = groupsTagAddTagColorDto;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto2 = new GroupsTagAddTagColorDto("TYPE_45678F", 1, "45678f");
        TYPE_45678F = groupsTagAddTagColorDto2;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto3 = new GroupsTagAddTagColorDto("TYPE_4BB34B", 2, "4bb34b");
        TYPE_4BB34B = groupsTagAddTagColorDto3;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto4 = new GroupsTagAddTagColorDto("TYPE_5181B8", 3, "5181b8");
        TYPE_5181B8 = groupsTagAddTagColorDto4;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto5 = new GroupsTagAddTagColorDto("TYPE_539B9C", 4, "539b9c");
        TYPE_539B9C = groupsTagAddTagColorDto5;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto6 = new GroupsTagAddTagColorDto("TYPE_5C9CE6", 5, "5c9ce6");
        TYPE_5C9CE6 = groupsTagAddTagColorDto6;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto7 = new GroupsTagAddTagColorDto("TYPE_63B9BA", 6, "63b9ba");
        TYPE_63B9BA = groupsTagAddTagColorDto7;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto8 = new GroupsTagAddTagColorDto("TYPE_6BC76B", 7, "6bc76b");
        TYPE_6BC76B = groupsTagAddTagColorDto8;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto9 = new GroupsTagAddTagColorDto("TYPE_76787A", 8, "76787a");
        TYPE_76787A = groupsTagAddTagColorDto9;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto10 = new GroupsTagAddTagColorDto("TYPE_792EC0", 9, "792ec0");
        TYPE_792EC0 = groupsTagAddTagColorDto10;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto11 = new GroupsTagAddTagColorDto("TYPE_7A6C4F", 10, "7a6c4f");
        TYPE_7A6C4F = groupsTagAddTagColorDto11;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto12 = new GroupsTagAddTagColorDto("TYPE_7ECECF", 11, "7ececf");
        TYPE_7ECECF = groupsTagAddTagColorDto12;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto13 = new GroupsTagAddTagColorDto("TYPE_9E8D6B", 12, "9e8d6b");
        TYPE_9E8D6B = groupsTagAddTagColorDto13;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto14 = new GroupsTagAddTagColorDto("A162DE", 13, "a162de");
        A162DE = groupsTagAddTagColorDto14;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto15 = new GroupsTagAddTagColorDto("AAAEB3", 14, "aaaeb3");
        AAAEB3 = groupsTagAddTagColorDto15;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto16 = new GroupsTagAddTagColorDto("BBAA84", 15, "bbaa84");
        BBAA84 = groupsTagAddTagColorDto16;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto17 = new GroupsTagAddTagColorDto("E64646", 16, "e64646");
        E64646 = groupsTagAddTagColorDto17;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto18 = new GroupsTagAddTagColorDto("FF5C5C", 17, "ff5c5c");
        FF5C5C = groupsTagAddTagColorDto18;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto19 = new GroupsTagAddTagColorDto("FFA000", 18, "ffa000");
        FFA000 = groupsTagAddTagColorDto19;
        GroupsTagAddTagColorDto groupsTagAddTagColorDto20 = new GroupsTagAddTagColorDto("FFC107", 19, "ffc107");
        FFC107 = groupsTagAddTagColorDto20;
        GroupsTagAddTagColorDto[] groupsTagAddTagColorDtoArr = {groupsTagAddTagColorDto, groupsTagAddTagColorDto2, groupsTagAddTagColorDto3, groupsTagAddTagColorDto4, groupsTagAddTagColorDto5, groupsTagAddTagColorDto6, groupsTagAddTagColorDto7, groupsTagAddTagColorDto8, groupsTagAddTagColorDto9, groupsTagAddTagColorDto10, groupsTagAddTagColorDto11, groupsTagAddTagColorDto12, groupsTagAddTagColorDto13, groupsTagAddTagColorDto14, groupsTagAddTagColorDto15, groupsTagAddTagColorDto16, groupsTagAddTagColorDto17, groupsTagAddTagColorDto18, groupsTagAddTagColorDto19, groupsTagAddTagColorDto20};
        $VALUES = groupsTagAddTagColorDtoArr;
        $ENTRIES = new asp(groupsTagAddTagColorDtoArr);
        CREATOR = new a();
    }

    private GroupsTagAddTagColorDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsTagAddTagColorDto valueOf(String str) {
        return (GroupsTagAddTagColorDto) Enum.valueOf(GroupsTagAddTagColorDto.class, str);
    }

    public static GroupsTagAddTagColorDto[] values() {
        return (GroupsTagAddTagColorDto[]) $VALUES.clone();
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
