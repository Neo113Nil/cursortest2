package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;

/* compiled from: MusicCameraData.kt */
/* loaded from: classes18.dex */
public final class MusicCameraData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicCameraData> CREATOR = new a();
    public final String b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MusicCameraData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicCameraData a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new MusicCameraData(H, serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicCameraData[i];
        }
    }

    public MusicCameraData(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicCameraData)) {
            return false;
        }
        MusicCameraData musicCameraData = (MusicCameraData) obj;
        return epx.f(this.b, musicCameraData.b) && this.c == musicCameraData.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicCameraData(trackId=");
        sb.append(this.b);
        sb.append(", playFromRecommended=");
        return q0.a(sb, this.c, ')');
    }
}
