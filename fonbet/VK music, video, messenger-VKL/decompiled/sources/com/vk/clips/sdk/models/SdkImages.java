package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.zcl;

/* compiled from: SdkImages.kt */
/* loaded from: classes17.dex */
public final class SdkImages implements Parcelable {
    public static final Parcelable.Creator<SdkImages> CREATOR = new a();
    public static final SdkImages d = new SdkImages(EmptyList.b, null);
    public final List<ImageUrl> b;
    public final Parcelable c;

    /* compiled from: SdkImages.kt */
    public static final class a implements Parcelable.Creator<SdkImages> {
        @Override // android.os.Parcelable.Creator
        public final SdkImages createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ImageUrl.CREATOR, parcel, arrayList, i, 1);
            }
            return new SdkImages(arrayList, parcel.readParcelable(SdkImages.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SdkImages[] newArray(int i) {
            return new SdkImages[i];
        }
    }

    public SdkImages(List<ImageUrl> list, Parcelable parcelable) {
        this.b = list;
        this.c = parcelable;
    }

    public final String a(int i) {
        ImageUrl b = b(i);
        if (b != null) {
            return b.b;
        }
        return null;
    }

    public final ImageUrl b(int i) {
        ImageUrl imageUrl = null;
        for (ImageUrl imageUrl2 : this.b) {
            if (imageUrl != null) {
                int i2 = imageUrl.f;
                if (i2 < imageUrl2.f) {
                    if (i2 >= i) {
                        if (Math.abs(imageUrl2.f - i) < Math.abs(i2 - i)) {
                        }
                    }
                }
            }
            imageUrl = imageUrl2;
        }
        return imageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkImages)) {
            return false;
        }
        SdkImages sdkImages = (SdkImages) obj;
        return epx.f(this.b, sdkImages.b) && epx.f(this.c, sdkImages.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Parcelable parcelable = this.c;
        return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "SdkImages(imageUrls=" + this.b + ", originalSource=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((ImageUrl) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ SdkImages(List list, Parcelable parcelable, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : parcelable);
    }
}
