package com.vk.libvideo.api.ui;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: VideoDialogParams.kt */
/* loaded from: classes2.dex */
public final class VideoDialogParams implements Serializer.StreamParcelable {
    public static final Serializer.c<VideoDialogParams> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoDialogParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoDialogParams a(Serializer serializer) {
            return new VideoDialogParams(serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoDialogParams[i];
        }
    }

    public VideoDialogParams(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.j0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDialogParams)) {
            return false;
        }
        VideoDialogParams videoDialogParams = (VideoDialogParams) obj;
        return this.b == videoDialogParams.b && this.c == videoDialogParams.c && this.d == videoDialogParams.d && this.e == videoDialogParams.e && epx.f(this.f, videoDialogParams.f);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDialogParams(playOnStart=");
        sb.append(this.b);
        sb.append(", stopOnClose=");
        sb.append(this.c);
        sb.append(", showAnimated=");
        sb.append(this.d);
        sb.append(", trackTransitionByRotation=");
        sb.append(this.e);
        sb.append(", trackCode=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
