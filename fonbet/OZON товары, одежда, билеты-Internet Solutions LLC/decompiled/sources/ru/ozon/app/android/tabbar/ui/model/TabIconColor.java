package ru.ozon.app.android.tabbar.ui.model;

import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "Landroid/os/Parcelable;", "Landroid/content/res/ColorStateList;", "colorTintList", "<init>", "(Landroid/content/res/ColorStateList;)V", "", "uncheckedState", "", "getUncheckedColor", "([I)I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/res/ColorStateList;", "getColorTintList", "()Landroid/content/res/ColorStateList;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TabIconColor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TabIconColor> CREATOR = new Creator();

    @NotNull
    private final ColorStateList colorTintList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TabIconColor> {
        @Override // android.os.Parcelable.Creator
        public final TabIconColor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TabIconColor((ColorStateList) parcel.readParcelable(TabIconColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TabIconColor[] newArray(int i11) {
            return new TabIconColor[i11];
        }
    }

    public TabIconColor(@NotNull ColorStateList colorTintList) {
        Intrinsics.checkNotNullParameter(colorTintList, "colorTintList");
        this.colorTintList = colorTintList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TabIconColor) && Intrinsics.d(this.colorTintList, ((TabIconColor) other).colorTintList);
    }

    @NotNull
    public final ColorStateList getColorTintList() {
        return this.colorTintList;
    }

    public final int getUncheckedColor(@NotNull int[] uncheckedState) {
        Intrinsics.checkNotNullParameter(uncheckedState, "uncheckedState");
        return this.colorTintList.getColorForState(uncheckedState, -16777216);
    }

    public int hashCode() {
        return this.colorTintList.hashCode();
    }

    @NotNull
    public String toString() {
        return "TabIconColor(colorTintList=" + this.colorTintList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.colorTintList, flags);
    }
}
