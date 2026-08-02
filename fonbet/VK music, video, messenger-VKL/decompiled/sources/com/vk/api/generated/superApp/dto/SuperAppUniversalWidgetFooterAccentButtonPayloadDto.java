package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: SuperAppUniversalWidgetFooterAccentButtonPayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetFooterAccentButtonPayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetFooterAccentButtonPayloadDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    /* compiled from: SuperAppUniversalWidgetFooterAccentButtonPayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetFooterAccentButtonPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetFooterAccentButtonPayloadDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetFooterAccentButtonPayloadDto(SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetFooterAccentButtonPayloadDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetFooterAccentButtonPayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetFooterAccentButtonPayloadDto[i];
        }
    }

    public SuperAppUniversalWidgetFooterAccentButtonPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
        this.title = superAppUniversalWidgetTextBlockDto;
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
        if (!(obj instanceof SuperAppUniversalWidgetFooterAccentButtonPayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetFooterAccentButtonPayloadDto superAppUniversalWidgetFooterAccentButtonPayloadDto = (SuperAppUniversalWidgetFooterAccentButtonPayloadDto) obj;
        return epx.f(this.title, superAppUniversalWidgetFooterAccentButtonPayloadDto.title) && epx.f(this.action, superAppUniversalWidgetFooterAccentButtonPayloadDto.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetFooterAccentButtonPayloadDto(title=" + this.title + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, i);
    }
}
