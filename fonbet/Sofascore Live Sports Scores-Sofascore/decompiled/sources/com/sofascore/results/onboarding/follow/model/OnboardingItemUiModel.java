package com.sofascore.results.onboarding.follow.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;
import defpackage.bf3;
import defpackage.d1c;
import defpackage.dmi;
import defpackage.srd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/onboarding/follow/model/OnboardingItemUiModel;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OnboardingItemUiModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingItemUiModel> CREATOR = new d1c(11);
    public final int a;
    public final srd b;
    public final String c;
    public final String d;
    public final OnboardingItemAdditionalIcon e;
    public final OnboardingItemAdditionalIcon f;

    public OnboardingItemUiModel(int i, srd srdVar, String str, String str2, OnboardingItemAdditionalIcon onboardingItemAdditionalIcon, OnboardingItemAdditionalIcon onboardingItemAdditionalIcon2) {
        srdVar.getClass();
        str.getClass();
        this.a = i;
        this.b = srdVar;
        this.c = str;
        this.d = str2;
        this.e = onboardingItemAdditionalIcon;
        this.f = onboardingItemAdditionalIcon2;
    }

    public final String a() {
        return this.b.name() + "_" + this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingItemUiModel)) {
            return false;
        }
        OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) obj;
        return this.a == onboardingItemUiModel.a && this.b == onboardingItemUiModel.b && Intrinsics.c(this.c, onboardingItemUiModel.c) && Intrinsics.c(this.d, onboardingItemUiModel.d) && Intrinsics.c(this.e, onboardingItemUiModel.e) && Intrinsics.c(this.f, onboardingItemUiModel.f);
    }

    public final int hashCode() {
        int c = dmi.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        OnboardingItemAdditionalIcon onboardingItemAdditionalIcon = this.e;
        int hashCode2 = (hashCode + (onboardingItemAdditionalIcon == null ? 0 : onboardingItemAdditionalIcon.hashCode())) * 31;
        OnboardingItemAdditionalIcon onboardingItemAdditionalIcon2 = this.f;
        return hashCode2 + (onboardingItemAdditionalIcon2 != null ? onboardingItemAdditionalIcon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingItemUiModel(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", text=");
        bf3.v(sb, this.c, ", sport=", this.d, ", additionalIcon=");
        sb.append(this.e);
        sb.append(", addedItemAdditionalIcon=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public /* synthetic */ OnboardingItemUiModel(int i, srd srdVar, String str, String str2, OnboardingItemAdditionalIcon.TeamLogo teamLogo, int i2) {
        this(i, srdVar, str, str2, (i2 & 16) != 0 ? null : teamLogo, (OnboardingItemAdditionalIcon) null);
    }
}
