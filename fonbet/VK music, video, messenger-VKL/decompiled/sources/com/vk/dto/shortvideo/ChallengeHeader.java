package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;

/* compiled from: ChallengeHeader.kt */
/* loaded from: classes18.dex */
public final class ChallengeHeader implements Serializer.StreamParcelable {
    public static final Serializer.c<ChallengeHeader> CREATOR = new a();
    public final Integer b;
    public final ChallengeColor c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChallengeHeader> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChallengeHeader a(Serializer serializer) {
            return new ChallengeHeader(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeHeader[i];
        }
    }

    public ChallengeHeader(Integer num, ChallengeColor challengeColor) {
        this.b = num;
        this.c = challengeColor;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.e0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeHeader)) {
            return false;
        }
        ChallengeHeader challengeHeader = (ChallengeHeader) obj;
        return epx.f(this.b, challengeHeader.b) && epx.f(this.c, challengeHeader.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ChallengeColor challengeColor = this.c;
        return hashCode + (challengeColor != null ? challengeColor.hashCode() : 0);
    }

    public final String toString() {
        return "ChallengeHeader(titleColor=" + this.b + ", backgroundColor=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ChallengeHeader(Serializer serializer) {
        this(serializer.v(), (ChallengeColor) serializer.A(ChallengeColor.class.getClassLoader()));
    }
}
