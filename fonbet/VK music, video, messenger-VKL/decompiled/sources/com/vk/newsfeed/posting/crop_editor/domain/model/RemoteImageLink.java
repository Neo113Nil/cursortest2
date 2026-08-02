package com.vk.newsfeed.posting.crop_editor.domain.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ImageLink.kt */
/* loaded from: classes4.dex */
public final class RemoteImageLink implements ImageLink {
    public static final Parcelable.Creator<RemoteImageLink> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final Uri d;
    public final int e;
    public final int f;

    /* compiled from: ImageLink.kt */
    public static final class a implements Parcelable.Creator<RemoteImageLink> {
        @Override // android.os.Parcelable.Creator
        public final RemoteImageLink createFromParcel(Parcel parcel) {
            return new RemoteImageLink(parcel.readString(), parcel.readInt() != 0, (Uri) parcel.readParcelable(RemoteImageLink.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteImageLink[] newArray(int i) {
            return new RemoteImageLink[i];
        }
    }

    public RemoteImageLink(String str, boolean z, Uri uri, int i, int i2) {
        this.b = str;
        this.c = z;
        this.d = uri;
        this.e = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink
    public final int getHeight() {
        return this.f;
    }

    @Override // com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink
    public final Uri getUri() {
        return this.d;
    }

    @Override // com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink
    public final int getWidth() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
