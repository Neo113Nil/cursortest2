package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Kk.c;
import Nh.a;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jn\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b\f\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "Landroid/os/Parcelable;", "", "marginLeft", "marginTop", "marginRight", "marginBottom", "marginVertical", "marginHorizontal", "", "cornerRadius", "", "isBannerTopPosition", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Z)Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMarginLeft", "()Ljava/lang/Integer;", "getMarginTop", "getMarginRight", "getMarginBottom", "getMarginVertical", "getMarginHorizontal", "Ljava/lang/Float;", "getCornerRadius", "()Ljava/lang/Float;", "Z", "()Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OnBoardingCutConfig implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OnBoardingCutConfig> CREATOR = new Creator();
    private final Float cornerRadius;
    private final boolean isBannerTopPosition;
    private final Integer marginBottom;
    private final Integer marginHorizontal;
    private final Integer marginLeft;
    private final Integer marginRight;
    private final Integer marginTop;
    private final Integer marginVertical;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnBoardingCutConfig> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingCutConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnBoardingCutConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingCutConfig[] newArray(int i11) {
            return new OnBoardingCutConfig[i11];
        }
    }

    public OnBoardingCutConfig() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public static /* synthetic */ OnBoardingCutConfig copy$default(OnBoardingCutConfig onBoardingCutConfig, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f7, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = onBoardingCutConfig.marginLeft;
        }
        if ((i11 & 2) != 0) {
            num2 = onBoardingCutConfig.marginTop;
        }
        if ((i11 & 4) != 0) {
            num3 = onBoardingCutConfig.marginRight;
        }
        if ((i11 & 8) != 0) {
            num4 = onBoardingCutConfig.marginBottom;
        }
        if ((i11 & 16) != 0) {
            num5 = onBoardingCutConfig.marginVertical;
        }
        if ((i11 & 32) != 0) {
            num6 = onBoardingCutConfig.marginHorizontal;
        }
        if ((i11 & 64) != 0) {
            f7 = onBoardingCutConfig.cornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = onBoardingCutConfig.isBannerTopPosition;
        }
        Float f11 = f7;
        boolean z12 = z11;
        Integer num7 = num5;
        Integer num8 = num6;
        return onBoardingCutConfig.copy(num, num2, num3, num4, num7, num8, f11, z12);
    }

    @NotNull
    public final OnBoardingCutConfig copy(Integer marginLeft, Integer marginTop, Integer marginRight, Integer marginBottom, Integer marginVertical, Integer marginHorizontal, Float cornerRadius, boolean isBannerTopPosition) {
        return new OnBoardingCutConfig(marginLeft, marginTop, marginRight, marginBottom, marginVertical, marginHorizontal, cornerRadius, isBannerTopPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnBoardingCutConfig)) {
            return false;
        }
        OnBoardingCutConfig onBoardingCutConfig = (OnBoardingCutConfig) other;
        return Intrinsics.d(this.marginLeft, onBoardingCutConfig.marginLeft) && Intrinsics.d(this.marginTop, onBoardingCutConfig.marginTop) && Intrinsics.d(this.marginRight, onBoardingCutConfig.marginRight) && Intrinsics.d(this.marginBottom, onBoardingCutConfig.marginBottom) && Intrinsics.d(this.marginVertical, onBoardingCutConfig.marginVertical) && Intrinsics.d(this.marginHorizontal, onBoardingCutConfig.marginHorizontal) && Intrinsics.d(this.cornerRadius, onBoardingCutConfig.cornerRadius) && this.isBannerTopPosition == onBoardingCutConfig.isBannerTopPosition;
    }

    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginHorizontal() {
        return this.marginHorizontal;
    }

    public final Integer getMarginLeft() {
        return this.marginLeft;
    }

    public final Integer getMarginRight() {
        return this.marginRight;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    public final Integer getMarginVertical() {
        return this.marginVertical;
    }

    public int hashCode() {
        Integer num = this.marginLeft;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.marginTop;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marginRight;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.marginBottom;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.marginVertical;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.marginHorizontal;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Float f7 = this.cornerRadius;
        return Boolean.hashCode(this.isBannerTopPosition) + ((hashCode6 + (f7 != null ? f7.hashCode() : 0)) * 31);
    }

    /* renamed from: isBannerTopPosition, reason: from getter */
    public final boolean getIsBannerTopPosition() {
        return this.isBannerTopPosition;
    }

    @NotNull
    public String toString() {
        Integer num = this.marginLeft;
        Integer num2 = this.marginTop;
        Integer num3 = this.marginRight;
        Integer num4 = this.marginBottom;
        Integer num5 = this.marginVertical;
        Integer num6 = this.marginHorizontal;
        Float f7 = this.cornerRadius;
        boolean z11 = this.isBannerTopPosition;
        StringBuilder f11 = c.f("OnBoardingCutConfig(marginLeft=", ", marginTop=", num, num2, ", marginRight=");
        Ef0.c.e(f11, num3, ", marginBottom=", num4, ", marginVertical=");
        Ef0.c.e(f11, num5, ", marginHorizontal=", num6, ", cornerRadius=");
        f11.append(f7);
        f11.append(", isBannerTopPosition=");
        f11.append(z11);
        f11.append(")");
        return f11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.marginLeft;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        Integer num2 = this.marginTop;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num2);
        }
        Integer num3 = this.marginRight;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num3);
        }
        Integer num4 = this.marginBottom;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num4);
        }
        Integer num5 = this.marginVertical;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num5);
        }
        Integer num6 = this.marginHorizontal;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num6);
        }
        Float f7 = this.cornerRadius;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
        dest.writeInt(this.isBannerTopPosition ? 1 : 0);
    }

    public OnBoardingCutConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f7, boolean z11) {
        this.marginLeft = num;
        this.marginTop = num2;
        this.marginRight = num3;
        this.marginBottom = num4;
        this.marginVertical = num5;
        this.marginHorizontal = num6;
        this.cornerRadius = f7;
        this.isBannerTopPosition = z11;
    }

    public /* synthetic */ OnBoardingCutConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Float f7, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4, (i11 & 16) != 0 ? null : num5, (i11 & 32) != 0 ? null : num6, (i11 & 64) != 0 ? null : f7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z11);
    }
}
