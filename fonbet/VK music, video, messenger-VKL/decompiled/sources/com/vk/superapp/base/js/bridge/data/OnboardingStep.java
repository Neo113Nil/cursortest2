package com.vk.superapp.base.js.bridge.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bpn0;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.w4u;
import xsna.zcl;

/* compiled from: OnboardingStep.kt */
/* loaded from: classes6.dex */
public final class OnboardingStep implements Parcelable {
    public static final Parcelable.Creator<OnboardingStep> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final bpn0 i;

    /* compiled from: OnboardingStep.kt */
    public static final class a implements Parcelable.Creator<OnboardingStep> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingStep createFromParcel(Parcel parcel) {
            return new OnboardingStep(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, 64, null);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingStep[] newArray(int i) {
            return new OnboardingStep[i];
        }
    }

    public OnboardingStep(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = new bpn0(new w4u(this, 25));
    }

    public static OnboardingStep a(OnboardingStep onboardingStep, String str, String str2) {
        String str3 = onboardingStep.b;
        String str4 = onboardingStep.c;
        String str5 = onboardingStep.e;
        String str6 = onboardingStep.g;
        String str7 = onboardingStep.h;
        onboardingStep.getClass();
        return new OnboardingStep(str3, str4, str, str5, str2, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingStep)) {
            return false;
        }
        OnboardingStep onboardingStep = (OnboardingStep) obj;
        return epx.f(this.b, onboardingStep.b) && epx.f(this.c, onboardingStep.c) && epx.f(this.d, onboardingStep.d) && epx.f(this.e, onboardingStep.e) && epx.f(this.f, onboardingStep.f) && epx.f(this.g, onboardingStep.g) && epx.f(this.h, onboardingStep.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingStep(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", positiveButtonText=");
        sb.append(this.d);
        sb.append(", sourceMimeType=");
        sb.append(this.e);
        sb.append(", negativeButtonText=");
        sb.append(this.f);
        sb.append(", url=");
        sb.append(this.g);
        sb.append(", blob=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public /* synthetic */ OnboardingStep(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7);
    }
}
