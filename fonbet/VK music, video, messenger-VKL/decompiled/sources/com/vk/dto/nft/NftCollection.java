package com.vk.dto.nft;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;

/* compiled from: NftCollection.kt */
/* loaded from: classes18.dex */
public final class NftCollection extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NftCollection> CREATOR = new a();
    public final String b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NftCollection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NftCollection a(Serializer serializer) {
            return new NftCollection(serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NftCollection[i];
        }
    }

    public NftCollection(String str, boolean z) {
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
        if (!(obj instanceof NftCollection)) {
            return false;
        }
        NftCollection nftCollection = (NftCollection) obj;
        return epx.f(this.b, nftCollection.b) && this.c == nftCollection.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftCollection(name=");
        sb.append(this.b);
        sb.append(", isVerified=");
        return q0.a(sb, this.c, ')');
    }
}
