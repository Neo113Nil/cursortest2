package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$ShowSnackbar$CropZoom implements PostingAction {
    public static final Parcelable.Creator<PostingAction$ShowSnackbar$CropZoom> CREATOR = new a();
    public final long b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$ShowSnackbar$CropZoom> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$ShowSnackbar$CropZoom createFromParcel(Parcel parcel) {
            return new PostingAction$ShowSnackbar$CropZoom(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$ShowSnackbar$CropZoom[] newArray(int i) {
            return new PostingAction$ShowSnackbar$CropZoom[i];
        }
    }

    public PostingAction$ShowSnackbar$CropZoom(long j) {
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingAction$ShowSnackbar$CropZoom) && this.b == ((PostingAction$ShowSnackbar$CropZoom) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("CropZoom(delay="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }
}
