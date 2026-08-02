package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ChannelsSearchMessagesResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSearchMessagesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsSearchMessagesResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ChannelsMessageDto> items;

    @pmi0("next_from")
    private final Integer nextFrom;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: ChannelsSearchMessagesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSearchMessagesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSearchMessagesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ChannelsMessageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ChannelsSearchMessagesResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSearchMessagesResponseDto[] newArray(int i) {
            return new ChannelsSearchMessagesResponseDto[i];
        }
    }

    public ChannelsSearchMessagesResponseDto(int i, List<ChannelsMessageDto> list, Integer num) {
        this.totalCount = i;
        this.items = list;
        this.nextFrom = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsSearchMessagesResponseDto)) {
            return false;
        }
        ChannelsSearchMessagesResponseDto channelsSearchMessagesResponseDto = (ChannelsSearchMessagesResponseDto) obj;
        return this.totalCount == channelsSearchMessagesResponseDto.totalCount && epx.f(this.items, channelsSearchMessagesResponseDto.items) && epx.f(this.nextFrom, channelsSearchMessagesResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.items);
        Integer num = this.nextFrom;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsSearchMessagesResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return uqi.b(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsMessageDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.nextFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ChannelsSearchMessagesResponseDto(int i, List list, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num);
    }
}
