package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;
import xsna.zcl;

/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public final class UniversalHalfTileIcon extends HalfTileIcon {
    public static final Parcelable.Creator<UniversalHalfTileIcon> CREATOR = new a();
    public final WebImage b;

    /* compiled from: HalfTileContent.kt */
    public static final class a implements Parcelable.Creator<UniversalHalfTileIcon> {
        @Override // android.os.Parcelable.Creator
        public final UniversalHalfTileIcon createFromParcel(Parcel parcel) {
            return new UniversalHalfTileIcon((WebImage) parcel.readParcelable(UniversalHalfTileIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalHalfTileIcon[] newArray(int i) {
            return new UniversalHalfTileIcon[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalHalfTileIcon() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UniversalHalfTileIcon) && epx.f(this.b, ((UniversalHalfTileIcon) obj).b);
    }

    public final int hashCode() {
        WebImage webImage = this.b;
        if (webImage == null) {
            return 0;
        }
        return webImage.b.hashCode();
    }

    public final String toString() {
        return "UniversalHalfTileIcon(images=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }

    public /* synthetic */ UniversalHalfTileIcon(WebImage webImage, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : webImage);
    }

    public UniversalHalfTileIcon(WebImage webImage) {
        super(null);
        this.b = webImage;
    }
}
