package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersSetPopupSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersSetPopupSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersSetPopupSettingsResponseDto> CREATOR = new a();

    @pmi0("popup")
    private final StickersPopupSettingsDto popup;

    /* compiled from: StickersSetPopupSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersSetPopupSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSetPopupSettingsResponseDto createFromParcel(Parcel parcel) {
            return new StickersSetPopupSettingsResponseDto((StickersPopupSettingsDto) parcel.readParcelable(StickersSetPopupSettingsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSetPopupSettingsResponseDto[] newArray(int i) {
            return new StickersSetPopupSettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersSetPopupSettingsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final StickersPopupSettingsDto d() {
        return this.popup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickersSetPopupSettingsResponseDto) && epx.f(this.popup, ((StickersSetPopupSettingsResponseDto) obj).popup);
    }

    public final int hashCode() {
        StickersPopupSettingsDto stickersPopupSettingsDto = this.popup;
        if (stickersPopupSettingsDto == null) {
            return 0;
        }
        return stickersPopupSettingsDto.hashCode();
    }

    public final String toString() {
        return "StickersSetPopupSettingsResponseDto(popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.popup, i);
    }

    public StickersSetPopupSettingsResponseDto(StickersPopupSettingsDto stickersPopupSettingsDto) {
        this.popup = stickersPopupSettingsDto;
    }

    public /* synthetic */ StickersSetPopupSettingsResponseDto(StickersPopupSettingsDto stickersPopupSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stickersPopupSettingsDto);
    }
}
