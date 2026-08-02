package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;

/* compiled from: TileBackgroundImage.kt */
/* loaded from: classes6.dex */
public final class TileBackgroundImage implements Parcelable {
    public static final Parcelable.Creator<TileBackgroundImage> CREATOR = new a();
    public final WebImage b;
    public final TileStyle c;
    public final TileImageSubIcon d;

    /* compiled from: TileBackgroundImage.kt */
    public static final class a implements Parcelable.Creator<TileBackgroundImage> {
        @Override // android.os.Parcelable.Creator
        public final TileBackgroundImage createFromParcel(Parcel parcel) {
            return new TileBackgroundImage((WebImage) parcel.readParcelable(TileBackgroundImage.class.getClassLoader()), parcel.readInt() == 0 ? null : TileStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TileImageSubIcon.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TileBackgroundImage[] newArray(int i) {
            return new TileBackgroundImage[i];
        }
    }

    public TileBackgroundImage(WebImage webImage, TileStyle tileStyle, TileImageSubIcon tileImageSubIcon) {
        this.b = webImage;
        this.c = tileStyle;
        this.d = tileImageSubIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileBackgroundImage)) {
            return false;
        }
        TileBackgroundImage tileBackgroundImage = (TileBackgroundImage) obj;
        return epx.f(this.b, tileBackgroundImage.b) && epx.f(this.c, tileBackgroundImage.c) && epx.f(this.d, tileBackgroundImage.d);
    }

    public final int hashCode() {
        int hashCode = this.b.b.hashCode() * 31;
        TileStyle tileStyle = this.c;
        int hashCode2 = (hashCode + (tileStyle == null ? 0 : tileStyle.hashCode())) * 31;
        TileImageSubIcon tileImageSubIcon = this.d;
        return hashCode2 + (tileImageSubIcon != null ? tileImageSubIcon.hashCode() : 0);
    }

    public final String toString() {
        return "TileBackgroundImage(image=" + this.b + ", style=" + this.c + ", subIcon=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        TileStyle tileStyle = this.c;
        if (tileStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tileStyle.writeToParcel(parcel, i);
        }
        TileImageSubIcon tileImageSubIcon = this.d;
        if (tileImageSubIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tileImageSubIcon.writeToParcel(parcel, i);
        }
    }
}
