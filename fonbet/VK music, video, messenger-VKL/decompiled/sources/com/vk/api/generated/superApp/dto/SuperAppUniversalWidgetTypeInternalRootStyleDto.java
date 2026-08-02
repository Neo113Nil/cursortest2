package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeInternalRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInternalRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInternalRootStyleDto> CREATOR = new a();

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextStyleDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    /* compiled from: SuperAppUniversalWidgetTypeInternalRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInternalRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInternalRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeInternalRootStyleDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInternalRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInternalRootStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetTypeInternalRootStyleDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInternalRootStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInternalRootStyleDto superAppUniversalWidgetTypeInternalRootStyleDto = (SuperAppUniversalWidgetTypeInternalRootStyleDto) obj;
        return epx.f(this.title, superAppUniversalWidgetTypeInternalRootStyleDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeInternalRootStyleDto.subtitle);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        int hashCode = (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode()) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.subtitle;
        return hashCode + (superAppUniversalWidgetTextStyleDto2 != null ? superAppUniversalWidgetTextStyleDto2.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInternalRootStyleDto(title=" + this.title + ", subtitle=" + this.subtitle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        if (superAppUniversalWidgetTextStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.subtitle;
        if (superAppUniversalWidgetTextStyleDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto2.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeInternalRootStyleDto(SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2) {
        this.title = superAppUniversalWidgetTextStyleDto;
        this.subtitle = superAppUniversalWidgetTextStyleDto2;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInternalRootStyleDto(SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTextStyleDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextStyleDto2);
    }
}
