package ru.ozon.app.android.tabbar.ui;

import N3.C3660k;
import Nh.a;
import T7.Z;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/tabbar/ui/ActiveColorsConfig;", "Landroid/os/Parcelable;", "", "titleColor", "iconColor", "", "titleAltColor", "iconAltColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleColor", "getIconColor", "Ljava/lang/Integer;", "getTitleAltColor", "()Ljava/lang/Integer;", "getIconAltColor", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActiveColorsConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveColorsConfig> CREATOR = new Creator();
    private final Integer iconAltColor;
    private final String iconColor;
    private final Integer titleAltColor;
    private final String titleColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActiveColorsConfig> {
        @Override // android.os.Parcelable.Creator
        public final ActiveColorsConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActiveColorsConfig(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ActiveColorsConfig[] newArray(int i11) {
            return new ActiveColorsConfig[i11];
        }
    }

    public ActiveColorsConfig() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveColorsConfig)) {
            return false;
        }
        ActiveColorsConfig activeColorsConfig = (ActiveColorsConfig) other;
        return Intrinsics.d(this.titleColor, activeColorsConfig.titleColor) && Intrinsics.d(this.iconColor, activeColorsConfig.iconColor) && Intrinsics.d(this.titleAltColor, activeColorsConfig.titleAltColor) && Intrinsics.d(this.iconAltColor, activeColorsConfig.iconAltColor);
    }

    public final Integer getIconAltColor() {
        return this.iconAltColor;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final Integer getTitleAltColor() {
        return this.titleAltColor;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        String str = this.titleColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.titleAltColor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.iconAltColor;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.titleColor;
        String str2 = this.iconColor;
        return Z.c(C3660k.d("ActiveColorsConfig(titleColor=", str, ", iconColor=", str2, ", titleAltColor="), this.titleAltColor, ", iconAltColor=", this.iconAltColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.titleColor);
        dest.writeString(this.iconColor);
        Integer num = this.titleAltColor;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        Integer num2 = this.iconAltColor;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num2);
        }
    }

    public ActiveColorsConfig(String str, String str2, Integer num, Integer num2) {
        this.titleColor = str;
        this.iconColor = str2;
        this.titleAltColor = num;
        this.iconAltColor = num2;
    }

    public /* synthetic */ ActiveColorsConfig(String str, String str2, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2);
    }
}
