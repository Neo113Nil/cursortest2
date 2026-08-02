package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: ChannelsReactionCountersResponseItemDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsReactionCountersResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsReactionCountersResponseItemDto> CREATOR = new a();

    @pmi0("counters")
    private final List<ChannelsReactionCounterResponseItemDto> counters;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("item_type")
    private final ItemTypeDto itemType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsReactionCountersResponseItemDto.kt */
    public static final class ItemTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemTypeDto[] $VALUES;

        @pmi0("comment")
        public static final ItemTypeDto COMMENT;
        public static final Parcelable.Creator<ItemTypeDto> CREATOR;

        @pmi0("message")
        public static final ItemTypeDto MESSAGE;
        private final String value;

        /* compiled from: ChannelsReactionCountersResponseItemDto.kt */
        public static final class a implements Parcelable.Creator<ItemTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ItemTypeDto createFromParcel(Parcel parcel) {
                return ItemTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ItemTypeDto[] newArray(int i) {
                return new ItemTypeDto[i];
            }
        }

        static {
            ItemTypeDto itemTypeDto = new ItemTypeDto("MESSAGE", 0, "message");
            MESSAGE = itemTypeDto;
            ItemTypeDto itemTypeDto2 = new ItemTypeDto("COMMENT", 1, "comment");
            COMMENT = itemTypeDto2;
            ItemTypeDto[] itemTypeDtoArr = {itemTypeDto, itemTypeDto2};
            $VALUES = itemTypeDtoArr;
            $ENTRIES = new asp(itemTypeDtoArr);
            CREATOR = new a();
        }

        private ItemTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ItemTypeDto valueOf(String str) {
            return (ItemTypeDto) Enum.valueOf(ItemTypeDto.class, str);
        }

        public static ItemTypeDto[] values() {
            return (ItemTypeDto[]) $VALUES.clone();
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

    /* compiled from: ChannelsReactionCountersResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsReactionCountersResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsReactionCountersResponseItemDto createFromParcel(Parcel parcel) {
            ItemTypeDto createFromParcel = ItemTypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ChannelsReactionCounterResponseItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ChannelsReactionCountersResponseItemDto(createFromParcel, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsReactionCountersResponseItemDto[] newArray(int i) {
            return new ChannelsReactionCountersResponseItemDto[i];
        }
    }

    public ChannelsReactionCountersResponseItemDto(ItemTypeDto itemTypeDto, int i, List<ChannelsReactionCounterResponseItemDto> list) {
        this.itemType = itemTypeDto;
        this.itemId = i;
        this.counters = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsReactionCountersResponseItemDto)) {
            return false;
        }
        ChannelsReactionCountersResponseItemDto channelsReactionCountersResponseItemDto = (ChannelsReactionCountersResponseItemDto) obj;
        return this.itemType == channelsReactionCountersResponseItemDto.itemType && this.itemId == channelsReactionCountersResponseItemDto.itemId && epx.f(this.counters, channelsReactionCountersResponseItemDto.counters);
    }

    public final int hashCode() {
        return this.counters.hashCode() + shy.a(this.itemId, this.itemType.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsReactionCountersResponseItemDto(itemType=");
        sb.append(this.itemType);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", counters=");
        return ms9.a(')', sb, this.counters);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.itemType.writeToParcel(parcel, i);
        parcel.writeInt(this.itemId);
        Iterator a2 = ao.a(parcel, this.counters);
        while (a2.hasNext()) {
            ((ChannelsReactionCounterResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
