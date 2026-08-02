package com.vk.onboardingpromo.impl.domain.objects;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OnboardingPromoSlideDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoSlideDo implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoSlideDo> CREATOR = new a();

    @pmi0("aspect_ratio")
    private final String aspectRatio;

    @pmi0(X3.i.I0)
    private final OnboardingPromoThemedValueDo media;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* compiled from: OnboardingPromoSlideDo.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoSlideDo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoSlideDo createFromParcel(Parcel parcel) {
            return new OnboardingPromoSlideDo(parcel.readString(), OnboardingPromoThemedValueDo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoSlideDo[] newArray(int i) {
            return new OnboardingPromoSlideDo[i];
        }
    }

    public OnboardingPromoSlideDo() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.aspectRatio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final OnboardingPromoThemedValueDo e() {
        return this.media;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoSlideDo)) {
            return false;
        }
        OnboardingPromoSlideDo onboardingPromoSlideDo = (OnboardingPromoSlideDo) obj;
        return epx.f(this.type, onboardingPromoSlideDo.type) && epx.f(this.media, onboardingPromoSlideDo.media) && epx.f(this.text, onboardingPromoSlideDo.text) && epx.f(this.aspectRatio, onboardingPromoSlideDo.aspectRatio);
    }

    public final String f() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.aspectRatio.hashCode() + urd0.a((this.media.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.text);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoSlideDo(type=");
        sb.append(this.type);
        sb.append(", media=");
        sb.append(this.media);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", aspectRatio=");
        return ho8.a(sb, this.aspectRatio, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        this.media.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.aspectRatio);
    }

    public OnboardingPromoSlideDo(String str, OnboardingPromoThemedValueDo onboardingPromoThemedValueDo, String str2, String str3) {
        this.type = str;
        this.media = onboardingPromoThemedValueDo;
        this.text = str2;
        this.aspectRatio = str3;
    }

    public /* synthetic */ OnboardingPromoSlideDo(String str, OnboardingPromoThemedValueDo onboardingPromoThemedValueDo, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new OnboardingPromoThemedValueDo(null, null, 3, null) : onboardingPromoThemedValueDo, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
