package com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.ClipVideoFile;
import defpackage.q0;
import xsna.bpn0;
import xsna.epx;
import xsna.mh;
import xsna.z4;

/* compiled from: AttachedClipsState.kt */
/* loaded from: classes7.dex */
public final class ClipState implements Parcelable {
    public static final Parcelable.Creator<ClipState> CREATOR = new a();
    public final String b;
    public final ClipVideoFile c;
    public final boolean d;
    public final bpn0 e = new bpn0(new z4(this, 24));
    public final bpn0 f = new bpn0(new mh(this, 24));

    /* compiled from: AttachedClipsState.kt */
    public static final class a implements Parcelable.Creator<ClipState> {
        @Override // android.os.Parcelable.Creator
        public final ClipState createFromParcel(Parcel parcel) {
            return new ClipState(parcel.readString(), (ClipVideoFile) parcel.readParcelable(ClipState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipState[] newArray(int i) {
            return new ClipState[i];
        }
    }

    public ClipState(String str, ClipVideoFile clipVideoFile, boolean z) {
        this.b = str;
        this.c = clipVideoFile;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipState)) {
            return false;
        }
        ClipState clipState = (ClipState) obj;
        return epx.f(this.b, clipState.b) && epx.f(this.c, clipState.c) && this.d == clipState.d;
    }

    public final int hashCode() {
        String str = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipState(editingVideoId=");
        sb.append(this.b);
        sb.append(", clipVideoFile=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
