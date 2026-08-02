package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AtumVkuiContentBadgePropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiContentBadgePropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiContentBadgePropsDto> CREATOR = new a();

    @pmi0("appearance")
    private final AtumVkuiAppearanceDto appearance;

    @pmi0("icon")
    private final AtumVkuiAnyImageDto icon;

    @pmi0("icon_after")
    private final AtumVkuiAnyImageDto iconAfter;

    @pmi0("icon_before")
    private final AtumVkuiAnyImageDto iconBefore;

    @pmi0("is_rounded")
    private final Boolean isRounded;

    @pmi0(X3.a.t)
    private final AtumVkuiContentBadgeModeDto mode;

    @pmi0("size")
    private final AtumVkuiSizeDto size;

    @pmi0("title")
    private final String title;

    /* compiled from: AtumVkuiContentBadgePropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiContentBadgePropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiContentBadgePropsDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            AtumVkuiAnyImageDto atumVkuiAnyImageDto = (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiContentBadgePropsDto.class.getClassLoader());
            Boolean bool = null;
            AtumVkuiSizeDto createFromParcel = parcel.readInt() == 0 ? null : AtumVkuiSizeDto.CREATOR.createFromParcel(parcel);
            AtumVkuiAppearanceDto createFromParcel2 = parcel.readInt() == 0 ? null : AtumVkuiAppearanceDto.CREATOR.createFromParcel(parcel);
            AtumVkuiContentBadgeModeDto createFromParcel3 = parcel.readInt() == 0 ? null : AtumVkuiContentBadgeModeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtumVkuiContentBadgePropsDto(readString, atumVkuiAnyImageDto, createFromParcel, createFromParcel2, createFromParcel3, bool, (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiContentBadgePropsDto.class.getClassLoader()), (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiContentBadgePropsDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiContentBadgePropsDto[] newArray(int i) {
            return new AtumVkuiContentBadgePropsDto[i];
        }
    }

    public AtumVkuiContentBadgePropsDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiContentBadgePropsDto)) {
            return false;
        }
        AtumVkuiContentBadgePropsDto atumVkuiContentBadgePropsDto = (AtumVkuiContentBadgePropsDto) obj;
        return epx.f(this.title, atumVkuiContentBadgePropsDto.title) && epx.f(this.icon, atumVkuiContentBadgePropsDto.icon) && this.size == atumVkuiContentBadgePropsDto.size && this.appearance == atumVkuiContentBadgePropsDto.appearance && this.mode == atumVkuiContentBadgePropsDto.mode && epx.f(this.isRounded, atumVkuiContentBadgePropsDto.isRounded) && epx.f(this.iconBefore, atumVkuiContentBadgePropsDto.iconBefore) && epx.f(this.iconAfter, atumVkuiContentBadgePropsDto.iconAfter);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtumVkuiAnyImageDto atumVkuiAnyImageDto = this.icon;
        int hashCode2 = (hashCode + (atumVkuiAnyImageDto == null ? 0 : atumVkuiAnyImageDto.hashCode())) * 31;
        AtumVkuiSizeDto atumVkuiSizeDto = this.size;
        int hashCode3 = (hashCode2 + (atumVkuiSizeDto == null ? 0 : atumVkuiSizeDto.hashCode())) * 31;
        AtumVkuiAppearanceDto atumVkuiAppearanceDto = this.appearance;
        int hashCode4 = (hashCode3 + (atumVkuiAppearanceDto == null ? 0 : atumVkuiAppearanceDto.hashCode())) * 31;
        AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto = this.mode;
        int hashCode5 = (hashCode4 + (atumVkuiContentBadgeModeDto == null ? 0 : atumVkuiContentBadgeModeDto.hashCode())) * 31;
        Boolean bool = this.isRounded;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtumVkuiAnyImageDto atumVkuiAnyImageDto2 = this.iconBefore;
        int hashCode7 = (hashCode6 + (atumVkuiAnyImageDto2 == null ? 0 : atumVkuiAnyImageDto2.hashCode())) * 31;
        AtumVkuiAnyImageDto atumVkuiAnyImageDto3 = this.iconAfter;
        return hashCode7 + (atumVkuiAnyImageDto3 != null ? atumVkuiAnyImageDto3.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiContentBadgePropsDto(title=" + this.title + ", icon=" + this.icon + ", size=" + this.size + ", appearance=" + this.appearance + ", mode=" + this.mode + ", isRounded=" + this.isRounded + ", iconBefore=" + this.iconBefore + ", iconAfter=" + this.iconAfter + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, i);
        AtumVkuiSizeDto atumVkuiSizeDto = this.size;
        if (atumVkuiSizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiSizeDto.writeToParcel(parcel, i);
        }
        AtumVkuiAppearanceDto atumVkuiAppearanceDto = this.appearance;
        if (atumVkuiAppearanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiAppearanceDto.writeToParcel(parcel, i);
        }
        AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto = this.mode;
        if (atumVkuiContentBadgeModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiContentBadgeModeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isRounded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.iconBefore, i);
        parcel.writeParcelable(this.iconAfter, i);
    }

    public AtumVkuiContentBadgePropsDto(String str, AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumVkuiSizeDto atumVkuiSizeDto, AtumVkuiAppearanceDto atumVkuiAppearanceDto, AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto, Boolean bool, AtumVkuiAnyImageDto atumVkuiAnyImageDto2, AtumVkuiAnyImageDto atumVkuiAnyImageDto3) {
        this.title = str;
        this.icon = atumVkuiAnyImageDto;
        this.size = atumVkuiSizeDto;
        this.appearance = atumVkuiAppearanceDto;
        this.mode = atumVkuiContentBadgeModeDto;
        this.isRounded = bool;
        this.iconBefore = atumVkuiAnyImageDto2;
        this.iconAfter = atumVkuiAnyImageDto3;
    }

    public /* synthetic */ AtumVkuiContentBadgePropsDto(String str, AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumVkuiSizeDto atumVkuiSizeDto, AtumVkuiAppearanceDto atumVkuiAppearanceDto, AtumVkuiContentBadgeModeDto atumVkuiContentBadgeModeDto, Boolean bool, AtumVkuiAnyImageDto atumVkuiAnyImageDto2, AtumVkuiAnyImageDto atumVkuiAnyImageDto3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : atumVkuiAnyImageDto, (i & 4) != 0 ? null : atumVkuiSizeDto, (i & 8) != 0 ? null : atumVkuiAppearanceDto, (i & 16) != 0 ? null : atumVkuiContentBadgeModeDto, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : atumVkuiAnyImageDto2, (i & 128) != 0 ? null : atumVkuiAnyImageDto3);
    }
}
