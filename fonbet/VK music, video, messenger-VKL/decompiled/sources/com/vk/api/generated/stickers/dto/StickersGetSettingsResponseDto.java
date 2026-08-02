package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersGetSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersGetSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersGetSettingsResponseDto> CREATOR = new a();

    @pmi0("settings")
    private final StickersSettingsDto settings;

    /* compiled from: StickersGetSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersGetSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersGetSettingsResponseDto createFromParcel(Parcel parcel) {
            return new StickersGetSettingsResponseDto((StickersSettingsDto) parcel.readParcelable(StickersGetSettingsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersGetSettingsResponseDto[] newArray(int i) {
            return new StickersGetSettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersGetSettingsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final StickersSettingsDto d() {
        return this.settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersGetSettingsResponseDto) && epx.f(this.settings, ((StickersGetSettingsResponseDto) obj).settings);
    }

    public final int hashCode() {
        StickersSettingsDto stickersSettingsDto = this.settings;
        if (stickersSettingsDto == null) {
            return 0;
        }
        return stickersSettingsDto.hashCode();
    }

    public final String toString() {
        return "StickersGetSettingsResponseDto(settings=" + this.settings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.settings, i);
    }

    public StickersGetSettingsResponseDto(StickersSettingsDto stickersSettingsDto) {
        this.settings = stickersSettingsDto;
    }

    public /* synthetic */ StickersGetSettingsResponseDto(StickersSettingsDto stickersSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stickersSettingsDto);
    }
}
