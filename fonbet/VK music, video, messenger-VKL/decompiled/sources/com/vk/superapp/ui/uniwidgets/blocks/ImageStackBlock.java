package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: ImageStackBlock.kt */
/* loaded from: classes6.dex */
public final class ImageStackBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final List<ImageBlock> b;
    public final int c;

    /* compiled from: ImageStackBlock.kt */
    public static final class a implements Parcelable.Creator<ImageStackBlock> {
        @Override // android.os.Parcelable.Creator
        public final ImageStackBlock createFromParcel(Parcel parcel) {
            return new ImageStackBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStackBlock[] newArray(int i) {
            return new ImageStackBlock[i];
        }
    }

    public ImageStackBlock(List<ImageBlock> list, int i) {
        this.b = list;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeInt(this.c);
    }

    public ImageStackBlock(Parcel parcel) {
        this(parcel.createTypedArrayList(ImageBlock.CREATOR), parcel.readInt());
    }
}
