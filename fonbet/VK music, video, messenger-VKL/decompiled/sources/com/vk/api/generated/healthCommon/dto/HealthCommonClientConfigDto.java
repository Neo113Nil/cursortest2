package com.vk.api.generated.healthCommon.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: HealthCommonClientConfigDto.kt */
/* loaded from: classes14.dex */
public final class HealthCommonClientConfigDto implements Parcelable {
    public static final Parcelable.Creator<HealthCommonClientConfigDto> CREATOR = new a();

    @pmi0("vkrun")
    private final HealthCommonClientConfigVkrunDto vkrun;

    @pmi0("vkstart")
    private final HealthCommonClientConfigVkstartDto vkstart;

    @pmi0("vkstart_widget")
    private final HealthCommonClientConfigVkstartWidgetDto vkstartWidget;

    /* compiled from: HealthCommonClientConfigDto.kt */
    public static final class a implements Parcelable.Creator<HealthCommonClientConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigDto createFromParcel(Parcel parcel) {
            return new HealthCommonClientConfigDto(HealthCommonClientConfigVkrunDto.CREATOR.createFromParcel(parcel), HealthCommonClientConfigVkstartDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HealthCommonClientConfigVkstartWidgetDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HealthCommonClientConfigDto[] newArray(int i) {
            return new HealthCommonClientConfigDto[i];
        }
    }

    public HealthCommonClientConfigDto(HealthCommonClientConfigVkrunDto healthCommonClientConfigVkrunDto, HealthCommonClientConfigVkstartDto healthCommonClientConfigVkstartDto, HealthCommonClientConfigVkstartWidgetDto healthCommonClientConfigVkstartWidgetDto) {
        this.vkrun = healthCommonClientConfigVkrunDto;
        this.vkstart = healthCommonClientConfigVkstartDto;
        this.vkstartWidget = healthCommonClientConfigVkstartWidgetDto;
    }

    public final HealthCommonClientConfigVkrunDto d() {
        return this.vkrun;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final HealthCommonClientConfigVkstartDto e() {
        return this.vkstart;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthCommonClientConfigDto)) {
            return false;
        }
        HealthCommonClientConfigDto healthCommonClientConfigDto = (HealthCommonClientConfigDto) obj;
        return epx.f(this.vkrun, healthCommonClientConfigDto.vkrun) && epx.f(this.vkstart, healthCommonClientConfigDto.vkstart) && epx.f(this.vkstartWidget, healthCommonClientConfigDto.vkstartWidget);
    }

    public final HealthCommonClientConfigVkstartWidgetDto f() {
        return this.vkstartWidget;
    }

    public final int hashCode() {
        int hashCode = (this.vkstart.hashCode() + (this.vkrun.hashCode() * 31)) * 31;
        HealthCommonClientConfigVkstartWidgetDto healthCommonClientConfigVkstartWidgetDto = this.vkstartWidget;
        return hashCode + (healthCommonClientConfigVkstartWidgetDto == null ? 0 : healthCommonClientConfigVkstartWidgetDto.hashCode());
    }

    public final String toString() {
        return "HealthCommonClientConfigDto(vkrun=" + this.vkrun + ", vkstart=" + this.vkstart + ", vkstartWidget=" + this.vkstartWidget + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.vkrun.writeToParcel(parcel, i);
        this.vkstart.writeToParcel(parcel, i);
        HealthCommonClientConfigVkstartWidgetDto healthCommonClientConfigVkstartWidgetDto = this.vkstartWidget;
        if (healthCommonClientConfigVkstartWidgetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            healthCommonClientConfigVkstartWidgetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ HealthCommonClientConfigDto(HealthCommonClientConfigVkrunDto healthCommonClientConfigVkrunDto, HealthCommonClientConfigVkstartDto healthCommonClientConfigVkstartDto, HealthCommonClientConfigVkstartWidgetDto healthCommonClientConfigVkstartWidgetDto, int i, zcl zclVar) {
        this(healthCommonClientConfigVkrunDto, healthCommonClientConfigVkstartDto, (i & 4) != 0 ? null : healthCommonClientConfigVkstartWidgetDto);
    }
}
