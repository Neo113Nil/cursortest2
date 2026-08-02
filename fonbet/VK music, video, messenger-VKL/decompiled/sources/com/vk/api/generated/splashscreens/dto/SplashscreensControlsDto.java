package com.vk.api.generated.splashscreens.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: SplashscreensControlsDto.kt */
/* loaded from: classes15.dex */
public final class SplashscreensControlsDto implements Parcelable {
    public static final Parcelable.Creator<SplashscreensControlsDto> CREATOR = new a();

    @pmi0("close_button_visible_after_ms")
    private final int closeButtonVisibleAfterMs;

    @pmi0("cta_button")
    private final SplashscreensControlsCtaButtonDto ctaButton;

    @pmi0("sound_toggle_button")
    private final boolean soundToggleButton;

    @pmi0("video_replay_button")
    private final boolean videoReplayButton;

    /* compiled from: SplashscreensControlsDto.kt */
    public static final class a implements Parcelable.Creator<SplashscreensControlsDto> {
        @Override // android.os.Parcelable.Creator
        public final SplashscreensControlsDto createFromParcel(Parcel parcel) {
            return new SplashscreensControlsDto(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, SplashscreensControlsCtaButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SplashscreensControlsDto[] newArray(int i) {
            return new SplashscreensControlsDto[i];
        }
    }

    public SplashscreensControlsDto(int i, boolean z, boolean z2, SplashscreensControlsCtaButtonDto splashscreensControlsCtaButtonDto) {
        this.closeButtonVisibleAfterMs = i;
        this.soundToggleButton = z;
        this.videoReplayButton = z2;
        this.ctaButton = splashscreensControlsCtaButtonDto;
    }

    public final int d() {
        return this.closeButtonVisibleAfterMs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SplashscreensControlsCtaButtonDto e() {
        return this.ctaButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashscreensControlsDto)) {
            return false;
        }
        SplashscreensControlsDto splashscreensControlsDto = (SplashscreensControlsDto) obj;
        return this.closeButtonVisibleAfterMs == splashscreensControlsDto.closeButtonVisibleAfterMs && this.soundToggleButton == splashscreensControlsDto.soundToggleButton && this.videoReplayButton == splashscreensControlsDto.videoReplayButton && epx.f(this.ctaButton, splashscreensControlsDto.ctaButton);
    }

    public final boolean f() {
        return this.soundToggleButton;
    }

    public final boolean g() {
        return this.videoReplayButton;
    }

    public final int hashCode() {
        return this.ctaButton.hashCode() + qoy.b(qoy.b(Integer.hashCode(this.closeButtonVisibleAfterMs) * 31, 31, this.soundToggleButton), 31, this.videoReplayButton);
    }

    public final String toString() {
        return "SplashscreensControlsDto(closeButtonVisibleAfterMs=" + this.closeButtonVisibleAfterMs + ", soundToggleButton=" + this.soundToggleButton + ", videoReplayButton=" + this.videoReplayButton + ", ctaButton=" + this.ctaButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.closeButtonVisibleAfterMs);
        parcel.writeInt(this.soundToggleButton ? 1 : 0);
        parcel.writeInt(this.videoReplayButton ? 1 : 0);
        this.ctaButton.writeToParcel(parcel, i);
    }
}
