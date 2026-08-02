package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: Clips.kt */
/* loaded from: classes18.dex */
public final class Clips implements Serializer.StreamParcelable {
    public static final Serializer.c<Clips> CREATOR = new a();
    public final List<ClipVideoFile> b;
    public String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Clips> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Clips a(Serializer serializer) {
            return new Clips(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Clips[i];
        }
    }

    public Clips(List<ClipVideoFile> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Clips)) {
            return false;
        }
        Clips clips = (Clips) obj;
        return epx.f(this.b, clips.b) && epx.f(this.c, clips.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Clips(videos=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public Clips(Serializer serializer) {
        this(serializer.k(ClipVideoFile.class), serializer.H());
    }
}
