package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.epx;

/* compiled from: AdditionalHeaderIconBlock.kt */
/* loaded from: classes6.dex */
public final class AdditionalHeaderIconBlock implements Parcelable {
    public static final a CREATOR = new a();
    public final WebImage b;
    public final WebAction c;

    /* compiled from: AdditionalHeaderIconBlock.kt */
    public static final class a implements Parcelable.Creator<AdditionalHeaderIconBlock> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalHeaderIconBlock createFromParcel(Parcel parcel) {
            return new AdditionalHeaderIconBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalHeaderIconBlock[] newArray(int i) {
            return new AdditionalHeaderIconBlock[i];
        }
    }

    public AdditionalHeaderIconBlock(WebImage webImage, WebAction webAction) {
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
        if (!(obj instanceof AdditionalHeaderIconBlock)) {
            return false;
        }
        AdditionalHeaderIconBlock additionalHeaderIconBlock = (AdditionalHeaderIconBlock) obj;
        return epx.f(this.b, additionalHeaderIconBlock.b) && epx.f(this.c, additionalHeaderIconBlock.c);
    }

    public final int hashCode() {
        WebImage webImage = this.b;
        int hashCode = (webImage == null ? 0 : webImage.b.hashCode()) * 31;
        WebAction webAction = this.c;
        return hashCode + (webAction != null ? webAction.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalHeaderIconBlock(originalImage=" + this.b + ", action=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public AdditionalHeaderIconBlock(Parcel parcel) {
        this((WebImage) parcel.readParcelable(WebImage.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
