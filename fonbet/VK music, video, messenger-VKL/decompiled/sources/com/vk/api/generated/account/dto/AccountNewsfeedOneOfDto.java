package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountNewsfeedOneOfDto.kt */
/* loaded from: classes14.dex */
public final class AccountNewsfeedOneOfDto implements Parcelable {
    public static final Parcelable.Creator<AccountNewsfeedOneOfDto> CREATOR = new a();

    @pmi0("fresh_news_button_offset")
    private final Integer freshNewsButtonOffset;

    @pmi0("inactive_time_to_reset")
    private final Integer inactiveTimeToReset;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("update_settings")
    private final AccountInfoExpDecayUpdateSettingsDto updateSettings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountNewsfeedOneOfDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;

        @pmi0("account_info_newsfeed_update_settings")
        public static final InnerTypeDto ACCOUNT_INFO_NEWSFEED_UPDATE_SETTINGS;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;
        private final String value;

        /* compiled from: AccountNewsfeedOneOfDto.kt */
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
            InnerTypeDto innerTypeDto = new InnerTypeDto("ACCOUNT_INFO_NEWSFEED_UPDATE_SETTINGS", 0, "account_info_newsfeed_update_settings");
            ACCOUNT_INFO_NEWSFEED_UPDATE_SETTINGS = innerTypeDto;
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

    /* compiled from: AccountNewsfeedOneOfDto.kt */
    public static final class a implements Parcelable.Creator<AccountNewsfeedOneOfDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNewsfeedOneOfDto createFromParcel(Parcel parcel) {
            return new AccountNewsfeedOneOfDto(InnerTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountInfoExpDecayUpdateSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNewsfeedOneOfDto[] newArray(int i) {
            return new AccountNewsfeedOneOfDto[i];
        }
    }

    public AccountNewsfeedOneOfDto(InnerTypeDto innerTypeDto, AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto, Integer num, Integer num2) {
        this.innerType = innerTypeDto;
        this.updateSettings = accountInfoExpDecayUpdateSettingsDto;
        this.inactiveTimeToReset = num;
        this.freshNewsButtonOffset = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNewsfeedOneOfDto)) {
            return false;
        }
        AccountNewsfeedOneOfDto accountNewsfeedOneOfDto = (AccountNewsfeedOneOfDto) obj;
        return this.innerType == accountNewsfeedOneOfDto.innerType && epx.f(this.updateSettings, accountNewsfeedOneOfDto.updateSettings) && epx.f(this.inactiveTimeToReset, accountNewsfeedOneOfDto.inactiveTimeToReset) && epx.f(this.freshNewsButtonOffset, accountNewsfeedOneOfDto.freshNewsButtonOffset);
    }

    public final int hashCode() {
        int hashCode = this.innerType.hashCode() * 31;
        AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto = this.updateSettings;
        int hashCode2 = (hashCode + (accountInfoExpDecayUpdateSettingsDto == null ? 0 : accountInfoExpDecayUpdateSettingsDto.hashCode())) * 31;
        Integer num = this.inactiveTimeToReset;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.freshNewsButtonOffset;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountNewsfeedOneOfDto(innerType=");
        sb.append(this.innerType);
        sb.append(", updateSettings=");
        sb.append(this.updateSettings);
        sb.append(", inactiveTimeToReset=");
        sb.append(this.inactiveTimeToReset);
        sb.append(", freshNewsButtonOffset=");
        return uqi.b(sb, this.freshNewsButtonOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto = this.updateSettings;
        if (accountInfoExpDecayUpdateSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoExpDecayUpdateSettingsDto.writeToParcel(parcel, i);
        }
        Integer num = this.inactiveTimeToReset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.freshNewsButtonOffset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AccountNewsfeedOneOfDto(InnerTypeDto innerTypeDto, AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto, Integer num, Integer num2, int i, zcl zclVar) {
        this(innerTypeDto, (i & 2) != 0 ? null : accountInfoExpDecayUpdateSettingsDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }
}
