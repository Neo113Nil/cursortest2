package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Pk0.b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;", "Landroid/os/Parcelable;", "", "left", "top", "right", "bottom", "", "viewCornerRadius", "backgroundCornerRadius", "padding", "<init>", "(IIIIFFI)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "F", "getViewCornerRadius", "()F", "getBackgroundCornerRadius", "getPadding", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardingDialogCutConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingDialogCutConfig> CREATOR = new Creator();
    private final float backgroundCornerRadius;
    private final int bottom;
    private final int left;
    private final int padding;
    private final int right;
    private final int top;
    private final float viewCornerRadius;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingDialogCutConfig> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingDialogCutConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingDialogCutConfig(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingDialogCutConfig[] newArray(int i11) {
            return new OnboardingDialogCutConfig[i11];
        }
    }

    public OnboardingDialogCutConfig(int i11, int i12, int i13, int i14, float f7, float f11, int i15) {
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
        this.viewCornerRadius = f7;
        this.backgroundCornerRadius = f11;
        this.padding = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingDialogCutConfig)) {
            return false;
        }
        OnboardingDialogCutConfig onboardingDialogCutConfig = (OnboardingDialogCutConfig) other;
        return this.left == onboardingDialogCutConfig.left && this.top == onboardingDialogCutConfig.top && this.right == onboardingDialogCutConfig.right && this.bottom == onboardingDialogCutConfig.bottom && Float.compare(this.viewCornerRadius, onboardingDialogCutConfig.viewCornerRadius) == 0 && Float.compare(this.backgroundCornerRadius, onboardingDialogCutConfig.backgroundCornerRadius) == 0 && this.padding == onboardingDialogCutConfig.padding;
    }

    public final float getBackgroundCornerRadius() {
        return this.backgroundCornerRadius;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getViewCornerRadius() {
        return this.viewCornerRadius;
    }

    public int hashCode() {
        return Integer.hashCode(this.padding) + b.a(this.backgroundCornerRadius, b.a(this.viewCornerRadius, C2454a.a(this.bottom, C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.left;
        int i12 = this.top;
        int i13 = this.right;
        int i14 = this.bottom;
        float f7 = this.viewCornerRadius;
        float f11 = this.backgroundCornerRadius;
        int i15 = this.padding;
        StringBuilder a11 = C2438a.a("OnboardingDialogCutConfig(left=", i11, ", top=", ", right=", i12);
        a.f(i13, i14, ", bottom=", ", viewCornerRadius=", a11);
        a11.append(f7);
        a11.append(", backgroundCornerRadius=");
        a11.append(f11);
        a11.append(", padding=");
        return K00.b.e(i15, ")", a11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.left);
        dest.writeInt(this.top);
        dest.writeInt(this.right);
        dest.writeInt(this.bottom);
        dest.writeFloat(this.viewCornerRadius);
        dest.writeFloat(this.backgroundCornerRadius);
        dest.writeInt(this.padding);
    }
}
