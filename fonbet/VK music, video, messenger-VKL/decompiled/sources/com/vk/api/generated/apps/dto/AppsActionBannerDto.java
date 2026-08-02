package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsActionBannerDto.kt */
/* loaded from: classes14.dex */
public final class AppsActionBannerDto implements Parcelable {
    public static final Parcelable.Creator<AppsActionBannerDto> CREATOR = new a();

    @pmi0("action")
    private final String action;

    @pmi0("action_url")
    private final String actionUrl;

    @pmi0(L2.g)
    private final String background;

    @pmi0("banner_type")
    private final BannerTypeDto bannerType;

    @pmi0("description")
    private final String description;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("info_text")
    private final String infoText;

    @pmi0("rules_url")
    private final String rulesUrl;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsActionBannerDto.kt */
    public static final class BannerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerTypeDto[] $VALUES;
        public static final Parcelable.Creator<BannerTypeDto> CREATOR;

        @pmi0("personal_discount_bonus_votes")
        public static final BannerTypeDto PERSONAL_DISCOUNT_BONUS_VOTES;

        @pmi0("personal_discount_cashback")
        public static final BannerTypeDto PERSONAL_DISCOUNT_CASHBACK;

        @pmi0("personal_discount_free_votes")
        public static final BannerTypeDto PERSONAL_DISCOUNT_FREE_VOTES;

        @pmi0("personal_discount_percent_discount")
        public static final BannerTypeDto PERSONAL_DISCOUNT_PERCENT_DISCOUNT;
        private final String value;

        /* compiled from: AppsActionBannerDto.kt */
        public static final class a implements Parcelable.Creator<BannerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final BannerTypeDto createFromParcel(Parcel parcel) {
                return BannerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BannerTypeDto[] newArray(int i) {
                return new BannerTypeDto[i];
            }
        }

        static {
            BannerTypeDto bannerTypeDto = new BannerTypeDto("PERSONAL_DISCOUNT_BONUS_VOTES", 0, "personal_discount_bonus_votes");
            PERSONAL_DISCOUNT_BONUS_VOTES = bannerTypeDto;
            BannerTypeDto bannerTypeDto2 = new BannerTypeDto("PERSONAL_DISCOUNT_FREE_VOTES", 1, "personal_discount_free_votes");
            PERSONAL_DISCOUNT_FREE_VOTES = bannerTypeDto2;
            BannerTypeDto bannerTypeDto3 = new BannerTypeDto("PERSONAL_DISCOUNT_PERCENT_DISCOUNT", 2, "personal_discount_percent_discount");
            PERSONAL_DISCOUNT_PERCENT_DISCOUNT = bannerTypeDto3;
            BannerTypeDto bannerTypeDto4 = new BannerTypeDto("PERSONAL_DISCOUNT_CASHBACK", 3, "personal_discount_cashback");
            PERSONAL_DISCOUNT_CASHBACK = bannerTypeDto4;
            BannerTypeDto[] bannerTypeDtoArr = {bannerTypeDto, bannerTypeDto2, bannerTypeDto3, bannerTypeDto4};
            $VALUES = bannerTypeDtoArr;
            $ENTRIES = new asp(bannerTypeDtoArr);
            CREATOR = new a();
        }

        private BannerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BannerTypeDto valueOf(String str) {
            return (BannerTypeDto) Enum.valueOf(BannerTypeDto.class, str);
        }

        public static BannerTypeDto[] values() {
            return (BannerTypeDto[]) $VALUES.clone();
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

    /* compiled from: AppsActionBannerDto.kt */
    public static final class a implements Parcelable.Creator<AppsActionBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsActionBannerDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsActionBannerDto.class, parcel, arrayList, i, 1);
            }
            return new AppsActionBannerDto(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : BannerTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsActionBannerDto[] newArray(int i) {
            return new AppsActionBannerDto[i];
        }
    }

    public AppsActionBannerDto(List<BaseImageDto> list, String str, BannerTypeDto bannerTypeDto, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.icons = list;
        this.title = str;
        this.bannerType = bannerTypeDto;
        this.description = str2;
        this.background = str3;
        this.action = str4;
        this.actionUrl = str5;
        this.rulesUrl = str6;
        this.infoText = str7;
    }

    public final BannerTypeDto d() {
        return this.bannerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsActionBannerDto)) {
            return false;
        }
        AppsActionBannerDto appsActionBannerDto = (AppsActionBannerDto) obj;
        return epx.f(this.icons, appsActionBannerDto.icons) && epx.f(this.title, appsActionBannerDto.title) && this.bannerType == appsActionBannerDto.bannerType && epx.f(this.description, appsActionBannerDto.description) && epx.f(this.background, appsActionBannerDto.background) && epx.f(this.action, appsActionBannerDto.action) && epx.f(this.actionUrl, appsActionBannerDto.actionUrl) && epx.f(this.rulesUrl, appsActionBannerDto.rulesUrl) && epx.f(this.infoText, appsActionBannerDto.infoText);
    }

    public final String f() {
        return this.infoText;
    }

    public final String g() {
        return this.rulesUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.icons.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BannerTypeDto bannerTypeDto = this.bannerType;
        int hashCode3 = (hashCode2 + (bannerTypeDto == null ? 0 : bannerTypeDto.hashCode())) * 31;
        String str2 = this.description;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.background;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.action;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rulesUrl;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.infoText;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsActionBannerDto(icons=");
        sb.append(this.icons);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", bannerType=");
        sb.append(this.bannerType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", actionUrl=");
        sb.append(this.actionUrl);
        sb.append(", rulesUrl=");
        sb.append(this.rulesUrl);
        sb.append(", infoText=");
        return ho8.a(sb, this.infoText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.icons);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        BannerTypeDto bannerTypeDto = this.bannerType;
        if (bannerTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.background);
        parcel.writeString(this.action);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.rulesUrl);
        parcel.writeString(this.infoText);
    }

    public /* synthetic */ AppsActionBannerDto(List list, String str, BannerTypeDto bannerTypeDto, String str2, String str3, String str4, String str5, String str6, String str7, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bannerTypeDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
