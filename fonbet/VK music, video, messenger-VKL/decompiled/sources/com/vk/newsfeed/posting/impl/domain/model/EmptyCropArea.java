package com.vk.newsfeed.posting.impl.domain.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: PhotoVideoAttachmentsCropData.kt */
/* loaded from: classes4.dex */
public final class EmptyCropArea implements Parcelable {
    public static final Parcelable.Creator<EmptyCropArea> CREATOR = new a();
    public final String b;
    public final Uri c;
    public final PostingPreviewRatio d;

    /* compiled from: PhotoVideoAttachmentsCropData.kt */
    public static final class a implements Parcelable.Creator<EmptyCropArea> {
        @Override // android.os.Parcelable.Creator
        public final EmptyCropArea createFromParcel(Parcel parcel) {
            return new EmptyCropArea(parcel.readString(), (Uri) parcel.readParcelable(EmptyCropArea.class.getClassLoader()), PostingPreviewRatio.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyCropArea[] newArray(int i) {
            return new EmptyCropArea[i];
        }
    }

    public EmptyCropArea(String str, Uri uri, PostingPreviewRatio postingPreviewRatio) {
        this.b = str;
        this.c = uri;
        this.d = postingPreviewRatio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyCropArea)) {
            return false;
        }
        EmptyCropArea emptyCropArea = (EmptyCropArea) obj;
        return epx.f(this.b, emptyCropArea.b) && epx.f(this.c, emptyCropArea.c) && epx.f(this.d, emptyCropArea.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Uri uri = this.c;
        return this.d.hashCode() + ((hashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    public final String toString() {
        return "EmptyCropArea(photoId=" + this.b + ", uri=" + this.c + ", targetRatio=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
    }
}
