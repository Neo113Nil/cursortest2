package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VkRunStepsListItemDetailsDto.kt */
/* loaded from: classes15.dex */
public final class VkRunStepsListItemDetailsDto implements Parcelable {
    public static final Parcelable.Creator<VkRunStepsListItemDetailsDto> CREATOR = new a();

    @pmi0("distance")
    private final Integer distance;

    @pmi0("is_manual")
    private final Boolean isManual;

    @pmi0("source_id")
    private final String sourceId;

    @pmi0("steps")
    private final Integer steps;

    /* compiled from: VkRunStepsListItemDetailsDto.kt */
    public static final class a implements Parcelable.Creator<VkRunStepsListItemDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunStepsListItemDetailsDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkRunStepsListItemDetailsDto(valueOf, valueOf2, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunStepsListItemDetailsDto[] newArray(int i) {
            return new VkRunStepsListItemDetailsDto[i];
        }
    }

    public VkRunStepsListItemDetailsDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunStepsListItemDetailsDto)) {
            return false;
        }
        VkRunStepsListItemDetailsDto vkRunStepsListItemDetailsDto = (VkRunStepsListItemDetailsDto) obj;
        return epx.f(this.steps, vkRunStepsListItemDetailsDto.steps) && epx.f(this.distance, vkRunStepsListItemDetailsDto.distance) && epx.f(this.isManual, vkRunStepsListItemDetailsDto.isManual) && epx.f(this.sourceId, vkRunStepsListItemDetailsDto.sourceId);
    }

    public final int hashCode() {
        Integer num = this.steps;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.distance;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isManual;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sourceId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunStepsListItemDetailsDto(steps=");
        sb.append(this.steps);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", isManual=");
        sb.append(this.isManual);
        sb.append(", sourceId=");
        return ho8.a(sb, this.sourceId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.steps;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.distance;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.isManual;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.sourceId);
    }

    public VkRunStepsListItemDetailsDto(Integer num, Integer num2, Boolean bool, String str) {
        this.steps = num;
        this.distance = num2;
        this.isManual = bool;
        this.sourceId = str;
    }

    public /* synthetic */ VkRunStepsListItemDetailsDto(Integer num, Integer num2, Boolean bool, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str);
    }
}
