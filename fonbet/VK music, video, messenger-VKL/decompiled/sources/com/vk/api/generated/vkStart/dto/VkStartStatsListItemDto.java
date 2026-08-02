package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.hihealth.data.Field;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkStartStatsListItemDto.kt */
/* loaded from: classes15.dex */
public final class VkStartStatsListItemDto implements Parcelable {
    public static final Parcelable.Creator<VkStartStatsListItemDto> CREATOR = new a();

    @pmi0("activity_count")
    private final Integer activityCount;

    @pmi0(Field.NUTRIENTS_FACTS_CALORIES)
    private final Integer calories;

    @pmi0("date")
    private final String date;

    @pmi0("distance_meters")
    private final Integer distanceMeters;

    @pmi0("duration_ms")
    private final Integer durationMs;

    /* compiled from: VkStartStatsListItemDto.kt */
    public static final class a implements Parcelable.Creator<VkStartStatsListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartStatsListItemDto createFromParcel(Parcel parcel) {
            return new VkStartStatsListItemDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartStatsListItemDto[] newArray(int i) {
            return new VkStartStatsListItemDto[i];
        }
    }

    public VkStartStatsListItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer d() {
        return this.activityCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.distanceMeters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkStartStatsListItemDto)) {
            return false;
        }
        VkStartStatsListItemDto vkStartStatsListItemDto = (VkStartStatsListItemDto) obj;
        return epx.f(this.date, vkStartStatsListItemDto.date) && epx.f(this.distanceMeters, vkStartStatsListItemDto.distanceMeters) && epx.f(this.calories, vkStartStatsListItemDto.calories) && epx.f(this.durationMs, vkStartStatsListItemDto.durationMs) && epx.f(this.activityCount, vkStartStatsListItemDto.activityCount);
    }

    public final int hashCode() {
        String str = this.date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.distanceMeters;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.calories;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.durationMs;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.activityCount;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkStartStatsListItemDto(date=");
        sb.append(this.date);
        sb.append(", distanceMeters=");
        sb.append(this.distanceMeters);
        sb.append(", calories=");
        sb.append(this.calories);
        sb.append(", durationMs=");
        sb.append(this.durationMs);
        sb.append(", activityCount=");
        return uqi.b(sb, this.activityCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.date);
        Integer num = this.distanceMeters;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.calories;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.durationMs;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.activityCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public VkStartStatsListItemDto(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.date = str;
        this.distanceMeters = num;
        this.calories = num2;
        this.durationMs = num3;
        this.activityCount = num4;
    }

    public /* synthetic */ VkStartStatsListItemDto(String str, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }
}
