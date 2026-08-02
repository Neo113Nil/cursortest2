package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: StickersSettingsDto.kt */
/* loaded from: classes15.dex */
public final class StickersSettingsDto implements Parcelable {
    public static final Parcelable.Creator<StickersSettingsDto> CREATOR = new a();

    @pmi0("animation_autoplay")
    private final boolean animationAutoplay;

    @pmi0("popup")
    private final StickersPopupSettingsDto popup;

    @pmi0("suggestions_is_enabled")
    private final boolean suggestionsIsEnabled;

    /* compiled from: StickersSettingsDto.kt */
    public static final class a implements Parcelable.Creator<StickersSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersSettingsDto createFromParcel(Parcel parcel) {
            return new StickersSettingsDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : StickersPopupSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersSettingsDto[] newArray(int i) {
            return new StickersSettingsDto[i];
        }
    }

    public StickersSettingsDto(boolean z, boolean z2, StickersPopupSettingsDto stickersPopupSettingsDto) {
        this.animationAutoplay = z;
        this.suggestionsIsEnabled = z2;
        this.popup = stickersPopupSettingsDto;
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
        if (!(obj instanceof StickersSettingsDto)) {
            return false;
        }
        StickersSettingsDto stickersSettingsDto = (StickersSettingsDto) obj;
        return this.animationAutoplay == stickersSettingsDto.animationAutoplay && this.suggestionsIsEnabled == stickersSettingsDto.suggestionsIsEnabled && epx.f(this.popup, stickersSettingsDto.popup);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.animationAutoplay) * 31, 31, this.suggestionsIsEnabled);
        StickersPopupSettingsDto stickersPopupSettingsDto = this.popup;
        return b + (stickersPopupSettingsDto == null ? 0 : stickersPopupSettingsDto.hashCode());
    }

    public final String toString() {
        return "StickersSettingsDto(animationAutoplay=" + this.animationAutoplay + ", suggestionsIsEnabled=" + this.suggestionsIsEnabled + ", popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.animationAutoplay ? 1 : 0);
        parcel.writeInt(this.suggestionsIsEnabled ? 1 : 0);
        StickersPopupSettingsDto stickersPopupSettingsDto = this.popup;
        if (stickersPopupSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersPopupSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StickersSettingsDto(boolean z, boolean z2, StickersPopupSettingsDto stickersPopupSettingsDto, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? null : stickersPopupSettingsDto);
    }
}
