package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetButtonStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetButtonStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetButtonStyleDto> CREATOR = new a();

    @pmi0("type")
    private final SuperAppUniversalWidgetButtonStyleTypeDto type;

    /* compiled from: SuperAppUniversalWidgetButtonStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetButtonStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetButtonStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetButtonStyleDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonStyleTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetButtonStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetButtonStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetButtonStyleDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppUniversalWidgetButtonStyleDto) && this.type == ((SuperAppUniversalWidgetButtonStyleDto) obj).type;
    }

    public final int hashCode() {
        SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto = this.type;
        if (superAppUniversalWidgetButtonStyleTypeDto == null) {
            return 0;
        }
        return superAppUniversalWidgetButtonStyleTypeDto.hashCode();
    }

    public final String toString() {
        return "SuperAppUniversalWidgetButtonStyleDto(type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto = this.type;
        if (superAppUniversalWidgetButtonStyleTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonStyleTypeDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetButtonStyleDto(SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto) {
        this.type = superAppUniversalWidgetButtonStyleTypeDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetButtonStyleDto(SuperAppUniversalWidgetButtonStyleTypeDto superAppUniversalWidgetButtonStyleTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetButtonStyleTypeDto);
    }
}
