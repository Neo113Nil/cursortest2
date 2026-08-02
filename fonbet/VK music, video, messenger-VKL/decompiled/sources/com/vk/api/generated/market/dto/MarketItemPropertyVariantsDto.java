package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketItemPropertyVariantsDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemPropertyVariantsDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemPropertyVariantsDto> CREATOR = new a();

    @pmi0("album_ids")
    private final List<Integer> albumIds;

    @pmi0("availability")
    private final AvailabilityDto availability;

    @pmi0("is_main")
    private final Boolean isMain;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("variant_ids")
    private final List<Integer> variantIds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketItemPropertyVariantsDto.kt */
    public static final class AvailabilityDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AvailabilityDto[] $VALUES;

        @pmi0("0")
        public static final AvailabilityDto AVAILABLE;
        public static final Parcelable.Creator<AvailabilityDto> CREATOR;

        @pmi0("1")
        public static final AvailabilityDto DELETED;

        @pmi0("2")
        public static final AvailabilityDto NOT_AVAILABLE;
        private final int value;

        /* compiled from: MarketItemPropertyVariantsDto.kt */
        public static final class a implements Parcelable.Creator<AvailabilityDto> {
            @Override // android.os.Parcelable.Creator
            public final AvailabilityDto createFromParcel(Parcel parcel) {
                return AvailabilityDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AvailabilityDto[] newArray(int i) {
                return new AvailabilityDto[i];
            }
        }

        static {
            AvailabilityDto availabilityDto = new AvailabilityDto("AVAILABLE", 0, 0);
            AVAILABLE = availabilityDto;
            AvailabilityDto availabilityDto2 = new AvailabilityDto("DELETED", 1, 1);
            DELETED = availabilityDto2;
            AvailabilityDto availabilityDto3 = new AvailabilityDto("NOT_AVAILABLE", 2, 2);
            NOT_AVAILABLE = availabilityDto3;
            AvailabilityDto[] availabilityDtoArr = {availabilityDto, availabilityDto2, availabilityDto3};
            $VALUES = availabilityDtoArr;
            $ENTRIES = new asp(availabilityDtoArr);
            CREATOR = new a();
        }

        private AvailabilityDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static AvailabilityDto valueOf(String str) {
            return (AvailabilityDto) Enum.valueOf(AvailabilityDto.class, str);
        }

        public static AvailabilityDto[] values() {
            return (AvailabilityDto[]) $VALUES.clone();
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

    /* compiled from: MarketItemPropertyVariantsDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemPropertyVariantsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemPropertyVariantsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            AvailabilityDto createFromParcel = AvailabilityDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList2, i, 1);
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketItemPropertyVariantsDto(readInt, createFromParcel, arrayList2, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemPropertyVariantsDto[] newArray(int i) {
            return new MarketItemPropertyVariantsDto[i];
        }
    }

    public MarketItemPropertyVariantsDto(int i, AvailabilityDto availabilityDto, List<Integer> list, List<Integer> list2, Boolean bool) {
        this.itemId = i;
        this.availability = availabilityDto;
        this.variantIds = list;
        this.albumIds = list2;
        this.isMain = bool;
    }

    public final AvailabilityDto d() {
        return this.availability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemPropertyVariantsDto)) {
            return false;
        }
        MarketItemPropertyVariantsDto marketItemPropertyVariantsDto = (MarketItemPropertyVariantsDto) obj;
        return this.itemId == marketItemPropertyVariantsDto.itemId && this.availability == marketItemPropertyVariantsDto.availability && epx.f(this.variantIds, marketItemPropertyVariantsDto.variantIds) && epx.f(this.albumIds, marketItemPropertyVariantsDto.albumIds) && epx.f(this.isMain, marketItemPropertyVariantsDto.isMain);
    }

    public final List<Integer> f() {
        return this.variantIds;
    }

    public final Boolean g() {
        return this.isMain;
    }

    public final int hashCode() {
        int a2 = fw3.a((this.availability.hashCode() + (Integer.hashCode(this.itemId) * 31)) * 31, 31, this.variantIds);
        List<Integer> list = this.albumIds;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isMain;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemPropertyVariantsDto(itemId=");
        sb.append(this.itemId);
        sb.append(", availability=");
        sb.append(this.availability);
        sb.append(", variantIds=");
        sb.append(this.variantIds);
        sb.append(", albumIds=");
        sb.append(this.albumIds);
        sb.append(", isMain=");
        return tn.a(sb, this.isMain, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.itemId);
        this.availability.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.variantIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        List<Integer> list = this.albumIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Boolean bool = this.isMain;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketItemPropertyVariantsDto(int i, AvailabilityDto availabilityDto, List list, List list2, Boolean bool, int i2, zcl zclVar) {
        this(i, availabilityDto, list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : bool);
    }
}
