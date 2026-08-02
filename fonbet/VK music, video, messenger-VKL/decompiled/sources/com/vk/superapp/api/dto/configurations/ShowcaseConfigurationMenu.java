package com.vk.superapp.api.dto.configurations;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.shy;
import xsna.vu5;

/* compiled from: ShowcaseConfiguration.kt */
/* loaded from: classes6.dex */
public final class ShowcaseConfigurationMenu extends ShowcaseConfiguration implements Parcelable {
    public static final Parcelable.Creator<ShowcaseConfigurationMenu> CREATOR = new a();
    public final boolean b;
    public final int c;
    public final int d;

    /* compiled from: ShowcaseConfiguration.kt */
    public static final class a implements Parcelable.Creator<ShowcaseConfigurationMenu> {
        @Override // android.os.Parcelable.Creator
        public final ShowcaseConfigurationMenu createFromParcel(Parcel parcel) {
            return new ShowcaseConfigurationMenu(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShowcaseConfigurationMenu[] newArray(int i) {
            return new ShowcaseConfigurationMenu[i];
        }
    }

    public ShowcaseConfigurationMenu(boolean z, int i, int i2) {
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowcaseConfigurationMenu)) {
            return false;
        }
        ShowcaseConfigurationMenu showcaseConfigurationMenu = (ShowcaseConfigurationMenu) obj;
        return this.b == showcaseConfigurationMenu.b && this.c == showcaseConfigurationMenu.c && this.d == showcaseConfigurationMenu.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Boolean.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowcaseConfigurationMenu(hasSearch=");
        sb.append(this.b);
        sb.append(", rowsPerPage=");
        sb.append(this.c);
        sb.append(", columnsPerPage=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
