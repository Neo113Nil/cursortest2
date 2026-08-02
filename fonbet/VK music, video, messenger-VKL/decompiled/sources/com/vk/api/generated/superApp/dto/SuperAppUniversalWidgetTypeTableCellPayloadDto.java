package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeTableCellPayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeTableCellPayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeTableCellPayloadDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("image")
    private final SuperAppUniversalWidgetImageBlockDto image;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextBlockDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    @pmi0("user_stack")
    private final SuperAppUniversalWidgetUserStackBasePayloadDto userStack;

    /* compiled from: SuperAppUniversalWidgetTypeTableCellPayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeTableCellPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeTableCellPayloadDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeTableCellPayloadDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppUniversalWidgetTypeTableCellPayloadDto.class.getClassLoader()), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeTableCellPayloadDto.class.getClassLoader()), parcel.readInt() != 0 ? SuperAppUniversalWidgetUserStackBasePayloadDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeTableCellPayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeTableCellPayloadDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeTableCellPayloadDto() {
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
        if (!(obj instanceof SuperAppUniversalWidgetTypeTableCellPayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeTableCellPayloadDto superAppUniversalWidgetTypeTableCellPayloadDto = (SuperAppUniversalWidgetTypeTableCellPayloadDto) obj;
        return epx.f(this.title, superAppUniversalWidgetTypeTableCellPayloadDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeTableCellPayloadDto.subtitle) && epx.f(this.image, superAppUniversalWidgetTypeTableCellPayloadDto.image) && epx.f(this.action, superAppUniversalWidgetTypeTableCellPayloadDto.action) && epx.f(this.userStack, superAppUniversalWidgetTypeTableCellPayloadDto.userStack);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        int hashCode = (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode()) * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
        SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = this.image;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetImageBlockDto == null ? 0 : superAppUniversalWidgetImageBlockDto.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        int hashCode4 = (hashCode3 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
        SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto = this.userStack;
        return hashCode4 + (superAppUniversalWidgetUserStackBasePayloadDto != null ? superAppUniversalWidgetUserStackBasePayloadDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeTableCellPayloadDto(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", action=" + this.action + ", userStack=" + this.userStack + ')';
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
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.subtitle;
        if (superAppUniversalWidgetTextBlockDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.action, i);
        SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto = this.userStack;
        if (superAppUniversalWidgetUserStackBasePayloadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetUserStackBasePayloadDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeTableCellPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto) {
        this.title = superAppUniversalWidgetTextBlockDto;
        this.subtitle = superAppUniversalWidgetTextBlockDto2;
        this.image = superAppUniversalWidgetImageBlockDto;
        this.action = superAppUniversalWidgetActionDto;
        this.userStack = superAppUniversalWidgetUserStackBasePayloadDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeTableCellPayloadDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 4) != 0 ? null : superAppUniversalWidgetImageBlockDto, (i & 8) != 0 ? null : superAppUniversalWidgetActionDto, (i & 16) != 0 ? null : superAppUniversalWidgetUserStackBasePayloadDto);
    }
}
