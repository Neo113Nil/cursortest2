package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketIntegrationSettingsAdminBannerModalDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationSettingsAdminBannerModalDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationSettingsAdminBannerModalDto> CREATOR = new a();

    @pmi0("actions")
    private final List<MarketIntegrationSettingsAdminBannerActionDto> actions;

    @pmi0("message")
    private final String message;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketIntegrationSettingsAdminBannerModalDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("allow_vk_products")
        public static final TypeDto ALLOW_VK_PRODUCTS;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("do_not_restore_vk_products")
        public static final TypeDto DO_NOT_RESTORE_VK_PRODUCTS;

        @pmi0("hide_vk_products")
        public static final TypeDto HIDE_VK_PRODUCTS;

        @pmi0("restore_vk_products")
        public static final TypeDto RESTORE_VK_PRODUCTS;
        private final String value;

        /* compiled from: MarketIntegrationSettingsAdminBannerModalDto.kt */
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
            TypeDto typeDto = new TypeDto("HIDE_VK_PRODUCTS", 0, "hide_vk_products");
            HIDE_VK_PRODUCTS = typeDto;
            TypeDto typeDto2 = new TypeDto("ALLOW_VK_PRODUCTS", 1, "allow_vk_products");
            ALLOW_VK_PRODUCTS = typeDto2;
            TypeDto typeDto3 = new TypeDto("RESTORE_VK_PRODUCTS", 2, "restore_vk_products");
            RESTORE_VK_PRODUCTS = typeDto3;
            TypeDto typeDto4 = new TypeDto("DO_NOT_RESTORE_VK_PRODUCTS", 3, "do_not_restore_vk_products");
            DO_NOT_RESTORE_VK_PRODUCTS = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* compiled from: MarketIntegrationSettingsAdminBannerModalDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationSettingsAdminBannerModalDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsAdminBannerModalDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketIntegrationSettingsAdminBannerActionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketIntegrationSettingsAdminBannerModalDto(createFromParcel, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsAdminBannerModalDto[] newArray(int i) {
            return new MarketIntegrationSettingsAdminBannerModalDto[i];
        }
    }

    public MarketIntegrationSettingsAdminBannerModalDto(TypeDto typeDto, String str, String str2, List<MarketIntegrationSettingsAdminBannerActionDto> list) {
        this.type = typeDto;
        this.title = str;
        this.message = str2;
        this.actions = list;
    }

    public final List<MarketIntegrationSettingsAdminBannerActionDto> d() {
        return this.actions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketIntegrationSettingsAdminBannerModalDto)) {
            return false;
        }
        MarketIntegrationSettingsAdminBannerModalDto marketIntegrationSettingsAdminBannerModalDto = (MarketIntegrationSettingsAdminBannerModalDto) obj;
        return this.type == marketIntegrationSettingsAdminBannerModalDto.type && epx.f(this.title, marketIntegrationSettingsAdminBannerModalDto.title) && epx.f(this.message, marketIntegrationSettingsAdminBannerModalDto.message) && epx.f(this.actions, marketIntegrationSettingsAdminBannerModalDto.actions);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MarketIntegrationSettingsAdminBannerActionDto> list = this.actions;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketIntegrationSettingsAdminBannerModalDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        List<MarketIntegrationSettingsAdminBannerActionDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketIntegrationSettingsAdminBannerActionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketIntegrationSettingsAdminBannerModalDto(TypeDto typeDto, String str, String str2, List list, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
