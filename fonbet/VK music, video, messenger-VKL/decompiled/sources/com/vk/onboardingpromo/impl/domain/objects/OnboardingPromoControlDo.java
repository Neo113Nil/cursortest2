package com.vk.onboardingpromo.impl.domain.objects;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: OnboardingPromoControlDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoControlDo implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoControlDo> CREATOR = new a();

    @pmi0("close_btn_visibility_delay")
    private final int closeBtnVisibilityDelay;

    @pmi0("cta_button")
    private final OnboardingPromoCtaButtonDo ctaButton;

    @pmi0("is_sound_btn_enabled")
    private final boolean isSoundBtnEnabled;

    @pmi0("is_video_replay_btn_enabled")
    private final boolean isVideoReplayBtnEnabled;

    /* compiled from: OnboardingPromoControlDo.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoControlDo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoControlDo createFromParcel(Parcel parcel) {
            return new OnboardingPromoControlDo(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, OnboardingPromoCtaButtonDo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoControlDo[] newArray(int i) {
            return new OnboardingPromoControlDo[i];
        }
    }

    public OnboardingPromoControlDo() {
        this(0, false, false, null, 15, null);
    }

    public final int d() {
        return this.closeBtnVisibilityDelay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final OnboardingPromoCtaButtonDo e() {
        return this.ctaButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoControlDo)) {
            return false;
        }
        OnboardingPromoControlDo onboardingPromoControlDo = (OnboardingPromoControlDo) obj;
        return this.closeBtnVisibilityDelay == onboardingPromoControlDo.closeBtnVisibilityDelay && this.isSoundBtnEnabled == onboardingPromoControlDo.isSoundBtnEnabled && this.isVideoReplayBtnEnabled == onboardingPromoControlDo.isVideoReplayBtnEnabled && epx.f(this.ctaButton, onboardingPromoControlDo.ctaButton);
    }

    public final boolean f() {
        return this.isSoundBtnEnabled;
    }

    public final boolean g() {
        return this.isVideoReplayBtnEnabled;
    }

    public final int hashCode() {
        return this.ctaButton.hashCode() + qoy.b(qoy.b(Integer.hashCode(this.closeBtnVisibilityDelay) * 31, 31, this.isSoundBtnEnabled), 31, this.isVideoReplayBtnEnabled);
    }

    public final String toString() {
        return "OnboardingPromoControlDo(closeBtnVisibilityDelay=" + this.closeBtnVisibilityDelay + ", isSoundBtnEnabled=" + this.isSoundBtnEnabled + ", isVideoReplayBtnEnabled=" + this.isVideoReplayBtnEnabled + ", ctaButton=" + this.ctaButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.closeBtnVisibilityDelay);
        parcel.writeInt(this.isSoundBtnEnabled ? 1 : 0);
        parcel.writeInt(this.isVideoReplayBtnEnabled ? 1 : 0);
        this.ctaButton.writeToParcel(parcel, i);
    }

    public OnboardingPromoControlDo(int i, boolean z, boolean z2, OnboardingPromoCtaButtonDo onboardingPromoCtaButtonDo) {
        this.closeBtnVisibilityDelay = i;
        this.isSoundBtnEnabled = z;
        this.isVideoReplayBtnEnabled = z2;
        this.ctaButton = onboardingPromoCtaButtonDo;
    }

    public /* synthetic */ OnboardingPromoControlDo(int i, boolean z, boolean z2, OnboardingPromoCtaButtonDo onboardingPromoCtaButtonDo, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? new OnboardingPromoCtaButtonDo(0, null, null, null, null, null, 63, null) : onboardingPromoCtaButtonDo);
    }
}
