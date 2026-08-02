package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeScrollItemPayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeScrollItemPayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeScrollItemPayloadDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("badge")
    private final SuperAppUniversalWidgetBaseBadgeDto badge;

    @pmi0("description")
    private final SuperAppUniversalWidgetTextBlockDto description;

    @pmi0("image")
    private final SuperAppUniversalWidgetImageBlockDto image;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    /* compiled from: SuperAppUniversalWidgetTypeScrollItemPayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeScrollItemPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeScrollItemPayloadDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeScrollItemPayloadDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppUniversalWidgetTypeScrollItemPayloadDto.class.getClassLoader()), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeScrollItemPayloadDto.class.getClassLoader()), parcel.readInt() != 0 ? SuperAppUniversalWidgetBaseBadgeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeScrollItemPayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeScrollItemPayloadDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeScrollItemPayloadDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeScrollItemPayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeScrollItemPayloadDto superAppUniversalWidgetTypeScrollItemPayloadDto = (SuperAppUniversalWidgetTypeScrollItemPayloadDto) obj;
        return epx.f(this.title, superAppUniversalWidgetTypeScrollItemPayloadDto.title) && epx.f(this.description, superAppUniversalWidgetTypeScrollItemPayloadDto.description) && epx.f(this.image, superAppUniversalWidgetTypeScrollItemPayloadDto.image) && epx.f(this.action, superAppUniversalWidgetTypeScrollItemPayloadDto.action) && epx.f(this.badge, superAppUniversalWidgetTypeScrollItemPayloadDto.badge);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        int hashCode = (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode()) * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.description;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
        SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = this.image;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetImageBlockDto == null ? 0 : superAppUniversalWidgetImageBlockDto.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        int hashCode4 = (hashCode3 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
        SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = this.badge;
        return hashCode4 + (superAppUniversalWidgetBaseBadgeDto != null ? superAppUniversalWidgetBaseBadgeDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeScrollItemPayloadDto(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", action=" + this.action + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        if (superAppUniversalWidgetTextBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.description;
        if (superAppUniversalWidgetTextBlockDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.action, i);
        SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto = this.badge;
        if (superAppUniversalWidgetBaseBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetBaseBadgeDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeScrollItemPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto) {
        this.title = superAppUniversalWidgetTextBlockDto;
        this.description = superAppUniversalWidgetTextBlockDto2;
        this.image = superAppUniversalWidgetImageBlockDto;
        this.action = superAppUniversalWidgetActionDto;
        this.badge = superAppUniversalWidgetBaseBadgeDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeScrollItemPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetBaseBadgeDto superAppUniversalWidgetBaseBadgeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 4) != 0 ? null : superAppUniversalWidgetImageBlockDto, (i & 8) != 0 ? null : superAppUniversalWidgetActionDto, (i & 16) != 0 ? null : superAppUniversalWidgetBaseBadgeDto);
    }
}
