package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$MediaPicker$Album$SelectAlbum implements PostingAction.MediaPicker {
    public static final Parcelable.Creator<PostingAction$MediaPicker$Album$SelectAlbum> CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$MediaPicker$Album$SelectAlbum> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$MediaPicker$Album$SelectAlbum createFromParcel(Parcel parcel) {
            return new PostingAction$MediaPicker$Album$SelectAlbum(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$MediaPicker$Album$SelectAlbum[] newArray(int i) {
            return new PostingAction$MediaPicker$Album$SelectAlbum[i];
        }
    }

    public PostingAction$MediaPicker$Album$SelectAlbum(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$MediaPicker$Album$SelectAlbum)) {
            return false;
        }
        PostingAction$MediaPicker$Album$SelectAlbum postingAction$MediaPicker$Album$SelectAlbum = (PostingAction$MediaPicker$Album$SelectAlbum) obj;
        return this.b == postingAction$MediaPicker$Album$SelectAlbum.b && this.c == postingAction$MediaPicker$Album$SelectAlbum.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectAlbum(albumId=");
        sb.append(this.b);
        sb.append(", albumIndex=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public /* synthetic */ PostingAction$MediaPicker$Album$SelectAlbum(int i, int i2, int i3, zcl zclVar) {
        this(i, (i3 & 2) != 0 ? 0 : i2);
    }
}
