package com.vk.superapp.ui.widgets.tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.epx;
import xsna.zcl;

/* compiled from: ImageWithAction.kt */
/* loaded from: classes6.dex */
public final class ImageWithAction implements Parcelable {
    public static final Parcelable.Creator<ImageWithAction> CREATOR = new a();
    public final WebImage b;
    public final WebAction c;

    /* compiled from: ImageWithAction.kt */
    public static final class a implements Parcelable.Creator<ImageWithAction> {
        @Override // android.os.Parcelable.Creator
        public final ImageWithAction createFromParcel(Parcel parcel) {
            return new ImageWithAction((WebImage) parcel.readParcelable(ImageWithAction.class.getClassLoader()), (WebAction) parcel.readParcelable(ImageWithAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageWithAction[] newArray(int i) {
            return new ImageWithAction[i];
        }
    }

    public ImageWithAction(WebImage webImage, WebAction webAction) {
        this.b = webImage;
        this.c = webAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithAction)) {
            return false;
        }
        ImageWithAction imageWithAction = (ImageWithAction) obj;
        return epx.f(this.b, imageWithAction.b) && epx.f(this.c, imageWithAction.c);
    }

    public final int hashCode() {
        WebImage webImage = this.b;
        int hashCode = (webImage == null ? 0 : webImage.b.hashCode()) * 31;
        WebAction webAction = this.c;
        return hashCode + (webAction != null ? webAction.hashCode() : 0);
    }

    public final String toString() {
        return "ImageWithAction(image=" + this.b + ", action=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ ImageWithAction(WebImage webImage, WebAction webAction, int i, zcl zclVar) {
        this(webImage, (i & 2) != 0 ? null : webAction);
    }
}
