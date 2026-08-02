package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeCounterItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeCounterItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeCounterItemDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("counter")
    private final SuperAppUniversalWidgetTextBlockDto counter;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextBlockDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    /* compiled from: SuperAppUniversalWidgetTypeCounterItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeCounterItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeCounterItemDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<SuperAppUniversalWidgetTextBlockDto> creator = SuperAppUniversalWidgetTextBlockDto.CREATOR;
            return new SuperAppUniversalWidgetTypeCounterItemDto(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeCounterItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeCounterItemDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeCounterItemDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeCounterItemDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
        this.counter = superAppUniversalWidgetTextBlockDto;
        this.title = superAppUniversalWidgetTextBlockDto2;
        this.subtitle = superAppUniversalWidgetTextBlockDto3;
        this.action = superAppUniversalWidgetActionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeCounterItemDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeCounterItemDto superAppUniversalWidgetTypeCounterItemDto = (SuperAppUniversalWidgetTypeCounterItemDto) obj;
        return epx.f(this.counter, superAppUniversalWidgetTypeCounterItemDto.counter) && epx.f(this.title, superAppUniversalWidgetTypeCounterItemDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeCounterItemDto.subtitle) && epx.f(this.action, superAppUniversalWidgetTypeCounterItemDto.action);
    }

    public final int hashCode() {
        int hashCode = this.counter.hashCode() * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        return hashCode3 + (superAppUniversalWidgetActionDto != null ? superAppUniversalWidgetActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeCounterItemDto(counter=" + this.counter + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.counter.writeToParcel(parcel, i);
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        if (superAppUniversalWidgetTextBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
        if (superAppUniversalWidgetTextBlockDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeCounterItemDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, int i, zcl zclVar) {
        this(superAppUniversalWidgetTextBlockDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 4) != 0 ? null : superAppUniversalWidgetTextBlockDto3, (i & 8) != 0 ? null : superAppUniversalWidgetActionDto);
    }
}
