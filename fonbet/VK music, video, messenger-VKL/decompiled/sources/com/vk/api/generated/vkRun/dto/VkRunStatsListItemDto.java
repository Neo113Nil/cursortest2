package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkRunStatsListItemDto.kt */
/* loaded from: classes15.dex */
public final class VkRunStatsListItemDto implements Parcelable {
    public static final Parcelable.Creator<VkRunStatsListItemDto> CREATOR = new a();

    @pmi0("date")
    private final String date;

    @pmi0("distance")
    private final int distance;

    @pmi0("is_target_reached")
    private final Boolean isTargetReached;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("steps")
    private final int steps;

    @pmi0("target")
    private final Integer target;

    @pmi0("target_percent")
    private final Integer targetPercent;

    /* compiled from: VkRunStatsListItemDto.kt */
    public static final class a implements Parcelable.Creator<VkRunStatsListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunStatsListItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkRunStatsListItemDto(readString, readInt, readInt2, valueOf2, valueOf3, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunStatsListItemDto[] newArray(int i) {
            return new VkRunStatsListItemDto[i];
        }
    }

    public VkRunStatsListItemDto(String str, int i, int i2, Integer num, Integer num2, Boolean bool, Integer num3) {
        this.date = str;
        this.steps = i;
        this.distance = i2;
        this.target = num;
        this.targetPercent = num2;
        this.isTargetReached = bool;
        this.position = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunStatsListItemDto)) {
            return false;
        }
        VkRunStatsListItemDto vkRunStatsListItemDto = (VkRunStatsListItemDto) obj;
        return epx.f(this.date, vkRunStatsListItemDto.date) && this.steps == vkRunStatsListItemDto.steps && this.distance == vkRunStatsListItemDto.distance && epx.f(this.target, vkRunStatsListItemDto.target) && epx.f(this.targetPercent, vkRunStatsListItemDto.targetPercent) && epx.f(this.isTargetReached, vkRunStatsListItemDto.isTargetReached) && epx.f(this.position, vkRunStatsListItemDto.position);
    }

    public final int hashCode() {
        int a2 = shy.a(this.distance, shy.a(this.steps, this.date.hashCode() * 31, 31), 31);
        Integer num = this.target;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.targetPercent;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isTargetReached;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.position;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunStatsListItemDto(date=");
        sb.append(this.date);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", targetPercent=");
        sb.append(this.targetPercent);
        sb.append(", isTargetReached=");
        sb.append(this.isTargetReached);
        sb.append(", position=");
        return uqi.b(sb, this.position, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.date);
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
        Integer num = this.target;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.targetPercent;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.isTargetReached;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.position;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ VkRunStatsListItemDto(String str, int i, int i2, Integer num, Integer num2, Boolean bool, Integer num3, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : num3);
    }
}
