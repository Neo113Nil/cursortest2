package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumImageViewRepoRefsDto.kt */
/* loaded from: classes14.dex */
public final class AtumImageViewRepoRefsDto implements Parcelable {
    public static final Parcelable.Creator<AtumImageViewRepoRefsDto> CREATOR = new a();

    @pmi0("blend_color")
    private final AtumRepositoryReferenceDto blendColor;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final AtumRepositoryReferenceDto imageUrl;

    @pmi0("local_image")
    private final AtumRepositoryReferenceDto localImage;

    /* compiled from: AtumImageViewRepoRefsDto.kt */
    public static final class a implements Parcelable.Creator<AtumImageViewRepoRefsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumImageViewRepoRefsDto createFromParcel(Parcel parcel) {
            return new AtumImageViewRepoRefsDto(parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumImageViewRepoRefsDto[] newArray(int i) {
            return new AtumImageViewRepoRefsDto[i];
        }
    }

    public AtumImageViewRepoRefsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumImageViewRepoRefsDto)) {
            return false;
        }
        AtumImageViewRepoRefsDto atumImageViewRepoRefsDto = (AtumImageViewRepoRefsDto) obj;
        return epx.f(this.imageUrl, atumImageViewRepoRefsDto.imageUrl) && epx.f(this.localImage, atumImageViewRepoRefsDto.localImage) && epx.f(this.blendColor, atumImageViewRepoRefsDto.blendColor);
    }

    public final int hashCode() {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.imageUrl;
        int hashCode = (atumRepositoryReferenceDto == null ? 0 : atumRepositoryReferenceDto.hashCode()) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.localImage;
        int hashCode2 = (hashCode + (atumRepositoryReferenceDto2 == null ? 0 : atumRepositoryReferenceDto2.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.blendColor;
        return hashCode2 + (atumRepositoryReferenceDto3 != null ? atumRepositoryReferenceDto3.hashCode() : 0);
    }

    public final String toString() {
        return "AtumImageViewRepoRefsDto(imageUrl=" + this.imageUrl + ", localImage=" + this.localImage + ", blendColor=" + this.blendColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.imageUrl;
        if (atumRepositoryReferenceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.localImage;
        if (atumRepositoryReferenceDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto2.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.blendColor;
        if (atumRepositoryReferenceDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto3.writeToParcel(parcel, i);
        }
    }

    public AtumImageViewRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3) {
        this.imageUrl = atumRepositoryReferenceDto;
        this.localImage = atumRepositoryReferenceDto2;
        this.blendColor = atumRepositoryReferenceDto3;
    }

    public /* synthetic */ AtumImageViewRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumRepositoryReferenceDto, (i & 2) != 0 ? null : atumRepositoryReferenceDto2, (i & 4) != 0 ? null : atumRepositoryReferenceDto3);
    }
}
