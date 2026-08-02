package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetFooterTextAndButtonPayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetFooterTextAndButtonPayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetFooterTextAndButtonPayloadDto> CREATOR = new a();

    @pmi0("button")
    private final SuperAppUniversalWidgetButtonDto button;

    @pmi0("text")
    private final SuperAppUniversalWidgetTextBlockDto text;

    /* compiled from: SuperAppUniversalWidgetFooterTextAndButtonPayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetFooterTextAndButtonPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetFooterTextAndButtonPayloadDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetFooterTextAndButtonPayloadDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetFooterTextAndButtonPayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetFooterTextAndButtonPayloadDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetFooterTextAndButtonPayloadDto() {
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
        if (!(obj instanceof SuperAppUniversalWidgetFooterTextAndButtonPayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetFooterTextAndButtonPayloadDto superAppUniversalWidgetFooterTextAndButtonPayloadDto = (SuperAppUniversalWidgetFooterTextAndButtonPayloadDto) obj;
        return epx.f(this.text, superAppUniversalWidgetFooterTextAndButtonPayloadDto.text) && epx.f(this.button, superAppUniversalWidgetFooterTextAndButtonPayloadDto.button);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.text;
        int hashCode = (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode()) * 31;
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
        return hashCode + (superAppUniversalWidgetButtonDto != null ? superAppUniversalWidgetButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetFooterTextAndButtonPayloadDto(text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.text;
        if (superAppUniversalWidgetTextBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
        if (superAppUniversalWidgetButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetFooterTextAndButtonPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto) {
        this.text = superAppUniversalWidgetTextBlockDto;
        this.button = superAppUniversalWidgetButtonDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetFooterTextAndButtonPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 2) != 0 ? null : superAppUniversalWidgetButtonDto);
    }
}
