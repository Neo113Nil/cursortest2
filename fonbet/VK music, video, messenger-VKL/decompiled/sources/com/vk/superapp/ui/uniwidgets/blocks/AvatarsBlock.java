package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class AvatarsBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final List<ImageBlock> b;

    /* compiled from: UiBlocks.kt */
    public static final class a implements Parcelable.Creator<AvatarsBlock> {
        @Override // android.os.Parcelable.Creator
        public final AvatarsBlock createFromParcel(Parcel parcel) {
            return new AvatarsBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarsBlock[] newArray(int i) {
            return new AvatarsBlock[i];
        }
    }

    public AvatarsBlock(List<ImageBlock> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
    }

    public AvatarsBlock(Parcel parcel) {
        this(parcel.createTypedArrayList(ImageBlock.CREATOR));
    }
}
