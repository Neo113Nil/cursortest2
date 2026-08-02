package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersPopupSettingsDto.kt */
/* loaded from: classes15.dex */
public final class StickersPopupSettingsDto implements Parcelable {
    public static final Parcelable.Creator<StickersPopupSettingsDto> CREATOR = new a();

    @pmi0("autoplay")
    private final StickersPopupSettingsAutoplayDto autoplay;

    @pmi0("flags")
    private final StickersPopupSettingsFlagsDto flags;

    /* compiled from: StickersPopupSettingsDto.kt */
    public static final class a implements Parcelable.Creator<StickersPopupSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPopupSettingsDto createFromParcel(Parcel parcel) {
            return new StickersPopupSettingsDto(StickersPopupSettingsAutoplayDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StickersPopupSettingsFlagsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPopupSettingsDto[] newArray(int i) {
            return new StickersPopupSettingsDto[i];
        }
    }

    public StickersPopupSettingsDto(StickersPopupSettingsAutoplayDto stickersPopupSettingsAutoplayDto, StickersPopupSettingsFlagsDto stickersPopupSettingsFlagsDto) {
        this.autoplay = stickersPopupSettingsAutoplayDto;
        this.flags = stickersPopupSettingsFlagsDto;
    }

    public final StickersPopupSettingsAutoplayDto d() {
        return this.autoplay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StickersPopupSettingsFlagsDto e() {
        return this.flags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPopupSettingsDto)) {
            return false;
        }
        StickersPopupSettingsDto stickersPopupSettingsDto = (StickersPopupSettingsDto) obj;
        return epx.f(this.autoplay, stickersPopupSettingsDto.autoplay) && epx.f(this.flags, stickersPopupSettingsDto.flags);
    }

    public final int hashCode() {
        int hashCode = this.autoplay.hashCode() * 31;
        StickersPopupSettingsFlagsDto stickersPopupSettingsFlagsDto = this.flags;
        return hashCode + (stickersPopupSettingsFlagsDto == null ? 0 : stickersPopupSettingsFlagsDto.hashCode());
    }

    public final String toString() {
        return "StickersPopupSettingsDto(autoplay=" + this.autoplay + ", flags=" + this.flags + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.autoplay.writeToParcel(parcel, i);
        StickersPopupSettingsFlagsDto stickersPopupSettingsFlagsDto = this.flags;
        if (stickersPopupSettingsFlagsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersPopupSettingsFlagsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StickersPopupSettingsDto(StickersPopupSettingsAutoplayDto stickersPopupSettingsAutoplayDto, StickersPopupSettingsFlagsDto stickersPopupSettingsFlagsDto, int i, zcl zclVar) {
        this(stickersPopupSettingsAutoplayDto, (i & 2) != 0 ? null : stickersPopupSettingsFlagsDto);
    }
}
