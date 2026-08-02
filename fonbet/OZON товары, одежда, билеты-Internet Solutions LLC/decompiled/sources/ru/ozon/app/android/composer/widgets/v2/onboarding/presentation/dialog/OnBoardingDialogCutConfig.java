package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialogCutConfig;", "Landroid/os/Parcelable;", "", "left", "top", "right", "bottom", "", "cornerRadius", "", "isBannerTopPosition", "<init>", "(IIIILjava/lang/Float;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "Ljava/lang/Float;", "getCornerRadius", "()Ljava/lang/Float;", "Z", "()Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OnBoardingDialogCutConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnBoardingDialogCutConfig> CREATOR = new Creator();
    private final int bottom;
    private final Float cornerRadius;
    private final boolean isBannerTopPosition;
    private final int left;
    private final int right;
    private final int top;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnBoardingDialogCutConfig> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingDialogCutConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnBoardingDialogCutConfig(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingDialogCutConfig[] newArray(int i11) {
            return new OnBoardingDialogCutConfig[i11];
        }
    }

    public OnBoardingDialogCutConfig(int i11, int i12, int i13, int i14, Float f7, boolean z11) {
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
        this.cornerRadius = f7;
        this.isBannerTopPosition = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnBoardingDialogCutConfig)) {
            return false;
        }
        OnBoardingDialogCutConfig onBoardingDialogCutConfig = (OnBoardingDialogCutConfig) other;
        return this.left == onBoardingDialogCutConfig.left && this.top == onBoardingDialogCutConfig.top && this.right == onBoardingDialogCutConfig.right && this.bottom == onBoardingDialogCutConfig.bottom && Intrinsics.d(this.cornerRadius, onBoardingDialogCutConfig.cornerRadius) && this.isBannerTopPosition == onBoardingDialogCutConfig.isBannerTopPosition;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.bottom, C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31), 31);
        Float f7 = this.cornerRadius;
        return Boolean.hashCode(this.isBannerTopPosition) + ((a11 + (f7 == null ? 0 : f7.hashCode())) * 31);
    }

    /* renamed from: isBannerTopPosition, reason: from getter */
    public final boolean getIsBannerTopPosition() {
        return this.isBannerTopPosition;
    }

    @NotNull
    public String toString() {
        int i11 = this.left;
        int i12 = this.top;
        int i13 = this.right;
        int i14 = this.bottom;
        Float f7 = this.cornerRadius;
        boolean z11 = this.isBannerTopPosition;
        StringBuilder a11 = C2438a.a("OnBoardingDialogCutConfig(left=", i11, ", top=", ", right=", i12);
        a.f(i13, i14, ", bottom=", ", cornerRadius=", a11);
        a11.append(f7);
        a11.append(", isBannerTopPosition=");
        a11.append(z11);
        a11.append(")");
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.left);
        dest.writeInt(this.top);
        dest.writeInt(this.right);
        dest.writeInt(this.bottom);
        Float f7 = this.cornerRadius;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
        dest.writeInt(this.isBannerTopPosition ? 1 : 0);
    }
}
