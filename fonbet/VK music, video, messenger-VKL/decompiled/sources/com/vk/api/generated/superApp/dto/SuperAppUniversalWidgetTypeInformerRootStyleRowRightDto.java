package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto> CREATOR = new a();

    @pmi0("button")
    private final SuperAppUniversalWidgetButtonStyleDto button;

    @pmi0("counter")
    private final SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto counter;

    @pmi0("icon")
    private final SuperAppUniversalWidgetIconStyleDto icon;

    @pmi0("image_stack")
    private final SuperAppUniversalWidgetImageStackStyleDto imageStack;

    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetIconStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetImageStackStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto() {
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
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto superAppUniversalWidgetTypeInformerRootStyleRowRightDto = (SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto) obj;
        return epx.f(this.icon, superAppUniversalWidgetTypeInformerRootStyleRowRightDto.icon) && epx.f(this.counter, superAppUniversalWidgetTypeInformerRootStyleRowRightDto.counter) && epx.f(this.button, superAppUniversalWidgetTypeInformerRootStyleRowRightDto.button) && epx.f(this.imageStack, superAppUniversalWidgetTypeInformerRootStyleRowRightDto.imageStack);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = this.icon;
        int hashCode = (superAppUniversalWidgetIconStyleDto == null ? 0 : superAppUniversalWidgetIconStyleDto.hashCode()) * 31;
        SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto = this.counter;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto == null ? 0 : superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.hashCode())) * 31;
        SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto = this.button;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetButtonStyleDto == null ? 0 : superAppUniversalWidgetButtonStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetImageStackStyleDto superAppUniversalWidgetImageStackStyleDto = this.imageStack;
        return hashCode3 + (superAppUniversalWidgetImageStackStyleDto != null ? superAppUniversalWidgetImageStackStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto(icon=" + this.icon + ", counter=" + this.counter + ", button=" + this.button + ", imageStack=" + this.imageStack + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = this.icon;
        if (superAppUniversalWidgetIconStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetIconStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto = this.counter;
        if (superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto = this.button;
        if (superAppUniversalWidgetButtonStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetImageStackStyleDto superAppUniversalWidgetImageStackStyleDto = this.imageStack;
        if (superAppUniversalWidgetImageStackStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetImageStackStyleDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto(SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto, SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto, SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto, SuperAppUniversalWidgetImageStackStyleDto superAppUniversalWidgetImageStackStyleDto) {
        this.icon = superAppUniversalWidgetIconStyleDto;
        this.counter = superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto;
        this.button = superAppUniversalWidgetButtonStyleDto;
        this.imageStack = superAppUniversalWidgetImageStackStyleDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto(SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto, SuperAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto, SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto, SuperAppUniversalWidgetImageStackStyleDto superAppUniversalWidgetImageStackStyleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetIconStyleDto, (i & 2) != 0 ? null : superAppUniversalWidgetTypeInformerRootStyleRowRightCounterDto, (i & 4) != 0 ? null : superAppUniversalWidgetButtonStyleDto, (i & 8) != 0 ? null : superAppUniversalWidgetImageStackStyleDto);
    }
}
