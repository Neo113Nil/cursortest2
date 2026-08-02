package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.qoy;

/* compiled from: ChallengeStyle.kt */
/* loaded from: classes18.dex */
public final class ChallengeStyle implements Serializer.StreamParcelable {
    public static final Serializer.c<ChallengeStyle> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ChallengeHeader f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChallengeStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChallengeStyle a(Serializer serializer) {
            return new ChallengeStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeStyle[i];
        }
    }

    public ChallengeStyle(boolean z, boolean z2, boolean z3, boolean z4, ChallengeHeader challengeHeader) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = challengeHeader;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeStyle)) {
            return false;
        }
        ChallengeStyle challengeStyle = (ChallengeStyle) obj;
        return this.b == challengeStyle.b && this.c == challengeStyle.c && this.d == challengeStyle.d && this.e == challengeStyle.e && epx.f(this.f, challengeStyle.f);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        ChallengeHeader challengeHeader = this.f;
        return b + (challengeHeader == null ? 0 : challengeHeader.hashCode());
    }

    public final String toString() {
        return "ChallengeStyle(showNames=" + this.b + ", hideViews=" + this.c + ", hideCounter=" + this.d + ", hideCameraButton=" + this.e + ", challengeHeader=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ChallengeStyle(Serializer serializer) {
        this(serializer.m(), serializer.m(), serializer.m(), serializer.m(), (ChallengeHeader) serializer.G(ChallengeHeader.class.getClassLoader()));
    }
}
