package com.vk.api.generated.vkStart.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.hihealth.data.Field;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkStartInputActivityProgressDto.kt */
/* loaded from: classes15.dex */
public final class VkStartInputActivityProgressDto implements Parcelable {
    public static final Parcelable.Creator<VkStartInputActivityProgressDto> CREATOR = new a();

    @pmi0("active_time_ms")
    private final Long activeTimeMs;

    @pmi0("active_time_seconds")
    private final Integer activeTimeSeconds;

    @pmi0("altitude_gain_meters")
    private final Integer altitudeGainMeters;

    @pmi0("avg_pulse_beats")
    private final Integer avgPulseBeats;

    @pmi0("cadence_steps")
    private final Integer cadenceSteps;

    @pmi0(Field.NUTRIENTS_FACTS_CALORIES)
    private final int calories;

    @pmi0("distance_meters")
    private final int distanceMeters;

    @pmi0("pace_meters")
    private final Integer paceMeters;

    /* compiled from: VkStartInputActivityProgressDto.kt */
    public static final class a implements Parcelable.Creator<VkStartInputActivityProgressDto> {
        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityProgressDto createFromParcel(Parcel parcel) {
            return new VkStartInputActivityProgressDto(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkStartInputActivityProgressDto[] newArray(int i) {
            return new VkStartInputActivityProgressDto[i];
        }
    }

    public VkStartInputActivityProgressDto(int i, int i2, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.distanceMeters = i;
        this.calories = i2;
        this.activeTimeSeconds = num;
        this.activeTimeMs = l;
        this.paceMeters = num2;
        this.avgPulseBeats = num3;
        this.altitudeGainMeters = num4;
        this.cadenceSteps = num5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkStartInputActivityProgressDto)) {
            return false;
        }
        VkStartInputActivityProgressDto vkStartInputActivityProgressDto = (VkStartInputActivityProgressDto) obj;
        return this.distanceMeters == vkStartInputActivityProgressDto.distanceMeters && this.calories == vkStartInputActivityProgressDto.calories && epx.f(this.activeTimeSeconds, vkStartInputActivityProgressDto.activeTimeSeconds) && epx.f(this.activeTimeMs, vkStartInputActivityProgressDto.activeTimeMs) && epx.f(this.paceMeters, vkStartInputActivityProgressDto.paceMeters) && epx.f(this.avgPulseBeats, vkStartInputActivityProgressDto.avgPulseBeats) && epx.f(this.altitudeGainMeters, vkStartInputActivityProgressDto.altitudeGainMeters) && epx.f(this.cadenceSteps, vkStartInputActivityProgressDto.cadenceSteps);
    }

    public final int hashCode() {
        int a2 = shy.a(this.calories, Integer.hashCode(this.distanceMeters) * 31, 31);
        Integer num = this.activeTimeSeconds;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.activeTimeMs;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.paceMeters;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.avgPulseBeats;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.altitudeGainMeters;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.cadenceSteps;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkStartInputActivityProgressDto(distanceMeters=");
        sb.append(this.distanceMeters);
        sb.append(", calories=");
        sb.append(this.calories);
        sb.append(", activeTimeSeconds=");
        sb.append(this.activeTimeSeconds);
        sb.append(", activeTimeMs=");
        sb.append(this.activeTimeMs);
        sb.append(", paceMeters=");
        sb.append(this.paceMeters);
        sb.append(", avgPulseBeats=");
        sb.append(this.avgPulseBeats);
        sb.append(", altitudeGainMeters=");
        sb.append(this.altitudeGainMeters);
        sb.append(", cadenceSteps=");
        return uqi.b(sb, this.cadenceSteps, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.distanceMeters);
        parcel.writeInt(this.calories);
        Integer num = this.activeTimeSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Long l = this.activeTimeMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Integer num2 = this.paceMeters;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.avgPulseBeats;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.altitudeGainMeters;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.cadenceSteps;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public /* synthetic */ VkStartInputActivityProgressDto(int i, int i2, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : l, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? null : num4, (i3 & 128) != 0 ? null : num5);
    }
}
