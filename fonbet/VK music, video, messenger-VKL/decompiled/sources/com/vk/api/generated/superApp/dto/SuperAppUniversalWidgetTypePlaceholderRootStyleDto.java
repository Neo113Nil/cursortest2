package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypePlaceholderRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypePlaceholderRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypePlaceholderRootStyleDto> CREATOR = new a();

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    /* compiled from: SuperAppUniversalWidgetTypePlaceholderRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypePlaceholderRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypePlaceholderRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypePlaceholderRootStyleDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypePlaceholderRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypePlaceholderRootStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetTypePlaceholderRootStyleDto() {
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
        return (obj instanceof SuperAppUniversalWidgetTypePlaceholderRootStyleDto) && epx.f(this.title, ((SuperAppUniversalWidgetTypePlaceholderRootStyleDto) obj).title);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        if (superAppUniversalWidgetTextStyleDto == null) {
            return 0;
        }
        return superAppUniversalWidgetTextStyleDto.hashCode();
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypePlaceholderRootStyleDto(title=" + this.title + ')';
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
    }

    public SuperAppUniversalWidgetTypePlaceholderRootStyleDto(SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto) {
        this.title = superAppUniversalWidgetTextStyleDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypePlaceholderRootStyleDto(SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTextStyleDto);
    }
}
