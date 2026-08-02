package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountPrivacySettingDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacySettingDto implements Parcelable {
    public static final Parcelable.Creator<AccountPrivacySettingDto> CREATOR = new a();

    @pmi0("all_categories")
    private final List<AccountPrivacyValueDto> allCategories;

    @pmi0("description")
    private final String description;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("key")
    private final String key;

    @pmi0("nested_description")
    private final String nestedDescription;

    @pmi0("nested_items")
    private final List<AccountPrivacySettingsDto> nestedItems;

    @pmi0("parent_categories")
    private final List<AccountPrivacyValueDto> parentCategories;

    @pmi0("section")
    private final String section;

    @pmi0("supported_categories")
    private final List<AccountPrivacyValueDto> supportedCategories;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("value")
    private final AccountPrivacySettingValueDto value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountPrivacySettingDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;

        @pmi0("account_privacy_setting")
        public static final InnerTypeDto ACCOUNT_PRIVACY_SETTING;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;
        private final String value;

        /* compiled from: AccountPrivacySettingDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("ACCOUNT_PRIVACY_SETTING", 0, "account_privacy_setting");
            ACCOUNT_PRIVACY_SETTING = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountPrivacySettingDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(BuildConfig.SDK_DEPENDENCY)
        public static final TypeDto BINARY;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("list")
        public static final TypeDto LIST;
        private final String value;

        /* compiled from: AccountPrivacySettingDto.kt */
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
            TypeDto typeDto = new TypeDto("LIST", 0, "list");
            LIST = typeDto;
            TypeDto typeDto2 = new TypeDto("BINARY", 1, BuildConfig.SDK_DEPENDENCY);
            BINARY = typeDto2;
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

    /* compiled from: AccountPrivacySettingDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacySettingDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySettingDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AccountPrivacySettingValueDto accountPrivacySettingValueDto = (AccountPrivacySettingValueDto) parcel.readParcelable(AccountPrivacySettingDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AccountPrivacyValueDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(AccountPrivacyValueDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            TypeDto createFromParcel2 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(AccountPrivacySettingsDto.CREATOR, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(AccountPrivacyValueDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new AccountPrivacySettingDto(createFromParcel, readString, readString2, accountPrivacySettingValueDto, arrayList4, readString3, arrayList, createFromParcel2, arrayList2, arrayList3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySettingDto[] newArray(int i) {
            return new AccountPrivacySettingDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPrivacySettingDto(InnerTypeDto innerTypeDto, String str, String str2, AccountPrivacySettingValueDto accountPrivacySettingValueDto, List<? extends AccountPrivacyValueDto> list, String str3, List<? extends AccountPrivacyValueDto> list2, TypeDto typeDto, List<AccountPrivacySettingsDto> list3, List<? extends AccountPrivacyValueDto> list4, String str4, String str5) {
        this.innerType = innerTypeDto;
        this.key = str;
        this.title = str2;
        this.value = accountPrivacySettingValueDto;
        this.supportedCategories = list;
        this.section = str3;
        this.allCategories = list2;
        this.type = typeDto;
        this.nestedItems = list3;
        this.parentCategories = list4;
        this.description = str4;
        this.nestedDescription = str5;
    }

    public final String d() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPrivacySettingDto)) {
            return false;
        }
        AccountPrivacySettingDto accountPrivacySettingDto = (AccountPrivacySettingDto) obj;
        return this.innerType == accountPrivacySettingDto.innerType && epx.f(this.key, accountPrivacySettingDto.key) && epx.f(this.title, accountPrivacySettingDto.title) && epx.f(this.value, accountPrivacySettingDto.value) && epx.f(this.supportedCategories, accountPrivacySettingDto.supportedCategories) && epx.f(this.section, accountPrivacySettingDto.section) && epx.f(this.allCategories, accountPrivacySettingDto.allCategories) && this.type == accountPrivacySettingDto.type && epx.f(this.nestedItems, accountPrivacySettingDto.nestedItems) && epx.f(this.parentCategories, accountPrivacySettingDto.parentCategories) && epx.f(this.description, accountPrivacySettingDto.description) && epx.f(this.nestedDescription, accountPrivacySettingDto.nestedDescription);
    }

    public final List<AccountPrivacyValueDto> f() {
        return this.supportedCategories;
    }

    public final AccountPrivacySettingValueDto g() {
        return this.value;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a((this.value.hashCode() + urd0.a(urd0.a(this.innerType.hashCode() * 31, 31, this.key), 31, this.title)) * 31, 31, this.supportedCategories), 31, this.section);
        List<AccountPrivacyValueDto> list = this.allCategories;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode2 = (hashCode + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        List<AccountPrivacySettingsDto> list2 = this.nestedItems;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AccountPrivacyValueDto> list3 = this.parentCategories;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.description;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nestedDescription;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPrivacySettingDto(innerType=");
        sb.append(this.innerType);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", supportedCategories=");
        sb.append(this.supportedCategories);
        sb.append(", section=");
        sb.append(this.section);
        sb.append(", allCategories=");
        sb.append(this.allCategories);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", nestedItems=");
        sb.append(this.nestedItems);
        sb.append(", parentCategories=");
        sb.append(this.parentCategories);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", nestedDescription=");
        return ho8.a(sb, this.nestedDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.value, i);
        Iterator a2 = ao.a(parcel, this.supportedCategories);
        while (a2.hasNext()) {
            ((AccountPrivacyValueDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.section);
        List<AccountPrivacyValueDto> list = this.allCategories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AccountPrivacyValueDto) f.next()).writeToParcel(parcel, i);
            }
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        List<AccountPrivacySettingsDto> list2 = this.nestedItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AccountPrivacySettingsDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<AccountPrivacyValueDto> list3 = this.parentCategories;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((AccountPrivacyValueDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.description);
        parcel.writeString(this.nestedDescription);
    }

    public /* synthetic */ AccountPrivacySettingDto(InnerTypeDto innerTypeDto, String str, String str2, AccountPrivacySettingValueDto accountPrivacySettingValueDto, List list, String str3, List list2, TypeDto typeDto, List list3, List list4, String str4, String str5, int i, zcl zclVar) {
        this(innerTypeDto, str, str2, accountPrivacySettingValueDto, list, str3, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : typeDto, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5);
    }
}
