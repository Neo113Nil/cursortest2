package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketModalIntegrationFullSizeContentItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketModalIntegrationFullSizeContentItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketModalIntegrationFullSizeContentItemDto> CREATOR = new a();

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketModalIntegrationFullSizeContentItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("application")
        public static final TypeDto APPLICATION;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(C4572u.g)
        public static final TypeDto DELIVERY;

        @pmi0("payment")
        public static final TypeDto PAYMENT;
        private final String value;

        /* compiled from: MarketModalIntegrationFullSizeContentItemDto.kt */
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
            TypeDto typeDto = new TypeDto("APPLICATION", 0, "application");
            APPLICATION = typeDto;
            TypeDto typeDto2 = new TypeDto("PAYMENT", 1, "payment");
            PAYMENT = typeDto2;
            TypeDto typeDto3 = new TypeDto("DELIVERY", 2, C4572u.g);
            DELIVERY = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: MarketModalIntegrationFullSizeContentItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketModalIntegrationFullSizeContentItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketModalIntegrationFullSizeContentItemDto createFromParcel(Parcel parcel) {
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
                    i = bo.b(MarketModalIntegrationFullSizeContentItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketModalIntegrationFullSizeContentItemDto(createFromParcel, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketModalIntegrationFullSizeContentItemDto[] newArray(int i) {
            return new MarketModalIntegrationFullSizeContentItemDto[i];
        }
    }

    public MarketModalIntegrationFullSizeContentItemDto(TypeDto typeDto, String str, String str2, List<BaseImageDto> list) {
        this.type = typeDto;
        this.title = str;
        this.text = str2;
        this.image = list;
    }

    public final List<BaseImageDto> d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketModalIntegrationFullSizeContentItemDto)) {
            return false;
        }
        MarketModalIntegrationFullSizeContentItemDto marketModalIntegrationFullSizeContentItemDto = (MarketModalIntegrationFullSizeContentItemDto) obj;
        return this.type == marketModalIntegrationFullSizeContentItemDto.type && epx.f(this.title, marketModalIntegrationFullSizeContentItemDto.title) && epx.f(this.text, marketModalIntegrationFullSizeContentItemDto.text) && epx.f(this.image, marketModalIntegrationFullSizeContentItemDto.image);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.text);
        List<BaseImageDto> list = this.image;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketModalIntegrationFullSizeContentItemDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketModalIntegrationFullSizeContentItemDto(TypeDto typeDto, String str, String str2, List list, int i, zcl zclVar) {
        this(typeDto, str, str2, (i & 8) != 0 ? null : list);
    }
}
