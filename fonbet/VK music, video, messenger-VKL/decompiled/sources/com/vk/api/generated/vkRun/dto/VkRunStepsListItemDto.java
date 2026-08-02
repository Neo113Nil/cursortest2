package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: VkRunStepsListItemDto.kt */
/* loaded from: classes15.dex */
public final class VkRunStepsListItemDto implements Parcelable {
    public static final Parcelable.Creator<VkRunStepsListItemDto> CREATOR = new a();

    @pmi0("date")
    private final String date;

    @pmi0("details")
    private final List<VkRunStepsListItemDetailsDto> details;

    @pmi0("distance")
    private final int distance;

    @pmi0("manual_distance")
    private final Integer manualDistance;

    @pmi0("manual_steps")
    private final Integer manualSteps;

    @pmi0("steps")
    private final int steps;

    /* compiled from: VkRunStepsListItemDto.kt */
    public static final class a implements Parcelable.Creator<VkRunStepsListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunStepsListItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(VkRunStepsListItemDetailsDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new VkRunStepsListItemDto(readString, readInt, readInt2, valueOf, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunStepsListItemDto[] newArray(int i) {
            return new VkRunStepsListItemDto[i];
        }
    }

    public VkRunStepsListItemDto(String str, int i, int i2, Integer num, Integer num2, List<VkRunStepsListItemDetailsDto> list) {
        this.date = str;
        this.steps = i;
        this.distance = i2;
        this.manualSteps = num;
        this.manualDistance = num2;
        this.details = list;
    }

    public final String d() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.distance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunStepsListItemDto)) {
            return false;
        }
        VkRunStepsListItemDto vkRunStepsListItemDto = (VkRunStepsListItemDto) obj;
        return epx.f(this.date, vkRunStepsListItemDto.date) && this.steps == vkRunStepsListItemDto.steps && this.distance == vkRunStepsListItemDto.distance && epx.f(this.manualSteps, vkRunStepsListItemDto.manualSteps) && epx.f(this.manualDistance, vkRunStepsListItemDto.manualDistance) && epx.f(this.details, vkRunStepsListItemDto.details);
    }

    public final Integer f() {
        return this.manualDistance;
    }

    public final Integer g() {
        return this.manualSteps;
    }

    public final int hashCode() {
        int a2 = shy.a(this.distance, shy.a(this.steps, this.date.hashCode() * 31, 31), 31);
        Integer num = this.manualSteps;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.manualDistance;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<VkRunStepsListItemDetailsDto> list = this.details;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final int i() {
        return this.steps;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunStepsListItemDto(date=");
        sb.append(this.date);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", manualSteps=");
        sb.append(this.manualSteps);
        sb.append(", manualDistance=");
        sb.append(this.manualDistance);
        sb.append(", details=");
        return ms9.a(')', sb, this.details);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.date);
        parcel.writeInt(this.steps);
        parcel.writeInt(this.distance);
        Integer num = this.manualSteps;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.manualDistance;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<VkRunStepsListItemDetailsDto> list = this.details;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VkRunStepsListItemDetailsDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunStepsListItemDto(String str, int i, int i2, Integer num, Integer num2, List list, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : list);
    }
}
