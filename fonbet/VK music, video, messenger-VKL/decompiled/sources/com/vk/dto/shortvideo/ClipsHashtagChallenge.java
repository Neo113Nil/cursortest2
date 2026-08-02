package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;

/* compiled from: ClipsHashtagChallenge.kt */
/* loaded from: classes18.dex */
public final class ClipsHashtagChallenge implements Serializer.StreamParcelable {
    public static final Serializer.c<ClipsHashtagChallenge> CREATOR = new a();
    public final Long b;
    public final ClipsChallenge c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipsHashtagChallenge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsHashtagChallenge a(Serializer serializer) {
            return new ClipsHashtagChallenge(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsHashtagChallenge[i];
        }
    }

    public ClipsHashtagChallenge(Long l, ClipsChallenge clipsChallenge) {
        this.b = l;
        this.c = clipsChallenge;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Long l = this.b;
        serializer.Y(l != null ? l.longValue() : 0L);
        serializer.i0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsHashtagChallenge)) {
            return false;
        }
        ClipsHashtagChallenge clipsHashtagChallenge = (ClipsHashtagChallenge) obj;
        return epx.f(this.b, clipsHashtagChallenge.b) && epx.f(this.c, clipsHashtagChallenge.c);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        ClipsChallenge clipsChallenge = this.c;
        return hashCode + (clipsChallenge != null ? clipsChallenge.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsHashtagChallenge(clipsCount=" + this.b + ", challenge=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ClipsHashtagChallenge(Serializer serializer) {
        this(Long.valueOf(serializer.w()), (ClipsChallenge) serializer.G(ClipsChallenge.class.getClassLoader()));
    }
}
