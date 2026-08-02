package com.vk.api.generated.marketIntegrations.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketIntegrationsInfoBlockCatalogDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationsInfoBlockCatalogDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationsInfoBlockCatalogDto> CREATOR = new a();

    @pmi0("action")
    private final MarketItemLabelActionDto action;

    @pmi0("action_icon")
    private final BaseImageDto actionIcon;

    @pmi0("integration_action_icon")
    private final List<BaseImageDto> integrationActionIcon;

    @pmi0("integration_icon")
    private final List<BaseImageDto> integrationIcon;

    @pmi0("logo")
    private final BaseImageDto logo;

    @pmi0("market_info_id")
    private final Integer marketInfoId;

    @pmi0("subtype")
    private final SubtypeDto subtype;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketIntegrationsInfoBlockCatalogDto.kt */
    public static final class SubtypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtypeDto[] $VALUES;
        public static final Parcelable.Creator<SubtypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final SubtypeDto DEFAULT;

        @pmi0("integration_onboarding")
        public static final SubtypeDto INTEGRATION_ONBOARDING;

        @pmi0("ozon_onboarding")
        public static final SubtypeDto OZON_ONBOARDING;
        private final String value;

        /* compiled from: MarketIntegrationsInfoBlockCatalogDto.kt */
        public static final class a implements Parcelable.Creator<SubtypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SubtypeDto createFromParcel(Parcel parcel) {
                return SubtypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubtypeDto[] newArray(int i) {
                return new SubtypeDto[i];
            }
        }

        static {
            SubtypeDto subtypeDto = new SubtypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = subtypeDto;
            SubtypeDto subtypeDto2 = new SubtypeDto("OZON_ONBOARDING", 1, "ozon_onboarding");
            OZON_ONBOARDING = subtypeDto2;
            SubtypeDto subtypeDto3 = new SubtypeDto("INTEGRATION_ONBOARDING", 2, "integration_onboarding");
            INTEGRATION_ONBOARDING = subtypeDto3;
            SubtypeDto[] subtypeDtoArr = {subtypeDto, subtypeDto2, subtypeDto3};
            $VALUES = subtypeDtoArr;
            $ENTRIES = new asp(subtypeDtoArr);
            CREATOR = new a();
        }

        private SubtypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubtypeDto valueOf(String str) {
            return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
        }

        public static SubtypeDto[] values() {
            return (SubtypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketIntegrationsInfoBlockCatalogDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final TypeDto DEFAULT;

        @pmi0("ozon_integration")
        public static final TypeDto OZON_INTEGRATION;
        private final String value;

        /* compiled from: MarketIntegrationsInfoBlockCatalogDto.kt */
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
            TypeDto typeDto = new TypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = typeDto;
            TypeDto typeDto2 = new TypeDto("OZON_INTEGRATION", 1, "ozon_integration");
            OZON_INTEGRATION = typeDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MarketIntegrationsInfoBlockCatalogDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationsInfoBlockCatalogDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsInfoBlockCatalogDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            SubtypeDto createFromParcel2 = parcel.readInt() == 0 ? null : SubtypeDto.CREATOR.createFromParcel(parcel);
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(MarketIntegrationsInfoBlockCatalogDto.class.getClassLoader());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MarketIntegrationsInfoBlockCatalogDto.class, parcel, arrayList3, i2, 1);
                }
                arrayList = arrayList3;
            }
            BaseImageDto baseImageDto2 = (BaseImageDto) parcel.readParcelable(MarketIntegrationsInfoBlockCatalogDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(MarketIntegrationsInfoBlockCatalogDto.class, parcel, arrayList4, i, 1);
                }
                arrayList2 = arrayList4;
            }
            return new MarketIntegrationsInfoBlockCatalogDto(createFromParcel, readString, valueOf, createFromParcel2, baseImageDto, arrayList, baseImageDto2, arrayList2, (MarketItemLabelActionDto) parcel.readParcelable(MarketIntegrationsInfoBlockCatalogDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsInfoBlockCatalogDto[] newArray(int i) {
            return new MarketIntegrationsInfoBlockCatalogDto[i];
        }
    }

    public MarketIntegrationsInfoBlockCatalogDto(TypeDto typeDto, String str, Integer num, SubtypeDto subtypeDto, BaseImageDto baseImageDto, List<BaseImageDto> list, BaseImageDto baseImageDto2, List<BaseImageDto> list2, MarketItemLabelActionDto marketItemLabelActionDto) {
        this.type = typeDto;
        this.text = str;
        this.marketInfoId = num;
        this.subtype = subtypeDto;
        this.logo = baseImageDto;
        this.integrationIcon = list;
        this.actionIcon = baseImageDto2;
        this.integrationActionIcon = list2;
        this.action = marketItemLabelActionDto;
    }

    public final MarketItemLabelActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseImageDto e() {
        return this.actionIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketIntegrationsInfoBlockCatalogDto)) {
            return false;
        }
        MarketIntegrationsInfoBlockCatalogDto marketIntegrationsInfoBlockCatalogDto = (MarketIntegrationsInfoBlockCatalogDto) obj;
        return this.type == marketIntegrationsInfoBlockCatalogDto.type && epx.f(this.text, marketIntegrationsInfoBlockCatalogDto.text) && epx.f(this.marketInfoId, marketIntegrationsInfoBlockCatalogDto.marketInfoId) && this.subtype == marketIntegrationsInfoBlockCatalogDto.subtype && epx.f(this.logo, marketIntegrationsInfoBlockCatalogDto.logo) && epx.f(this.integrationIcon, marketIntegrationsInfoBlockCatalogDto.integrationIcon) && epx.f(this.actionIcon, marketIntegrationsInfoBlockCatalogDto.actionIcon) && epx.f(this.integrationActionIcon, marketIntegrationsInfoBlockCatalogDto.integrationActionIcon) && epx.f(this.action, marketIntegrationsInfoBlockCatalogDto.action);
    }

    public final BaseImageDto f() {
        return this.logo;
    }

    public final Integer g() {
        return this.marketInfoId;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.type.hashCode() * 31, 31, this.text);
        Integer num = this.marketInfoId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        SubtypeDto subtypeDto = this.subtype;
        int hashCode2 = (hashCode + (subtypeDto == null ? 0 : subtypeDto.hashCode())) * 31;
        BaseImageDto baseImageDto = this.logo;
        int hashCode3 = (hashCode2 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<BaseImageDto> list = this.integrationIcon;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BaseImageDto baseImageDto2 = this.actionIcon;
        int hashCode5 = (hashCode4 + (baseImageDto2 == null ? 0 : baseImageDto2.hashCode())) * 31;
        List<BaseImageDto> list2 = this.integrationActionIcon;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketItemLabelActionDto marketItemLabelActionDto = this.action;
        return hashCode6 + (marketItemLabelActionDto != null ? marketItemLabelActionDto.hashCode() : 0);
    }

    public final SubtypeDto i() {
        return this.subtype;
    }

    public final String j() {
        return this.text;
    }

    public final TypeDto k() {
        return this.type;
    }

    public final String toString() {
        return "MarketIntegrationsInfoBlockCatalogDto(type=" + this.type + ", text=" + this.text + ", marketInfoId=" + this.marketInfoId + ", subtype=" + this.subtype + ", logo=" + this.logo + ", integrationIcon=" + this.integrationIcon + ", actionIcon=" + this.actionIcon + ", integrationActionIcon=" + this.integrationActionIcon + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        Integer num = this.marketInfoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        SubtypeDto subtypeDto = this.subtype;
        if (subtypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subtypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.logo, i);
        List<BaseImageDto> list = this.integrationIcon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.actionIcon, i);
        List<BaseImageDto> list2 = this.integrationActionIcon;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ MarketIntegrationsInfoBlockCatalogDto(TypeDto typeDto, String str, Integer num, SubtypeDto subtypeDto, BaseImageDto baseImageDto, List list, BaseImageDto baseImageDto2, List list2, MarketItemLabelActionDto marketItemLabelActionDto, int i, zcl zclVar) {
        this(typeDto, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : subtypeDto, (i & 16) != 0 ? null : baseImageDto, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : baseImageDto2, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : marketItemLabelActionDto);
    }
}
