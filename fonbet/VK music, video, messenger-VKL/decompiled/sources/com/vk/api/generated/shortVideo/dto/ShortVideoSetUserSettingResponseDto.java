package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoSetUserSettingResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSetUserSettingResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSetUserSettingResponseDto> CREATOR = new a();

    @pmi0("clips_app_onboarding_finished")
    private final Boolean clipsAppOnboardingFinished;

    @pmi0("result")
    private final boolean result;

    @pmi0("setting")
    private final ShortVideoSettingDto setting;

    /* compiled from: ShortVideoSetUserSettingResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSetUserSettingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSetUserSettingResponseDto createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            ShortVideoSettingDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoSettingDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoSetUserSettingResponseDto(z, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSetUserSettingResponseDto[] newArray(int i) {
            return new ShortVideoSetUserSettingResponseDto[i];
        }
    }

    public ShortVideoSetUserSettingResponseDto(boolean z, ShortVideoSettingDto shortVideoSettingDto, Boolean bool) {
        this.result = z;
        this.setting = shortVideoSettingDto;
        this.clipsAppOnboardingFinished = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoSetUserSettingResponseDto)) {
            return false;
        }
        ShortVideoSetUserSettingResponseDto shortVideoSetUserSettingResponseDto = (ShortVideoSetUserSettingResponseDto) obj;
        return this.result == shortVideoSetUserSettingResponseDto.result && epx.f(this.setting, shortVideoSetUserSettingResponseDto.setting) && epx.f(this.clipsAppOnboardingFinished, shortVideoSetUserSettingResponseDto.clipsAppOnboardingFinished);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.result) * 31;
        ShortVideoSettingDto shortVideoSettingDto = this.setting;
        int hashCode2 = (hashCode + (shortVideoSettingDto == null ? 0 : shortVideoSettingDto.hashCode())) * 31;
        Boolean bool = this.clipsAppOnboardingFinished;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoSetUserSettingResponseDto(result=");
        sb.append(this.result);
        sb.append(", setting=");
        sb.append(this.setting);
        sb.append(", clipsAppOnboardingFinished=");
        return tn.a(sb, this.clipsAppOnboardingFinished, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result ? 1 : 0);
        ShortVideoSettingDto shortVideoSettingDto = this.setting;
        if (shortVideoSettingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoSettingDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.clipsAppOnboardingFinished;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ShortVideoSetUserSettingResponseDto(boolean z, ShortVideoSettingDto shortVideoSettingDto, Boolean bool, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : shortVideoSettingDto, (i & 4) != 0 ? null : bool);
    }
}
