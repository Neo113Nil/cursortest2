package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import xsna.epx;
import xsna.vu5;

/* compiled from: ClipCameraParams.kt */
/* loaded from: classes18.dex */
public final class ClipCameraParams implements Serializer.StreamParcelable {
    public static final Serializer.c<ClipCameraParams> CREATOR = new a();
    public final String b;
    public final Mask c;
    public final MusicTrack d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipCameraParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipCameraParams a(Serializer serializer) {
            return new ClipCameraParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipCameraParams[i];
        }
    }

    public ClipCameraParams(String str, Mask mask, MusicTrack musicTrack, int i) {
        this.b = str;
        this.c = mask;
        this.d = musicTrack;
        this.e = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.S(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCameraParams)) {
            return false;
        }
        ClipCameraParams clipCameraParams = (ClipCameraParams) obj;
        return epx.f(this.b, clipCameraParams.b) && epx.f(this.c, clipCameraParams.c) && epx.f(this.d, clipCameraParams.d) && this.e == clipCameraParams.e;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Mask mask = this.c;
        int hashCode2 = (hashCode + (mask == null ? 0 : mask.hashCode())) * 31;
        MusicTrack musicTrack = this.d;
        return Integer.hashCode(this.e) + ((hashCode2 + (musicTrack != null ? musicTrack.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCameraParams(tag=");
        sb.append(this.b);
        sb.append(", mask=");
        sb.append(this.c);
        sb.append(", audio=");
        sb.append(this.d);
        sb.append(", audioStartTime=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ClipCameraParams(Serializer serializer) {
        this(serializer.H(), (Mask) serializer.G(Mask.class.getClassLoader()), (MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), serializer.u());
    }
}
