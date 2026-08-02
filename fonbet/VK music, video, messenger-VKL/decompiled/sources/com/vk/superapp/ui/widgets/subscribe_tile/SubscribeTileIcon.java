package com.vk.superapp.ui.widgets.subscribe_tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.ui.widgets.tile.TileStyle;
import xsna.epx;

/* compiled from: SubscribeTileIcon.kt */
/* loaded from: classes6.dex */
public final class SubscribeTileIcon implements Parcelable {
    public static final Parcelable.Creator<SubscribeTileIcon> CREATOR = new a();
    public final WebImage b;
    public final TileStyle c;
    public final SubIcon d;

    /* compiled from: SubscribeTileIcon.kt */
    public static final class a implements Parcelable.Creator<SubscribeTileIcon> {
        @Override // android.os.Parcelable.Creator
        public final SubscribeTileIcon createFromParcel(Parcel parcel) {
            return new SubscribeTileIcon((WebImage) parcel.readParcelable(SubscribeTileIcon.class.getClassLoader()), parcel.readInt() == 0 ? null : TileStyle.CREATOR.createFromParcel(parcel), (SubIcon) parcel.readParcelable(SubscribeTileIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SubscribeTileIcon[] newArray(int i) {
            return new SubscribeTileIcon[i];
        }
    }

    public SubscribeTileIcon(WebImage webImage, TileStyle tileStyle, SubIcon subIcon) {
        this.b = webImage;
        this.c = tileStyle;
        this.d = subIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeTileIcon)) {
            return false;
        }
        SubscribeTileIcon subscribeTileIcon = (SubscribeTileIcon) obj;
        return epx.f(this.b, subscribeTileIcon.b) && epx.f(this.c, subscribeTileIcon.c) && epx.f(this.d, subscribeTileIcon.d);
    }

    public final int hashCode() {
        WebImage webImage = this.b;
        int hashCode = (webImage == null ? 0 : webImage.b.hashCode()) * 31;
        TileStyle tileStyle = this.c;
        int hashCode2 = (hashCode + (tileStyle == null ? 0 : tileStyle.hashCode())) * 31;
        SubIcon subIcon = this.d;
        return hashCode2 + (subIcon != null ? subIcon.hashCode() : 0);
    }

    public final String toString() {
        return "SubscribeTileIcon(images=" + this.b + ", style=" + this.c + ", subIcon=" + this.d + ')';
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
        parcel.writeParcelable(this.d, i);
    }
}
