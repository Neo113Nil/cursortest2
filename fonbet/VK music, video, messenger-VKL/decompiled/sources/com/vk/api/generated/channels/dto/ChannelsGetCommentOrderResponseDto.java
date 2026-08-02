package com.vk.api.generated.channels.dto;

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

/* compiled from: ChannelsGetCommentOrderResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetCommentOrderResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetCommentOrderResponseDto> CREATOR = new a();

    @pmi0("current_order")
    private final CurrentOrderDto currentOrder;

    @pmi0("items")
    private final List<ChannelsCommentOrderDto> items;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsGetCommentOrderResponseDto.kt */
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

        /* compiled from: ChannelsGetCommentOrderResponseDto.kt */
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ChannelsGetCommentOrderResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetCommentOrderResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentOrderResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ChannelsCommentOrderDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ChannelsGetCommentOrderResponseDto(arrayList, CurrentOrderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentOrderResponseDto[] newArray(int i) {
            return new ChannelsGetCommentOrderResponseDto[i];
        }
    }

    public ChannelsGetCommentOrderResponseDto(List<ChannelsCommentOrderDto> list, CurrentOrderDto currentOrderDto) {
        this.items = list;
        this.currentOrder = currentOrderDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetCommentOrderResponseDto)) {
            return false;
        }
        ChannelsGetCommentOrderResponseDto channelsGetCommentOrderResponseDto = (ChannelsGetCommentOrderResponseDto) obj;
        return epx.f(this.items, channelsGetCommentOrderResponseDto.items) && this.currentOrder == channelsGetCommentOrderResponseDto.currentOrder;
    }

    public final int hashCode() {
        return this.currentOrder.hashCode() + (this.items.hashCode() * 31);
    }

    public final String toString() {
        return "ChannelsGetCommentOrderResponseDto(items=" + this.items + ", currentOrder=" + this.currentOrder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsCommentOrderDto) a2.next()).writeToParcel(parcel, i);
        }
        this.currentOrder.writeToParcel(parcel, i);
    }
}
