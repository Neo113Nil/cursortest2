package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: PhotoVideoAttachmentsCropData.kt */
/* loaded from: classes4.dex */
public final class PostingPreviewRatio implements Parcelable {
    public static final Parcelable.Creator<PostingPreviewRatio> CREATOR = new a();
    public static final PostingPreviewRatio f = new PostingPreviewRatio(1, 1, false, false);
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    /* compiled from: PhotoVideoAttachmentsCropData.kt */
    public static final class a implements Parcelable.Creator<PostingPreviewRatio> {
        @Override // android.os.Parcelable.Creator
        public final PostingPreviewRatio createFromParcel(Parcel parcel) {
            return new PostingPreviewRatio(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingPreviewRatio[] newArray(int i) {
            return new PostingPreviewRatio[i];
        }
    }

    public PostingPreviewRatio(int i, int i2, boolean z, boolean z2) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingPreviewRatio)) {
            return false;
        }
        PostingPreviewRatio postingPreviewRatio = (PostingPreviewRatio) obj;
        return this.b == postingPreviewRatio.b && this.c == postingPreviewRatio.c && this.d == postingPreviewRatio.d && this.e == postingPreviewRatio.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingPreviewRatio(ratioW=");
        sb.append(this.b);
        sb.append(", ratioH=");
        sb.append(this.c);
        sb.append(", isCustom=");
        sb.append(this.d);
        sb.append(", isOriginal=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ PostingPreviewRatio(int i, int i2, boolean z, boolean z2, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2);
    }
}
