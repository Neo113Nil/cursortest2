package com.vk.onboarding.api.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.shy;

/* compiled from: VkOnboardingCampaign.kt */
/* loaded from: classes4.dex */
public final class VkOnboardingCampaign implements Parcelable {
    public static final Parcelable.Creator<VkOnboardingCampaign> CREATOR = new a();
    public final String b;
    public final int c;
    public boolean d;

    /* compiled from: VkOnboardingCampaign.kt */
    public static final class a implements Parcelable.Creator<VkOnboardingCampaign> {
        @Override // android.os.Parcelable.Creator
        public final VkOnboardingCampaign createFromParcel(Parcel parcel) {
            return new VkOnboardingCampaign(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VkOnboardingCampaign[] newArray(int i) {
            return new VkOnboardingCampaign[i];
        }
    }

    public VkOnboardingCampaign(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkOnboardingCampaign)) {
            return false;
        }
        VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj;
        return epx.f(this.b, vkOnboardingCampaign.b) && this.c == vkOnboardingCampaign.c && this.d == vkOnboardingCampaign.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkOnboardingCampaign(name=");
        sb.append(this.b);
        sb.append(", abGroup=");
        sb.append(this.c);
        sb.append(", hasActiveBanner=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
