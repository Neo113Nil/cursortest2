package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AtumVkuiAvatarPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiAvatarPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiAvatarPropsDto> CREATOR = new a();

    @pmi0("badge_container")
    private final AtumVkuiBadgeContainerDto badgeContainer;

    @pmi0("border_color")
    private final AtumVkuiColorNameDto borderColor;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final AtumVkuiAvatarContentDto content;

    @pmi0("is_user_interaction_enabled")
    private final Boolean isUserInteractionEnabled;

    @pmi0("overlay")
    private final AtumVkuiIconOverlayDto overlay;

    @pmi0("size")
    private final AtumVkuiPictureSizeDto size;

    /* compiled from: AtumVkuiAvatarPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiAvatarPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiAvatarPropsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AtumVkuiIconOverlayDto createFromParcel = AtumVkuiIconOverlayDto.CREATOR.createFromParcel(parcel);
            AtumVkuiAvatarContentDto atumVkuiAvatarContentDto = (AtumVkuiAvatarContentDto) parcel.readParcelable(AtumVkuiAvatarPropsDto.class.getClassLoader());
            AtumVkuiColorNameDto createFromParcel2 = parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel);
            AtumVkuiPictureSizeDto createFromParcel3 = parcel.readInt() == 0 ? null : AtumVkuiPictureSizeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtumVkuiAvatarPropsDto(createFromParcel, atumVkuiAvatarContentDto, createFromParcel2, createFromParcel3, valueOf, parcel.readInt() != 0 ? AtumVkuiBadgeContainerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiAvatarPropsDto[] newArray(int i) {
            return new AtumVkuiAvatarPropsDto[i];
        }
    }

    public AtumVkuiAvatarPropsDto(AtumVkuiIconOverlayDto atumVkuiIconOverlayDto, AtumVkuiAvatarContentDto atumVkuiAvatarContentDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumVkuiPictureSizeDto atumVkuiPictureSizeDto, Boolean bool, AtumVkuiBadgeContainerDto atumVkuiBadgeContainerDto) {
        this.overlay = atumVkuiIconOverlayDto;
        this.content = atumVkuiAvatarContentDto;
        this.borderColor = atumVkuiColorNameDto;
        this.size = atumVkuiPictureSizeDto;
        this.isUserInteractionEnabled = bool;
        this.badgeContainer = atumVkuiBadgeContainerDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiAvatarPropsDto)) {
            return false;
        }
        AtumVkuiAvatarPropsDto atumVkuiAvatarPropsDto = (AtumVkuiAvatarPropsDto) obj;
        return epx.f(this.overlay, atumVkuiAvatarPropsDto.overlay) && epx.f(this.content, atumVkuiAvatarPropsDto.content) && this.borderColor == atumVkuiAvatarPropsDto.borderColor && this.size == atumVkuiAvatarPropsDto.size && epx.f(this.isUserInteractionEnabled, atumVkuiAvatarPropsDto.isUserInteractionEnabled) && epx.f(this.badgeContainer, atumVkuiAvatarPropsDto.badgeContainer);
    }

    public final int hashCode() {
        int hashCode = (this.content.hashCode() + (this.overlay.hashCode() * 31)) * 31;
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.borderColor;
        int hashCode2 = (hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode())) * 31;
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto = this.size;
        int hashCode3 = (hashCode2 + (atumVkuiPictureSizeDto == null ? 0 : atumVkuiPictureSizeDto.hashCode())) * 31;
        Boolean bool = this.isUserInteractionEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtumVkuiBadgeContainerDto atumVkuiBadgeContainerDto = this.badgeContainer;
        return hashCode4 + (atumVkuiBadgeContainerDto != null ? atumVkuiBadgeContainerDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiAvatarPropsDto(overlay=" + this.overlay + ", content=" + this.content + ", borderColor=" + this.borderColor + ", size=" + this.size + ", isUserInteractionEnabled=" + this.isUserInteractionEnabled + ", badgeContainer=" + this.badgeContainer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.overlay.writeToParcel(parcel, i);
        parcel.writeParcelable(this.content, i);
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.borderColor;
        if (atumVkuiColorNameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiColorNameDto.writeToParcel(parcel, i);
        }
        AtumVkuiPictureSizeDto atumVkuiPictureSizeDto = this.size;
        if (atumVkuiPictureSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiPictureSizeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isUserInteractionEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AtumVkuiBadgeContainerDto atumVkuiBadgeContainerDto = this.badgeContainer;
        if (atumVkuiBadgeContainerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiBadgeContainerDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiAvatarPropsDto(AtumVkuiIconOverlayDto atumVkuiIconOverlayDto, AtumVkuiAvatarContentDto atumVkuiAvatarContentDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumVkuiPictureSizeDto atumVkuiPictureSizeDto, Boolean bool, AtumVkuiBadgeContainerDto atumVkuiBadgeContainerDto, int i, zcl zclVar) {
        this(atumVkuiIconOverlayDto, atumVkuiAvatarContentDto, (i & 4) != 0 ? null : atumVkuiColorNameDto, (i & 8) != 0 ? null : atumVkuiPictureSizeDto, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : atumVkuiBadgeContainerDto);
    }
}
