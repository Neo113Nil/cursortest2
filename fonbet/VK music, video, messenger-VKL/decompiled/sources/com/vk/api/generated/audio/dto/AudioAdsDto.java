package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioAdsDto.kt */
/* loaded from: classes14.dex */
public final class AudioAdsDto implements Parcelable {
    public static final Parcelable.Creator<AudioAdsDto> CREATOR = new a();

    @pmi0("_SITEID")
    private final String SITEID;

    @pmi0("account_age_type")
    private final AccountAgeTypeDto accountAgeType;

    @pmi0("content_id")
    private final String contentId;

    @pmi0("duration")
    private final String duration;

    @pmi0("preview")
    private final String preview;

    @pmi0("puid1")
    private final String puid1;

    @pmi0("puid22")
    private final String puid22;

    @pmi0("ver")
    private final String ver;

    @pmi0("vk_id")
    private final String vkId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioAdsDto.kt */
    public static final class AccountAgeTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccountAgeTypeDto[] $VALUES;
        public static final Parcelable.Creator<AccountAgeTypeDto> CREATOR;

        @pmi0("1")
        public static final AccountAgeTypeDto TYPE_1_YEAR;

        @pmi0("2")
        public static final AccountAgeTypeDto TYPE_2_YEAR;

        @pmi0("3")
        public static final AccountAgeTypeDto TYPE_3_AND_MORE_YEARS;

        @pmi0("0")
        public static final AccountAgeTypeDto WRONG;
        private final String value;

        /* compiled from: AudioAdsDto.kt */
        public static final class a implements Parcelable.Creator<AccountAgeTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final AccountAgeTypeDto createFromParcel(Parcel parcel) {
                return AccountAgeTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AccountAgeTypeDto[] newArray(int i) {
                return new AccountAgeTypeDto[i];
            }
        }

        static {
            AccountAgeTypeDto accountAgeTypeDto = new AccountAgeTypeDto("WRONG", 0, "0");
            WRONG = accountAgeTypeDto;
            AccountAgeTypeDto accountAgeTypeDto2 = new AccountAgeTypeDto("TYPE_1_YEAR", 1, "1");
            TYPE_1_YEAR = accountAgeTypeDto2;
            AccountAgeTypeDto accountAgeTypeDto3 = new AccountAgeTypeDto("TYPE_2_YEAR", 2, "2");
            TYPE_2_YEAR = accountAgeTypeDto3;
            AccountAgeTypeDto accountAgeTypeDto4 = new AccountAgeTypeDto("TYPE_3_AND_MORE_YEARS", 3, "3");
            TYPE_3_AND_MORE_YEARS = accountAgeTypeDto4;
            AccountAgeTypeDto[] accountAgeTypeDtoArr = {accountAgeTypeDto, accountAgeTypeDto2, accountAgeTypeDto3, accountAgeTypeDto4};
            $VALUES = accountAgeTypeDtoArr;
            $ENTRIES = new asp(accountAgeTypeDtoArr);
            CREATOR = new a();
        }

        private AccountAgeTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AccountAgeTypeDto valueOf(String str) {
            return (AccountAgeTypeDto) Enum.valueOf(AccountAgeTypeDto.class, str);
        }

        public static AccountAgeTypeDto[] values() {
            return (AccountAgeTypeDto[]) $VALUES.clone();
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

    /* compiled from: AudioAdsDto.kt */
    public static final class a implements Parcelable.Creator<AudioAdsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAdsDto createFromParcel(Parcel parcel) {
            return new AudioAdsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AccountAgeTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAdsDto[] newArray(int i) {
            return new AudioAdsDto[i];
        }
    }

    public AudioAdsDto(String str, String str2, String str3, AccountAgeTypeDto accountAgeTypeDto, String str4, String str5, String str6, String str7, String str8) {
        this.contentId = str;
        this.duration = str2;
        this.preview = str3;
        this.accountAgeType = accountAgeTypeDto;
        this.puid1 = str4;
        this.puid22 = str5;
        this.vkId = str6;
        this.ver = str7;
        this.SITEID = str8;
    }

    public final AccountAgeTypeDto d() {
        return this.accountAgeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.contentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAdsDto)) {
            return false;
        }
        AudioAdsDto audioAdsDto = (AudioAdsDto) obj;
        return epx.f(this.contentId, audioAdsDto.contentId) && epx.f(this.duration, audioAdsDto.duration) && epx.f(this.preview, audioAdsDto.preview) && this.accountAgeType == audioAdsDto.accountAgeType && epx.f(this.puid1, audioAdsDto.puid1) && epx.f(this.puid22, audioAdsDto.puid22) && epx.f(this.vkId, audioAdsDto.vkId) && epx.f(this.ver, audioAdsDto.ver) && epx.f(this.SITEID, audioAdsDto.SITEID);
    }

    public final String f() {
        return this.duration;
    }

    public final String g() {
        return this.preview;
    }

    public final int hashCode() {
        int hashCode = this.contentId.hashCode() * 31;
        String str = this.duration;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.preview;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountAgeTypeDto accountAgeTypeDto = this.accountAgeType;
        int hashCode4 = (hashCode3 + (accountAgeTypeDto == null ? 0 : accountAgeTypeDto.hashCode())) * 31;
        String str3 = this.puid1;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.puid22;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vkId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ver;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.SITEID;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String i() {
        return this.puid1;
    }

    public final String j() {
        return this.puid22;
    }

    public final String k() {
        return this.SITEID;
    }

    public final String l() {
        return this.ver;
    }

    public final String n() {
        return this.vkId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAdsDto(contentId=");
        sb.append(this.contentId);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", accountAgeType=");
        sb.append(this.accountAgeType);
        sb.append(", puid1=");
        sb.append(this.puid1);
        sb.append(", puid22=");
        sb.append(this.puid22);
        sb.append(", vkId=");
        sb.append(this.vkId);
        sb.append(", ver=");
        sb.append(this.ver);
        sb.append(", SITEID=");
        return ho8.a(sb, this.SITEID, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contentId);
        parcel.writeString(this.duration);
        parcel.writeString(this.preview);
        AccountAgeTypeDto accountAgeTypeDto = this.accountAgeType;
        if (accountAgeTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountAgeTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.puid1);
        parcel.writeString(this.puid22);
        parcel.writeString(this.vkId);
        parcel.writeString(this.ver);
        parcel.writeString(this.SITEID);
    }

    public /* synthetic */ AudioAdsDto(String str, String str2, String str3, AccountAgeTypeDto accountAgeTypeDto, String str4, String str5, String str6, String str7, String str8, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : accountAgeTypeDto, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }
}
