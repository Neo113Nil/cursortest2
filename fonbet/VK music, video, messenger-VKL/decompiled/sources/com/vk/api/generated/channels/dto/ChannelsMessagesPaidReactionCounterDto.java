package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ChannelsMessagesPaidReactionCounterDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsMessagesPaidReactionCounterDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsMessagesPaidReactionCounterDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("user_count")
    private final Integer userCount;

    /* compiled from: ChannelsMessagesPaidReactionCounterDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsMessagesPaidReactionCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsMessagesPaidReactionCounterDto createFromParcel(Parcel parcel) {
            return new ChannelsMessagesPaidReactionCounterDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsMessagesPaidReactionCounterDto[] newArray(int i) {
            return new ChannelsMessagesPaidReactionCounterDto[i];
        }
    }

    public ChannelsMessagesPaidReactionCounterDto(int i, Integer num) {
        this.count = i;
        this.userCount = num;
    }

    public final Integer d() {
        return this.userCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsMessagesPaidReactionCounterDto)) {
            return false;
        }
        ChannelsMessagesPaidReactionCounterDto channelsMessagesPaidReactionCounterDto = (ChannelsMessagesPaidReactionCounterDto) obj;
        return this.count == channelsMessagesPaidReactionCounterDto.count && epx.f(this.userCount, channelsMessagesPaidReactionCounterDto.userCount);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.userCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsMessagesPaidReactionCounterDto(count=");
        sb.append(this.count);
        sb.append(", userCount=");
        return uqi.b(sb, this.userCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Integer num = this.userCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ChannelsMessagesPaidReactionCounterDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
