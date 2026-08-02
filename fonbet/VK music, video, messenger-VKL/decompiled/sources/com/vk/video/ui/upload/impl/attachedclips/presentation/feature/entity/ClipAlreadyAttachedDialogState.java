package com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: AttachedClipsState.kt */
/* loaded from: classes7.dex */
public final class ClipAlreadyAttachedDialogState implements Parcelable {
    public static final Parcelable.Creator<ClipAlreadyAttachedDialogState> CREATOR = new a();
    public final String b;

    /* compiled from: AttachedClipsState.kt */
    public static final class a implements Parcelable.Creator<ClipAlreadyAttachedDialogState> {
        @Override // android.os.Parcelable.Creator
        public final ClipAlreadyAttachedDialogState createFromParcel(Parcel parcel) {
            return new ClipAlreadyAttachedDialogState(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipAlreadyAttachedDialogState[] newArray(int i) {
            return new ClipAlreadyAttachedDialogState[i];
        }
    }

    public ClipAlreadyAttachedDialogState(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClipAlreadyAttachedDialogState) && epx.f(this.b, ((ClipAlreadyAttachedDialogState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClipAlreadyAttachedDialogState(videoId="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
