package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AccountInfoCacheNewsfeedSmartFeedMergeDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoCacheNewsfeedSmartFeedMergeDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoCacheNewsfeedSmartFeedMergeDto> CREATOR = new a();

    @pmi0("append")
    private final AccountInfoCacheNewsfeedSmartFeedMergeAppendDto append;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountInfoCacheNewsfeedSmartFeedMergeDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("append")
        public static final TypeDto APPEND;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("reset")
        public static final TypeDto RESET;
        private final String value;

        /* compiled from: AccountInfoCacheNewsfeedSmartFeedMergeDto.kt */
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
            TypeDto typeDto = new TypeDto("RESET", 0, "reset");
            RESET = typeDto;
            TypeDto typeDto2 = new TypeDto("APPEND", 1, "append");
            APPEND = typeDto2;
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

    /* compiled from: AccountInfoCacheNewsfeedSmartFeedMergeDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoCacheNewsfeedSmartFeedMergeDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheNewsfeedSmartFeedMergeDto createFromParcel(Parcel parcel) {
            return new AccountInfoCacheNewsfeedSmartFeedMergeDto(TypeDto.CREATOR.createFromParcel(parcel), AccountInfoCacheNewsfeedSmartFeedMergeAppendDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheNewsfeedSmartFeedMergeDto[] newArray(int i) {
            return new AccountInfoCacheNewsfeedSmartFeedMergeDto[i];
        }
    }

    public AccountInfoCacheNewsfeedSmartFeedMergeDto(TypeDto typeDto, AccountInfoCacheNewsfeedSmartFeedMergeAppendDto accountInfoCacheNewsfeedSmartFeedMergeAppendDto) {
        this.type = typeDto;
        this.append = accountInfoCacheNewsfeedSmartFeedMergeAppendDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoCacheNewsfeedSmartFeedMergeDto)) {
            return false;
        }
        AccountInfoCacheNewsfeedSmartFeedMergeDto accountInfoCacheNewsfeedSmartFeedMergeDto = (AccountInfoCacheNewsfeedSmartFeedMergeDto) obj;
        return this.type == accountInfoCacheNewsfeedSmartFeedMergeDto.type && epx.f(this.append, accountInfoCacheNewsfeedSmartFeedMergeDto.append);
    }

    public final int hashCode() {
        return this.append.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AccountInfoCacheNewsfeedSmartFeedMergeDto(type=" + this.type + ", append=" + this.append + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.append.writeToParcel(parcel, i);
    }
}
