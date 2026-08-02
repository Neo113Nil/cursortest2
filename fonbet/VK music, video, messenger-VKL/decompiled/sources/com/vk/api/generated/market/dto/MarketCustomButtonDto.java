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
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCustomButtonDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonDto> CREATOR = new a();

    @pmi0("available")
    private final List<MarketCustomButtonAvailableDayDto> available;

    @pmi0("custom_text")
    private final String customText;

    @pmi0("phone")
    private final String phone;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final Integer timezone;

    @pmi0("title_type")
    private final Integer titleType;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCustomButtonDto.kt */
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

        /* compiled from: MarketCustomButtonDto.kt */
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketCustomButtonDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(MarketCustomButtonDto.class.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketCustomButtonDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketCustomButtonDto(createFromParcel, userId, valueOf, readString, readString2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonDto[] newArray(int i) {
            return new MarketCustomButtonDto[i];
        }
    }

    public MarketCustomButtonDto(TypeDto typeDto, UserId userId, Integer num, String str, String str2, List<MarketCustomButtonAvailableDayDto> list, Integer num2) {
        this.type = typeDto;
        this.userId = userId;
        this.titleType = num;
        this.customText = str;
        this.phone = str2;
        this.available = list;
        this.timezone = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonDto)) {
            return false;
        }
        MarketCustomButtonDto marketCustomButtonDto = (MarketCustomButtonDto) obj;
        return this.type == marketCustomButtonDto.type && epx.f(this.userId, marketCustomButtonDto.userId) && epx.f(this.titleType, marketCustomButtonDto.titleType) && epx.f(this.customText, marketCustomButtonDto.customText) && epx.f(this.phone, marketCustomButtonDto.phone) && epx.f(this.available, marketCustomButtonDto.available) && epx.f(this.timezone, marketCustomButtonDto.timezone);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        UserId userId = this.userId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.titleType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.customText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MarketCustomButtonAvailableDayDto> list = this.available;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.timezone;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonDto(type=");
        sb.append(this.type);
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
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num2 = this.timezone;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MarketCustomButtonDto(TypeDto typeDto, UserId userId, Integer num, String str, String str2, List list, Integer num2, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : num2);
    }
}
