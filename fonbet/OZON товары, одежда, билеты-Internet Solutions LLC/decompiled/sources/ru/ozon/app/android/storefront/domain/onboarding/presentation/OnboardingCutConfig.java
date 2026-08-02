package ru.ozon.app.android.storefront.domain.onboarding.presentation;

import B4.V;
import Pk0.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingCutConfig;", "Landroid/os/Parcelable;", "", "backgroundPadding", "", "backgroundCornerRadius", "viewCornerRadius", "<init>", "(IFF)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundPadding", "F", "getBackgroundCornerRadius", "()F", "getViewCornerRadius", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardingCutConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingCutConfig> CREATOR = new Creator();
    private final float backgroundCornerRadius;
    private final int backgroundPadding;
    private final float viewCornerRadius;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingCutConfig> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingCutConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingCutConfig(parcel.readInt(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingCutConfig[] newArray(int i11) {
            return new OnboardingCutConfig[i11];
        }
    }

    public OnboardingCutConfig() {
        this(0, 0.0f, 0.0f, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingCutConfig)) {
            return false;
        }
        OnboardingCutConfig onboardingCutConfig = (OnboardingCutConfig) other;
        return this.backgroundPadding == onboardingCutConfig.backgroundPadding && Float.compare(this.backgroundCornerRadius, onboardingCutConfig.backgroundCornerRadius) == 0 && Float.compare(this.viewCornerRadius, onboardingCutConfig.viewCornerRadius) == 0;
    }

    public final float getBackgroundCornerRadius() {
        return this.backgroundCornerRadius;
    }

    public final int getBackgroundPadding() {
        return this.backgroundPadding;
    }

    public final float getViewCornerRadius() {
        return this.viewCornerRadius;
    }

    public int hashCode() {
        return Float.hashCode(this.viewCornerRadius) + b.a(this.backgroundCornerRadius, Integer.hashCode(this.backgroundPadding) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.backgroundPadding;
        float f7 = this.backgroundCornerRadius;
        float f11 = this.viewCornerRadius;
        StringBuilder sb2 = new StringBuilder("OnboardingCutConfig(backgroundPadding=");
        sb2.append(i11);
        sb2.append(", backgroundCornerRadius=");
        sb2.append(f7);
        sb2.append(", viewCornerRadius=");
        return V.b(f11, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.backgroundPadding);
        dest.writeFloat(this.backgroundCornerRadius);
        dest.writeFloat(this.viewCornerRadius);
    }

    public OnboardingCutConfig(int i11, float f7, float f11) {
        this.backgroundPadding = i11;
        this.backgroundCornerRadius = f7;
        this.viewCornerRadius = f11;
    }

    public /* synthetic */ OnboardingCutConfig(int i11, float f7, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0.0f : f7, (i12 & 4) != 0 ? 0.0f : f11);
    }
}
