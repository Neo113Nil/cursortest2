package com.vk.newsfeed.posting.crop_editor.domain.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ImageLink.kt */
/* loaded from: classes4.dex */
public final class LocalImageLink implements ImageLink {
    public static final Parcelable.Creator<LocalImageLink> CREATOR = new a();
    public final Uri b;
    public final int c;
    public final int d;

    /* compiled from: ImageLink.kt */
    public static final class a implements Parcelable.Creator<LocalImageLink> {
        @Override // android.os.Parcelable.Creator
        public final LocalImageLink createFromParcel(Parcel parcel) {
            return new LocalImageLink((Uri) parcel.readParcelable(LocalImageLink.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LocalImageLink[] newArray(int i) {
            return new LocalImageLink[i];
        }
    }

    public LocalImageLink(Uri uri, int i, int i2) {
        this.b = uri;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink
    public final int getHeight() {
        return this.d;
    }

    @Override // com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink
    public final Uri getUri() {
        return this.b;
    }

    @Override // com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink
    public final int getWidth() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
