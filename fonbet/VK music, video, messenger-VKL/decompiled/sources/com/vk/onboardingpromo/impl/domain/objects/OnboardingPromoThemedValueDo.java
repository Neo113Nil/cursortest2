package com.vk.onboardingpromo.impl.domain.objects;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OnboardingPromoThemedValueDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoThemedValueDo implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoThemedValueDo> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: OnboardingPromoThemedValueDo.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoThemedValueDo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoThemedValueDo createFromParcel(Parcel parcel) {
            return new OnboardingPromoThemedValueDo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoThemedValueDo[] newArray(int i) {
            return new OnboardingPromoThemedValueDo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingPromoThemedValueDo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoThemedValueDo)) {
            return false;
        }
        OnboardingPromoThemedValueDo onboardingPromoThemedValueDo = (OnboardingPromoThemedValueDo) obj;
        return epx.f(this.light, onboardingPromoThemedValueDo.light) && epx.f(this.dark, onboardingPromoThemedValueDo.dark);
    }

    public final int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoThemedValueDo(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ho8.a(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }

    public OnboardingPromoThemedValueDo(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public /* synthetic */ OnboardingPromoThemedValueDo(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
