package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MarketCatalogStatusOptionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCatalogStatusOptionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCatalogStatusOptionDto> CREATOR = new a();

    @pmi0("id")
    private final IdDto id;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCatalogStatusOptionDto.kt */
    public static final class IdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IdDto[] $VALUES;

        @pmi0("all_items")
        public static final IdDto ALL_ITEMS;

        @pmi0("banned")
        public static final IdDto BANNED;
        public static final Parcelable.Creator<IdDto> CREATOR;

        @pmi0(C4217a2.e)
        public static final IdDto DISABLED;

        @pmi0("not_in_market")
        public static final IdDto NOT_IN_MARKET;
        private final String value;

        /* compiled from: MarketCatalogStatusOptionDto.kt */
        public static final class a implements Parcelable.Creator<IdDto> {
            @Override // android.os.Parcelable.Creator
            public final IdDto createFromParcel(Parcel parcel) {
                return IdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IdDto[] newArray(int i) {
                return new IdDto[i];
            }
        }

        static {
            IdDto idDto = new IdDto("ALL_ITEMS", 0, "all_items");
            ALL_ITEMS = idDto;
            IdDto idDto2 = new IdDto("BANNED", 1, "banned");
            BANNED = idDto2;
            IdDto idDto3 = new IdDto("DISABLED", 2, C4217a2.e);
            DISABLED = idDto3;
            IdDto idDto4 = new IdDto("NOT_IN_MARKET", 3, "not_in_market");
            NOT_IN_MARKET = idDto4;
            IdDto[] idDtoArr = {idDto, idDto2, idDto3, idDto4};
            $VALUES = idDtoArr;
            $ENTRIES = new asp(idDtoArr);
            CREATOR = new a();
        }

        private IdDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IdDto valueOf(String str) {
            return (IdDto) Enum.valueOf(IdDto.class, str);
        }

        public static IdDto[] values() {
            return (IdDto[]) $VALUES.clone();
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

    /* compiled from: MarketCatalogStatusOptionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCatalogStatusOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCatalogStatusOptionDto createFromParcel(Parcel parcel) {
            return new MarketCatalogStatusOptionDto(IdDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCatalogStatusOptionDto[] newArray(int i) {
            return new MarketCatalogStatusOptionDto[i];
        }
    }

    public MarketCatalogStatusOptionDto(IdDto idDto, String str) {
        this.id = idDto;
        this.title = str;
    }

    public final IdDto d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCatalogStatusOptionDto)) {
            return false;
        }
        MarketCatalogStatusOptionDto marketCatalogStatusOptionDto = (MarketCatalogStatusOptionDto) obj;
        return this.id == marketCatalogStatusOptionDto.id && epx.f(this.title, marketCatalogStatusOptionDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCatalogStatusOptionDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.id.writeToParcel(parcel, i);
        parcel.writeString(this.title);
    }
}
