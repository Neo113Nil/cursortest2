package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsEditSettingsActionButtonParamItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEditSettingsActionButtonParamItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEditSettingsActionButtonParamItemDto> CREATOR = new a();

    @pmi0("hint")
    private final String hint;

    @pmi0("key")
    private final String key;

    @pmi0("selector_values")
    private final List<GroupsEditSettingsActionButtonParamSelectorValueItemDto> selectorValues;

    @pmi0("text_value")
    private final String textValue;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsEditSettingsActionButtonParamItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("email")
        public static final TypeDto EMAIL;

        @pmi0("number")
        public static final TypeDto NUMBER;

        @pmi0("selector")
        public static final TypeDto SELECTOR;

        @pmi0("tel")
        public static final TypeDto TEL;

        @pmi0("text")
        public static final TypeDto TEXT;
        private final String value;

        /* compiled from: GroupsEditSettingsActionButtonParamItemDto.kt */
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
            TypeDto typeDto = new TypeDto("SELECTOR", 0, "selector");
            SELECTOR = typeDto;
            TypeDto typeDto2 = new TypeDto("TEXT", 1, "text");
            TEXT = typeDto2;
            TypeDto typeDto3 = new TypeDto("TEL", 2, "tel");
            TEL = typeDto3;
            TypeDto typeDto4 = new TypeDto("NUMBER", 3, "number");
            NUMBER = typeDto4;
            TypeDto typeDto5 = new TypeDto(CommonConstant.RETKEY.EMAIL, 4, "email");
            EMAIL = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

    /* compiled from: GroupsEditSettingsActionButtonParamItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEditSettingsActionButtonParamItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonParamItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsEditSettingsActionButtonParamSelectorValueItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsEditSettingsActionButtonParamItemDto(readString, readString2, createFromParcel, readString3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEditSettingsActionButtonParamItemDto[] newArray(int i) {
            return new GroupsEditSettingsActionButtonParamItemDto[i];
        }
    }

    public GroupsEditSettingsActionButtonParamItemDto(String str, String str2, TypeDto typeDto, String str3, List<GroupsEditSettingsActionButtonParamSelectorValueItemDto> list, String str4) {
        this.key = str;
        this.title = str2;
        this.type = typeDto;
        this.hint = str3;
        this.selectorValues = list;
        this.textValue = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsEditSettingsActionButtonParamItemDto)) {
            return false;
        }
        GroupsEditSettingsActionButtonParamItemDto groupsEditSettingsActionButtonParamItemDto = (GroupsEditSettingsActionButtonParamItemDto) obj;
        return epx.f(this.key, groupsEditSettingsActionButtonParamItemDto.key) && epx.f(this.title, groupsEditSettingsActionButtonParamItemDto.title) && this.type == groupsEditSettingsActionButtonParamItemDto.type && epx.f(this.hint, groupsEditSettingsActionButtonParamItemDto.hint) && epx.f(this.selectorValues, groupsEditSettingsActionButtonParamItemDto.selectorValues) && epx.f(this.textValue, groupsEditSettingsActionButtonParamItemDto.textValue);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(this.key.hashCode() * 31, 31, this.title)) * 31;
        String str = this.hint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsEditSettingsActionButtonParamSelectorValueItemDto> list = this.selectorValues;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.textValue;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEditSettingsActionButtonParamItemDto(key=");
        sb.append(this.key);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", selectorValues=");
        sb.append(this.selectorValues);
        sb.append(", textValue=");
        return ho8.a(sb, this.textValue, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.hint);
        List<GroupsEditSettingsActionButtonParamSelectorValueItemDto> list = this.selectorValues;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsEditSettingsActionButtonParamSelectorValueItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.textValue);
    }

    public /* synthetic */ GroupsEditSettingsActionButtonParamItemDto(String str, String str2, TypeDto typeDto, String str3, List list, String str4, int i, zcl zclVar) {
        this(str, str2, typeDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4);
    }
}
