package com.vk.libvideo.adfree.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.libvideo.adfree.api.VideoAdFreeBottomSheetArguments;
import xsna.epx;
import xsna.lm50;

/* compiled from: BottomSheetState.kt */
/* loaded from: classes18.dex */
public final class BottomSheetState implements lm50, Parcelable {
    public static final Parcelable.Creator<BottomSheetState> CREATOR = new a();
    public final VideoAdFreeBottomSheetArguments b;

    /* compiled from: BottomSheetState.kt */
    public static final class a implements Parcelable.Creator<BottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final BottomSheetState createFromParcel(Parcel parcel) {
            return new BottomSheetState((VideoAdFreeBottomSheetArguments) parcel.readParcelable(BottomSheetState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BottomSheetState[] newArray(int i) {
            return new BottomSheetState[i];
        }
    }

    public BottomSheetState(VideoAdFreeBottomSheetArguments videoAdFreeBottomSheetArguments) {
        this.b = videoAdFreeBottomSheetArguments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BottomSheetState) && epx.f(this.b, ((BottomSheetState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "BottomSheetState(bottomSheetContentParams=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
