package com.vk.clips.viewer.edit.presentation.feature.state;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.zcl;

/* compiled from: ClipEditSdkCoverImage.kt */
/* loaded from: classes17.dex */
public final class ClipEditSdkCoverImage implements Parcelable {
    public static final Parcelable.Creator<ClipEditSdkCoverImage> CREATOR = new a();
    public final List<CoverImageUrl> b;
    public final Parcelable c;

    /* compiled from: ClipEditSdkCoverImage.kt */
    public static final class a implements Parcelable.Creator<ClipEditSdkCoverImage> {
        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkCoverImage createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CoverImageUrl.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClipEditSdkCoverImage(arrayList, parcel.readParcelable(ClipEditSdkCoverImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkCoverImage[] newArray(int i) {
            return new ClipEditSdkCoverImage[i];
        }
    }

    public ClipEditSdkCoverImage(List<CoverImageUrl> list, Parcelable parcelable) {
        this.b = list;
        this.c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipEditSdkCoverImage)) {
            return false;
        }
        ClipEditSdkCoverImage clipEditSdkCoverImage = (ClipEditSdkCoverImage) obj;
        return epx.f(this.b, clipEditSdkCoverImage.b) && epx.f(this.c, clipEditSdkCoverImage.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Parcelable parcelable = this.c;
        return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "ClipEditSdkCoverImage(imageUrls=" + this.b + ", originalSource=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((CoverImageUrl) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ ClipEditSdkCoverImage(List list, Parcelable parcelable, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : parcelable);
    }
}
