package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCustomButtonFullDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonFullDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonFullDto> CREATOR = new a();

    @pmi0("available")
    private final List<MarketCustomButtonAvailableDayDto> available;

    @pmi0("click_id")
    private final String clickId;

    @pmi0("custom_text")
    private final String customText;

    @pmi0("inaccessibility_message")
    private final MarketCustomButtonInaccessibilityMessageDto inaccessibilityMessage;

    @pmi0("is_available_now")
    private final Boolean isAvailableNow;

    @pmi0("phone")
    private final String phone;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final Integer timezone;

    @pmi0("title")
    private final String title;

    @pmi0("title_type")
    private final Integer titleType;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0(LoginApiConstants.PARAM_NAME_USERNAME)
    private final String userName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCustomButtonFullDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("4")
        public static final TypeDto ADD_IN_CART;

        @pmi0(Gc.e)
        public static final TypeDto BUY_NOW;

        @pmi0("2")
        public static final TypeDto CALL;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(C4217a2.f)
        public static final TypeDto DISABLED;

        @pmi0("3")
        public static final TypeDto GO_TO_CART;

        @pmi0("1")
        public static final TypeDto OPEN;

        @pmi0("6")
        public static final TypeDto OPEN_PARTNER_SITE;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TypeDto SIMILAR;

        @pmi0("0")
        public static final TypeDto WRITE;
        private final int value;

        /* compiled from: MarketCustomButtonFullDto.kt */
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
            TypeDto typeDto = new TypeDto("DISABLED", 0, -1);
            DISABLED = typeDto;
            TypeDto typeDto2 = new TypeDto("WRITE", 1, 0);
            WRITE = typeDto2;
            TypeDto typeDto3 = new TypeDto("OPEN", 2, 1);
            OPEN = typeDto3;
            TypeDto typeDto4 = new TypeDto("CALL", 3, 2);
            CALL = typeDto4;
            TypeDto typeDto5 = new TypeDto("GO_TO_CART", 4, 3);
            GO_TO_CART = typeDto5;
            TypeDto typeDto6 = new TypeDto("ADD_IN_CART", 5, 4);
            ADD_IN_CART = typeDto6;
            TypeDto typeDto7 = new TypeDto("SIMILAR", 6, 5);
            SIMILAR = typeDto7;
            TypeDto typeDto8 = new TypeDto("OPEN_PARTNER_SITE", 7, 6);
            OPEN_PARTNER_SITE = typeDto8;
            TypeDto typeDto9 = new TypeDto("BUY_NOW", 8, 7);
            BUY_NOW = typeDto9;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
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

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketCustomButtonFullDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonFullDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonFullDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarketCustomButtonInaccessibilityMessageDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketCustomButtonInaccessibilityMessageDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(MarketCustomButtonFullDto.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            ArrayList arrayList = null;
            Integer num = valueOf2;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketCustomButtonAvailableDayDto.CREATOR, parcel, arrayList2, i, 1);
                    valueOf = valueOf;
                }
                arrayList = arrayList2;
            }
            return new MarketCustomButtonFullDto(createFromParcel, readString, readString2, readString3, readString4, valueOf, createFromParcel2, userId, num, readString5, readString6, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonFullDto[] newArray(int i) {
            return new MarketCustomButtonFullDto[i];
        }
    }

    public MarketCustomButtonFullDto(TypeDto typeDto, String str, String str2, String str3, String str4, Boolean bool, MarketCustomButtonInaccessibilityMessageDto marketCustomButtonInaccessibilityMessageDto, UserId userId, Integer num, String str5, String str6, List<MarketCustomButtonAvailableDayDto> list, Integer num2) {
        this.type = typeDto;
        this.url = str;
        this.userName = str2;
        this.clickId = str3;
        this.title = str4;
        this.isAvailableNow = bool;
        this.inaccessibilityMessage = marketCustomButtonInaccessibilityMessageDto;
        this.userId = userId;
        this.titleType = num;
        this.customText = str5;
        this.phone = str6;
        this.available = list;
        this.timezone = num2;
    }

    public final List<MarketCustomButtonAvailableDayDto> d() {
        return this.available;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.customText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonFullDto)) {
            return false;
        }
        MarketCustomButtonFullDto marketCustomButtonFullDto = (MarketCustomButtonFullDto) obj;
        return this.type == marketCustomButtonFullDto.type && epx.f(this.url, marketCustomButtonFullDto.url) && epx.f(this.userName, marketCustomButtonFullDto.userName) && epx.f(this.clickId, marketCustomButtonFullDto.clickId) && epx.f(this.title, marketCustomButtonFullDto.title) && epx.f(this.isAvailableNow, marketCustomButtonFullDto.isAvailableNow) && epx.f(this.inaccessibilityMessage, marketCustomButtonFullDto.inaccessibilityMessage) && epx.f(this.userId, marketCustomButtonFullDto.userId) && epx.f(this.titleType, marketCustomButtonFullDto.titleType) && epx.f(this.customText, marketCustomButtonFullDto.customText) && epx.f(this.phone, marketCustomButtonFullDto.phone) && epx.f(this.available, marketCustomButtonFullDto.available) && epx.f(this.timezone, marketCustomButtonFullDto.timezone);
    }

    public final MarketCustomButtonInaccessibilityMessageDto f() {
        return this.inaccessibilityMessage;
    }

    public final String g() {
        return this.phone;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clickId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isAvailableNow;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketCustomButtonInaccessibilityMessageDto marketCustomButtonInaccessibilityMessageDto = this.inaccessibilityMessage;
        int hashCode7 = (hashCode6 + (marketCustomButtonInaccessibilityMessageDto == null ? 0 : marketCustomButtonInaccessibilityMessageDto.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode8 = (hashCode7 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.titleType;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.customText;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<MarketCustomButtonAvailableDayDto> list = this.available;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.timezone;
        return hashCode12 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer i() {
        return this.timezone;
    }

    public final TypeDto j() {
        return this.type;
    }

    public final String k() {
        return this.userName;
    }

    public final Boolean l() {
        return this.isAvailableNow;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonFullDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", clickId=");
        sb.append(this.clickId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isAvailableNow=");
        sb.append(this.isAvailableNow);
        sb.append(", inaccessibilityMessage=");
        sb.append(this.inaccessibilityMessage);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", titleType=");
        sb.append(this.titleType);
        sb.append(", customText=");
        sb.append(this.customText);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(", timezone=");
        return uqi.b(sb, this.timezone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.url);
        parcel.writeString(this.userName);
        parcel.writeString(this.clickId);
        parcel.writeString(this.title);
        Boolean bool = this.isAvailableNow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MarketCustomButtonInaccessibilityMessageDto marketCustomButtonInaccessibilityMessageDto = this.inaccessibilityMessage;
        if (marketCustomButtonInaccessibilityMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCustomButtonInaccessibilityMessageDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.userId, i);
        Integer num = this.titleType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.customText);
        parcel.writeString(this.phone);
        List<MarketCustomButtonAvailableDayDto> list = this.available;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketCustomButtonAvailableDayDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.timezone;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MarketCustomButtonFullDto(TypeDto typeDto, String str, String str2, String str3, String str4, Boolean bool, MarketCustomButtonInaccessibilityMessageDto marketCustomButtonInaccessibilityMessageDto, UserId userId, Integer num, String str5, String str6, List list, Integer num2, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : marketCustomButtonInaccessibilityMessageDto, (i & 128) != 0 ? null : userId, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : num2);
    }
}
