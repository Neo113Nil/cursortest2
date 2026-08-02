package com.vk.dto.clips.upload;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: ClipEditorSizeParams.kt */
/* loaded from: classes18.dex */
public final class ClipEditorSizeParams implements Parcelable {
    public static final Parcelable.Creator<ClipEditorSizeParams> CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: ClipEditorSizeParams.kt */
    public static final class a implements Parcelable.Creator<ClipEditorSizeParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipEditorSizeParams createFromParcel(Parcel parcel) {
            return new ClipEditorSizeParams(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipEditorSizeParams[] newArray(int i) {
            return new ClipEditorSizeParams[i];
        }
    }

    public ClipEditorSizeParams(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipEditorSizeParams)) {
            return false;
        }
        ClipEditorSizeParams clipEditorSizeParams = (ClipEditorSizeParams) obj;
        return this.b == clipEditorSizeParams.b && this.c == clipEditorSizeParams.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipEditorSizeParams(width=");
        sb.append(this.b);
        sb.append(", height=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
