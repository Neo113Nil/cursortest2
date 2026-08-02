package com.vk.onboardingpromo.impl.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: OnboardingPromoConfig.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoConfig implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoConfig> CREATOR = new a();

    @pmi0("time_to_live")
    private final long ttlIntervalInSeconds;

    /* compiled from: OnboardingPromoConfig.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoConfig> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoConfig createFromParcel(Parcel parcel) {
            return new OnboardingPromoConfig(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoConfig[] newArray(int i) {
            return new OnboardingPromoConfig[i];
        }
    }

    public OnboardingPromoConfig() {
        this(0L, 1, null);
    }

    public final long d() {
        return this.ttlIntervalInSeconds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingPromoConfig) && this.ttlIntervalInSeconds == ((OnboardingPromoConfig) obj).ttlIntervalInSeconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.ttlIntervalInSeconds);
    }

    public final String toString() {
        return vu5.a(')', this.ttlIntervalInSeconds, new StringBuilder("OnboardingPromoConfig(ttlIntervalInSeconds="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ttlIntervalInSeconds);
    }

    public OnboardingPromoConfig(long j) {
        this.ttlIntervalInSeconds = j;
    }

    public /* synthetic */ OnboardingPromoConfig(long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j);
    }
}
