package ru.ozon.app.android.storefront.navBar;

import Am.C2438a;
import B0.C2454a;
import Ep.a;
import Kk.C3532b;
import Ql.c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarColors;", "Landroid/os/Parcelable;", "<init>", "()V", "backgroundColor", "", "getBackgroundColor", "()I", "statusBarColor", "getStatusBarColor", "iconColor", "getIconColor", "isBgColorDark", "", "()Z", "Default", "Expanded", "Lru/ozon/app/android/storefront/navBar/NavBarColors$Default;", "Lru/ozon/app/android/storefront/navBar/NavBarColors$Expanded;", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NavBarColors implements Parcelable {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarColors$Default;", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "", "backgroundColor", "statusBarColor", "iconColor", "", "isBgColorDark", "<init>", "(IIIZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "getStatusBarColor", "getIconColor", "Z", "()Z", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends NavBarColors {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new Creator();
        private final int backgroundColor;
        private final int iconColor;
        private final boolean isBgColorDark;
        private final int statusBarColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i11) {
                return new Default[i11];
            }
        }

        public Default(int i11, int i12, int i13, boolean z11) {
            super(null);
            this.backgroundColor = i11;
            this.statusBarColor = i12;
            this.iconColor = i13;
            this.isBgColorDark = z11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r52 = (Default) other;
            return this.backgroundColor == r52.backgroundColor && this.statusBarColor == r52.statusBarColor && this.iconColor == r52.iconColor && this.isBgColorDark == r52.isBgColorDark;
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        public int getIconColor() {
            return this.iconColor;
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        public int getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isBgColorDark) + C2454a.a(this.iconColor, C2454a.a(this.statusBarColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31);
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        /* renamed from: isBgColorDark, reason: from getter */
        public boolean getIsBgColorDark() {
            return this.isBgColorDark;
        }

        @NotNull
        public String toString() {
            int i11 = this.backgroundColor;
            int i12 = this.statusBarColor;
            int i13 = this.iconColor;
            boolean z11 = this.isBgColorDark;
            StringBuilder a11 = C2438a.a("Default(backgroundColor=", i11, ", statusBarColor=", ", iconColor=", i12);
            a11.append(i13);
            a11.append(", isBgColorDark=");
            a11.append(z11);
            a11.append(")");
            return a11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.backgroundColor);
            dest.writeInt(this.statusBarColor);
            dest.writeInt(this.iconColor);
            dest.writeInt(this.isBgColorDark ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarColors$Expanded;", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "", "backgroundColor", "statusBarColor", "iconColor", "", "isBgColorDark", "scrimColor", "<init>", "(IIIZLjava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "getStatusBarColor", "getIconColor", "Z", "()Z", "Ljava/lang/Integer;", "getScrimColor", "()Ljava/lang/Integer;", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Expanded extends NavBarColors {

        @NotNull
        public static final Parcelable.Creator<Expanded> CREATOR = new Creator();
        private final int backgroundColor;
        private final int iconColor;
        private final boolean isBgColorDark;
        private final Integer scrimColor;
        private final int statusBarColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Expanded> {
            @Override // android.os.Parcelable.Creator
            public final Expanded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Expanded(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Expanded[] newArray(int i11) {
                return new Expanded[i11];
            }
        }

        public Expanded(int i11, int i12, int i13, boolean z11, Integer num) {
            super(null);
            this.backgroundColor = i11;
            this.statusBarColor = i12;
            this.iconColor = i13;
            this.isBgColorDark = z11;
            this.scrimColor = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) other;
            return this.backgroundColor == expanded.backgroundColor && this.statusBarColor == expanded.statusBarColor && this.iconColor == expanded.iconColor && this.isBgColorDark == expanded.isBgColorDark && Intrinsics.d(this.scrimColor, expanded.scrimColor);
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        public int getIconColor() {
            return this.iconColor;
        }

        public final Integer getScrimColor() {
            return this.scrimColor;
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        public int getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.iconColor, C2454a.a(this.statusBarColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31, this.isBgColorDark);
            Integer num = this.scrimColor;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @Override // ru.ozon.app.android.storefront.navBar.NavBarColors
        /* renamed from: isBgColorDark, reason: from getter */
        public boolean getIsBgColorDark() {
            return this.isBgColorDark;
        }

        @NotNull
        public String toString() {
            int i11 = this.backgroundColor;
            int i12 = this.statusBarColor;
            int i13 = this.iconColor;
            boolean z11 = this.isBgColorDark;
            Integer num = this.scrimColor;
            StringBuilder a11 = C2438a.a("Expanded(backgroundColor=", i11, ", statusBarColor=", ", iconColor=", i12);
            c.d(a11, i13, ", isBgColorDark=", z11, ", scrimColor=");
            return a.c(a11, num, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.backgroundColor);
            dest.writeInt(this.statusBarColor);
            dest.writeInt(this.iconColor);
            dest.writeInt(this.isBgColorDark ? 1 : 0);
            Integer num = this.scrimColor;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
        }
    }

    public /* synthetic */ NavBarColors(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getBackgroundColor();

    public abstract int getIconColor();

    public abstract int getStatusBarColor();

    /* renamed from: isBgColorDark */
    public abstract boolean getIsBgColorDark();

    private NavBarColors() {
    }
}
