package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import defpackage.q0;
import io.appmetrica.analytics.BuildConfig;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountPrivacySettingValueDto.kt */
/* loaded from: classes.dex */
public abstract class AccountPrivacySettingValueDto implements Parcelable {

    /* compiled from: AccountPrivacySettingValueDto.kt */
    /* loaded from: classes14.dex */
    public static final class AccountPrivacySettingValueCategoryDto extends AccountPrivacySettingValueDto implements Parcelable {
        public static final Parcelable.Creator<AccountPrivacySettingValueCategoryDto> CREATOR = new a();

        @pmi0("category")
        private final AccountPrivacyValueDto category;

        @pmi0("lists")
        private final AccountPrivacySettingValueListDto lists;

        @pmi0("lists_categories")
        private final AccountPrivacySettingValueListCategoriesDto listsCategories;

        @pmi0("lists_owners")
        private final AccountPrivacySettingValueListDto listsOwners;

        @pmi0("owners")
        private final AccountPrivacySettingValueListDto owners;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AccountPrivacySettingValueDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("category")
            public static final TypeDto CATEGORY;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AccountPrivacySettingValueDto.kt */
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
                TypeDto typeDto = new TypeDto("CATEGORY", 0, "category");
                CATEGORY = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: AccountPrivacySettingValueDto.kt */
        public static final class a implements Parcelable.Creator<AccountPrivacySettingValueCategoryDto> {
            @Override // android.os.Parcelable.Creator
            public final AccountPrivacySettingValueCategoryDto createFromParcel(Parcel parcel) {
                return new AccountPrivacySettingValueCategoryDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountPrivacyValueDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountPrivacySettingValueListDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountPrivacySettingValueListDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountPrivacySettingValueListDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountPrivacySettingValueListCategoriesDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AccountPrivacySettingValueCategoryDto[] newArray(int i) {
                return new AccountPrivacySettingValueCategoryDto[i];
            }
        }

        public /* synthetic */ AccountPrivacySettingValueCategoryDto(TypeDto typeDto, AccountPrivacyValueDto accountPrivacyValueDto, AccountPrivacySettingValueListDto accountPrivacySettingValueListDto, AccountPrivacySettingValueListDto accountPrivacySettingValueListDto2, AccountPrivacySettingValueListDto accountPrivacySettingValueListDto3, AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : accountPrivacyValueDto, (i & 4) != 0 ? null : accountPrivacySettingValueListDto, (i & 8) != 0 ? null : accountPrivacySettingValueListDto2, (i & 16) != 0 ? null : accountPrivacySettingValueListDto3, (i & 32) != 0 ? null : accountPrivacySettingValueListCategoriesDto);
        }

        public final AccountPrivacyValueDto d() {
            return this.category;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AccountPrivacySettingValueListDto e() {
            return this.listsOwners;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountPrivacySettingValueCategoryDto)) {
                return false;
            }
            AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto = (AccountPrivacySettingValueCategoryDto) obj;
            return this.type == accountPrivacySettingValueCategoryDto.type && this.category == accountPrivacySettingValueCategoryDto.category && epx.f(this.owners, accountPrivacySettingValueCategoryDto.owners) && epx.f(this.lists, accountPrivacySettingValueCategoryDto.lists) && epx.f(this.listsOwners, accountPrivacySettingValueCategoryDto.listsOwners) && epx.f(this.listsCategories, accountPrivacySettingValueCategoryDto.listsCategories);
        }

        public final AccountPrivacySettingValueListDto f() {
            return this.owners;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            AccountPrivacyValueDto accountPrivacyValueDto = this.category;
            int hashCode2 = (hashCode + (accountPrivacyValueDto == null ? 0 : accountPrivacyValueDto.hashCode())) * 31;
            AccountPrivacySettingValueListDto accountPrivacySettingValueListDto = this.owners;
            int hashCode3 = (hashCode2 + (accountPrivacySettingValueListDto == null ? 0 : accountPrivacySettingValueListDto.hashCode())) * 31;
            AccountPrivacySettingValueListDto accountPrivacySettingValueListDto2 = this.lists;
            int hashCode4 = (hashCode3 + (accountPrivacySettingValueListDto2 == null ? 0 : accountPrivacySettingValueListDto2.hashCode())) * 31;
            AccountPrivacySettingValueListDto accountPrivacySettingValueListDto3 = this.listsOwners;
            int hashCode5 = (hashCode4 + (accountPrivacySettingValueListDto3 == null ? 0 : accountPrivacySettingValueListDto3.hashCode())) * 31;
            AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto = this.listsCategories;
            return hashCode5 + (accountPrivacySettingValueListCategoriesDto != null ? accountPrivacySettingValueListCategoriesDto.hashCode() : 0);
        }

        public final String toString() {
            return "AccountPrivacySettingValueCategoryDto(type=" + this.type + ", category=" + this.category + ", owners=" + this.owners + ", lists=" + this.lists + ", listsOwners=" + this.listsOwners + ", listsCategories=" + this.listsCategories + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            AccountPrivacyValueDto accountPrivacyValueDto = this.category;
            if (accountPrivacyValueDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                accountPrivacyValueDto.writeToParcel(parcel, i);
            }
            AccountPrivacySettingValueListDto accountPrivacySettingValueListDto = this.owners;
            if (accountPrivacySettingValueListDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                accountPrivacySettingValueListDto.writeToParcel(parcel, i);
            }
            AccountPrivacySettingValueListDto accountPrivacySettingValueListDto2 = this.lists;
            if (accountPrivacySettingValueListDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                accountPrivacySettingValueListDto2.writeToParcel(parcel, i);
            }
            AccountPrivacySettingValueListDto accountPrivacySettingValueListDto3 = this.listsOwners;
            if (accountPrivacySettingValueListDto3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                accountPrivacySettingValueListDto3.writeToParcel(parcel, i);
            }
            AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto = this.listsCategories;
            if (accountPrivacySettingValueListCategoriesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                accountPrivacySettingValueListCategoriesDto.writeToParcel(parcel, i);
            }
        }

        public AccountPrivacySettingValueCategoryDto(TypeDto typeDto, AccountPrivacyValueDto accountPrivacyValueDto, AccountPrivacySettingValueListDto accountPrivacySettingValueListDto, AccountPrivacySettingValueListDto accountPrivacySettingValueListDto2, AccountPrivacySettingValueListDto accountPrivacySettingValueListDto3, AccountPrivacySettingValueListCategoriesDto accountPrivacySettingValueListCategoriesDto) {
            super(null);
            this.type = typeDto;
            this.category = accountPrivacyValueDto;
            this.owners = accountPrivacySettingValueListDto;
            this.lists = accountPrivacySettingValueListDto2;
            this.listsOwners = accountPrivacySettingValueListDto3;
            this.listsCategories = accountPrivacySettingValueListCategoriesDto;
        }
    }

    /* compiled from: AccountPrivacySettingValueDto.kt */
    /* loaded from: classes14.dex */
    public static final class AccountPrivacySettingValueIsEnabledDto extends AccountPrivacySettingValueDto implements Parcelable {
        public static final Parcelable.Creator<AccountPrivacySettingValueIsEnabledDto> CREATOR = new a();

        @pmi0("is_enabled")
        private final boolean isEnabled;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AccountPrivacySettingValueDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(BuildConfig.SDK_DEPENDENCY)
            public static final TypeDto BINARY;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AccountPrivacySettingValueDto.kt */
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
                TypeDto typeDto = new TypeDto("BINARY", 0, BuildConfig.SDK_DEPENDENCY);
                BINARY = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: AccountPrivacySettingValueDto.kt */
        public static final class a implements Parcelable.Creator<AccountPrivacySettingValueIsEnabledDto> {
            @Override // android.os.Parcelable.Creator
            public final AccountPrivacySettingValueIsEnabledDto createFromParcel(Parcel parcel) {
                return new AccountPrivacySettingValueIsEnabledDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AccountPrivacySettingValueIsEnabledDto[] newArray(int i) {
                return new AccountPrivacySettingValueIsEnabledDto[i];
            }
        }

        public AccountPrivacySettingValueIsEnabledDto(TypeDto typeDto, boolean z) {
            super(null);
            this.type = typeDto;
            this.isEnabled = z;
        }

        public final boolean d() {
            return this.isEnabled;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountPrivacySettingValueIsEnabledDto)) {
                return false;
            }
            AccountPrivacySettingValueIsEnabledDto accountPrivacySettingValueIsEnabledDto = (AccountPrivacySettingValueIsEnabledDto) obj;
            return this.type == accountPrivacySettingValueIsEnabledDto.type && this.isEnabled == accountPrivacySettingValueIsEnabledDto.isEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEnabled) + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountPrivacySettingValueIsEnabledDto(type=");
            sb.append(this.type);
            sb.append(", isEnabled=");
            return q0.a(sb, this.isEnabled, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.isEnabled ? 1 : 0);
        }
    }

    /* compiled from: AccountPrivacySettingValueDto.kt */
    public static final class Deserializer implements a9y<AccountPrivacySettingValueDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "category")) {
                return (AccountPrivacySettingValueDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AccountPrivacySettingValueCategoryDto.class);
            }
            if (epx.f(f, BuildConfig.SDK_DEPENDENCY)) {
                return (AccountPrivacySettingValueDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AccountPrivacySettingValueIsEnabledDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AccountPrivacySettingValueDto(zcl zclVar) {
        this();
    }

    private AccountPrivacySettingValueDto() {
    }
}
