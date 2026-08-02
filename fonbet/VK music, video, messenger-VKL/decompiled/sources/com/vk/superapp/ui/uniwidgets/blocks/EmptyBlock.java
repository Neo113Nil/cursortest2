package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class EmptyBlock implements BaseBlock {
    public static final EmptyBlock b = new EmptyBlock();
    public static final Parcelable.Creator<EmptyBlock> CREATOR = new a();

    /* compiled from: UiBlocks.kt */
    public static final class a implements Parcelable.Creator<EmptyBlock> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EmptyBlock createFromParcel(Parcel parcel) {
            return EmptyBlock.b;
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyBlock[] newArray(int i) {
            return new EmptyBlock[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
