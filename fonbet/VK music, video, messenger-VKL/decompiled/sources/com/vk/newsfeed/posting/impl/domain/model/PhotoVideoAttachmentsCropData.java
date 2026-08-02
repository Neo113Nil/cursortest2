package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.urd0;

/* compiled from: PhotoVideoAttachmentsCropData.kt */
/* loaded from: classes4.dex */
public final class PhotoVideoAttachmentsCropData implements Parcelable {
    public static final Parcelable.Creator<PhotoVideoAttachmentsCropData> CREATOR = new a();
    public static final PhotoVideoAttachmentsCropData f;
    public final List<ImageCropArea> b;
    public final List<EmptyCropArea> c;
    public final String d;
    public final PostingPreviewRatio e;

    /* compiled from: PhotoVideoAttachmentsCropData.kt */
    public static final class a implements Parcelable.Creator<PhotoVideoAttachmentsCropData> {
        @Override // android.os.Parcelable.Creator
        public final PhotoVideoAttachmentsCropData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(ImageCropArea.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(EmptyCropArea.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new PhotoVideoAttachmentsCropData(arrayList, arrayList2, parcel.readString(), PostingPreviewRatio.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoVideoAttachmentsCropData[] newArray(int i) {
            return new PhotoVideoAttachmentsCropData[i];
        }
    }

    static {
        EmptyList emptyList = EmptyList.b;
        f = new PhotoVideoAttachmentsCropData(emptyList, emptyList, "", PostingPreviewRatio.f);
    }

    public PhotoVideoAttachmentsCropData(List<ImageCropArea> list, List<EmptyCropArea> list2, String str, PostingPreviewRatio postingPreviewRatio) {
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = postingPreviewRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PhotoVideoAttachmentsCropData a(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, ArrayList arrayList, ArrayList arrayList2, String str, PostingPreviewRatio postingPreviewRatio, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = photoVideoAttachmentsCropData.b;
        }
        List list2 = arrayList2;
        if ((i & 2) != 0) {
            list2 = photoVideoAttachmentsCropData.c;
        }
        if ((i & 4) != 0) {
            str = photoVideoAttachmentsCropData.d;
        }
        if ((i & 8) != 0) {
            postingPreviewRatio = photoVideoAttachmentsCropData.e;
        }
        photoVideoAttachmentsCropData.getClass();
        return new PhotoVideoAttachmentsCropData(list, list2, str, postingPreviewRatio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoVideoAttachmentsCropData)) {
            return false;
        }
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = (PhotoVideoAttachmentsCropData) obj;
        return epx.f(this.b, photoVideoAttachmentsCropData.b) && epx.f(this.c, photoVideoAttachmentsCropData.c) && epx.f(this.d, photoVideoAttachmentsCropData.d) && epx.f(this.e, photoVideoAttachmentsCropData.e);
    }

    public final int hashCode() {
        List<ImageCropArea> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<EmptyCropArea> list2 = this.c;
        return this.e.hashCode() + urd0.a((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PhotoVideoAttachmentsCropData(currentCrops=" + this.b + ", emptyCrops=" + this.c + ", ratioMeta=" + this.d + ", ratio=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ImageCropArea> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list, 1);
            while (f2.hasNext()) {
                ((ImageCropArea) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<EmptyCropArea> list2 = this.c;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list2, 1);
            while (f3.hasNext()) {
                ((EmptyCropArea) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
    }
}
