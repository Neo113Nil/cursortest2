package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: TileBackgroundImage.kt */
/* loaded from: classes6.dex */
public final class TileImageSubIcon implements Parcelable {
    public static final Parcelable.Creator<TileImageSubIcon> CREATOR = new a();
    public final TileImageSubIconType b;
    public final WebImage c;
    public final String d;
    public final String e;

    /* compiled from: TileBackgroundImage.kt */
    public static final class a implements Parcelable.Creator<TileImageSubIcon> {
        @Override // android.os.Parcelable.Creator
        public final TileImageSubIcon createFromParcel(Parcel parcel) {
            return new TileImageSubIcon(TileImageSubIconType.valueOf(parcel.readString()), (WebImage) parcel.readParcelable(TileImageSubIcon.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TileImageSubIcon[] newArray(int i) {
            return new TileImageSubIcon[i];
        }
    }

    public TileImageSubIcon(TileImageSubIconType tileImageSubIconType, WebImage webImage, String str, String str2) {
        this.b = tileImageSubIconType;
        this.c = webImage;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileImageSubIcon)) {
            return false;
        }
        TileImageSubIcon tileImageSubIcon = (TileImageSubIcon) obj;
        return this.b == tileImageSubIcon.b && epx.f(this.c, tileImageSubIcon.c) && epx.f(this.d, tileImageSubIcon.d) && epx.f(this.e, tileImageSubIcon.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        WebImage webImage = this.c;
        int hashCode2 = (hashCode + (webImage == null ? 0 : webImage.b.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileImageSubIcon(type=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public /* synthetic */ TileImageSubIcon(TileImageSubIconType tileImageSubIconType, WebImage webImage, String str, String str2, int i, zcl zclVar) {
        this(tileImageSubIconType, (i & 2) != 0 ? null : webImage, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
