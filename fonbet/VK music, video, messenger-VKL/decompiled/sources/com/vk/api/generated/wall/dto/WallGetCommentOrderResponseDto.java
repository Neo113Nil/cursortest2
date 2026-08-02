package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: WallGetCommentOrderResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetCommentOrderResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetCommentOrderResponseDto> CREATOR = new a();

    @pmi0("current_order")
    private final CurrentOrderDto currentOrder;

    @pmi0("items")
    private final List<WallCommentOrderDto> items;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallGetCommentOrderResponseDto.kt */
    public static final class CurrentOrderDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CurrentOrderDto[] $VALUES;

        @pmi0("asc")
        public static final CurrentOrderDto ASC;
        public static final Parcelable.Creator<CurrentOrderDto> CREATOR;

        @pmi0(CampaignEx.JSON_KEY_DESC)
        public static final CurrentOrderDto DESC;

        @pmi0("smart")
        public static final CurrentOrderDto SMART;
        private final String value;

        /* compiled from: WallGetCommentOrderResponseDto.kt */
        public static final class a implements Parcelable.Creator<CurrentOrderDto> {
            @Override // android.os.Parcelable.Creator
            public final CurrentOrderDto createFromParcel(Parcel parcel) {
                return CurrentOrderDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CurrentOrderDto[] newArray(int i) {
                return new CurrentOrderDto[i];
            }
        }

        static {
            CurrentOrderDto currentOrderDto = new CurrentOrderDto("SMART", 0, "smart");
            SMART = currentOrderDto;
            CurrentOrderDto currentOrderDto2 = new CurrentOrderDto("ASC", 1, "asc");
            ASC = currentOrderDto2;
            CurrentOrderDto currentOrderDto3 = new CurrentOrderDto("DESC", 2, CampaignEx.JSON_KEY_DESC);
            DESC = currentOrderDto3;
            CurrentOrderDto[] currentOrderDtoArr = {currentOrderDto, currentOrderDto2, currentOrderDto3};
            $VALUES = currentOrderDtoArr;
            $ENTRIES = new asp(currentOrderDtoArr);
            CREATOR = new a();
        }

        private CurrentOrderDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CurrentOrderDto valueOf(String str) {
            return (CurrentOrderDto) Enum.valueOf(CurrentOrderDto.class, str);
        }

        public static CurrentOrderDto[] values() {
            return (CurrentOrderDto[]) $VALUES.clone();
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

    /* compiled from: WallGetCommentOrderResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetCommentOrderResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetCommentOrderResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(WallCommentOrderDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new WallGetCommentOrderResponseDto(arrayList, CurrentOrderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetCommentOrderResponseDto[] newArray(int i) {
            return new WallGetCommentOrderResponseDto[i];
        }
    }

    public WallGetCommentOrderResponseDto(List<WallCommentOrderDto> list, CurrentOrderDto currentOrderDto) {
        this.items = list;
        this.currentOrder = currentOrderDto;
    }

    public final CurrentOrderDto d() {
        return this.currentOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<WallCommentOrderDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentOrderResponseDto)) {
            return false;
        }
        WallGetCommentOrderResponseDto wallGetCommentOrderResponseDto = (WallGetCommentOrderResponseDto) obj;
        return epx.f(this.items, wallGetCommentOrderResponseDto.items) && this.currentOrder == wallGetCommentOrderResponseDto.currentOrder;
    }

    public final int hashCode() {
        return this.currentOrder.hashCode() + (this.items.hashCode() * 31);
    }

    public final String toString() {
        return "WallGetCommentOrderResponseDto(items=" + this.items + ", currentOrder=" + this.currentOrder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((WallCommentOrderDto) a2.next()).writeToParcel(parcel, i);
        }
        this.currentOrder.writeToParcel(parcel, i);
    }
}
