package com.vk.onboardingpromo.impl.domain.objects;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OnboardingPromoCtaButtonDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoCtaButtonDo implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoCtaButtonDo> CREATOR = new a();

    @pmi0("action")
    private final OnboardingPromoActionDo action;

    @pmi0("button_color")
    private final OnboardingPromoThemedValueDo buttonColor;

    @pmi0("color_text")
    private final OnboardingPromoThemedValueDo colorText;

    @pmi0("slide_show_type")
    private final OnboardingPromoSlideShowTypeDo slideShowType;

    @pmi0("text")
    private final String text;

    @pmi0("visibility_delay")
    private final int visibilityDelay;

    /* compiled from: OnboardingPromoCtaButtonDo.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoCtaButtonDo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoCtaButtonDo createFromParcel(Parcel parcel) {
            return new OnboardingPromoCtaButtonDo(parcel.readInt(), parcel.readString(), OnboardingPromoSlideShowTypeDo.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OnboardingPromoThemedValueDo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OnboardingPromoThemedValueDo.CREATOR.createFromParcel(parcel) : null, OnboardingPromoActionDo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoCtaButtonDo[] newArray(int i) {
            return new OnboardingPromoCtaButtonDo[i];
        }
    }

    public OnboardingPromoCtaButtonDo() {
        this(0, null, null, null, null, null, 63, null);
    }

    public final OnboardingPromoActionDo d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final OnboardingPromoThemedValueDo e() {
        return this.buttonColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoCtaButtonDo)) {
            return false;
        }
        OnboardingPromoCtaButtonDo onboardingPromoCtaButtonDo = (OnboardingPromoCtaButtonDo) obj;
        return this.visibilityDelay == onboardingPromoCtaButtonDo.visibilityDelay && epx.f(this.text, onboardingPromoCtaButtonDo.text) && this.slideShowType == onboardingPromoCtaButtonDo.slideShowType && epx.f(this.buttonColor, onboardingPromoCtaButtonDo.buttonColor) && epx.f(this.colorText, onboardingPromoCtaButtonDo.colorText) && epx.f(this.action, onboardingPromoCtaButtonDo.action);
    }

    public final OnboardingPromoThemedValueDo f() {
        return this.colorText;
    }

    public final OnboardingPromoSlideShowTypeDo g() {
        return this.slideShowType;
    }

    public final int hashCode() {
        int hashCode = (this.slideShowType.hashCode() + urd0.a(Integer.hashCode(this.visibilityDelay) * 31, 31, this.text)) * 31;
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo = this.buttonColor;
        int hashCode2 = (hashCode + (onboardingPromoThemedValueDo == null ? 0 : onboardingPromoThemedValueDo.hashCode())) * 31;
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo2 = this.colorText;
        return this.action.hashCode() + ((hashCode2 + (onboardingPromoThemedValueDo2 != null ? onboardingPromoThemedValueDo2.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.text;
    }

    public final int j() {
        return this.visibilityDelay;
    }

    public final String toString() {
        return "OnboardingPromoCtaButtonDo(visibilityDelay=" + this.visibilityDelay + ", text=" + this.text + ", slideShowType=" + this.slideShowType + ", buttonColor=" + this.buttonColor + ", colorText=" + this.colorText + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.visibilityDelay);
        parcel.writeString(this.text);
        parcel.writeString(this.slideShowType.name());
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo = this.buttonColor;
        if (onboardingPromoThemedValueDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingPromoThemedValueDo.writeToParcel(parcel, i);
        }
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo2 = this.colorText;
        if (onboardingPromoThemedValueDo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingPromoThemedValueDo2.writeToParcel(parcel, i);
        }
        this.action.writeToParcel(parcel, i);
    }

    public OnboardingPromoCtaButtonDo(int i, String str, OnboardingPromoSlideShowTypeDo onboardingPromoSlideShowTypeDo, OnboardingPromoThemedValueDo onboardingPromoThemedValueDo, OnboardingPromoThemedValueDo onboardingPromoThemedValueDo2, OnboardingPromoActionDo onboardingPromoActionDo) {
        this.visibilityDelay = i;
        this.text = str;
        this.slideShowType = onboardingPromoSlideShowTypeDo;
        this.buttonColor = onboardingPromoThemedValueDo;
        this.colorText = onboardingPromoThemedValueDo2;
        this.action = onboardingPromoActionDo;
    }

    public /* synthetic */ OnboardingPromoCtaButtonDo(int i, String str, OnboardingPromoSlideShowTypeDo onboardingPromoSlideShowTypeDo, OnboardingPromoThemedValueDo onboardingPromoThemedValueDo, OnboardingPromoThemedValueDo onboardingPromoThemedValueDo2, OnboardingPromoActionDo onboardingPromoActionDo, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? OnboardingPromoSlideShowTypeDo.LAST : onboardingPromoSlideShowTypeDo, (i2 & 8) != 0 ? null : onboardingPromoThemedValueDo, (i2 & 16) != 0 ? null : onboardingPromoThemedValueDo2, (i2 & 32) != 0 ? new OnboardingPromoActionDo(null, null, 3, null) : onboardingPromoActionDo);
    }
}
