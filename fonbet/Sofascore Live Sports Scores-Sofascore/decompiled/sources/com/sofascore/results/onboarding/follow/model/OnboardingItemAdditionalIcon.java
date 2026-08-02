package com.sofascore.results.onboarding.follow.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon;", "Landroid/os/Parcelable;", "SportIcon", "CountryFlag", "TeamLogo", "Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon$CountryFlag;", "Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon$SportIcon;", "Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon$TeamLogo;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnboardingItemAdditionalIcon extends Parcelable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon$CountryFlag;", "Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CountryFlag implements OnboardingItemAdditionalIcon {

        @NotNull
        public static final Parcelable.Creator<CountryFlag> CREATOR = new a();
        public final String a;

        public CountryFlag(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CountryFlag) && Intrinsics.c(this.a, ((CountryFlag) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return lnb.o("CountryFlag(countryCode=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon$SportIcon;", "Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SportIcon implements OnboardingItemAdditionalIcon {

        @NotNull
        public static final Parcelable.Creator<SportIcon> CREATOR = new b();
        public final String a;

        public SportIcon(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SportIcon) && Intrinsics.c(this.a, ((SportIcon) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return lnb.o("SportIcon(sportSlug=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon$TeamLogo;", "Lcom/sofascore/results/onboarding/follow/model/OnboardingItemAdditionalIcon;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TeamLogo implements OnboardingItemAdditionalIcon {

        @NotNull
        public static final Parcelable.Creator<TeamLogo> CREATOR = new c();
        public final int a;

        public TeamLogo(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeamLogo) && this.a == ((TeamLogo) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return lnb.k(this.a, "TeamLogo(teamId=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
        }
    }
}
