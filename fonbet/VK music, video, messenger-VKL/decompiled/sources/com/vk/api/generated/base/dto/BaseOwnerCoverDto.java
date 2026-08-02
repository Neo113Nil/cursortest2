package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BaseOwnerCoverDto.kt */
/* loaded from: classes14.dex */
public final class BaseOwnerCoverDto implements Parcelable {
    public static final Parcelable.Creator<BaseOwnerCoverDto> CREATOR = new a();

    @pmi0("crop_params")
    private final BaseOwnerCoverCropParamsDto cropParams;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("original_image")
    private final BaseImageDto originalImage;

    @pmi0("photo_id")
    private final Integer photoId;

    /* compiled from: BaseOwnerCoverDto.kt */
    public static final class a implements Parcelable.Creator<BaseOwnerCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseOwnerCoverDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            BaseBoolIntDto createFromParcel = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new BaseOwnerCoverDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : BaseOwnerCoverCropParamsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BaseImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseOwnerCoverDto[] newArray(int i) {
            return new BaseOwnerCoverDto[i];
        }
    }

    public BaseOwnerCoverDto(BaseBoolIntDto baseBoolIntDto, List<BaseImageDto> list, BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto, BaseImageDto baseImageDto, Integer num) {
        this.enabled = baseBoolIntDto;
        this.images = list;
        this.cropParams = baseOwnerCoverCropParamsDto;
        this.originalImage = baseImageDto;
        this.photoId = num;
    }

    public final BaseBoolIntDto d() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOwnerCoverDto)) {
            return false;
        }
        BaseOwnerCoverDto baseOwnerCoverDto = (BaseOwnerCoverDto) obj;
        return this.enabled == baseOwnerCoverDto.enabled && epx.f(this.images, baseOwnerCoverDto.images) && epx.f(this.cropParams, baseOwnerCoverDto.cropParams) && epx.f(this.originalImage, baseOwnerCoverDto.originalImage) && epx.f(this.photoId, baseOwnerCoverDto.photoId);
    }

    public final Integer f() {
        return this.photoId;
    }

    public final int hashCode() {
        int hashCode = this.enabled.hashCode() * 31;
        List<BaseImageDto> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto = this.cropParams;
        int hashCode3 = (hashCode2 + (baseOwnerCoverCropParamsDto == null ? 0 : baseOwnerCoverCropParamsDto.hashCode())) * 31;
        BaseImageDto baseImageDto = this.originalImage;
        int hashCode4 = (hashCode3 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        Integer num = this.photoId;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseOwnerCoverDto(enabled=");
        sb.append(this.enabled);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", cropParams=");
        sb.append(this.cropParams);
        sb.append(", originalImage=");
        sb.append(this.originalImage);
        sb.append(", photoId=");
        return uqi.b(sb, this.photoId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.enabled.writeToParcel(parcel, i);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto = this.cropParams;
        if (baseOwnerCoverCropParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseOwnerCoverCropParamsDto.writeToParcel(parcel, i);
        }
        BaseImageDto baseImageDto = this.originalImage;
        if (baseImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseImageDto.writeToParcel(parcel, i);
        }
        Integer num = this.photoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ BaseOwnerCoverDto(BaseBoolIntDto baseBoolIntDto, List list, BaseOwnerCoverCropParamsDto baseOwnerCoverCropParamsDto, BaseImageDto baseImageDto, Integer num, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : baseOwnerCoverCropParamsDto, (i & 8) != 0 ? null : baseImageDto, (i & 16) != 0 ? null : num);
    }
}
